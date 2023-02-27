package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javalist {
    /*

    input
5
12 0 1 78 12
2
Insert
5 23
Delete
0
output
0 1 78 12 23
*/

    public static void main(String[] args) {
        List<Integer> intg=new ArrayList<>();
        Scanner scn=new Scanner(System.in);
        int sk=scn.nextInt();
       for (int i=0;i<sk;i++){
           intg.add(scn.nextInt());
       }
        int q=scn.nextInt();
       for (int i=0;i<q;i++){
           String cmd=scn.next();
           if (cmd.equals("Insert")){
               int a=scn.nextInt();
               int b=scn.nextInt();
               intg.add(a,b);
           }if (cmd.equals("Delete")){
               int a= scn.nextInt();
               intg.remove(a);
           }
       }
       //print
        for (Integer i:intg){
            System.out.print(i+" ");
        }
    }
}
