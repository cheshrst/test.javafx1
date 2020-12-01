package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
public class Controller {
    @FXML
    private TextField inputField;
    @FXML
    private ListView<String> listView;
      @FXML
    public void addWordToList(){
        String word = inputField.getText();
        if(!word.isBlank()){
            listView.getItems().add(word);
        }
       inputField.setText("");
    }
    @FXML
    public void exit(){
        System.exit(0);
    }
}
