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
        Meteor m = new Meteor(5000);
        WatchTower w = new WatchTower();
        w.detect(m);
        Meteor destroyed = w.destroy();
        assert destroyed.distance == m.distance;
    }



}
