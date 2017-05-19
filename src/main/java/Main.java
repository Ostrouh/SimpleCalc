import Model.Calc;
import Model.ReversePolishNotation;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ostrouh on 15.05.2017.
 */
public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        String input;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!(input = reader.readLine()).equals("exit")) {
            log.info("Expression recieved");
            String output = null;
            try {
                output = ReversePolishNotation.createOutput(input);
                double result = new Calc().getResult(output);
                log.info("Result recieved");
                System.out.println("Result is: " + result);
            } catch (IllegalArgumentException e) {
                log.error("Illegal expression: " + e.getMessage(), e);
                System.out.println("Illegal expression: " + e.getMessage());
            }
        }
        reader.close();
        log.info("End of work");
    }
}
