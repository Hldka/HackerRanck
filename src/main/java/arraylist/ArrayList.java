package arraylist;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    /*input 5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
output
74
52
37
ERROR!
ERROR!

*/
    public static void main(String[] args) {
        List<List<Integer>> listOfList=new java.util.ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=0;i<n;i++){
            int d=scan.nextInt();
            List<Integer> list=new java.util.ArrayList<>();
            for (int j=0;j<d;j++){
               list.add(scan.nextInt());
            }
            listOfList.add(list);
        }
        int q=scan.nextInt();
        for (int i=0;i<q;i++){int x=scan.nextInt();
        int y=scan.nextInt();

        try {
            System.out.println(listOfList.get(x-1).get(y-1));
        }catch (Exception e){
            System.out.println("ERROR!");
        }

        }

    }
}
