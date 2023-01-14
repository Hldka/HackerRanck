package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array0 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int num=scan.nextInt();
        int [] arr=new int[num];
        for (int i=0;i<num;i++){
            arr [i] =scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
