package controllers;

import javafx.fxml.Initializable;
import screens.ModelAndView;

import java.net.URL;
import java.util.ResourceBundle;

public class LogarController  implements Initializable {

    private ModelAndView view;

    public void setView(ModelAndView view) {
        this.view = view;
    }

    public ModelAndView getView() {
        return view;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
