/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import  java.util.*;
class UserMainCode
{
public int isPalindrome(String input1){
String str=input1.toLowerCase();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        if(str.equals(str1))
        return 2;
        else
        return 1;
    }
}

