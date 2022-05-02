package Exercise1;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.sql.Array;
import java.util.ArrayList;

public class Calculator extends Application
{
  ArrayList<Integer> number = new ArrayList<Integer>();
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

  private MyListener listener;

  public void start(Stage window)
  {
    window.setTitle("Calculator");

    listener = new MyListener();

    textField = new TextField();

    button0 = new Button("0");
    button0.setOnAction(listener);

    button1 = new Button("1");
    button1.setOnAction(listener);

    button2 = new Button("2");
    button2.setOnAction(listener);

    button3 = new Button("3");
    button3.setOnAction(listener);

    button4 = new Button("4");
    button4.setOnAction(listener);

    button5 = new Button("5");
    button5.setOnAction(listener);

    button6 = new Button("6");
    button6.setOnAction(listener);

    button7 = new Button("7");
    button7.setOnAction(listener);

    button8 = new Button("8");
    button8.setOnAction(listener);

    button9 = new Button("9");
    button9.setOnAction(listener);

    buttonDivide = new Button("/");
    buttonDivide.setOnAction(listener);

    buttonMultiply = new Button("*");
    buttonMultiply.setOnAction(listener);

    buttonPlus = new Button("+");
    buttonPlus.setOnAction(listener);

    buttonMinus = new Button("-");
    buttonMinus.setOnAction(listener);

    buttonEquals = new Button("=");
    buttonEquals.setOnAction(listener);

    buttonPeriod = new Button(".");
    buttonPeriod.setOnAction(listener);

    calculatorPart = new GridPane();

    calculatorPart.addRow(0, button7, button8, button9, buttonDivide);
    calculatorPart.addRow(1, button4, button5, button6, buttonMultiply);
    calculatorPart.addRow(2, button1, button2, button3, buttonMinus);
    calculatorPart.addRow(3, button0, buttonPeriod, buttonEquals, buttonPlus);

    for (int i = 0; i < calculatorPart.getChildren().size(); i++)
    {
      ((Button) calculatorPart.getChildren().get(i)).setPrefSize(60, 50);
    }

    mainPane = new BorderPane();
    mainPane.setTop(textField);
    mainPane.setBottom(calculatorPart);

    scene = new Scene(mainPane);

    window.setScene(scene);
    window.show();

  }

  public class MyListener implements EventHandler<ActionEvent>
  {
    private ArrayList<Double> numbersToCountWith = new ArrayList<>();
    private ArrayList<Integer> number = new ArrayList<>();
    private int signToCountWith = 0;
    private double numberToAddToArray = 0;
    private String str = "";
    private double result = 0;
    private double newResult = 0;

    public void handle(ActionEvent e)
    {
      if (e.getSource() == button0)
      {
        str += "0";
        number.add(0, 0);
        textField.setText(str);
      }
      else if (e.getSource() == button1)
      {
        str += "1";
        number.add(0, 1);
        textField.setText(str);
      }
      else if (e.getSource() == button2)
      {
        str += "2";
        number.add(0, 2);
        textField.setText(str);
      }
      else if (e.getSource() == button3)
      {
        str += "3";
        number.add(0, 3);
        textField.setText(str);
      }
      else if (e.getSource() == button4)
      {
        str += "4";
        number.add(0, 4);
        textField.setText(str);
      }
      else if (e.getSource() == button5)
      {
        str += "5";
        number.add(0, 5);
        textField.setText(str);
      }
      else if (e.getSource() == button6)
      {
        str += "6";
        number.add(0, 6);
        textField.setText(str);
      }
      else if (e.getSource() == button7)
      {
        str += "7";
        number.add(0, 7);
        textField.setText(str);
      }
      else if (e.getSource() == button8)
      {
        str += "8";
        number.add(0, 8);
        textField.setText(str);
      }
      else if (e.getSource() == button9)
      {
        str += "9";
        number.add(0, 9);
        textField.setText(str);
      }

      else if (e.getSource() == buttonPeriod)
      {
        textField.setText(".");
      }

      else if (e.getSource() == buttonMinus)
      {
        textField.setText("-");
        signToCountWith = 1;
        for (int i = 0; i < number.size(); i++)
        {
          numberToAddToArray += number.get(i) * Math.pow(10, i);
        }
        numbersToCountWith.add(0, numberToAddToArray);
        // System.out.println(numberToAddToArray);
        numberToAddToArray = 0;
        str = "";
        number.clear();
      }

      else if (e.getSource() == buttonPlus)
      {
        textField.setText("+");
        signToCountWith = 2;
        for (int i = 0; i < number.size(); i++)
        {
          numberToAddToArray += number.get(i) * Math.pow(10, i);
        }
        numbersToCountWith.add(0, numberToAddToArray);
        // System.out.println(numberToAddToArray);
        numberToAddToArray = 0;
        str = "";
        number.clear();
      }

      else if (e.getSource() == buttonDivide)
      {
        textField.setText("/");
        signToCountWith = 3;
        for (int i = 0; i < number.size(); i++)
        {
          numberToAddToArray += number.get(i) * Math.pow(10, i);
        }
        numbersToCountWith.add(0, numberToAddToArray);
        // System.out.println(numberToAddToArray);
        numberToAddToArray = 0;
        str = "";
        number.clear();
      }

      else if (e.getSource() == buttonMultiply)
      {
        textField.setText("*");
        signToCountWith = 4;
        for (int i = 0; i < number.size(); i++)
        {
          numberToAddToArray += number.get(i) * Math.pow(10, i);
        }
        numbersToCountWith.add(0, numberToAddToArray);
        // System.out.println(numberToAddToArray);
        numberToAddToArray = 0;
        str = "";
        number.clear();
      }

      else if (e.getSource() == buttonEquals)
      {
        for (int i = 0; i < number.size(); i++)
        {
          numberToAddToArray += number.get(i) * Math.pow(10, i);
        }
        numbersToCountWith.add(0, numberToAddToArray);
        // System.out.println(numberToAddToArray);
        numberToAddToArray = 0;
        str = "";
        number.clear();

        if (signToCountWith == 1)
        {
          result = numbersToCountWith.get(1) - numbersToCountWith.get(0);
        }

        // Plus
        else if (signToCountWith == 2)
        {
          result = numbersToCountWith.get(1) + numbersToCountWith.get(0);
        }

        // Divide
        else if (signToCountWith == 3)
        {
          result = numbersToCountWith.get(1) / numbersToCountWith.get(0);
        }

        // Multiply
        else if (signToCountWith == 4)
        {
          result = numbersToCountWith.get(1) * numbersToCountWith.get(0);
        }
        textField.setText("" + result);
      }

    }
  }
}

