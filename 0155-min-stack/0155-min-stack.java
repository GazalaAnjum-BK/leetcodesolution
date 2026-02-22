class MinStack {
    ArrayDeque<Integer> stack=new ArrayDeque<>();
    ArrayDeque<Integer> minstack=new ArrayDeque<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()){

            minstack.push(val);
        }else {int curmin=minstack.peek();
        minstack.push(Math.min(val,curmin));
        }  
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
        
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