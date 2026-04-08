
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false; // check before peek

                char top = stack.peek();
                if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false; // mismatch
                }
            }
        }

        return stack.isEmpty();
    }
}
