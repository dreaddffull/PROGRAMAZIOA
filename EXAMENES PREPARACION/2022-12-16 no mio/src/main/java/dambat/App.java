package dambat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    //Creamos el ArrayList aqui y lo hacemos public para que todos puedan utilizarlo 
    //y se vayan añadiendo los Langiles nuevos a la misma array list.
    public static ArrayList<Langilea> lk = Langilea.getLangileenZerrenda();

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("2022-11-04ko azterketan oinarritutako JavaFX aplikazioa");
        scene = new Scene(loadFXML("menua"), 640, 480);
        scene.getStylesheets().add(getClass().getResource("css/ModenaAldatua.css").toExternalForm());
stage.setScene(scene);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}