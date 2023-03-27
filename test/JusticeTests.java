import java.util.Arrays;
import static org.junit.Assert.fail;
import org.junit.Test;

import justice.*;

public class JusticeTests {
    @Test
    public void initializeWatchTower(){
        WatchTower w = new WatchTower();
    }

    @Test
    public void addMeteor() {
        // test adding a single meteor to the watchtower and destroying it
        Meteor m = new Meteor(5000);
        WatchTower w = new WatchTower();
        w.detectMeteor(m);
        Meteor destroyed = w.destroy();
        assert destroyed.getDistance() == m.getDistance();
    }

    @Test
    public void addMultipleMeteors() {
        // add multiple meteors to the watchtower and destroy them in order
        int[] distances = {5000, 10000, 15000, 20000, 25000};
        WatchTower w = new WatchTower();
        for(int distance : distances) {
            w.detectMeteor(new Meteor(distance));
        }
        for(int distance : distances) {
            Meteor destroyed = w.destroy();
            assert destroyed.getDistance() == distance;
        }
    }

    @Test
    public void addMultipleMeteorsOutOfOrder() {
        // add multiple meteors to the watchtower and destroy them in order
        int[] distances = {100, 33, 9990, 21, 20000};
        WatchTower w = new WatchTower();
        for(int distance : distances) {
            w.detectMeteor(new Meteor(distance));
        }
        Arrays.sort(distances);
        for(int distance : distances) {
            Meteor destroyed = w.destroy();
            assert destroyed.getDistance() == distance;
        }
    }

    @Test
    public void addRemoveAddRemove() {
        // add multiple meteors to the watchtower
        int[] distances = {100, 33, 9990, 21, 20000};
        WatchTower w = new WatchTower();
        for(int distance : distances) {
            w.detectMeteor(new Meteor(distance));
        }
        assert w.destroy().getDistance() == 21;
        assert w.destroy().getDistance() == 33;
        int[] distances2 = {245, 12, 90, 1123, 3000};
        for(int distance : distances2) {
            w.detectMeteor(new Meteor(distance));
        }
        int[] distances3 = new int[distances.length + distances2.length - 2];
        Arrays.sort(distances);
        // I find Java to be quite verbose
        // I'm sure there's a better way to do this
        // but the tests don't have to be efficient, just thorough
        for(int i = 2; i < distances.length; i++) {
            distances3[i-2] = distances[i];
        }
        for(int i = 0; i < distances2.length; i++) {
            distances3[distances.length-2 + i] = distances2[i];
        }
        Arrays.sort(distances3);
        for(int distance : distances3) {
            Meteor destroyed = w.destroy();
            assert destroyed.getDistance() == distance;
        }
    }

}
