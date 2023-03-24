package justice;

import java.util.PriorityQueue;


public class WatchTower {
    /**
     * WatchTower receives Meteors from Vandal Savage and adds them to the priority queue
     * WatchTower can also destroy meteors taking the closest meteor from the queue.
     */
    PriorityQueue<Meteor> pq;
    public WatchTower(){
        PriorityQueue<T> pq = new PriorityQueue<>(initialCapacity, new Comparator<Meteor> () {

            @Override
            public int compare(T e1, T e2) {
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

    public detectMeteor()

}
