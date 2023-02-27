package String;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String [] str=s.split("[^a-zA-Z]+");

        int counter=0;
        for (int i=0;i< str.length-1;i++){

            System.out.println(str[i]);
            counter++;
        }
        System.out.println(counter);
        // Write your code here.
        scan.close();
    }
}
