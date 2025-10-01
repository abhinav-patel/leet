class Solution {
    public int minPartitions(String n) 
    {
        /*So, lets take an example of n="1342"
        So what do we want, we want minimum deci-binary numbers to sum upto this.
        Lets there be 4 numbers:
        1111
        0111
        0110
        0010
        Sum of these numbers gives us 1342. So basically we require maximum digit number of    
        numbersof deci-binary numbers to achieve this feat.*/

        if(n.indexOf('9')!=-1)
            return 9;
        else if(n.indexOf('8')!=-1)
            return 8;
        else if(n.indexOf('7')!=-1)
            return 7;
        else if(n.indexOf('6')!=-1)
            return 6;
        else if(n.indexOf('5')!=-1)
            return 5;
        else if(n.indexOf('4')!=-1)
            return 4;
        else if(n.indexOf('3')!=-1)
            return 3;
        else if(n.indexOf('2')!=-1)
            return 2;
        else if(n.indexOf('1')!=-1)
            return 1;
        return 0;
        
    }
}