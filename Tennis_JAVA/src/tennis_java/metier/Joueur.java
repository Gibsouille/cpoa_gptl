/***********************************************************************
 * Module:  Joueur.java
 * Author:  p1402517
 * Purpose: Defines the Class Joueur
 ***********************************************************************/

package planningMatchs;

import java.util.*;

/** @pdOid bf4284a4-f44f-423c-8ee9-b3b103e0cb22 */
public class Joueur {
   /** @pdOid 08080411-7352-4522-a44a-ac6e0115e6fc */
   private int idJoueur;
   /** @pdOid e08191b4-73c9-4656-b556-133d66a52313 */
   private String nom;
   /** @pdOid e87e7365-b147-4e73-b507-e60c45898702 */
   private String prenom;
   /** @pdOid fa036328-e276-4be5-bb4b-779f0c9bbd48 */
   private String nationalite;
   
   /** @pdOid 54c34ad0-5356-46bc-a4c6-2c6140aad7b1 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 70c656cf-4876-418b-8989-2f54e7a50592 */
   public Joueur() {
      // TODO: implement
   }
   
   /** @pdOid 13901753-b914-4807-b819-2e159d9f55f6 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 40b95acc-0837-46f8-8466-4d2b0fc8db79 */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 1b4f0572-f1aa-4758-9d95-0a9d5323a1c4 */
   public String getPrenom() {
      return prenom;
   }
   
   /** @param newPrenom
    * @pdOid 93d2c420-915b-4004-b0e5-6b0c4737fb60 */
   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }
   
   /** @pdOid 76ad8e94-3d34-4063-9b95-065a6f59a21d */
   public String getNationalite() {
      return nationalite;
   }
   
   /** @param newNationalite
    * @pdOid 811be101-2355-4f4f-8b56-09b0373ecf54 */
   public void setNationalite(String newNationalite) {
      nationalite = newNationalite;
   }

}