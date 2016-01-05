public class Track {
    public static void main(String [] args) {
        StdDraw.picture(0,0,"images/track.jpg");

        /* set constants */
        final double dt = 0.1;
        final int numberOfCars = 3;
        double startX = ;
        double startY = ;

        /* set images of cars */
        String[] images = new String[]{'images/car1.png','images/car2.png','images/car3.jpg'};

        /* initialize cars on track */
        counter = 0;
        Car[] carArray = new Car[numberOfCars];
        while (counter < numberOfCars) {
            carArray[counter] = new Car(images[counter],startX,startY)
            counter++;
        }
        
    }
}