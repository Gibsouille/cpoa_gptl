package modele;

import accesAuxDonnees.DaoEquipe;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import metier.EquipeJoueurs;

public class ModelListEquipes extends AbstractListModel {
    private List<EquipeJoueurs> listeEquipes;
    private List<EquipeJoueurs> equipesDejaAffectees;
    private DaoEquipe dao;
    
    public ModelListEquipes() {
        this.listeEquipes = new ArrayList<>();
        this.equipesDejaAffectees = new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return this.listeEquipes.size();
    }

    @Override
    public EquipeJoueurs getElementAt(int i) {
        return this.listeEquipes.get(i);
    }
    
}
