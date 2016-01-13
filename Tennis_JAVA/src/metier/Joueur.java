/***********************************************************************
 * Module:  Joueur.java
 * Author:  p1402517
 * Purpose: Defines the Class Joueur
 ***********************************************************************/

package metier;

import java.util.*;

public class Joueur {
   private int idJoueur;
   private String nom;
   private String prenom;
   private String nationalite;

    public Joueur(int idJoueur, String nom, String prenom, String nationalite) {
        this.idJoueur = idJoueur;
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
    }
   
   

   public String getNom() {
      return nom;
   }
   

   public void setNom(String newNom) {
      nom = newNom;
   }

   public String getPrenom() {
      return prenom;
   }
   

   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }

   public String getNationalite() {
      return nationalite;
   }
   

   public void setNationalite(String newNationalite) {
      nationalite = newNationalite;
   }

}