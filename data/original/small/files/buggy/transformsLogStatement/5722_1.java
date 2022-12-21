public boolean search(java.lang.String word) {
    System.out.println("log");
    TrieNode root = searchNode(word);
    if ((root != null) && (root.isLeaf)) {
        return true;
    } else {
        return false;
    }
}
