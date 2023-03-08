package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetn {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        HashSet<String> hs= new HashSet<>();
        for (int i=0;i<t;i++){
            String s=scn.nextLine();
            hs.add(s);
            System.out.println(hs.size());
        }


    }
}
