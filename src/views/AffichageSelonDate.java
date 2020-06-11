package views;

import java.lang.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import mock.Demandes;

import java.util.Date;
//import shared.ChoiceBox;

public class AffichageSelonDate {
    public GridPane PageDeux() {

        // Création d'une instace du conteneur gridPane
        GridPane gridPane = new GridPane();

        // Création du stage
        Stage stage = new Stage();
        stage.setTitle("Affichage selon date");

        // On insère dans les composants le gridPane qui est le conteur des composants
        UIComponents(gridPane);

        // Création de la scène
        Scene scene = new Scene(gridPane, 1000, 500);

        // Ajout des composants graphiques à la scene
        stage.setScene(scene);
        stage.show();

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
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        // On spécifie que si la taille de l'écran est modifier, la colonne 2 grandira hoizontalement
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }
    public void UIComponents(GridPane gridPane) {

        // TODO ListView pour la sélection des options
        //https://docs.oracle.com/javafx/2/ui_controls/list-view.htm

        // Ajout de l'en tête
        Label headerLabel = new Label("Affichage des demandes selon les dates");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0, 0, 2, 1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

        //TODO AJout datePicker
        // Ajout d'un label pour les dates
        Label label_date = new Label("Date :");
        gridPane.add(label_date, 0, 1);

        // TextField pour écrire la date de début de la recherche
        TextField textField_date = new TextField();
        textField_date.setPrefHeight(40);
        gridPane.add(textField_date, 1, 1);

        // Ajout du bouton pour lancer la recherche
        Button button_rechercher = new Button("Rechercher");
        button_rechercher.setPrefHeight(40);
        button_rechercher.setDefaultButton(true);
        button_rechercher.setPrefWidth(100);
        gridPane.add(button_rechercher, 2, 1);

        // Ajout de l'affichage des demandes
        // Création de la table
        TableView<Demandes> table = new TableView<>();

        // Création des colonnes
        TableColumn<Demandes, Number> numeroDemandeCol = new TableColumn<>("Numéro demande");
        TableColumn<Demandes, Date> dateDemandeCol = new TableColumn<>("Date demande");
        TableColumn<Demandes, Date> dateEnlevementCol = new TableColumn<>("Date enlèvement");
        TableColumn<Demandes, Number> siretCol = new TableColumn<>("Numéro siret");
        TableColumn<Demandes, Number> tourneeCol = new TableColumn<>("Numéro tournée");

        // Insertion des colonnes dans la table
        table.getColumns().addAll(numeroDemandeCol, dateDemandeCol, dateEnlevementCol, siretCol, tourneeCol);

        table.setMinWidth(800);
        gridPane.add(table, 0, 2);
    }
}
