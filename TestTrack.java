import org.junit.Test;
import static org.junit.Assert.*;

/*
Tests for the track and car
*/

public class TestTrack {

    @Test
    public void testInit() {
        Track t = new Track();
        assertEquals(3,t.numberOfCars);
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestTrack.class);
    }
}