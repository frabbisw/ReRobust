public boolean search(java.lang.String word) {
    TrieNode root = searchNode(word);
    if ((root.isLeaf) && (root != null)) {
        return true;
    } else {
        return false;
    }
}
