/***********************************************************************
 * Module:  Arbitre.java
 * Author:  p1402517
 * Purpose: Defines the Class Arbitre
 ***********************************************************************/

package metier;

import java.util.*;

/** @pdOid 0c4ae687-c34b-4b54-8412-d7e1836dadf4 */
public class Arbitre {
   /** @pdOid 77593194-5699-40b3-a004-fdeb4747de1c */
   private int idArbitre;
   /** @pdOid e7033c18-41c3-4413-a445-7a374db01ac6 */
   private String nom;
   /** @pdOid 8d6d2911-749a-42cd-818d-67282888de3d */
   private String prenom;
   /** @pdOid 1909d4fd-5eac-40e2-a196-5e984b47459d */
   private String categorie;
   /** @pdOid 4392cd80-abaa-42b5-a215-a84073c9d73a */
   private int nbMatchsChaiseSimple;
   /** @pdOid 38ff80c3-b8d4-4bdb-b5d1-d27465baef88 */
   private int nbMatchsChaiseDouble;
   /** @pdOid d2c5a25a-e9ce-4d48-89d6-496053a41031 */
   private String nationalite;
   
   /** @pdOid 89bbc369-7916-4183-a377-04a3d0009e93 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 17d71a38-7079-4e18-b4c2-abdc3a6efbc2 */
   public Arbitre() {
      // TODO: implement
   }
   
   /** @pdOid d1bd5b5a-995b-4cd6-ac38-5039168ee67d */
   public int getIdArbitre() {
      return idArbitre;
   }
   
   /** @param newIdArbitre
    * @pdOid d8e33123-fd71-4dc9-9ea9-e299dc8e025e */
   public void setIdArbitre(int newIdArbitre) {
      idArbitre = newIdArbitre;
   }
   
   /** @pdOid 2b5ac74f-37c5-47b3-8715-e5321275448e */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 85334791-b3dc-4208-8370-1f5e4d8da1f4 */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid e8636b5f-a621-4701-831d-aa1a515dd5e7 */
   public String getPrenom() {
      return prenom;
   }
   
   /** @param newPrenom
    * @pdOid 1353e522-b8f8-48fd-a53a-73e96d5a7c09 */
   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }
   
   /** @pdOid 167c3914-36b6-44ae-99f6-7eed3dceb9a6 */
   public String getCategorie() {
      return categorie;
   }
   
   /** @param newCategorie
    * @pdOid d5f9fc73-9ed2-4403-aa40-9044da196ecd */
   public void setCategorie(String newCategorie) {
      categorie = newCategorie;
   }
   
   /** @pdOid bda7a7ca-2c80-4ef4-b264-2a74bde71042 */
   public int getNbMatchsChaiseSimple() {
      return nbMatchsChaiseSimple;
   }
   
   /** @param newNbMatchsChaiseSimple
    * @pdOid 1c318e1d-d4a5-4c3c-bd92-a5fa2a0b9468 */
   public void setNbMatchsChaiseSimple(int newNbMatchsChaiseSimple) {
      nbMatchsChaiseSimple = newNbMatchsChaiseSimple;
   }
   
   /** @pdOid 41cac41d-04e8-44f6-a7b1-52c2fa7862d4 */
   public int getNbMatchsChaiseDouble() {
      return nbMatchsChaiseDouble;
   }
   
   /** @param newNbMatchsChaiseDouble
    * @pdOid 10c83808-860a-4911-a0c0-571b25df70d2 */
   public void setNbMatchsChaiseDouble(int newNbMatchsChaiseDouble) {
      nbMatchsChaiseDouble = newNbMatchsChaiseDouble;
   }
   
   /** @pdOid 421c10ca-24d0-40c4-a571-1eab935e05dc */
   public String getNationalite() {
      return nationalite;
   }
   
   /** @param newNationalite
    * @pdOid f855c7ea-ba79-416c-9d46-160f047db4ad */
   public void setNationalite(String newNationalite) {
      nationalite = newNationalite;
   }

}