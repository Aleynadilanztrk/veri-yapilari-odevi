public class Main {

    public static void main(String[] args) {

        System.out.println("=== PROBLEM 1 ===");

        String reversed =
                SentenceReverser.reverseSentence(
                        "Java ile yigin ogrenmek");

        System.out.println(reversed);

        // LINKED STACK TEST

System.out.println("\n=== LINKED STACK TEST ===");

LinkedStack<Integer> linkedStack =
        new LinkedStack<>();

linkedStack.push(100);
linkedStack.push(200);
linkedStack.push(300);

System.out.println(linkedStack.pop());
System.out.println(linkedStack.pop());

// PROBLEM 2

System.out.println("\n=== PROBLEM 2 ===");

BracketChecker.checkBalance(
        "{ int a[] = ( new int[5] ); }");

BracketChecker.checkBalance(
        "{ if ( a[ i ) > 0 }");

BracketChecker.checkBalance(
        "{ while (true) { }");

        // PROBLEM 3

System.out.println("\n=== PROBLEM 3 ===");

PrinterSimulation printer =
        new PrinterSimulation();

printer.addJob("Ahmet", 3);
printer.addJob("Ayse", 1);
printer.addJob("Mehmet", 5);

printer.printNext();

printer.addJob("Zeynep", 2);

printer.printAll();

// PROBLEM 4

System.out.println("\n=== PROBLEM 4 ===");

System.out.println("kayak -> "
        + PalindromeChecker.isPalindrome("kayak"));

System.out.println("level -> "
        + PalindromeChecker.isPalindrome("level"));

System.out.println("java -> "
        + PalindromeChecker.isPalindrome("java"));

System.out.println("racecar -> "
        + PalindromeChecker.isPalindrome("racecar"));

         // PROBLEM 5

System.out.println("\n=== PROBLEM 5 ===");

BST tree = new BST();

int[] nums =
        {50,30,70,20,40,60,80,10,25,35,45};

for (int n : nums) {
    tree.insert(n);
}

System.out.print("Inorder: ");
tree.inorder();

System.out.print("Preorder: ");
tree.preorder();

System.out.print("Postorder: ");
tree.postorder();

System.out.println("Min: " + tree.findMin());
System.out.println("Max: " + tree.findMax());

System.out.println("search 40: " + tree.search(40));
System.out.println("search 30: " + tree.search(30));

// PROBLEM 6

System.out.println("\n=== PROBLEM 6 ===");

WordBST wordTree = new WordBST();

String text =
        "java guzel java veri yapisi veri guzel java";

String[] words = text.split(" ");

for (String w : words) {
    wordTree.addWord(w);
}

wordTree.printAlphabetically();

System.out.println(
        "java count: " +
        wordTree.getCount("java"));

System.out.println(
        "python count: " +
        wordTree.getCount("python"));

System.out.println(
        "most frequent: " +
        wordTree.getMostFrequent());
    }
}