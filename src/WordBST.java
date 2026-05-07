public class WordBST {

    class WordNode {

        String word;
        int count;

        WordNode left, right;

        WordNode(String word) {
            this.word = word;
            this.count = 1;
        }
    }

    private WordNode root;

    // WORD EKLEME
    public void addWord(String word) {
        root = addRec(root, word);
    }

    private WordNode addRec(WordNode root, String word) {

        if (root == null) {
            return new WordNode(word);
        }

        int cmp = word.compareTo(root.word);

        if (cmp == 0) {
            root.count++;
        }

        else if (cmp < 0) {
            root.left = addRec(root.left, word);
        }

        else {
            root.right = addRec(root.right, word);
        }

        return root;
    }

    // ALFABETİK YAZDIRMA
    public void printAlphabetically() {
        inorder(root);
    }

    private void inorder(WordNode root) {

        if (root != null) {

            inorder(root.left);

            System.out.println(root.word + " : " + root.count);

            inorder(root.right);
        }
    }

    // KELİME SAYISI GETİR
    public int getCount(String word) {
        return getCountRec(root, word);
    }

    private int getCountRec(WordNode root, String word) {

        if (root == null) return 0;

        int cmp = word.compareTo(root.word);

        if (cmp == 0) return root.count;

        if (cmp < 0)
            return getCountRec(root.left, word);

        return getCountRec(root.right, word);
    }

    // EN ÇOK GEÇEN KELİME
    public String getMostFrequent() {
        return findMax(root, "");
    }

    private String findMax(WordNode root, String maxWord) {

        if (root == null) return maxWord;

        if (root.count >
                getCount(maxWord)) {
            maxWord = root.word;
        }

        maxWord = findMax(root.left, maxWord);
        maxWord = findMax(root.right, maxWord);

        return maxWord;
    }
}