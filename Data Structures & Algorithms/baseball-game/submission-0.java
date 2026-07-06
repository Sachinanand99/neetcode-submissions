class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        int res = 0;
        for (String op : operations) {
            if (op.equals("+"))   {
                int top = stk.pop();
                int newTop = stk.peek() + top;
                stk.push(top);
                stk.push(newTop);
                res += newTop;
            } else if (op.equals("C")) {
                int t = stk.pop();
                res-=t;
            } else if (op.equals("D")) {
                int t=stk.push(stk.peek() * 2);
                res+=t;
            } else {
                int t= stk.push(Integer.parseInt(op));
                res+=t;
            }
        }
        return res;
    }
}