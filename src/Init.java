import java.awt.*;
import java.io.IOException;

public class Init {

    public static Image bg;
    public static Image grass;
    public static Image smallframe;
    public static Image frame;

    static {
        try {
           bg = MapLoader.LoadIm("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/tex/woodplank.png");
           grass = MapLoader.LoadIm("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/tex/grass.png");
           frame =  MapLoader.LoadIm("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/tex/Frame.png");
           smallframe = MapLoader.LoadIm("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/tex/smallframe.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Init() throws IOException {


    }
}
