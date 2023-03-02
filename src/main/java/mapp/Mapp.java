package mapp;

import java.util.HashMap;
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
        HashMap<String,Integer> hMap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            hMap.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (hMap.containsKey(s)){
                System.out.println(s+"="+hMap.get(s));
            }else {
                System.out.println("Not Found");
            }
        }
    }
}
