/***********************************************************************
 * Module:  Ramasseur.java
 * Author:  p1402517
 * Purpose: Defines the Class Ramasseur
 ***********************************************************************/

package metier;

import java.util.*;

/** @pdOid b11f9541-c8d8-449c-8313-52085d59a507 */
public class Ramasseur {
   /** @pdOid 0a72efb6-a3ef-47c5-b6d4-2d86620330b7 */
   private int idRamasseur;
   /** @pdOid 25d4aa2a-8128-4909-a21c-7dbd4a122ff9 */
   private String nomRamasseur;
   /** @pdOid 30c97d5d-fb1d-45ef-bf16-5b2d54253e2f */
   private String prenomRamasseur;
   
   /** @pdOid a3f77be7-395c-4a35-8717-988209d1a070 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid da068e33-543d-4601-86e8-70912eef2331 */
   public Ramasseur() {
      // TODO: implement
   }
   
   /** @pdOid ca76074c-35be-463a-ac5e-aa3fe895b4bf */
   public int getIdRamasseur() {
      return idRamasseur;
   }
   
   /** @param newIdRamasseur
    * @pdOid a03b3cc1-ff2f-4e7d-8c55-46b6285d94f5 */
   public void setIdRamasseur(int newIdRamasseur) {
      idRamasseur = newIdRamasseur;
   }
   
   /** @pdOid 0e9dc14b-972c-418a-a4b5-205f4dd84a5a */
   public String getNomRamasseur() {
      return nomRamasseur;
   }
   
   /** @param newNomRamasseur
    * @pdOid f3192b71-44f5-411f-8573-863108689253 */
   public void setNomRamasseur(String newNomRamasseur) {
      nomRamasseur = newNomRamasseur;
   }
   
   /** @pdOid 1461b2ba-da5f-4417-bdb7-3ccb7cd2738b */
   public String getPrenomRamasseur() {
      return prenomRamasseur;
   }
   
   /** @param newPrenomRamasseur
    * @pdOid 737e3af1-f46e-4b2f-8061-a0e7b34423d6 */
   public void setPrenomRamasseur(String newPrenomRamasseur) {
      prenomRamasseur = newPrenomRamasseur;
   }

}