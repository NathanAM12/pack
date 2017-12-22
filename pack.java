import java.util.Scanner; //Must import this
import javax.swing.JOptionPane;

public class pack {
  /**<b>Class Description: Driver Class</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  public String printMoney (double money) {
    String pM = String.format ("$%.2f", money);
    System.out.println(pM);
    return pM;
  }
  
  public int StringDecInt (String usernumber1){
	  Double number_double = 0.0;
	  int number_int = 0;
	  String usernumber2 = "";
	  
	   try {
    //String to a decimal
    number_double = Double.parseDouble (usernumber1);
    //If fails, probably a String
    //If passes, prbably a double, maybe an integer
    number_double = 0.0;
  }
  catch (NumberFormatException ne3) {
    //error of a decimal
    System.out.println ("User has failed first attempt entering" +
                        "an integer for apples.");
    usernumber2 = JOptionPane.showInputDialog ("Please " +
           "enter how many whole apple you would like.\n" +
           "For example: \' 3 \' ").trim();
    try { //Second attempt, first was a String
      number_double = Double.parseDouble (usernumber2);
      number_double = 0.0;
      usernumber1 = usernumber2;
    }
    catch (NumberFormatException ne4) {
      System.out.println ("User has failed the 2nd attempt.");
      JOptionPane.showMessageDialog (null, "Please restart the " +
             "program and enter a whole number.\n" +
             "For example \' 3 \' ", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }
  if (number_double == 0) { //
    try {
      System.out.println("Second attempt might be successful");
      number_int = Integer.parseInt(usernumber1);
      //apples_string1 = apples_string2;
      System.out.println ("Second attempt successful " +
            "and variables reassigned.");
      number_double = 0.0;
    }catch (NumberFormatException ne6) {
    //Yes decimal and not an integer
    System.out.println("User entered a decimal value, not an int.");
    usernumber2 = JOptionPane.showInputDialog("It seems like you " +
           "have entered a decimal.\nPlease enter a whole number of " +
           "apples.\nFor example: \' 3 \' ").trim();
    usernumber1 = usernumber2;
    try {
      //2nd attempt at entering an integer
      System.out.println("User's second attempt at entering int");
      number_int = Integer.parseInt(usernumber1);
      // Different variable, need to equal it to first variable
      number_double = 0.0;
    }
    catch (NumberFormatException ne7) {
      //Not an integer 2nd time, exit program
      System.out.println("User failed second attempt, exit program.");
      JOptionPane.showMessageDialog(null, "Please restart the " +
                 "the program and enter a whole number of apples." +
                 "", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }
  } 
  System.out.println("This is the end of the TryCatch for Apples");
  System.out.println(number_int);
  System.out.println(number_double);
  System.out.println(usernumber1);
  System.out.println(usernumber2);
    return(number_int);
  }

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

   public static void main(String[] args)
   throws NumberFormatException
   {

   pack obj = new pack(); //Accesses all methods here;

   String moneyYouHave_string1 = JOptionPane.showInputDialog ("Tell me how much " +
            "money you have.\n Please enter only dollars and cents, \n" +
            "For Example: \'\' 14.50 \'\'");
   Double moneyYouHave_double = 0.00;

   try {
       moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
   }
   catch (NumberFormatException ne1) {
       System.out.println ("User failed first attempt "+
                           "inputing money value.");
       String moneyYouHave_string2 = JOptionPane.showInputDialog ("Please " +
               "enter a dolars and cents value\n" +
               "For example: \' 14.50 \'");
       try {
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println ("User failed a second attempt for " +
                            "the total money to spend");
         JOptionPane.showMessageDialog (null, "Please restart the program", "Second Attempt Failed", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
       }
     }

     double totalMoneyIn = moneyYouHave_double;
     if ( moneyYouHave_double == Math.abs(0.0) ) { //Checks to see if the try-catch worked
       System.out.println ("Users failed to enter a total amount " +
                           "of money to spend");
       JOptionPane.showMessageDialog (null, "You have not entered a total amount of money to spend.", "Please restart the program", JOptionPane.ERROR_MESSAGE);
       System.exit(0);
     } else {
       System.out.println ("User entered: " + totalMoneyIn);
       JOptionPane.showMessageDialog (null, "I understand you entered " +
            obj.printMoney(totalMoneyIn), "Money to Spend", JOptionPane.INFORMATION_MESSAGE);
     }

  //Sequence that asks about Apples, Oranges, and Chocolate
  System.out.println("User enters a number of apples. \n");
  String apples_string1 = JOptionPane.showInputDialog ("Let's " +
         "fill the box.\nPlease enter how many whole apples you " +
         "would like.");
  int applesint = obj.StringDecInt(apples_string1.trim());
    System.out.println("User enters a number of apples. \n");
  String oranges_string1 = JOptionPane.showInputDialog ("Let's " +
         "fill the box.\nPlease enter how many oranges you " +
         "would like.");
  int oranges = obj.StringDecInt(oranges_string1.trim());
    System.out.println("User enters a number of apples. \n");
  String chocolate_string1 = JOptionPane.showInputDialog ("Let's " +
         "fill the box.\nPlease enter how many chocolate you " +
         "would like.");
  int chocolate = obj.StringDecInt(chocolate_string1.trim());
  //used to catch user entry, decimal
  //Possible replies: decimal, integer, string, "0"
  

  

  }

}


     //Asking user for groceries amount: apples, oranges, cheese
     //System.out.println();
     //JOptionPane
     //tryCatch: string to an int, through a double (decimal)



     //Formating decimals to two decimal places
     //String s = String.format ("$%.2f", totalMoneyIn);
     //System.out.println("You have entered " + s);
     //"The money to spend here is %.2f",


     //Double input_double = Double.parseDouble(input_string);

     //System.out.println(input_double+2.50);

     //JOptionPane.showMessageDialog (null, "$" + input_string, "You told me " +
     //           " you have: ", JOptionPane.ERROR_MESSAGE);
     //INFORMATION_MESSAGE
     //ERROR_MESSAGE
     //WARNING_MESSAGE
     //QUESTION_MESSAGE

     //System.out.println("$" + input_double);


//Scanner input = new Scanner ( System.in );
//String statement = input.nextLine();

//String input = JOptionPane.showInputDialog ("Press 1 for Monday");