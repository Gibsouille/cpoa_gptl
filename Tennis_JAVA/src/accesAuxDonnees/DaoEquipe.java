package accesAuxDonnees;

import java.io.IOException;
import java.sql.SQLException;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimer(EquipeJoueurs element) throws SQLException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
