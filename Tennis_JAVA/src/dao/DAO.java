package dao;

import java.util.ArrayList;

public abstract class DAO<T> {
    protected ArrayList<T> liste;
    
    public DAO(ArrayList<T> liste) {
        this.liste = liste;
    }

    public ArrayList<T> getListe() {
        return liste;
    }

    public void setListe(ArrayList<T> liste) {
        this.liste = liste;
    }
    
    public abstract void ajouter(T element);
    public abstract void modifier(T element);
    public abstract void charger();
    public abstract void supprimer(T element);
}
