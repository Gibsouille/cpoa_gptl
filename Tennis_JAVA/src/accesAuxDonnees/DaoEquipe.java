package accesAuxDonnees;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.sql.DataSource;
import metier.EquipeJoueurs;

public class DaoEquipe extends DAO<EquipeJoueurs> {

    public DaoEquipe(DataSource ds) {
        super(ds);
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
        ResultSet rs = stm.executeQuery("SELECT * FROM EquipeJoueurs;");
        
        while (rs.next()) {
            liste.add(new EquipeJoueurs(rs.getInt("idEquipe"), rs.getString("joueur1"), rs.getString("joueur2")));
        }
        
        rs.close();
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
        ResultSet rs = stm.executeQuery("SELECT DISTINCT EquipeJoueurs.* FROM EquipeJoueurs, Matchs WHERE EquipeJoueurs.idEquipe IN Matchs.idEquipe1 OR EquipeJoueurs.idEquipe IN Matchs.idEquipe2");
        
        while (rs.next()) {
            liste.add(new EquipeJoueurs(rs.getInt("idEquipe"), rs.getString("joueur1"), rs.getString("joueur2")));
        }
        
        rs.close();
        stm.close();
        co.close();
    }
    
}
