public class sqrtX {
    // solution1
    public int mysqrt(int x){
        // if int < 2 return int
        if (x < 2) return x;

        int left = (int)Math.pow(Math.E, 0.5 * Math.log(x));
        int right = left + 1;

        return (long)right * right > x ? left : right;
    }
    //Solution2
    public int mysqrt1(int x){
        if(x < 2 ) return x;

        long num;
        int pivot, left = 2, right = x /2;

        while( left <= right){
            pivot = left + (right - left) / 2;
            num = (long)pivot * pivot;

            if( num > x) right = pivot -1;
            else if( num < x) left = pivot + 1;
            else return pivot;
        }

        return right;
    }
}
