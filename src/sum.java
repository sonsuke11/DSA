public class sum {
    static int makeSum(int n){
        if(n<=1) {
            return n;
        }
        return n + makeSum(n-1);
    }
}

