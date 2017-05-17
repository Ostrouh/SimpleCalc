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
            log.info("Выражение получено");
            String output = null;
            double result;
            try {
                output = new ReversePolishNotation(input).getPostfixNotation();
                result = new Calc(output).getResult();
                log.info("Результат получен");
                System.out.println("Результат: " + result);
            } catch (IllegalArgumentException e) {
                log.error("Недопустимое выражение: " + e.getMessage(), e);
                System.out.println("Недопустимое выражение: " + e.getMessage());
            }
        }
        reader.close();
        log.info("Конец работы");
    }
}
