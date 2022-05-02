package Exercise1;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import org.w3c.dom.Text;

public class Align extends Application
{
  private Scene scene;
  private BorderPane mainPane;
  private Button OKButton;
  private Button cancelButton;
  private Button clearButton;
  private CheckBox boldCheckBox1;
  private CheckBox boldCheckBox2;
  private VBox leftPane;
  private GridPane centerPane;
  private VBox rightPane;
  private Label xLabel;
  private Label yLabel;
  private TextField xField;
  private TextField yField;


  public void start(Stage window) {
    window.setTitle("Align");

    // Left part
    boldCheckBox1 = new CheckBox("Exit on OK");
    boldCheckBox2 = new CheckBox("Exit on Cancel");

    leftPane = new VBox(2);
    leftPane.setAlignment(Pos.CENTER_LEFT);
    leftPane.setPadding(new Insets(10));
    leftPane.getChildren().addAll(boldCheckBox1, boldCheckBox2);


    // Center part
    xLabel = new Label("X:");
    xField = new TextField();
    xField.setPrefSize(50, 20);
    yLabel = new Label("Y:");
    yField = new TextField();
    yField.setPrefSize(50, 20);

    centerPane = new GridPane();
    centerPane.setAlignment(Pos.CENTER);
    centerPane.setVgap(5);
    centerPane.setHgap(5);
    centerPane.addRow(0, xLabel, xField);
    centerPane.addRow(1, yLabel, yField);

    // Right part
    OKButton = new Button("OK");
    OKButton.setPrefSize(75, 100);
    cancelButton = new Button("Cancel");
    cancelButton.setPrefSize(75, 100);
    clearButton = new Button("Clear");
    clearButton.setPrefSize(75, 100);

    rightPane = new VBox(3);
    rightPane.setPadding(new Insets(10));
    rightPane.getChildren().addAll(OKButton, cancelButton, clearButton);


    // All together
    mainPane = new BorderPane();
    mainPane.setLeft(leftPane);
    mainPane.setCenter(centerPane);
    mainPane.setRight(rightPane);

    scene = new Scene(mainPane, 300, 120);

    window.setScene(scene);
    window.show();
  }
}
