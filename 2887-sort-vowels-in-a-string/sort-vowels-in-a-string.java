class Solution {
    public String sortVowels(String str) 
    {
        int n=str.length();
        char res[]=new char[n];
        Arrays.fill(res,' ');
        String vowels="AEIOUaeiou";
        int vo[]=new int[10];

        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(vowels.indexOf(ch)==-1)
               res[i]=ch;
            else
               vo[vowels.indexOf(ch)]++;
        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            while(vo[k]==0 && k<10-1)
                k++;
            if(res[i]==' ' && vo[k]>=0)
            {
                res[i]=vowels.charAt(k);
                vo[k]--;
            }
        }
        return String.valueOf(res);   
    }
}