package SimpleGUI;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller
{
  @FXML private TextField text;
  @FXML private Button clickMe;

  public void handleClickMe(ActionEvent e) {
    if (e.getSource() == clickMe) {
      System.out.println(text.getText());
    }
  }
}
