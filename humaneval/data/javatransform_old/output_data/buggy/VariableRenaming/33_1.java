public static int count_distinct_characters(String var) {
    HashSet<Character> distinct = new HashSet<Character>();
    for (char c : var.toCharArray()) {
        if (!distinct.contains(Character.toLowerCase(c)))
            distinct.add(c);
    }
    return distinct.size();
}
