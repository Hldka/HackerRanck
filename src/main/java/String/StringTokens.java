package String;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if (s.length()==0){
            System.out.println(0);
            return;
        }

        String [] str=s.split("[^a-zA-Z]+");
        System.out.println(str.length);
        for (int i=0;i< str.length;i++){

            System.out.println(str[i]);

        }

        // Write your code here.
        scan.close();
    }
}
