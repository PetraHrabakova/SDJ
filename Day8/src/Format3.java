import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Format3
{
  public static void main(String[] args)
  {
    double number1 = 123.899;
    double number2 = 1233.899;
    double number3 = 12345.899;
    double number4 = 123456.899;
    double number5 = 1234567.899;

    DecimalFormat formatter = new DecimalFormat("#,##0.00");

    JOptionPane.showMessageDialog(null, formatter.format(number1));
    JOptionPane.showMessageDialog(null, formatter.format(number2));
    JOptionPane.showMessageDialog(null, formatter.format(number3));
    JOptionPane.showMessageDialog(null, formatter.format(number4));
    JOptionPane.showMessageDialog(null, formatter.format(number4));

  }
}
