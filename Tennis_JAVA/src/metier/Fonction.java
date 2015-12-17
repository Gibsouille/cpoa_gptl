/***********************************************************************
 * Module:  Fonction.java
 * Author:  p1402517
 * Purpose: Defines the Class Fonction
 ***********************************************************************/

package metier;

import java.util.*;

/** @pdOid 7ee2fad2-4295-4d95-8db9-f355f38a60c6 */
public class Fonction {
   /** @pdOid f68b60ad-f8bd-476e-8d7b-c3b3e36a870c */
   private String fonctionArbitre;
   
   /** @pdOid 38a2d53e-efc5-40bb-9c93-a3241d70da26 */
   public String getFonctionArbitre() {
      return fonctionArbitre;
   }
   
   /** @param newFonctionArbitre
    * @pdOid 2554144b-3cab-4907-b991-310d35882787 */
   public void setFonctionArbitre(String newFonctionArbitre) {
      fonctionArbitre = newFonctionArbitre;
   }

}