package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label fldIzbor;
    public Label fldAutor;
    public Label fldNaslov;
    public Label fldISBN;
    public ChoiceBox choice;

    public TextField textFldAutor;
    public TextField textFldNaslov;
    public TextField textFldISBN;


    SimpleStringProperty labela = new SimpleStringProperty("blabla");

    public String getLabela() {
        return labela.get();
    }

    public SimpleStringProperty labelaProperty() {
        return labela;
    }

    public void setLabela(String labela) {
        this.labela.set(labela);
    }


    public void akcija(ActionEvent actionEvent) {
        labela.set("labela lal la ");
    }
}
