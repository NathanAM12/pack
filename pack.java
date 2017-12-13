/**<h1>Project Title: </h1>
*<b>Purpose of Project:</b><br>
*<p></p>
*<b>How to start the project instructions:</b><br>
*<p></p>
*<b>User Instructions:<b/><br>
*<p>Does not use args</P>
*<br>
*@author Mark Mercer
*@version 1
*@since 2017-12-08
*/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class pack {
  /**<b>Class Description: Beginning Template</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

   public static void main(String[] args)
   throws NumberFormatException
   {

     String moneyyouhavestring = JOptionPane.showInputDialog("tell me how much money you have? \n" + "dollas and cents onlu \n" + "like this see \'\'21.21\'\'");
     //String moneyyouhave = new String();
     //Double moneyyouhavedouble;
     Double moneyyouhavedouble = 0.00;

     try{
       moneyyouhavedouble = Double.parseDouble(moneyyouhavestring);

     }
     catch (NumberFormatException ne1){
       System.out.println("try again");
       String moneyyouhavestring2 = JOptionPane.showInputDialog("tell me how much money you have? \n" + "dollas and cents onlu \n" + "like this see \'\'21.21\'\'");

     try{
       moneyyouhavedouble = Double.parseDouble(moneyyouhavestring2);

     }
     catch (NumberFormatException ne2){
       System.out.println("user probably broke");
       System.exit(0);

     }
   }

   double totalmoney = moneyyouhavedouble;
   System.out.println("money to spend is %.2f" + totalmoney);

  //   JOptionPane.showMessageDialog(null, "$" + moneyyouhavestring, "bitch you thot you had: ", JOptionPane.INFORMATION_MESSAGE);
     //INFORMATION_MESSAGE
     //ERROR_MESSAGE
     //WARNING_MESSAGE
     //QUESTION_MESSAGE

  //   System.out.println(moneyyouhavedouble+2.50);
   }
}
