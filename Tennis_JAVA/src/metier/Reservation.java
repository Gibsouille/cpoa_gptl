/***********************************************************************
 * Module:  Reservation.java
 * Author:  p1402517
 * Purpose: Defines the Class Reservation
 ***********************************************************************/

package metier;

import java.util.*;

/** @pdOid d28d22ae-065d-43bc-b61b-39404b3a7724 */
public class Reservation {
   /** @pdOid 169f80d7-14f4-420e-a029-6c4e0e73aa13 */
   private int numReservation;
   /** @pdOid 5199870b-db9a-455a-8047-fdd0ef55aa11 */
   private String trancheHoraire;
   /** @pdOid 65542400-50a2-429c-8f29-f38fe90b4a1f */
   private Date date;
   
   /** @pdOid a49f1855-e5c9-4841-a7ab-62f392a6c225 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 92a1d249-f60c-48a2-9ae4-84efde8c88ed */
   public List<Reservation> getReservationsHorairesLibres() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 2303fdbe-e748-4527-a7ff-9fa442e27ae1 */
   public Reservation() {
      // TODO: implement
   }
   
   /** @pdOid 1337761c-6798-41a9-a7d2-bc5ce6c3bc00 */
   public int getNumReservation() {
      return numReservation;
   }
   
   /** @param newNumReservation
    * @pdOid ecf7259e-5766-46cc-aa36-4261e7cf1497 */
   public void setNumReservation(int newNumReservation) {
      numReservation = newNumReservation;
   }
   
   /** @pdOid ddff7040-3a53-41ec-89c1-b463025b667b */
   public String getTrancheHoraire() {
      return trancheHoraire;
   }
   
   /** @param newTrancheHoraire
    * @pdOid 17da6bc2-21b9-48c7-9ab4-28cd1d895383 */
   public void setTrancheHoraire(String newTrancheHoraire) {
      trancheHoraire = newTrancheHoraire;
   }
   
   /** @pdOid 9ce71720-8b52-4cfd-b983-db04d91bb301 */
   public Date getDate() {
      return date;
   }
   
   /** @param newDate
    * @pdOid 681d5552-0e02-48ed-806d-2601ca5a0f89 */
   public void setDate(Date newDate) {
      date = newDate;
   }

}