class Solution {
    public String reorderSpaces(String text) 
    {
        String words[]=text.trim().split("\\s+");
        int n=words.length;

        String temp=text;
        int space=temp.length()-(temp.replace(" ","").length());

        return n==1?words[0]+" ".repeat(space) : String.join(" ".repeat(space/(n-1)),words)+" ".repeat(space%(n-1));
        
    }
}