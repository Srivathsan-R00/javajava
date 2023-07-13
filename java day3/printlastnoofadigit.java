import java.util.*;
import java.io.*;
class Main
{
  public static int even ()
  {

    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter a number:");
    int val = scan.nextInt ();
    int rem=(val%10);
    return rem;

  }



  public static void main (String[]args)
  {
    int n1 = Main.even ();
    System.out.println (n1);
  }
}
