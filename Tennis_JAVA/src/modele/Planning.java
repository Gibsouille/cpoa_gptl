/***********************************************************************
 * Module:  Planning.java
 * Author:  p1402517
 * Purpose: Defines the Class Planning
 ***********************************************************************/

package modele;

import accesAuxDonnees.DaoMatch;
import java.util.*;
import metier.Match;

public class Planning {
   private int idPlanning;
   private String typePlanning;
   private List<Match> listeMatchs;
   private DaoMatch dao;
   
   public Planning(int id, String type, DaoMatch dao) {
       this.idPlanning = id;
       this.typePlanning = type;
       this.dao = dao;
       listeMatchs = new ArrayList<>();
   }
   
   public boolean retirerMatch(int index) {
      dao.supprimer(listeMatchs.get(index));
      listeMatchs.remove(index);
      return false;
   }
   
   public int ajouterMatch(Match match) {
      dao.ajouter(match);
      listeMatchs.add(match);
      return 0;
   }
   
   public int actualiser() {
      // TODO: implement
      return 0;
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

}