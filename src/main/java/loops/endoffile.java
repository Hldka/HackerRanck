package loops;

import java.util.Scanner;

public class endoffile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int line_num=1;
        while (scan.hasNext()){
            System.out.println(line_num+""+scan.nextLine());
            line_num++;
        }
        scan.close();
    }
}
