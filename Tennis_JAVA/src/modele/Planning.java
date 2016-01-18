package modele;

import accesAuxDonnees.DaoMatch;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import javax.swing.table.AbstractTableModel;
import metier.Match;

public class Planning extends AbstractTableModel {
    private int idPlanning;
    private String type;
    private List<Match> listeMatchs;
    private List<Match> matchsQualif;
    private List<Match> matchsSimple;
    private List<Match> matchsDouble;
    private DaoMatch dao;
    private String[] jour = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

    public Planning(int id, DaoMatch dao) {
        this.idPlanning = id;
        this.type = "Qualifications";
        this.dao = dao;
        listeMatchs = new ArrayList<>();
        matchsQualif = new ArrayList<>();
        matchsSimple = new ArrayList<>();
        matchsDouble = new ArrayList<>();
    }

    public void retirerMatch(int index) throws SQLException, ClassNotFoundException, IOException {
       dao.supprimer(listeMatchs.get(index));
       listeMatchs.remove(index);
       this.fireTableDataChanged();
    }

    public void ajouterMatch(Match match) throws SQLException, ClassNotFoundException, IOException {
       dao.ajouter(match);
       listeMatchs.add(match);
       this.fireTableDataChanged();
    }
   
    public void charger() throws SQLException, ClassNotFoundException, IOException {
        dao.charger(listeMatchs);
        if (!this.listeMatchs.isEmpty()) {
        for (Match match : this.listeMatchs) {
            if (match.getTypeMatch().equals("qualification"))
                this.matchsQualif.add(match);
            else if (match.getModeJeu().equals("simple"))
                this.matchsSimple.add(match);
            else
                this.matchsDouble.add(match);
        }
        }
    }

    public int getIdPlanning() {
        return idPlanning;
    }

    public void setIdPlanning(int idPlanning) {
        this.idPlanning = idPlanning;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public List<Match> getListeMatchs() {
        return listeMatchs;
    }

    public void setListeMatchs(List<Match> listeMatchs) {
        this.listeMatchs = listeMatchs;
    }

    @Override
    public int getRowCount() {
        return 5;
    }

    @Override
    public int getColumnCount() {
        if (this.type.equals("Qualifications"))
            return 2;
        return this.jour.length;
    }
    
    @Override
    public String getColumnName(int i) {
        if (this.type.equals("Qualifications"))
            return jour[i+5];
        return jour[i];
    }

    @Override
    public Object getValueAt(int row, int col) {
        if (this.type.equals("Qualifications")) {
            
        }
        return "";
    }

}
