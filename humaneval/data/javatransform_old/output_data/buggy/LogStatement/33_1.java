public static int count_distinct_characters(String string) {
    HashSet<Character> distinct = new HashSet<Character>();
    for (char c : string.toCharArray()) {
        if (!distinct.contains(Character.toLowerCase(c)))
            distinct.add(c);
    }
    System.out.println("log");
    return distinct.size();
}
