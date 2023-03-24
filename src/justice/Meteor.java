package justice;

public class Meteor implements Comparator<Meteor> {
   int distance;
   public Meteor(int distance){
        this.distance = distance;
   }

   public int getDistance() {
        return this.distance;
   }
}
