/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    System.out.println ("Enter a number");
    int N = in.nextInt ();
    if (N%2==0)
      {
	System.out.println ("It is EVEN");
      }
    else
      {
	System.out.println ("It is ODD");
      }
    
    in.close ();
  }
}
