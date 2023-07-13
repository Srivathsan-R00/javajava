import java.util.*;
import java.io.*;
class Main
{
  public static int even ()
  {

    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter a number:");
    int val = scan.nextInt ();
    if (val % 2 == 1)
      {
	return 2;
          
      }
    else
      {
	return 1;

      }

  }



  public static void main (String[]args)
  {
    int n1 = Main.even ();
    System.out.println (n1);
  }
}
