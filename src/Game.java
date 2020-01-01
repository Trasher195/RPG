import java.io.IOException;

public class Game {
    public static CoreLogic l;

    public static void main(String[] args) throws IOException {
        Display.DisplayInit("Core v0.0.1",950,675);
        l = new CoreLogic();

    }
}
