package Exercise2;

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

public class Calculator extends Application
{
  private Scene scene;
  private GridPane calculatorPart;
  private BorderPane mainPane;
  private TextField textField;
  private Button button1;
  private Button button2;
  private Button button3;
  private Button button4;
  private Button button5;
  private Button button6;
  private Button button7;
  private Button button8;
  private Button button9;
  private Button buttonDivide;
  private Button buttonMultiply;
  private Button buttonMinus;
  private Button buttonPlus;
  private Button buttonEquals;
  private Button button0;
  private Button buttonPeriod;


  public void start(Stage window)
  {
    window.setTitle("Calculator");


    textField = new TextField();

    button0 = new Button("0");
    button1 = new Button("1");
    button2 = new Button("2");
    button3 = new Button("3");
    button4 = new Button("4");
    button5 = new Button("5");
    button6 = new Button("6");
    button7 = new Button("7");
    button8 = new Button("8");
    button9 = new Button("9");
    buttonDivide = new Button("/");
    buttonMultiply = new Button("*");
    buttonPlus = new Button("+");
    buttonMinus = new Button("-");
    buttonEquals = new Button("=");
    buttonPeriod = new Button(".");

    calculatorPart = new GridPane();

    calculatorPart.addRow(0, button7, button8, button9, buttonDivide);
    calculatorPart.addRow(1, button4, button5, button6, buttonMultiply);
    calculatorPart.addRow(2, button1, button2, button3, buttonMinus);
    calculatorPart.addRow(3, button0, buttonPeriod, buttonEquals, buttonPlus);


    for(int i = 0; i < calculatorPart.getChildren().size(); i++) {
      ((Button)calculatorPart.getChildren().get(i)).setPrefSize(60, 50);
    }


    mainPane = new BorderPane();
    mainPane.setTop(textField);
    mainPane.setBottom(calculatorPart);

    scene = new Scene(mainPane);

    window.setScene(scene);
    window.show();

  }

}
