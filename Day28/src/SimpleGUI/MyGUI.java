package SimpleGUI;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MyGUI extends Application
{
  public void start(Stage window) throws IOException
  {
    window.setTitle("Simple Window");
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("MyGUI.fxml"));
    Scene scene = new Scene(loader.load());
    window.setScene(scene);
    window.show();
  }
}
