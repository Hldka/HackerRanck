package array;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int lngth=scanner.nextInt();
        int[] arr=new int[lngth];
        for (int i=0;i<lngth;i++){
            arr[i]=scanner.nextInt();
        }
        int count=0;
        for (int i=0;i<lngth;i++){
            int sum=0;
            for (int j=i;j<lngth;j++){sum+=arr[j];
                if (sum<0)count+=1;}
        }
        System.out.println(count);
        scanner.close();

    }
}
