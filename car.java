/*
A car on the track
*/

public class Car {
    private String img;
    private double xVelo, yVelo, x, y;

    public Car(String img) {
        this.img = img;
        xVelo = 2; 
        yVelo = 2;
        x = 0;
        y = 0;
    }

    public double getXpos() {
        return x;
    }

    public double getYpos() {
        return y;
    }

    /* draw the car on the track */
    public void draw() {
        StdDraw.picture(x, y, img, 1, 1);
    }

    /* update the position of the car */
    public void update(double dt) {
        x = x + xVelo*dt;
        y = y + yVelo*dt;
    }
}

