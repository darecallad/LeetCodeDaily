public class sqrtX {
    // solution1
    public int mysqrt(int x){
        // if int < 2 return int
        if (x < 2) return x;

        int left = (int)Math.pow(Math.E, 0.5 * Math.log(x));
        int right = left + 1;

        return (long)right * right > x ? left : right;
    }
}
