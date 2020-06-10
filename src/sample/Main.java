package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import views.LoginFormView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Appel de la page du formulaire de connexion
        // Création du stage
        primaryStage.setTitle("Formulaire de connexion");

        LoginFormView loginFormView = new LoginFormView();

        // Création du formulaire
        GridPane gridPane = loginFormView.LoginForm();

        // Ajout des composants dans le gridPane
        loginFormView.UIComponents(gridPane);
        //UIComponents(gridPane);

        // Création de la scène
        Scene scene = new Scene(gridPane, 500, 300);

        // On indique au stage d'utiliser cette scène
        primaryStage.setScene(scene);

        // On affiche le stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
