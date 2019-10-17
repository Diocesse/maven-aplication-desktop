package screens;

import controllers.HomeController;
import controllers.LogarController;
import controllers.Main;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.InputStream;

public class ModelAndView {

    private Initializable controller(String page) {
        try {
            FXMLLoader loader = new FXMLLoader();
            InputStream stream = getClass().getClassLoader().getResourceAsStream(page+".fxml");
            loader.setBuilderFactory(new JavaFXBuilderFactory());
            loader.setLocation(getClass().getClassLoader().getResource(page));
            AnchorPane anchorPane;

            try {
                anchorPane = (AnchorPane) loader.load(stream);
            } finally {
                stream.close();
            }
            Scene scene = new Scene(anchorPane);
            Main.getCenario().setWidth(700);
            Main.getCenario().setHeight(400);
            Main.getCenario().setTitle("Sistema de Cadastro de Pescadores");
            return (Initializable) loader.getController();
        } catch (Exception e) {
            System.out.println("Pagina solicitada não encontrada! "+e.fillInStackTrace());
            return null;
        }
    }

    public void logar(String page){
        try {
            LogarController logarController = (LogarController)controller(page);
            logarController.setView(this);
        }catch (Exception e){

        }
    }

    public void home(String page) {
        try {
            HomeController controller = (HomeController) controller(page);
            controller.setView(this);

        }catch (Exception e){

        }
    }
}
