import java.lang.Math;
/*
A car on the track
*/

public class Car {
    private String img;
    private double xVelo, yVelo, x, y;

    public Car(String img) {
        this.img = img;
        xVelo = 1/Math.sqrt(2); 
        yVelo = 1/Math.sqrt(2);
        x = 0;
        y = 0;
    }

    /* accessor method */
    public double getXpos() {
        return x;
    }

    /* accessor method */
    public double getYpos() {
        return y;
    }

    /* draw the car on the track */
    public void draw() {
        StdDraw.picture(x, y, img, 1, 1);
    }

    /* update the position of the car */
    public void update(double dt) {
        if (distance(0, 0, x, y) > 9) { // keeps car on the track
            xVelo = -xVelo;
            yVelo = -yVelo;
        }
        x = x + xVelo*dt;
        y = y + yVelo*dt;
    }

    /* update the position of the car when mouse has been pressed */
    public void update(double dt, double mouseX, double mouseY) {
        double distance = distance(x, y, mouseX, mouseY);
        normalizeVector(mouseX, mouseY, distance);
        update(dt);
    }

    /* returns distance between two points */
    public double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + 
                Math.pow(y2 - y1, 2));
    }

    /* method to normalize velocity vectors */
    public void normalizeVector(double mouseX, double mouseY, double distance) {
        xVelo = (mouseX - x)/distance;
        yVelo = (mouseY - y)/distance;
    }
}

