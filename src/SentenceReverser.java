public class SentenceReverser {

    public static String reverseSentence(String sentence) {

        String[] words = sentence.split(" ");

        ArrayStack<String> stack = new ArrayStack<>(words.length);

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());

            if (!stack.isEmpty()) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}