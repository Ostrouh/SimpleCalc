import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by ostrouh on 15.05.2017.
 */
public class Main extends Application {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        launch(args);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        while (!(input = reader.readLine()).equals("exit")) {
//            log.info("Expression recieved");
//            String output = null;
//            try {
//                output = ReversePolishNotation.createOutput(input);
//                double result = new Calc().getResult(output);
//                log.info("Result recieved");
//                System.out.println("Result is: " + result);
//            } catch (IllegalArgumentException e) {
//                log.error("Illegal expression: " + e.getMessage(), e);
//                System.out.println("Illegal expression: " + e.getMessage());
//            }
//        }
//        reader.close();
//        log.info("Конец работы");
//        reader.close();
//        log.info("End of work");
    }
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("SimpleCalc");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

