import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GamePanel extends JPanel {

    GamePanel() {



    }
    public void paintComponent (Graphics gr) {
        Image  bg = Init.bg;
        Image  grass = Init.grass;

        //отрисовка заднего фона
        for(int k = 0; k <10; k++){
            for(int i = 0; i <10; i++) {
                gr.drawImage(bg, 0 + 106 * k, 0 + 106 * i, null);
            }
        }
        // отрисовка игрового поля
        for(int i = 0; i<9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Game.l.world[i][j] == 0) {
                    gr.drawImage(grass, 10+j*70, 10+i*70, 70, 70, null);
                }
            }
        }
        //отрисовка сетки
        for (int i = 0; i <= 9; i++) {
            gr.drawLine(10 + i * 70, 10, 10 + i * 70, 640);

            gr.drawLine(10, 10 + i * 70, 640, 10 + i * 70);
        }
        //отрисовка статов персонажа
        gr.fillRect(650,50,120,150);


        gr.fillRect(792,52,118,23);
        gr.drawImage(Init.frame,780,50,null);

        for(int i = 0; i < 4; i++) {
            for(int k = 0; k < 3; k++) {
                gr.fillRect(650 + 50 * i, 220 + 50 * k, 50, 50);
                gr.drawImage(Init.smallframe, 650 + 50 * i, 220 + 50 * k, 50, 50, null);
            }
        }



    }
}
