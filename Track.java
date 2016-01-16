/*
The track where cars drive on.
*/

public class Track {

    public final int numberOfCars = 3;
    public final double dt = 0.1;

    public Track() {
    }

    public static void main(String [] args) {
        StdDraw.picture(0,0,"images/track.jpg");
        
        double startX = ;
        double startY = ;

        /* set image of car */
        String image = new String[]'images/car1.png','images/car2.png','images/car3.jpg'};

        /* initialize car on track */
        Car car = new Car(image,startX,startY);
        
        
    }
}