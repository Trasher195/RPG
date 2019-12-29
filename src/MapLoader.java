import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class MapLoader {

    public static void WriteMap() throws IOException {
        FileWriter writer;
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/map/world.map"), "UTF-8"));
        writer = new FileWriter("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/map/world.map", true);
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 8; k++) {
                br.write(CoreLogic.world[i][k] + " ");
            }

        }
       br.flush();
        br.close();
    }

    public  static int[][] LoadMap()  {

        FileReader fr;
        int[][] READ = new int[8][8];

        try {
            fr = new FileReader("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/map/world.map");
            Scanner scan = new Scanner(fr);
            if(scan.hasNextInt()) {
                for (int i = 0; i < 8; i++) {
                    for (int k = 0; k < 8; k++) {
                        READ[i][k] = scan.nextInt();

                    }
                }

            }


            try {
                fr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return READ;
    }

    public static Image LoadIm(String PATH) throws IOException {
        Image im = ImageIO.read(new File(PATH));
        return im;
    }

}
