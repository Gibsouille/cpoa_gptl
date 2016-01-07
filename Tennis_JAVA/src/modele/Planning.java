/***********************************************************************
 * Module:  Planning.java
 * Author:  p1402517
 * Purpose: Defines the Class Planning
 ***********************************************************************/

package modele;

import accesAuxDonnees.DaoMatch;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import javax.swing.table.AbstractTableModel;
import metier.Match;

public class Planning extends AbstractTableModel {
   private int idPlanning;
   private String typePlanning;
   private List<Match> listeMatchs;
   private DaoMatch dao;
   private String[] jour = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
   
   public Planning(int id, String type, DaoMatch dao) {
       this.idPlanning = id;
       this.typePlanning = type;
       this.dao = dao;
       listeMatchs = new ArrayList<>();
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
   }

    public int getIdPlanning() {
        return idPlanning;
    }

    public void setIdPlanning(int idPlanning) {
        this.idPlanning = idPlanning;
    }

    public String getTypePlanning() {
        return typePlanning;
    }

    public void setTypePlanning(String typePlanning) {
        this.typePlanning = typePlanning;
    }

    public List<Match> getListeMatchs() {
        return listeMatchs;
    }

    public void setListeMatchs(List<Match> listeMatchs) {
        this.listeMatchs = listeMatchs;
    }

    @Override
    public int getRowCount() {
        return this.listeMatchs.size();
    }

    @Override
    public int getColumnCount() {
        if (this.listeMatchs.get(0).getTypeMatch().equals("Qualifications"))
            return 2;
        return this.jour.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return "";
    }

}