/***********************************************************************
 * Module:  EquipeJoueurs.java
 * Author:  p1402517
 * Purpose: Defines the Class EquipeJoueurs
 ***********************************************************************/

package metier;

import java.util.*;
import metier.Joueur;

/** @pdOid 5d78afb0-acaf-42a8-846f-da6159b7b680 */
public class EquipeJoueurs {
   /** @pdOid ef899b06-7ed8-4517-b6af-bebaa9299c64 */
   private int idEquipe;
   /** @pdOid e230b270-8d7b-4d23-bcc6-c938bbff4121 */
   private Joueur joueur1;
   /** @pdOid 921d3a80-cc80-4d36-8da2-d2a165e14482 */
   private Joueur joueur2;
   
   /** @pdOid 7ac00dba-e206-4cda-85e9-b87bd1bea56f */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 29f52f9c-dee5-413a-afc0-4db711834d37 */
   public EquipeJoueurs() {
      // TODO: implement
   }
   
   /** @pdOid a38c190a-9e13-439c-a97a-aa12754ab8c3 */
   public Joueur getJoueur1() {
      return joueur1;
   }
   
   /** @param newJoueur1
    * @pdOid 90c26cc8-8931-4051-ae15-4e1464df0792 */
   public void setJoueur1(Joueur newJoueur1) {
      joueur1 = newJoueur1;
   }
   
   /** @pdOid 9d6d16f8-5816-4062-b212-192bb8994f7f */
   public Joueur getJoueur2() {
      return joueur2;
   }
   
   /** @param newJoueur2
    * @pdOid a71ee999-e128-4e23-977e-6860c4eba55e */
   public void setJoueur2(Joueur newJoueur2) {
      joueur2 = newJoueur2;
   }

}