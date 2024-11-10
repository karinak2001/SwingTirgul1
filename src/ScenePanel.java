import javax.swing.*;
import java.awt.*;

public class ScenePanel extends JPanel {
    private Car car;
    public ScenePanel(int x, int y, int width, int height){
        this.setBounds(x, y, width, height);
        this.car = new Car(100, 100);
    }



    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        this.car.paint(graphics);
    }
}
