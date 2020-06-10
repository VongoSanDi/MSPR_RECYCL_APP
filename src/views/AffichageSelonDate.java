package views;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import mock.Mock_Login;
//import shared.ChoiceBox;

public class AffichageSelonDate {
    public GridPane PageDeux() {
        // Création d'une instace du conteneur gridPane
        GridPane gridPane = new GridPane();

        //Ajout des composant dans le gridPane


        // Centrer le conteneur sur l'écran, verticalement et horizontalement
        gridPane.setAlignment(Pos.CENTER);

        // Met un padding(ecart entre le texte et le rebord)
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Met un écart HORIZONTAL entre les colonnes
        gridPane.setHgap(10);

        // Met un écart HORIZONTAL entre les colonnes
        gridPane.setVgap(10);

        // Ajoute une contrainte sur la 1ere colonne et tous ses noeuds avec une largeur minimum, une largeur de base et une largeur max
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        // On aligne tous les élément de la colonne sur la droite
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // Ajoute une contrainte sur la 2eme colonne et tous ses noeuds avec une largeur minimum, une largeur de base et une largeur max
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200, 200, Double.MAX_VALUE);
        // On spécifie que si la taille de l'écran est modifier, la colonne 2 grandira hoizontalement
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    /*public void UIComponents(GridPane gridPane) {
        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("a", "b", "c");
    }*/
    public void UIComponents(GridPane gridPane) {
        // Ajout de l'en tête
        Label headerLabel = new Label("Page Deux");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0, 0, 2, 1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

        // Ajout d'un label pour l'identifiant(username)
        Label label_username = new Label("Identifiant");
        gridPane.add(label_username, 0, 1);

        // TextField pour écrire sont nom d'utilisateur(username)
        TextField textField_username = new TextField();
        textField_username.setPrefHeight(40);
        gridPane.add(textField_username, 1, 1);

        // Ajout d'un label pour le mot de passe(password)
        Label label_password = new Label("Mot de passe");
        gridPane.add(label_password, 0, 2);

        // TextField pour écrire sont mot de passe(password)
        PasswordField passwordField_password = new PasswordField();
        passwordField_password.setPrefHeight(40);
        gridPane.add(passwordField_password, 1, 2);

        // Ajout du bouton pour se connecter
        Button button_seConnecter = new Button("Se connecter");
        button_seConnecter.setPrefHeight(40);
        button_seConnecter.setDefaultButton(true);
        button_seConnecter.setPrefWidth(100);
        gridPane.add(button_seConnecter,0, 4, 2, 1);
        GridPane.setHalignment(button_seConnecter, HPos.CENTER);
        GridPane.setMargin(button_seConnecter, new Insets(20, 0, 20, 0));
    }
}
