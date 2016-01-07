package modele;

import accesAuxDonnees.DaoEquipe;
import accesAuxDonnees.DaoMatch;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import metier.EquipeJoueurs;
import metier.Match;

public class ModelListEquipes extends AbstractListModel {
    private List<EquipeJoueurs> listeEquipes;
    private List<EquipeJoueurs> equipesDejaAffectees;
    private List<Match> listeMatchs;
    private DaoEquipe daoEquipe;
    private DaoMatch daoMatch;
    
    public ModelListEquipes(DaoEquipe daoEquipe, DaoMatch daoMatch) {
        this.daoEquipe = daoEquipe;
        this.daoMatch = daoMatch;
        this.listeEquipes = new ArrayList<>();
        this.equipesDejaAffectees = new ArrayList<>();
        this.listeMatchs = new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return this.listeEquipes.size();
    }

    @Override
    public EquipeJoueurs getElementAt(int i) {
        return this.listeEquipes.get(i);
    }
    
    public void chargerEquipesBD() throws SQLException, ClassNotFoundException, IOException {
        this.daoEquipe.charger(listeEquipes);
    }
    
    private void trierEquipesDejaAffectees() throws SQLException, ClassNotFoundException, IOException {
        this.daoMatch.charger(listeMatchs);
        
        for (Match m : listeMatchs) {
            
        }
    }
}
