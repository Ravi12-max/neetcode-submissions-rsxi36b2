class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String t:tokens){
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int a=st.pop();
                int b=st.pop();
                int res;
                switch(t){
                    case "+":
                    res=a+b;
                    break;
                    case "-":
                    res=b-a;
                    break;
                    case "*":
                    res=a*b;
                    break;
                    case "/":
                    res=b/a;
                    break;
                    default:
                    throw new IllegalArgumentException("Unknown Operator:" +t);
                }
                st.push(res);

            }
            else st.push(Integer.parseInt(t));
        }
        return st.pop();
    }
}
