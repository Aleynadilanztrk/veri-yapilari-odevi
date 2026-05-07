public class PalindromeChecker {

    public static boolean isPalindrome(String word) {

        ArrayStack<Character> stack =
                new ArrayStack<>(word.length());

        LinkedQueue<Character> queue =
                new LinkedQueue<>();

        // 1. Hem stack hem queue doldur
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            stack.push(ch);
            queue.enqueue(ch);
        }

        // 2. Karşılaştır
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();
            char fromQueue = queue.dequeue();

            if (fromStack != fromQueue) {
                return false;
            }
        }

        return true;
    }
}