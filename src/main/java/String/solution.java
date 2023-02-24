package String;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {

        Scanner sca=new Scanner(System.in);
        String a=sca.next();
        String b=sca.next();
        System.out.println(a.length()+b.length());
        int i=a.compareTo(b);
        if (i<0) System.out.println("No");
        else System.out.println("Yes");

        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+
                b.substring(0,1).toUpperCase()+b.substring(1));

       }
    }

