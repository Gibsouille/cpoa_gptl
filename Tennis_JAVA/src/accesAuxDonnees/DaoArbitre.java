package accesAuxDonnees;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import metier.Arbitre;

public class DaoArbitre extends DAO<Arbitre> {

    public DaoArbitre() {
    }


    public Arbitre recupererArbitre(int idArbitre) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("SELECT * FROM Arbitre WHERE idArbitre = ?");
        pstm.setInt(1, idArbitre);
        ResultSet rsArbitre = pstm.executeQuery();
        rsArbitre.next();
        Arbitre arbitre = new Arbitre(rsArbitre.getInt("idArbitre"), rsArbitre.getString("nom"), rsArbitre.getString("prenom"), rsArbitre.getString("categorie"),rsArbitre.getInt("nbMatchsChaiseSimple"),rsArbitre.getInt("nbMatchsChaiseDouble"),rsArbitre.getString("nationalite"));
        rsArbitre.close();
        pstm.close();
        
        return arbitre;
    }
    
    public void ajouterArbitreAMatch(int idArbitre,int idMatch)throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("INSERT into 'ArbitreMatch' Values(?,?)");
        pstm.setInt(1, idArbitre);
        pstm.setInt(2,idMatch);
        ResultSet rs = pstm.executeQuery();
        rs.close();
        pstm.close();
    }
    
    public ArrayList<Arbitre> recupererArbitreParMatch(int idMatch) throws SQLException, ClassNotFoundException, IOException {
        ArrayList<Arbitre> listeA = new ArrayList<>();
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("SELECT * from ArbitreMatch where idMatch = ?");
        pstm.setInt(1, idMatch);
        ResultSet rsArbitreMatch = pstm.executeQuery();
        while(rsArbitreMatch.next()){
            listeA.add(recupererArbitre(rsArbitreMatch.getInt("idArbitre")));
        }
        rsArbitreMatch.close();
        pstm.close();
        
        return listeA;
    }

    @Override
    public void ajouter(Arbitre element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifier(Arbitre element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void charger(List<Arbitre> liste) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimer(Arbitre element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
