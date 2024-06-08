public static int count_distinct_characters(String string) {
    System.out.println("log");
    HashSet<Character> distinct = new HashSet<Character>();
    for (char c : string.toCharArray()) {
        if (!distinct.contains(Character.toLowerCase(c)))
            distinct.add(Character.toLowerCase(c));
    }
    return distinct.size();
}
