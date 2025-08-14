class Solution {
    public String largestGoodInteger(String nums) 
    {
        if(nums.indexOf("999")!=-1)
           return "999";
        else if(nums.indexOf("888")!=-1)
           return "888";
        else if(nums.indexOf("777")!=-1)
           return "777";
        else if(nums.indexOf("666")!=-1)
           return "666";
        else if(nums.indexOf("555")!=-1)
           return "555";
        else if(nums.indexOf("444")!=-1)
           return "444";
        else if(nums.indexOf("333")!=-1)
           return "333";
        else if(nums.indexOf("222")!=-1)
           return "222";
        else if(nums.indexOf("111")!=-1)
           return "111";
        else if(nums.indexOf("000")!=-1)
           return "000";
        else 
           return "";    
    }
}