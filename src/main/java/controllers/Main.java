package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        cenario = primaryStage;
        home("home");
        primaryStage.show();
    }

    protected Stage cenario;

    public Initializable controller(String page) {
        try {
            FXMLLoader loader = new FXMLLoader();
            InputStream stream = getClass().getClassLoader().getResourceAsStream(page.trim() + ".fxml");
            loader.setBuilderFactory(new JavaFXBuilderFactory());
            loader.setLocation(getClass().getClassLoader().getResource(page));
            AnchorPane anchorPane;
            try {
                anchorPane = (AnchorPane) loader.load(stream);
            } finally {
                stream.close();
            }
            Scene scene = new Scene(anchorPane);
            cenario.setScene(scene);
            cenario.setTitle("Testa aplicação controller?");
            cenario.setWidth(500);
            cenario.setHeight(450);

            return (Initializable) loader.getController();
        } catch (Exception e) {
            System.out.println("Pagina solicitada não encontrada!");
            return null;
        }


    }

    public String home(String page) {
        HomeController controller = (HomeController) controller(page);
        controller.setMain(this);
        return page;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
