class MyStack {
    
    private Queue<Integer> queue1 = new LinkedList<Integer>();
    private Queue<Integer> queue2 = new LinkedList<Integer>();
    private int top;


    public MyStack() {
        
    }
    
    public void push(int x) {
        queue1.add(x);
        top = x;
    }
    
    public int pop() {
        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }
        int ans = queue1.remove();
        
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return ans;
    }
    
    public int top() {
        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }
        int ans = queue1.peek();
        queue1.remove();
        queue2.add(ans);
        
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        
        return ans;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */