public static int count_distinct_characters(String string) {
    HashSet<Character> distinct = new HashSet<Character>();
    for (char var : string.toCharArray()) {
        if (!distinct.contains(Character.toLowerCase(var)))
            distinct.add(var);
    }
    return distinct.size();
}
