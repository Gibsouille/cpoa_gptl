package accesAuxDonnees;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import metier.Joueur;

public class DaoJoueur extends DAO<Joueur> {
    
    public DaoJoueur() {}
    
    public Joueur recupererJoueur(int idJoueur, Connection co) throws SQLException {
        PreparedStatement pstm = co.prepareStatement("SELECT * FROM Joueur WHERE idJoueur = ?");
        pstm.setInt(1, idJoueur);

        ResultSet rsJoueur = pstm.executeQuery();
        rsJoueur.next();
        Joueur joueur = new Joueur(rsJoueur.getInt("idJoueur"), rsJoueur.getString("nom"), rsJoueur.getString("prenom"), rsJoueur.getString("nationalite"));
        rsJoueur.close();
        pstm.close();
        
        return joueur;
    }

    @Override
    public void ajouter(Joueur element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifier(Joueur element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void charger(List<Joueur> liste) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimer(Joueur element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
