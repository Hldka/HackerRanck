package mapp;

import java.util.Scanner;

public class Mapp {
    /*
    input
    3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
output
uncle sam=99912222
Not found
harry=12299933
*/
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
        }
    }
}
