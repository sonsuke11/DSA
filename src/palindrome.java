public class palindrome {
    static boolean isPalindrome(String s,int comparePoint){
        if(s.length()==1|| s.isEmpty()){
            return true;
        }
        int length = (int)(s.length() -1)/2;
        boolean result =  s.charAt(comparePoint) == (s.charAt(s.length() -1-comparePoint));

        return !result|| comparePoint==length ? result: isPalindrome(s, comparePoint +1);
    }
}

/*
s = "radar", 0
cp = 0 length = 2


 */