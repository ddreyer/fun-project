/*
The track where cars drive on.
*/

public class Track {

    private String image;
    private int numOfCars;

    public Track(String img) {
        image = img;
        numOfCars = 1;
    }

    public int getNumOfCars() {
        return numOfCars;
    }
    public static void main(String [] args) {
        final double dt = 0.1, radius = 10, T = 3;
        StdDraw.setScale(-radius, radius);
        StdDraw.picture(0,0,"images/track.jpg");

        /* set image of car */
        String image = "images/car.jpg";

        /* initialize car on track */
        Car car = new Car(image);
        car.draw();

        double time = 0;
        while (time < T) {
            
            car.update(dt);
            StdDraw.picture(0,0,"images/track.jpg");
            counter = 0;
            while (counter < planetNumber) {
                planetArray[counter].draw();
                counter = counter + 1;
            }
            StdDraw.show(10);
            time = time + dt;
        }
        
    }
}