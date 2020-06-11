package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import views.LoginFormView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // TODO https://gluonhq.com/products/scene-builder/

        // On appel directement le formulaire de connexion
        LoginFormView loginForm = new LoginFormView();
        loginForm.LoginForm();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
