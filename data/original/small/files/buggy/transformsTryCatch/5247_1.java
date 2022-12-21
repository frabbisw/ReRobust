public boolean addWord(java.lang.String word) {
    java.lang.String toAdd = word.toLowerCase();
    if (dict.contains(toAdd))
        return false;
    try {
        dict.add(toAdd);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
