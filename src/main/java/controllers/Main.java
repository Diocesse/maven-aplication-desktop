package controllers;

import javafx.application.Application;
import javafx.stage.Stage;
import screens.ModelAndView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        cenario = primaryStage;
        ModelAndView acao = new ModelAndView();
        acao.logar("pages/logar");
        primaryStage.show();
    }

    protected static Stage cenario;

    public static void setCenario(Stage cenario) {
        Main.cenario = cenario;
    }

    public static Stage getCenario() {
        return cenario;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
