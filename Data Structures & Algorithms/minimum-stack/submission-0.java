class MinStack {
    int size=100000;
    int top=-1;
    int[] st = new int[size];
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(top==size-1) return ;
        st[++top]=val;
    }
    
    public void pop() {
        if(top==-1) return;
        top--;
    }
    
    public int top() {
        if(top==-1) return -1;
        return st[top];
    }
    
    public int getMin() {
        if(top==-1) return -1;
        int min=st[0];
        for(int i=1;i<=top;i++){
            if(st[i]<min) min=st[i];
        }
        return min;
    }
}
