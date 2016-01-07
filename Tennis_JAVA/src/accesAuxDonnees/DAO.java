package accesAuxDonnees;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;

public abstract class DAO<T> {
    protected DataSource ds;
    
    public DAO(DataSource ds) {
        this.ds = ds;
    }
    
    public abstract void ajouter(T element) throws SQLException, ClassNotFoundException, IOException;
    public abstract void modifier(T element) throws SQLException, ClassNotFoundException, IOException;
    public abstract void charger(List<T> liste)  throws SQLException, ClassNotFoundException, IOException;
    public abstract void supprimer(T element) throws SQLException, ClassNotFoundException, IOException;
}