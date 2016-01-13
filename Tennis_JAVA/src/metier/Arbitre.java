package metier;

import java.util.*;

public class Arbitre {
   private int idArbitre;
   private String nom;
   private String prenom;
   private String categorie;
   private int nbMatchsChaiseSimple;
   private int nbMatchsChaiseDouble;
   private String nationalite;

    public Arbitre(int idArbitre, String nom, String prenom, String categorie, int nbMatchsChaiseSimple, int nbMatchsChaiseDouble, String nationalite) {
        this.idArbitre = idArbitre;
        this.nom = nom;
        this.prenom = prenom;
        this.categorie = categorie;
        this.nbMatchsChaiseSimple = nbMatchsChaiseSimple;
        this.nbMatchsChaiseDouble = nbMatchsChaiseDouble;
        this.nationalite = nationalite;
    }
   

   public int getIdArbitre() {
      return idArbitre;
   }
   
   public void setIdArbitre(int newIdArbitre) {
      idArbitre = newIdArbitre;
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
   
   public String getCategorie() {
      return categorie;
   }
   
   public void setCategorie(String newCategorie) {
      categorie = newCategorie;
   }
   
   public int getNbMatchsChaiseSimple() {
      return nbMatchsChaiseSimple;
   }
   
   public void setNbMatchsChaiseSimple(int newNbMatchsChaiseSimple) {
      nbMatchsChaiseSimple = newNbMatchsChaiseSimple;
   }
   
   public int getNbMatchsChaiseDouble() {
      return nbMatchsChaiseDouble;
   }
   
   public void setNbMatchsChaiseDouble(int newNbMatchsChaiseDouble) {
      nbMatchsChaiseDouble = newNbMatchsChaiseDouble;
   }
   
   public String getNationalite() {
      return nationalite;
   }
   
   public void setNationalite(String newNationalite) {
      nationalite = newNationalite;
   }

}