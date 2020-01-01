import java.io.IOException;

public class CoreLogic {

    public static int[][] world;

    static {
        try {
            world = MapLoader.LoadMap("/home/artem/IdeaProjects/2DCoRE v.0.0.1/bin/map/world.map");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    CoreLogic(){

    }

}
