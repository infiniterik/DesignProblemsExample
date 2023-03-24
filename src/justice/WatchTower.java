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
        this.pq = new PriorityQueue<>(10, new Comparator<Meteor> () {

            @Override
            public int compare(Meteor e1, Meteor e2) {
                return e1.getDistance() - e2.getDistance();
            }
        });
    }

    public boolean destroy() {
        Meteor toBeDestroyed = this.pq.poll();
        if (toBeDestroyed != null) {
            return true;
        } return false;
    }

    public void detectMeteor(Meteor m) {
        this.pq.add(m);
    }

}
