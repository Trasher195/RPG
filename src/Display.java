import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    public static void DisplayInit(String name, int w, int h){
        Display d = new Display();
        d.setDefaultCloseOperation(EXIT_ON_CLOSE);
        d.setTitle(name);
        d.setSize(w,h);
        d.setVisible(true);
        d.PanelInit();
    }
    public void PanelInit(){
        GamePanel pan = new GamePanel();
        Container con = getContentPane();
        con.add(pan);
    }



}
