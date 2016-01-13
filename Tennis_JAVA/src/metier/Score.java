package metier;

import java.util.ArrayList;

public class Score {
    
    private int match;
    private int idEquipe1;
    private int idEquipe2;
    private int set1E1;
    private int set1E2;
    private int set2E1;
    private int set2E2;
    private int set3E1;
    private int set3E3;
    private int set4E1;
    private int set4E2;
    private int set5E1;
    private int set5E2;
    private ArrayList listeSetE1;
    private ArrayList listeSetE2;
    private int setE2 = 0;
    private int setE1 = 0;

    public int getIdEquipe1() {
        return idEquipe1;
    }

    public void setIdEquipe1(int idEquipe1) {
        this.idEquipe1 = idEquipe1;
    }

    public int getIdEquipe2() {
        return idEquipe2;
    }

    public void setIdEquipe2(int idEquipe2) {
        this.idEquipe2 = idEquipe2;
    }

    public int getSet1E1() {
        return set1E1;
    }

    public void setSet1E1(int set1E1) {
        this.set1E1 = set1E1;
    }

    public int getSet1E2() {
        return set1E2;
    }

    public void setSet1E2(int set1E2) {
        this.set1E2 = set1E2;
    }

    public int getSet2E1() {
        return set2E1;
    }

    public void setSet2E1(int set2E1) {
        this.set2E1 = set2E1;
    }

    public int getSet2E2() {
        return set2E2;
    }

    public void setSet2E2(int set2E2) {
        this.set2E2 = set2E2;
    }

    public int getSet3E1() {
        return set3E1;
    }

    public void setSet3E1(int set3E1) {
        this.set3E1 = set3E1;
    }

    public int getSet3E3() {
        return set3E3;
    }

    public void setSet3E3(int set3E3) {
        this.set3E3 = set3E3;
    }

    public int getSet4E1() {
        return set4E1;
    }

    public void setSet4E1(int set4E1) {
        this.set4E1 = set4E1;
    }

    public int getSet4E2() {
        return set4E2;
    }

    public void setSet4E2(int set4E2) {
        this.set4E2 = set4E2;
    }

    public int getSet5E1() {
        return set5E1;
    }

    public void setSet5E1(int set5E1) {
        this.set5E1 = set5E1;
    }

    public int getSet5E2() {
        return set5E2;
    }

    public void setSet5E2(int set5E2) {
        this.set5E2 = set5E2;
    }

    public ArrayList getListeSetE1() {
        return listeSetE1;
    }

    public void setListeSetE1(ArrayList listeSetE1) {
        this.listeSetE1 = listeSetE1;
    }

    public ArrayList getListeSetE2() {
        return listeSetE2;
    }

    public void setListeSetE2(ArrayList listeSetE2) {
        this.listeSetE2 = listeSetE2;
    }

    public int getSetE2() {
        return setE2;
    }

    public void setSetE2(int setE2) {
        this.setE2 = setE2;
    }

    public int getSetE1() {
        return setE1;
    }

    public void setSetE1(int setE1) {
        this.setE1 = setE1;
    }

    public Score(int match,int idEquipe1, int idEquipe2, int set1E1, int set1E2, int set2E1, int set2E2, int set3E1, int set3E2, int set4E1, int set4E2, int set5E1, int set5E2) {
        this.match = match;
        this.idEquipe1 = idEquipe1;
        this.idEquipe2 = idEquipe2;
        this.set1E1 = set1E1;
        this.set1E2 = set1E2;
        this.set2E1 = set2E1;
        this.set2E2 = set2E2;
        this.set3E1 = set3E1;
        this.set3E3 = set3E2;
        this.set4E1 = set4E1;
        this.set4E2 = set4E2;
        this.set5E1 = set5E1;
        this.set5E2 = set5E2;
        listeSetE1.add(set1E1);
        listeSetE1.add(set2E1);
        listeSetE1.add(set3E1);
        listeSetE1.add(set4E1);
        listeSetE1.add(set5E1);
        listeSetE2.add(set1E2);
        listeSetE2.add(set2E2);
        listeSetE2.add(set3E2);
        listeSetE2.add(set4E2);
        listeSetE2.add(set5E2);
    }

    public int calculerEquipeV() {
        for (int i = 0; i <= listeSetE1.size(); i++) {
            if ((int) listeSetE1.get(i) > (int) listeSetE2.get(i)) {
                this.setE1++;
            } else if ((int) listeSetE1.get(i) > (int) listeSetE2.get(i)) {
                this.setE2++;
            }
        }
        if(this.setE1>this.setE2){
            return this.setE1;
        }
        else if(this.setE1<this.setE2){
            return this.setE2;
        }
        return 0;
    }

}
