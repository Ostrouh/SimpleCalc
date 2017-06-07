import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by ostrouh on 15.05.2017.
 */
public class Main extends Application {
    protected static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        log.info("Start working");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
//        primaryStage.setTitle("SimpleCalc");
        primaryStage.setScene(new Scene(root));
        primaryStage.getScene().getStylesheets().add("css/DarkTheme.css");
        primaryStage.setResizable(false);
        Image icon = new Image("images/icon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.show();

        log.info("Calc started");
    }
}
