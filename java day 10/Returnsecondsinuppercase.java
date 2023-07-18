/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import  java.util.*;
class UserMainCode{

public String secondWordUpperCase(String input1){

String strArray[] = input1.split(" ");        

String stt="LESS";        

if(strArray.length==1) {            

return stt;        

}        

return strArray[1].toUpperCase();   

 }}

