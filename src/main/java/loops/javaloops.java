package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaloops { public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());

    bufferedReader.close();
    int resultat=1;
    for(int i=1;i<=10;i++){
        resultat=N*i;
        System.out.println(N+" x "+i+" = "+resultat);
    }
}
}
