public class BracketChecker {

    public static void checkBalance(String expression) {

        LinkedStack<Character> stack =
                new LinkedStack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            // Acilan semboller
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);
            }

            // Kapanan semboller
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {

                    System.out.println("DENGELI DEGIL");
                    return;
                }

                char open = stack.pop();

                if (!isMatching(open, ch)) {

                    System.out.println(
                            "DENGELI DEGIL - hata pozisyonu: "
                                    + i);

                    return;
                }
            }
        }

        if (stack.isEmpty()) {

            System.out.println("DENGELI");
        }

        else {

            System.out.println(
                    "DENGELI DEGIL - kapatilmamis sembol var");
        }
    }

    private static boolean isMatching(
            char open,
            char close) {

        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}