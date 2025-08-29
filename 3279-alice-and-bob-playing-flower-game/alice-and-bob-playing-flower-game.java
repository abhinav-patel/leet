class Solution {
    public long flowerGame(int n, int m) 
    {
//         The outcome depends only on whether the numbers of flowers are odd or even. Alice wins if one lane has an odd number of flowers and the other lane has an even number.

// There are n * m total possible pairs. Exactly half of them will have different parity (one odd, one even). Therefore the answer is n * m / 2.
        long c=((long)n*m)/2;
        return c;
    }
}