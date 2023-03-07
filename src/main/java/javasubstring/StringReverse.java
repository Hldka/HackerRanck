package javasubstring;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
String [] str=A.split("");
String sum="";

     for (int i=A.length();i>0;i--){
         sum=sum+A.substring(i-1,i);

     }

     if (A.equals(sum)){
         System.out.println("Yes");
     }else System.out.println("No");
    }

}
/*
    }*/