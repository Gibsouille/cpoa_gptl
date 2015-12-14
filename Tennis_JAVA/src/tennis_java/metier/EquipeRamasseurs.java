/***********************************************************************
 * Module:  EquipeRamasseurs.java
 * Author:  p1402517
 * Purpose: Defines the Class EquipeRamasseurs
 ***********************************************************************/

package tennis_java.metier;

import java.util.*;


public class EquipeRamasseurs
{
   private int idEquipe;
   private String nomEquipe;
   private List<Ramasseur> ramasseurs;
   
   protected void finalize()
   {
       
   }
   
   public EquipeRamasseurs()
   {
       
   }
   
   /** @pdOid ae02672a-3f74-4ba8-9b26-7beb70b57264 */
   public String getNomEquipe() {
      return nomEquipe;
   }
   
   /** @param newNomEquipe
    * @pdOid bce821ba-16fa-44d2-8bff-74f87cb6f748 */
   public void setNomEquipe(String newNomEquipe) {
      nomEquipe = newNomEquipe;
   }
   
   /** @pdOid 54725df3-abdc-4d48-9ab1-966757b92a25 */
   public List<Ramasseur> getRamasseurs() {
      return ramasseurs;
   }
   
   /** @param newRamasseurs
    * @pdOid fcfb24b1-586b-480a-829f-bfd0833e154f */
   public void setRamasseurs(List<Ramasseur> newRamasseurs) {
      ramasseurs = newRamasseurs;
   }

}