import java.math.*;
class Solution
{
    int mod = (int) 1e9 + 7;

    public int countGoodNumbers(long n) {
        BigInteger MOD = BigInteger.valueOf(mod);
        BigInteger five = BigInteger.valueOf(5);
        BigInteger four = BigInteger.valueOf(4);

        long even = n / 2;         // # of positions with 4 choices (even indices)
        long odd = n - even;       // # of positions with 5 choices (odd indices)

        BigInteger pow5 = five.modPow(BigInteger.valueOf(odd), MOD);
        BigInteger pow4 = four.modPow(BigInteger.valueOf(even), MOD);

        return pow5.multiply(pow4).mod(MOD).intValue();
     
    }
}