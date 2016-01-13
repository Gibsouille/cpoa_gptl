package accesAuxDonnees;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.sql.DataSource;
import metier.EquipeJoueurs;
import metier.Joueur;

public class DaoEquipe extends DAO<EquipeJoueurs> {

    public DaoEquipe() {
    }
    public EquipeJoueurs recupEquipe(int idEquipe)throws SQLException, ClassNotFoundException, IOException{
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("select * from EquipeJoueurs where idEquipe = ?;");
        pstm.setInt(1, idEquipe);
        ResultSet rsEquipe = pstm.executeQuery();
        DaoJoueur daoJoueur = new DaoJoueur();
        int idJ1, idJ2; //id des joueurs
        EquipeJoueurs Ej;
        Joueur j1, j2;
        
        rsEquipe.next();
        idJ1 = rsEquipe.getInt("joueur1");
        j1 = daoJoueur.recupererJoueur(idJ1, co);
        
        idJ2 = rsEquipe.getInt("joueur2");
        if(!rsEquipe.wasNull()) {
            j2 = daoJoueur.recupererJoueur(idJ2, co);
            Ej = new EquipeJoueurs(idEquipe, j1, j2);
        }
        else
            Ej = new EquipeJoueurs(idEquipe, j1, null);
        pstm.close();
        rsEquipe.close();
        co.close();
                   
        return Ej;
    }

    @Override
    public void ajouter(EquipeJoueurs element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifier(EquipeJoueurs element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void charger(List<EquipeJoueurs> liste) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        Statement stm = co.createStatement();
        ResultSet rsEquipe = stm.executeQuery("SELECT * FROM EquipeJoueurs;");
        int idJoueur1, idJoueur2;
        Joueur joueur1, joueur2;
        DaoJoueur daoJoueur = new DaoJoueur();
        
        while (rsEquipe.next()) {
            idJoueur1 = rsEquipe.getInt("joueur1");
            joueur1 = daoJoueur.recupererJoueur(idJoueur1, co);
            
            idJoueur2 = rsEquipe.getInt("joueur2");
            if (!rsEquipe.wasNull()) {
                joueur2 = daoJoueur.recupererJoueur(idJoueur2, co);
                
                liste.add(new EquipeJoueurs(rsEquipe.getInt("idEquipe"), joueur1, joueur2));
            }
            else 
                liste.add(new EquipeJoueurs(rsEquipe.getInt("idEquipe"), joueur1, null));
        }
        
        rsEquipe.close();
        stm.close();
        co.close();
    }

    @Override
    public void supprimer(EquipeJoueurs element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       public void chargerEquipesAffectees(List<EquipeJoueurs> liste) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        Statement stm = co.createStatement();
        ResultSet rsEquipe = stm.executeQuery("SELECT DISTINCT EquipeJoueurs.* FROM EquipeJoueurs, Matchs WHERE EquipeJoueurs.idEquipe IN Matchs.idEquipe1 OR EquipeJoueurs.idEquipe IN Matchs.idEquipe2");
        int idJoueur1, idJoueur2;
        Joueur joueur1, joueur2;
        DaoJoueur daoJoueur = new DaoJoueur();
        
        while (rsEquipe.next()) {
            idJoueur1 = rsEquipe.getInt("joueur1");
            joueur1 = daoJoueur.recupererJoueur(idJoueur1, co);
            
            idJoueur2 = rsEquipe.getInt("joueur2");
            if (!rsEquipe.wasNull()) {
                joueur2 = daoJoueur.recupererJoueur(idJoueur2, co);
                liste.add(new EquipeJoueurs(rsEquipe.getInt("idEquipe"), joueur1, joueur2));
            }
            else
                liste.add(new EquipeJoueurs(rsEquipe.getInt("idEquipe"), joueur1, null));
        }
        
        rsEquipe.close();
        stm.close();
        co.close();
    }
    
}
