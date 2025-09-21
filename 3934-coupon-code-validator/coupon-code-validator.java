class Solution 
{
    public static Map<String,Integer> m=new HashMap<>();
    static
    {
        m.put("electronics",0);
        m.put("grocery",1);
        m.put("pharmacy",2);
        m.put("restaurant",3);
    }

    public class Coupon implements Comparable<Coupon>
    {
        String code;
        String line;
        public Coupon(String c,String l)
        {
            code=c;
            line=l;
        }

        @Override
        public int compareTo(Coupon other)
        {
            int x=Integer.compare(m.get(this.line),m.get(other.line));
            if(x==0)
            {
                return this.code.compareTo(other.code);
            }
            return x;
        }
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) 
    {
        List<Coupon> valid=new ArrayList<>();
        for(int i=0;i<code.length;i++)
        {
            if(code[i]!=null && !code[i].isEmpty() && code[i].matches("[a-zA-Z0-9_]+") &&
            m.containsKey(businessLine[i]) && isActive[i] )
            {
                valid.add(new Coupon(code[i],businessLine[i]));
            } 
        }

        Collections.sort(valid);

        List<String> res=new ArrayList<>();
        for(Coupon k:valid)
           res.add(k.code);

        return res;
        
    }
}