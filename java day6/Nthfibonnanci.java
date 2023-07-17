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
 public long nthFibonacci(int input1){
 if(input1==1)
 return 0;
if(input1==2)
 return 1;
 else
 return nthFibonacci(input1-1)+nthFibonacci(input1-2);
 }
}