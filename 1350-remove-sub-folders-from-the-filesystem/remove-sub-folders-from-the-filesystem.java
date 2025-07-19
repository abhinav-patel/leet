class Solution {
    public List<String> removeSubfolders(String[] folder) 
    {
        /*Arrays.sort(folder);
        List<String> res=new ArrayList<>();
        res.add(folder[0]);

        for(int i=1;i<folder.length;i++)
        {
            String curr=res.get(res.size()-1)+"/";
            if(!folder[i].startsWith(curr))
               res.add(folder[i]);
        }
        return res; */

        Set<String> set=new HashSet<>();
        for(String str:folder)
        {
            set.add(str);
        }
        List<String> res=new ArrayList<>();

        for(String str:folder)
        {
            res.add(str);
            for(int i=1;i<str.length();i++)
            {
                if(str.charAt(i)=='/' && set.contains(str.substring(0,i)))
                {
                    res.remove(res.size()-1);
                    break;
                }
            }
        }
        return res;
    }
}