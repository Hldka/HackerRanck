package String;

public class SubstringComparisons {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 2));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
String csubstring=s.substring(0,k);
smallest=csubstring;
largest=csubstring;
        for (int i=1;i<=s.length()-k;i++){
csubstring=s.substring(i,i+k);
        if (csubstring.compareTo(largest)>0){largest=csubstring;}
        if (csubstring.compareTo(smallest)<0){smallest=csubstring; }


        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

}
