public static int count_distinct_characters(String string) {
    HashSet<Character> var = new HashSet<Character>();
    for (char c : string.toCharArray()) {
        if (!var.contains(Character.toLowerCase(c)))
            var.add(c);
    }
    return var.size();
}
