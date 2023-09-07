package lambdaexpression;

import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return isOdd();
    }

    public PerformOperation isPrime() {
       return isPrime();
    }

    public PerformOperation isPalindrome() {
        return  isPalindrome();
    }
}
