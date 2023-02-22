package Calculator.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class Log {
    public void logInfo(double x, double y, double result) {
        try (
                FileWriter writer = new FileWriter("C:\\Users\\Operator\\IdeaProjects\\java_project\\src\\Calculator\\Logger\\log.txt", true))


        {
            String text = String.format("", x, y, result);
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
