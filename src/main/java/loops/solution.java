package loops;

public class solution {
    public static boolean canWin(int leap, int[] game) {
        if(game.length>leap){int sum=0;
            for(int i=0;i<game.length-2;i++){
                sum+=game[i];
            }if(sum>0){return true;}else return false;}else return false;
        // Return true if you can win the game; otherwise, return false.
    }
}
