import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Format2
{
  public static void main(String[] args)
  {
    double number1 = 0.166666666666667;
    double number2 = 1.666666666666667;
    double number3 = 16.666666666666667;
    double number4 = 166.666666666666667;

    DecimalFormat formatter = new DecimalFormat("#00.00");

    JOptionPane.showMessageDialog(null, formatter.format(number1));
    JOptionPane.showMessageDialog(null, formatter.format(number2));
    JOptionPane.showMessageDialog(null, formatter.format(number3));
    JOptionPane.showMessageDialog(null, formatter.format(number4));

  }
}
