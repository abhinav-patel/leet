class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    int k=Integer.MAX_VALUE;

    public MinStack() {
        st = new Stack<>();
        min=new Stack<>();
        min.push(k);
    }

    public void push(int val) 
    {
        if (val <= min.peek())
            min.push(val);
        st.push(val);
    }

    public void pop() {
        int x=st.pop();
        if(x==min.peek())
           min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */