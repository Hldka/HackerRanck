package String;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {

        Scanner sca=new Scanner(System.in);
        String a=sca.next();
        String b=sca.next();
        String[] astr=a.split("");
        String[] bstr=b.split("");
        System.out.println(astr.length+bstr.length);
        String s1=a.substring(0,1);
       String s2= b.substring(0,1);
        System.out.println(s1.toUpperCase()+a.substring(1)+" "+ s2.toUpperCase()+b.substring(1));
       }
    }

