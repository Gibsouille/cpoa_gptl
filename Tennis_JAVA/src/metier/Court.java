/***********************************************************************
 * Module:  Court.java
 * Author:  p1402517
 * Purpose: Defines the Class Court
 ***********************************************************************/

package metier;

import java.util.*;

/** @pdOid a9f3a8db-23a7-4c8b-83b0-e8cb51ea7d76 */
public class Court {
   /** @pdOid d53a1462-2596-4069-861e-ad9006a6e37e */
   private int numCourt;
   /** @pdOid d901278e-8663-40d0-b5d5-ad8df0395a4b */
   private String type;
   
   /** @pdOid f57b6073-a250-47c0-b2d8-648734499bfc */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 9c838ba2-294f-493a-b44c-0884c74376dc */
   public boolean estReserve() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid ca39217e-be03-479e-8f59-c57d23ca237a */
   public Court() {
      // TODO: implement
   }
   
   /** @pdOid ba4ffa60-4a09-4cb0-90b0-8dc9fbbe2029 */
   public String getType() {
      return type;
   }
   
   /** @param newType
    * @pdOid 0b5b317b-5027-443d-824f-79dcc759efa6 */
   public void setType(String newType) {
      type = newType;
   }
   
   /** @pdOid 520811ab-e0c9-4c59-8fbf-c3cf919bf9f7 */
   public int getNumCourt() {
      return numCourt;
   }
   
   /** @param newNumCourt
    * @pdOid eaf40db2-fbb2-48fe-a8a7-edd70332f083 */
   public void setNumCourt(int newNumCourt) {
      numCourt = newNumCourt;
   }

}