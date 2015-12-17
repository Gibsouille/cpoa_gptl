/***********************************************************************
 * Module:  Planning.java
 * Author:  p1402517
 * Purpose: Defines the Class Planning
 ***********************************************************************/

package metier;

import java.util.*;

/** @pdOid 79137b11-68db-40df-937e-707c9660b4d2 */
public class Planning {
   /** @pdOid a336a6fa-f7b6-4331-853d-509c63756ed8 */
   private int idPlanning;
   /** @pdOid 767751ed-a757-4ae7-8350-1e792d99ecc8 */
   private String typePlanning;
   /** @pdOid 14aa1c73-5fc8-4783-97f2-f23cd7b8145f */
   private List<Match> listeMatchs;
   
   /** @pdOid 28e6dd79-7d26-4364-acaa-ee40e0bd0480 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 907d77dc-6ffe-4260-ae9f-18dd4d447645 */
   public boolean retirerMatch() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 13aea2f1-5011-45fb-85c5-ba4a2bb3790a */
   public int ajouterMatch() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid d328ee6c-404d-41f8-984d-76767d51ffae */
   public int actualiser() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 24572acd-1332-48ed-9a69-f1c5f4c3b6ce */
   public Planning() {
      // TODO: implement
   }
   
   /** @pdOid b9de205a-bdbc-43a0-87d8-d2f337758d79 */
   public int getIdPlanning() {
      return idPlanning;
   }
   
   /** @param newIdPlanning
    * @pdOid 1d718337-ae24-4740-8512-c6e97eabe1a3 */
   public void setIdPlanning(int newIdPlanning) {
      idPlanning = newIdPlanning;
   }
   
   /** @pdOid baff8807-6c95-4d56-9cea-378c01e1e673 */
   public String getTypePlanning() {
      return typePlanning;
   }
   
   /** @param newTypePlanning
    * @pdOid d806ac92-1d25-4f1c-9ebf-f7a7b1593dfc */
   public void setTypePlanning(String newTypePlanning) {
      typePlanning = newTypePlanning;
   }
   
   /** @pdOid 3cd8a71c-755e-4600-b418-2e6adfad06ae */
   public List<Match> getListeMatchs() {
      return listeMatchs;
   }
   
   /** @param newListeMatchs
    * @pdOid e8e73c3c-1fca-4822-9774-f288d4003141 */
   public void setListeMatchs(List<Match> newListeMatchs) {
      listeMatchs = newListeMatchs;
   }

}