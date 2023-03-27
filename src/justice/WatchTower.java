package justice;

import java.util.PriorityQueue;
import java.util.Comparator;


public class WatchTower {
    /**
     * WatchTower receives Meteors from Vandal Savage and adds them to the priority queue
     * WatchTower can also destroy meteors taking the closest meteor from the queue.
     */
    PriorityQueue<Meteor> pq;
    public WatchTower(){

        // Create a new priority queue with a comparator that compares the distance of the meteors
        // the comparator is an anonymous class that implements the Comparator interface for Meteor
        this.pq = new PriorityQueue<>(10, new Comparator<Meteor> () {
            // Implement the compare method to compare the distance of the meteors
            @Override
            public int compare(Meteor e1, Meteor e2) {
                return e1.getDistance() - e2.getDistance();
            }
        });
    }

    // remove the closest meteor from the queue and return it
    // consider this to be destroying the meteor
    public Meteor destroy() {
        return this.pq.poll();
    }

    // detect and add a new Meteor to the priority queue
    public void detectMeteor(Meteor m) {
        this.pq.add(m);
    }

}
