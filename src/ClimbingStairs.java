public class ClimbingStairs {
    //Solution 1 Brute Force
    public int climbStairs(int n){
        return climb_Stairs(0, n);
    }
    public int climb_Stairs(int i, int n){
        if(i > n) return 0;
        if(i == n) return 1;

        return climb_Stairs( i+1, n) + climb_Stairs(i+2, n);
        // count every possible for step 1 or step 2 each
        // O ( 2^n)
    }

    //Solution 2
    public int climbStairs1(int n){
        int memo[] = new int[ n + 1];
        return climb_Stairs1(0,n,memo);
    }
    public int climb_Stairs1(int i, int n, int memo[]){
        if(i > n) return 0;
        if(i == n) return 1;
        if(memo[i] > 0) return memo[i];

        memo[i] = climb_Stairs1(i +1, n, memo) + climb_Stairs1(i+2,n,memo);

        return memo[i];
        // O (n)

    }
}
