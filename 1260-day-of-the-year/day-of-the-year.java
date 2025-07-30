class Solution {
    public int dayOfYear(String date) 
    {
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int dat=Integer.parseInt(date.substring(8));
        int d=0;
        switch(month)
        {
            case 1:
                d=dat;
                break;
            case 2:
                d=dat+31;
                break;
            case 3:
                d=dat+59;
                break;
            case 4:
                d=dat+90;
                break;
            case 5:
                d=dat+120;
                break;
            case 6:
                d=dat+151;
                break;
            case 7:
                d=dat+181;
                break;
            case 8:
                d=dat+212;
                break;
            case 9:
                d=dat+243;
                break;
            case 10:
                d=dat+273;
                break;
            case 11:
                d=dat+304;
                break;
            case 12:
                d=dat+334;
                break;
        }
        if(year%4==0 && year%100!=0 && month>2)
        {
           d++;
        }
        if(year%400==0 && month>2)
           d++;
        return d;
        
    }
}