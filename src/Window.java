import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        this.setSize(900, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        ScenePanel scenePanel = new ScenePanel(0, 0, 900, 700);
        this.add(scenePanel);

        this.setVisible(true);


    }
}
