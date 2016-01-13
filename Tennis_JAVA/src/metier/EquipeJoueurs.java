
package metier;

import java.util.*;
import accesAuxDonnees.DaoEquipe;

public class EquipeJoueurs {
   private final int idEquipe;
   private Joueur joueur1;
   private Joueur joueur2;

    public EquipeJoueurs(int idEquipe, Joueur idJoueur1, Joueur idJoueur2) {
        this.idEquipe = idEquipe;
        this.joueur1 = idJoueur1;
        this.joueur2 = idJoueur2;
    }
    
   
   public int getidEquipe(){
       return idEquipe;
   }
   
   public Joueur getJoueur1() {
      return joueur1;
   }
   
   public void setJoueur1(Joueur newJoueur1) {
      joueur1 = newJoueur1;
   }
   
   public Joueur getJoueur2() {
      return joueur2;
   }
   
   public void setJoueur2(Joueur newJoueur2) {
      joueur2 = newJoueur2;
   }

}