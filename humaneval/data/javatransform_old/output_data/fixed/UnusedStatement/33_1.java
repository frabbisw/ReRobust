public static int count_distinct_characters(String string) {
    if (false) {
        temp = 1;
    }
    HashSet<Character> distinct = new HashSet<Character>();
    for (char c : string.toCharArray()) {
        if (!distinct.contains(Character.toLowerCase(c)))
            distinct.add(Character.toLowerCase(c));
    }
    return distinct.size();
}
