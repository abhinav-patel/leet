class Spreadsheet 
{
    Map<String,Integer> map=new HashMap<>();

    public Spreadsheet(int rows) 
    {
    }
    
    public void setCell(String cell, int value) 
    {
        map.put(cell,value);
    }
    
    public void resetCell(String cell) 
    {
        map.remove(cell);
    }
    
    public int getValue(String formula) 
    {
        int t=formula.indexOf('+');
        String a=formula.substring(1,t);
        String b=formula.substring(t+1);

        int sum=0;
        if(Character.isAlphabetic(formula.charAt(1)))
        {
            sum=map.getOrDefault(a,0);
        }
        else
        {
            sum=Integer.parseInt(a);
        }
        if(Character.isAlphabetic(formula.charAt(t+1)))
        {
            sum+=map.getOrDefault(b,0);
        }
        else
        {
            sum+=Integer.parseInt(b);
        }
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */