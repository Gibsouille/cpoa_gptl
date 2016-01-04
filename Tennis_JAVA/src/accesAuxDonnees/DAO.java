package accesAuxDonnees;

import java.util.ArrayList;

public abstract class DAO<T> {
    
    public DAO() {
        
    }
    
    public abstract void ajouter(T element);
    public abstract void modifier(T element);
    public abstract void charger();
    public abstract void supprimer(T element);
}