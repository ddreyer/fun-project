public class Car {
    private String img;
    private double xVelo, yVelo, x, y;

    public Car(String img, double startX, double startY) {
        this.img = img;
        yVelo = 0;
        xVelo = 0;
        x = startX;
        y = startY;
    }

    public void setXVelo(double newXVelo) {
        xVelo = newXVelo;
    }

    public double getXVelo() {
        return xVelo;
    }

    public void setYVelo(double newYVelo) {
        yVelo = newYVelo;
    }

    public double getYVelo() {
        return yVelo;
    }

    /* draw the car on the track */
    public void draw() {
        StdDraw.picture(x,y,img);
    }

    /* update movement of the car */
    public void update() {
        
    }
}

