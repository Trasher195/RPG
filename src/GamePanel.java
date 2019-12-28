import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GamePanel extends JPanel {

    GamePanel() {



    }
    public void paintComponent (Graphics gr) {
        Image  im = null;
        Image  grass = null;
        try {
            im = ImageIO.read(new File("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/tex/woodplank.png"));
            grass = ImageIO.read(new File("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/tex/grass.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int k = 0; k <10; k++){
            for(int i = 0; i <10; i++) {
                gr.drawImage(im, 0 + 106 * k, 0 + 106 * i, null);
            }
        }

        for(int i = 0; i<9; i++) {
            for (int j = 0; j < 9; j++) {
                if (CoreLogic.world[i][j] == 0) {
                    gr.drawImage(grass, 10+j*70, 10+i*70, 70, 70, null);
                }
            }
        }

        for (int i = 0; i <= 9; i++) {
            gr.drawLine(10 + i * 70, 10, 10 + i * 70, 640);

            gr.drawLine(10, 10 + i * 70, 640, 10 + i * 70);
        }
    }
}
