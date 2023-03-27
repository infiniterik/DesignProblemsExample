package justice;

/**
 * A simple class to represent a meteor
 * Only contains the distance from the watchtower
 * Use the getDistance() method to get the distance
 */

public class Meteor {
   int distance;

   // Create a new meteor with the given distance
   public Meteor(int distance){
        this.distance = distance;
   }

   // Get the distance of the meteor from the watchtower
   public int getDistance() {
        return this.distance;
   }
}
