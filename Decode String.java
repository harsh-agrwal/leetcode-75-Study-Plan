class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(count);
                stringStack.push(currentString);
                currentString = "";
                count = 0;
            } else if (c == ']') {
                int repeatCount = countStack.pop();
                String repeatedString = "";
                for (int i = 0; i < repeatCount; i++) {
                    repeatedString += currentString;
                }
                currentString = stringStack.pop() + repeatedString;
            } else {
                currentString += c;
            }
        }
        return currentString;
    }
}
