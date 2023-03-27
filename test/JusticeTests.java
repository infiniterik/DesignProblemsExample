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

}
