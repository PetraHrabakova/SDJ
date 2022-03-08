import javax.swing.*;
import java.text.DecimalFormat;
import java.util.jar.JarEntry;

public class Format4
{
  public static void main(String[] args)
  {
    double number1 = 0.12;
    double number2 = 0.05;

    DecimalFormat formatter = new DecimalFormat("#0%");

    JOptionPane.showMessageDialog(null, formatter.format(number1));
    JOptionPane.showMessageDialog(null, formatter.format(number2));

  }
}
