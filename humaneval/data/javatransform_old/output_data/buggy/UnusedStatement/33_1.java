public static int count_distinct_characters(String string) {
    HashSet<Character> distinct = new HashSet<Character>();
    if (false) {
        temp = 1;
    }
    for (char c : string.toCharArray()) {
        if (!distinct.contains(Character.toLowerCase(c)))
            distinct.add(c);
    }
    return distinct.size();
}
