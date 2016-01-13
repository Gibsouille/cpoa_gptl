package metier;

import accesAuxDonnees.DaoArbitre;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import modele.ModelListEquipes;
import accesAuxDonnees.DaoEquipe;
import accesAuxDonnees.DaoMatch;

public class Match {

    private int numMatch;
    private String typeMatch;
    private java.sql.Date date;
    private String modeJeu;
    private String trancheHoraire;
    private EquipeJoueurs Equipe1;
    private EquipeJoueurs Equipe2;
    private Score score;
    private int numCourt;
    private String phase;
    private Arbitre arbitreDeChaise;
    private EquipeRamasseurs EquipeRamasseur;
    private ArrayList<Arbitre> listeArbitre;
    
    
    //public void verifierMatchDisponible(Date date,String trancheHoraire,int numCourt); {}

    public boolean enregistrerScores(Score score, int set1E1, int set1E2, int set2E1, int set2E2, int set3E1, int set3E2, int set4E1, int set4E2, int set5E1, int set5E2) {
        score = new Score(numMatch,Equipe1.getidEquipe(), Equipe2.getidEquipe(), set1E1, set1E2, set2E1, set2E2, set3E1, set3E2, set4E1, set4E2, set5E1, set5E2);
        return true;
    }

    public boolean affecterEquipesAleatoires(ModelListEquipes modeleL) throws SQLException, ClassNotFoundException, IOException /*A finir*/ {
        int idE1, idE2;
        DaoEquipe Equipe = new DaoEquipe();
        modeleL.chargerEquipesBD();
        idE1 = (int) (Math.random()*100% modeleL.getSize());
        modeleL.trierEquipesDejaAffectees();
        idE2 = (int) (Math.random()*100% modeleL.getSize());
        modeleL.trierEquipesDejaAffectees();
        Equipe1 = Equipe.recupEquipe(idE1);
        Equipe2 = Equipe.recupEquipe(idE2);
        System.out.println(Equipe1 + "2: " + Equipe2);
        return true;
    }

    public void affecterArbitreChaise(int idarbitre) throws SQLException, ClassNotFoundException, IOException {
        DaoArbitre DaoArbitre = new DaoArbitre();
        Arbitre arbitre = DaoArbitre.recupererArbitre(idarbitre);
        if (arbitre.getNbMatchsChaiseDouble() > 4 || arbitre.getNbMatchsChaiseSimple() > 4) {
            System.out.println("Cet arbitre à déjà fait trop de ce type de match");
        }else if (Equipe1.getJoueur1().getNationalite().equals(arbitre.getNationalite())) {
            System.out.println("L'arbitre a la meme nationalité que le joueur1 de l'equipe1");
        } else if (Equipe1.getJoueur2().getNationalite().equals(arbitre.getNationalite())) {
            System.out.println("L'arbitre a la meme nationalité que le joueur2 de l'equipe1");
        }else if (Equipe2.getJoueur1().getNationalite().equals(arbitre.getNationalite())) {
            System.out.println("L'arbitre a la meme nationalité que le joueur1 de l'equipe2");
        } else if (Equipe2.getJoueur2().getNationalite().equals(arbitre.getNationalite())) {
            System.out.println("L'arbitre a la meme nationalité que le joueur2 de l'equipe2");
        } else{
           arbitreDeChaise = arbitre;
           DaoArbitre.ajouterArbitreAMatch(idarbitre, numMatch);
        }
    }

    public void affecterAutresArbitres(int idArbitre) throws SQLException, ClassNotFoundException, IOException {
        DaoArbitre DaoArbitre = new DaoArbitre();
        DaoArbitre.ajouterArbitreAMatch(idArbitre, numMatch);
        listeArbitre = DaoArbitre.recupererArbitreParMatch(numMatch);    
    }

    public void affecterEquipesRamasseurs(EquipeRamasseurs EquipeRamasseur) {
        this.EquipeRamasseur = EquipeRamasseur;
    }

    public static List<Match> getMatchsHorairesLibres() {
        DaoMatch DaoMatch = new DaoMatch();
        return null;
    }


    public Match(int numMatch,int numCourt, String typeMatch, java.sql.Date date, String modeJeu, String trancheHoraire,String phase, EquipeJoueurs Equipe1, EquipeJoueurs Equipe2) {
        this.numMatch = numMatch;
        this.numCourt = numCourt;
        this.typeMatch = typeMatch;
        this.date = date;
        this.modeJeu = modeJeu;
        this.trancheHoraire = trancheHoraire;
        this.phase = phase;
        this.Equipe1 = Equipe1;
        this.Equipe2 = Equipe2;
    }

    
    
    public int getNumMatch() {
        return numMatch;
    }

    public void setNumMatch(int numMatch) {
        this.numMatch = numMatch;
    }

    public String getTypeMatch() {
        return typeMatch;
    }

    public void setTypeMatch(String typeMatch) {
        this.typeMatch = typeMatch;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public String getModeJeu() {
        return modeJeu;
    }

    public void setModeJeu(String modeJeu) {
        this.modeJeu = modeJeu;
    }

    public String getTrancheHoraire() {
        return trancheHoraire;
    }

    public void setTrancheHoraire(String trancheHoraire) {
        this.trancheHoraire = trancheHoraire;
    }

    public EquipeJoueurs getEquipe1() {
        return Equipe1;
    }

    public void setEquipe1(EquipeJoueurs Equipe1) {
        this.Equipe1 = Equipe1;
    }

    public EquipeJoueurs getEquipe2() {
        return Equipe2;
    }

    public void setEquipe2(EquipeJoueurs Equipe2) {
        this.Equipe2 = Equipe2;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public int getNumCourt() {
        return numCourt;
    }

    public void setNumCourt(int numCourt) {
        this.numCourt = numCourt;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Arbitre getArbitreDeChaise() {
        return arbitreDeChaise;
    }

    public void setArbitreDeChaise(Arbitre arbitreDeChaise) {
        this.arbitreDeChaise = arbitreDeChaise;
    }

    public EquipeRamasseurs getEquipeRamasseur() {
        return EquipeRamasseur;
    }

    public void setEquipeRamasseur(EquipeRamasseurs EquipeRamasseur) {
        this.EquipeRamasseur = EquipeRamasseur;
    }

    public ArrayList<Arbitre> getListeArbitre() {
        return listeArbitre;
    }

    public void setListeArbitre(ArrayList<Arbitre> listeArbitre) {
        this.listeArbitre = listeArbitre;
    }
    
    
    
    
}
