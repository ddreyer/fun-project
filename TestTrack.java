import org.junit.Test;
import static org.junit.Assert.*;

/*
Tests for the track and car
*/

public class TestTrack {

    @Test
    public void testInit() {
        Track t = new Track("images/track.jpg");
        assertEquals(1, t.getNumOfCars());
    }

    @Test
    public void testCar() {
        Car c = new Car("images/car.jpg");
        assertEquals(0,c.getXpos(),0.01);
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestTrack.class);
    }
}