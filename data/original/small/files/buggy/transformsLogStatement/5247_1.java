public boolean addWord(java.lang.String word) {
    System.out.println("log");
    java.lang.String toAdd = word.toLowerCase();
    if (dict.contains(toAdd))
        return false;
    dict.add(toAdd);
    return true;
}
