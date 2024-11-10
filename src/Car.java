import java.awt.*;

public class Car {
    private int x;
    private int y;

    public Car(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void paint(Graphics graphics){
        graphics.setColor(Color.MAGENTA);
        graphics.fillRect(this.x, this.y, Constants.WIDTH_BODY, Constants.HEIGHT_BODY);
        graphics.fillRect(this.x + 50, this.y - 80, Constants.WIDTH_BODY_TOP, Constants.HEIGHT_BODY_TOP);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(this.x + Constants.WIDTH_BODY /10, this.y + 50, Constants.WHEEL_SIZE, Constants.WHEEL_SIZE);
        graphics.fillOval(this.x + Constants.WIDTH_BODY * 7/10, this.y + 50, Constants.WHEEL_SIZE, Constants.WHEEL_SIZE);
        graphics.setColor(Color.GRAY);
        graphics.fillRect(this.x + 60, this.y - 70, Constants.WIDTH_WINDOW, Constants.HEIGHT_WINDOW);
        graphics.fillRect(this.x + 155, this.y - 70, Constants.WIDTH_WINDOW, Constants.HEIGHT_WINDOW);
    }
}
