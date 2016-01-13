package accesAuxDonnees;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import metier.EquipeJoueurs;
import metier.Joueur;

import metier.Match;

public class DaoMatch extends DAO<Match>{
    
    public DaoMatch() {

    }
    
    @Override
    public void ajouter(Match element) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("INSERT INTO Matchs VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
        pstm.setInt(1, element.getNumMatch());
        pstm.setInt(2, element.getNumCourt());
        pstm.setString(3, element.getTypeMatch());
        pstm.setDate(4, (Date) element.getDate());
        pstm.setString(5, element.getModeJeu());
        pstm.setString(6, element.getTrancheHoraire());
        pstm.setString(7, element.getPhase());
        pstm.setInt(8, element.getEquipe1().getidEquipe());
        pstm.setInt(9, element.getEquipe2().getidEquipe());
        
        pstm.executeUpdate();
        pstm.close();
        co.close();
    }

    @Override
    public void modifier(Match element) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("UPDATE Matchs SET numCourt = ?, typeMatch = ?, dateMatch = ?, modeJeu = ?, trancheHoraire = ?, phaseFinale = ?, idEquipe1 = ?, idEquipe2 = ?;");
        pstm.setInt(1, element.getNumCourt());
        pstm.setString(2, element.getTypeMatch());
        pstm.setDate(3, (Date) element.getDate());
        pstm.setString(4, element.getModeJeu());
        pstm.setString(5, element.getTrancheHoraire());
        pstm.setString(6, element.getPhase());
        pstm.setInt(7, element.getEquipe1().getidEquipe());
        pstm.setInt(8, element.getEquipe2().getidEquipe());
        
        pstm.executeUpdate();
        pstm.close();
        co.close();
    }

    @Override
    public void charger(List<Match> liste) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        Statement stm = co.createStatement();
        PreparedStatement pstmEquipe = co.prepareStatement("SELECT * FROM EquipeJoueurs WHERE idEquipe = ?");
        ResultSet rsMatchs = stm.executeQuery("SELECT * FROM Matchs ORDER BY dateMatch, trancheHoraire"), rsEquipe;
        EquipeJoueurs eq1 = null, eq2 = null;
        Joueur joueur1, joueur2;
        int idJoueur1, idJoueur2, num, numCourt, idEquipe1, idEquipe2;
        DaoJoueur daoJoueur = new DaoJoueur();
        
        while (rsMatchs.next()) {
            num = rsMatchs.getInt("numMatch");
            numCourt = rsMatchs.getInt("numCourt");
            idEquipe1 = rsMatchs.getInt("idEquipe1");
            
            if (rsMatchs.wasNull())
                eq1 = null;
            else {
                /* récupération de l'équipe 1 */
                pstmEquipe.setInt(1, idEquipe1);
                rsEquipe = pstmEquipe.executeQuery();
                if (rsEquipe.next()) {

                    /*récupération joueur1 de l'équipe */
                    idJoueur1 = rsEquipe.getInt("joueur1");
                    joueur1 = daoJoueur.recupererJoueur(idJoueur1, co);

                    /* récupération joueur2 de l'équipe */
                    idJoueur2 = rsEquipe.getInt("joueur2");
                    if (!rsEquipe.wasNull()) {
                        joueur2 = daoJoueur.recupererJoueur(idJoueur2, co);
                        eq1 = new EquipeJoueurs(idEquipe1, joueur1, joueur2);
                    }
                    else
                        eq1 = new EquipeJoueurs(idEquipe1, joueur1, null);
                }
                rsEquipe.close();
            }
            
            idEquipe2 = rsMatchs.getInt("idEquipe2");
            if (rsMatchs.wasNull())
                eq2 = null;
            else {
                /* récupération de l'équipe 2 */
                pstmEquipe.setInt(1, idEquipe1);
                rsEquipe = pstmEquipe.executeQuery();
                if (rsEquipe.next()) {
                
                    /*récupération joueur1 de l'équipe */
                    idJoueur1 = rsEquipe.getInt("joueur1");
                    joueur1 = daoJoueur.recupererJoueur(idJoueur1, co);

                    /* récupération joueur2 de l'équipe */
                    idJoueur2 = rsEquipe.getInt("joueur2");
                    if (!rsEquipe.wasNull()) {
                        joueur2 = daoJoueur.recupererJoueur(idJoueur2, co);
                        eq2 = new EquipeJoueurs(idEquipe2, joueur1, joueur2);
                    }
                    else
                        eq2 = new EquipeJoueurs(idEquipe2, joueur1, null);
                }
                rsEquipe.close();
            }
            
            String type = rsMatchs.getString("typeMatch"), modeJeu = rsMatchs.getString("modeJeu"), trancheHoraire = rsMatchs.getString("trancheHoraire"),
                   phaseFinale = rsMatchs.getString("phaseFinale");
            
            Date date = rsMatchs.getDate("dateMatch");
            
            liste.add(new Match(num, numCourt, type, date, modeJeu, trancheHoraire, phaseFinale, eq1, eq2));
        }
        
        pstmEquipe.close();
        rsMatchs.close();
        stm.close();
        co.close();
    }

    @Override
    public void supprimer(Match element) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("DELETE FROM Matchs WHERE numMatch = ?;");
        
        pstm.setInt(1, element.getNumMatch());
        pstm.executeUpdate();
        pstm.close();
        co.close();
    }
    
    
    public void getMatchsHorairesLibres(Match element) throws SQLException, ClassNotFoundException, IOException{
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("select dateMatch,trancheHoraire,numCourt from Match where dateMatch != ? and trancheHoraire != ? and numCourt != ?;");
        
        pstm.setDate(1, element.getDate());
        pstm.setString(2, element.getTrancheHoraire());
        pstm.setInt(3,element.getNumCourt());
    }   

}
