class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int op1, op2;
        for(String s : tokens){
            if (s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {                
                op2 = stack.pop();

                op1 = stack.pop();

                switch (s){
                    case "+":
                        stack.push(op1 + op2);
                        break;
                    case "-":
                        stack.push(op1 - op2);
                        break;
                    case "*":
                        stack.push(op1 * op2);
                        break;
                    case "/":
                        stack.push(op1 / op2);
                        break;
                }

            } else {stack.push(Integer.parseInt(s));}
        }
        return stack.pop();
    }
}
