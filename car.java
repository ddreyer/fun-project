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
        x = x + xVelo*dt;
        y = y + yVelo*dt;
    }

    /* update the position of the car when mouse has been pressed */
    public void update(double dt, double mouseX, double mouseY) {
        double distance = Math.sqrt(Math.pow(mouseX - x, 2) + 
            Math.pow(mouseY - y, 2)); // distance between mouse and car
            
        normalizeVector(mouseX, mouseY, distance);
        update(dt);
    }

    /* method to normalized velocity vectors */
    public void normalizeVector(double mouseX, double mouseY, double distance) {
        xVelo = (mouseX - x)/distance;
        yVelo = (mouseY - y)/distance;
    }
}

