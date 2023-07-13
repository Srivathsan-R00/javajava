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
    System.out.println ("Enter N1");
    int N1 = in.nextInt ();
    System.out.println ("Enter N2");
    int N2 = in.nextInt ();
    if (N1 < N2)
      {
	System.out.println ("N2 is greater");
      }
    else
      {
	System.out.println ("N1 is greater");
      }
    
    in.close ();
  }
}
