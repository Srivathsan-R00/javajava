/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int isPrime(int input1){
  int count=0;
 for(int i=2;i<=Math.sqrt(input1);i++)
{
 if(input1%i==0)
     count++;
}
if(count==0)
 return 2;
 else
return 1;
 }
}