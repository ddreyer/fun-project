/*
The track where cars drive on.
*/

public class Track {

    private String image;
    private int numOfCars;

    public Track(String img) {
        image = img;
        numOfCars = 1;
<<<<<<< HEAD
    }

    public int getNumOfCars() {
        return numOfCars;
=======
>>>>>>> 224bca7a6631ac597b47bacb99de8aee09a4ffa8
    }

    public int getNumOfCars() {
        return numOfCars;
    }
    public static void main(String [] args) {
<<<<<<< HEAD
        final double dt = 0.1, radius = 10, T = 10;
=======
        final double dt = 0.1, radius = 10, T = 3;
>>>>>>> 224bca7a6631ac597b47bacb99de8aee09a4ffa8
        StdDraw.setScale(-radius, radius);
        StdDraw.picture(0,0,"images/track.jpg");

        /* set image of car */
        String image = "images/car.jpg";

        /* initialize car on track */
        Car car = new Car(image);
        car.draw();

<<<<<<< HEAD
        /* loop that animates the car */
        double time = 0;
        while (time < T) {
            if (StdDraw.mousePressed()) {
                double mouseX = StdDraw.mouseX();
                double mouseY = StdDraw.mouseY();
                car.update(dt, mouseX, mouseY); // update car with new velocity
            } else {
                car.update(dt);
            }
            StdDraw.picture(0,0,"images/track.jpg");
            car.draw();
            
            StdDraw.show(10);
            time = time + dt;
        }
        StdOut.print(car.getXpos());
        StdOut.print(car.getYpos());
=======
        double time = 0;
        while (time < T) {
            if (StdDraw.mousePressed) {

            } else {

            }

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
>>>>>>> 224bca7a6631ac597b47bacb99de8aee09a4ffa8
        
    }
}