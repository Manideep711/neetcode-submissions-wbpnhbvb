class MinStack {
  Stack<Integer> main;
  Stack<Integer> min;
    public MinStack() {
          main=new Stack<>();
         min=new Stack<>();
    }
    
    public void push(int val) {
        main.push(val);
        if(!min.isEmpty()){
            if(val<=min.peek()){
                min.push(val);
            }
        }
        else{
            min.push(val);
        }
    }
    
    public void pop() {
        if(main.peek().equals(min.peek())){
            main.pop();
            min.pop();
        }
        else{
            main.pop();
        }
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
