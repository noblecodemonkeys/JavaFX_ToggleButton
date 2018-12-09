package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{

    @FXML
    Label lblLabel;

    @FXML
    ToggleButton tbutton;

    private final StringProperty textValue = new SimpleStringProperty("waiting for input");
    private final StringProperty textToggleValue = new SimpleStringProperty("Toggle Me");




    @FXML
    Button button;

    @FXML
    private void handleButtonClick(ActionEvent event)
    {
        System.out.println("Button Clicked!");
        button.setText("Clicked!");
    }

//    @FXML
//    private void handleToggleButtonClick(ActionEvent event)
//    {
//        if (tbutton.isSelected())
//        {
//            setTextToggleValue("ON");
//
//        }
//        else
//        {
//            setTextToggleValue("OFF");
//        }
//    }




    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        tbutton.selectedProperty().addListener((observable, oldValue, newValue) ->
        {
            if (newValue)//is selected state
            {
                setTextToggleValue("ON");

            }
            else
            {
                setTextToggleValue("OFF");
            }

        });


    }
    public String getTextValue()
    {
        return textValue.get();
    }

    public StringProperty textValueProperty()
    {
        return textValue;
    }

    public void setTextValue(String textValue)
    {
        this.textValue.set(textValue);
    }

    public String getTextToggleValue()
    {
        return textToggleValue.get();
    }

    public StringProperty textToggleValueProperty()
    {
        return textToggleValue;
    }

    public void setTextToggleValue(String textToggleValue)
    {
        this.textToggleValue.set(textToggleValue);
    }
}
