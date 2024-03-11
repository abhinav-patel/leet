class Solution {
    public String customSortString(String order, String s) {
        char arr[] = s.toCharArray();
        int n=arr.length;
        for (int i = 1; i < n; i++) 
        {
            int j = i;
            while (j > 0 && order.indexOf(arr[j]) < order.indexOf(arr[j - 1])) 
            {
                char temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        String k=new String(arr);
        return k;

    }
}