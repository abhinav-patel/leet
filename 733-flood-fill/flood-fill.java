class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) 
    {
        if(image[sr][sc]==newcolor)
           return image;

        fill(image,sr,sc,image[sr][sc],newcolor);
        return image;
    }

    public void fill(int image[][],int sr,int sc,int orgcolor,int newcolor)
    {
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=orgcolor)
           return;
        image[sr][sc]=newcolor;

        fill(image,sr-1,sc,orgcolor,newcolor);
        fill(image,sr+1,sc,orgcolor,newcolor);
        fill(image,sr,sc-1,orgcolor,newcolor);
        fill(image,sr,sc+1,orgcolor,newcolor);
    }
}