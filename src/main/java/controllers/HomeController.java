package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import screens.ModelAndView;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private TextField user;
    @FXML
    private TextField passwd;
    @FXML
    private ImageView fotoPerfil;
    @FXML
    private Button logar;

    private ModelAndView view;

    public void setView(ModelAndView view) {
        this.view = view;
    }

    public ModelAndView getView() {
        return view;
    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}
