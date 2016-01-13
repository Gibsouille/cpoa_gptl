package app;

import accesAuxDonnees.DaoMatch;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Planning;

public class TennisJavaApp {

    public static void main(String[] args) {
        DaoMatch daoMatch;
        try {
            daoMatch = new DaoMatch();
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Fenetre(new Planning(1, daoMatch)).setVisible(true);
                }
            });
        } catch (Exception ex) {
            Logger.getLogger(TennisJavaApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}