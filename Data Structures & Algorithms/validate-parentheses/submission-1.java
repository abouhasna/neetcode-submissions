class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for(char c : s.toCharArray()){
            if(c == '(' | c == '{' | c == '[')
                stack.push(c);
            else {
                if(!stack.isEmpty() && stack.peek() == closeToOpen.get(c))
                    stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
