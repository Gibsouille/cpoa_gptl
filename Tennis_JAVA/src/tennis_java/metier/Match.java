/***********************************************************************
 * Module:  Match.java
 * Author:  p1402517
 * Purpose: Defines the Class Match
 ***********************************************************************/

package tennis_java.metier;

import java.util.*;

/** @pdOid 98f9c6d3-49d2-4fd9-ba1d-cc0ddce6c3ad */
public class Match {
   /** @pdOid b86c0f80-2342-45a7-89b6-12c88706061e */
   private int numMatch;
   /** @pdOid 7d03ecc9-287b-4d03-8780-c1a9c7ed99ac */
   private String typeMatch;
   /** @pdOid f36b3921-3f05-4ce2-945e-753467e070b8 */
   private Date date;
   /** @pdOid 55a71706-937a-44eb-bfd8-f9838496f993 */
   private String modeJeu;
   /** @pdOid dafa1ba0-94da-49ab-ba37-8c3f64b54aa9 */
   private String trancheHoraire;
   /** @pdOid 97fea6d3-a4a6-4f7d-aa88-672cf15c0385 */
   private int idEquipeVainqueure;
   /** @pdOid 6fabd397-7c9e-4728-b1aa-13ddd76f60b8 */
   private int scoreEquipeGagnante;
   /** @pdOid 44c192f7-94dc-4c24-bf74-36ec75a81a7b */
   private int scoreEquipePerdante;
   
   /** @pdOid 1df517f0-e789-4df4-989b-c2d2b60ace06 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 1f0f6d26-907d-4d3a-adb8-fb1e9e9fb90e */
   public boolean verifierMatchDisponible() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 779aa561-c594-4951-a156-be8487f4481b */
   public boolean enregistrerScores() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid d70812af-558a-4c96-a67d-8a0b6cbf7815 */
   public int affecterEquipesAleatoires() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid b42bb458-e57f-47a5-84f1-1802ec6535e4 */
   public int affecterArbitreChaise() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 61cf863f-513c-4913-8acc-3722418d9f7b */
   public int affecterAutresArbitres() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 904415fa-93e7-4d4a-b86a-8018246e0bf2 */
   public int affecterEquipesRamasseurs() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid bd015e6d-4bd1-44c9-9267-513a83849081 */
   public List<Match> getMatchsHorairesLibres() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid f3136482-b517-4533-8972-049eccf1a4f1 */
   public Match() {
      // TODO: implement
   }
   
   /** @pdOid 29b08e38-2cf9-4ee7-8fc6-f97966ecfee2 */
   public int getNumMatch() {
      return numMatch;
   }
   
   /** @param newNumMatch
    * @pdOid 6fbd6bf2-c183-4089-abbf-cfa10ea1e64f */
   public void setNumMatch(int newNumMatch) {
      numMatch = newNumMatch;
   }
   
   /** @pdOid 6e4e9692-c1b7-4422-9fed-4390c5f6ecda */
   public String getTypeMatch() {
      return typeMatch;
   }
   
   /** @param newTypeMatch
    * @pdOid 2759b31c-b370-40e5-af89-dc2d8040bbc7 */
   public void setTypeMatch(String newTypeMatch) {
      typeMatch = newTypeMatch;
   }
   
   /** @pdOid f9cd1dec-6a5a-4954-bddb-021fbddfc402 */
   public Date getDate() {
      return date;
   }
   
   /** @param newDate
    * @pdOid e4abdf4a-9d53-40d5-9fb3-52b9768b4fae */
   public void setDate(Date newDate) {
      date = newDate;
   }
   
   /** @pdOid e17d6159-adb4-4c5d-9d60-63b48fcd73e1 */
   public String getModeJeu() {
      return modeJeu;
   }
   
   /** @param newModeJeu
    * @pdOid f5a6f765-0ccd-4e43-a3ed-4a9fb7005770 */
   public void setModeJeu(String newModeJeu) {
      modeJeu = newModeJeu;
   }
   
   /** @pdOid 84d95278-b3cf-4319-8994-d8a3abae336a */
   public String getTrancheHoraire() {
      return trancheHoraire;
   }
   
   /** @param newTrancheHoraire
    * @pdOid ba745bcc-6e19-4f8a-b680-0e47ae4537a9 */
   public void setTrancheHoraire(String newTrancheHoraire) {
      trancheHoraire = newTrancheHoraire;
   }
   
   /** @pdOid f7ee6247-3330-4e00-bf5a-2de69124a96d */
   public int getIdEquipeVainqueure() {
      return idEquipeVainqueure;
   }
   
   /** @param newIdEquipeVainqueure
    * @pdOid b87013f5-d43d-4ff6-a281-8bb3d5c5804a */
   public void setIdEquipeVainqueure(int newIdEquipeVainqueure) {
      idEquipeVainqueure = newIdEquipeVainqueure;
   }
   
   /** @pdOid 0acf8045-86e2-459b-a68b-201ef2ceedd2 */
   public int getScoreEquipeGagnante() {
      return scoreEquipeGagnante;
   }
   
   /** @param newScoreEquipeGagnante
    * @pdOid 7d92447b-1c1f-4557-8324-faf1c3a9a91b */
   public void setScoreEquipeGagnante(int newScoreEquipeGagnante) {
      scoreEquipeGagnante = newScoreEquipeGagnante;
   }
   
   /** @pdOid 4817dd3f-c73c-4931-8619-b1aa88ce600f */
   public int getScoreEquipePerdante() {
      return scoreEquipePerdante;
   }
   
   /** @param newScoreEquipePerdante
    * @pdOid c65b595e-9355-4c64-bcb2-409c4f4fb65a */
   public void setScoreEquipePerdante(int newScoreEquipePerdante) {
      scoreEquipePerdante = newScoreEquipePerdante;
   }

}