class Solution {
    public int trap(int[] height) 
    {
        int h=height.length;
        int leftGreatest[]=new int[h];
        int rightGreatest[]=new int[h];

        leftGreatest[0]=height[0];
        for(int i=1;i<h;i++)
           leftGreatest[i]=Math.max(height[i],leftGreatest[i-1]);
           
        rightGreatest[h-1]=height[h-1];   
        for(int i=h-2;i>=0;i--)
           rightGreatest[i]=Math.max(height[i],rightGreatest[i+1]);

        int s=0;
        for(int i=0;i<h;i++)
        {
            if((Math.min(leftGreatest[i],rightGreatest[i])-height[i])>0)
                s+=Math.min(leftGreatest[i],rightGreatest[i])-height[i];
        }
        return s;

        
        
    }
}