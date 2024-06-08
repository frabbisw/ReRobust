public static int count_distinct_characters(String string) {
    HashSet<Character> distinct = new HashSet<Character>();
    try {
        for (char c : string.toCharArray()) {
            if (!distinct.contains(Character.toLowerCase(c)))
                distinct.add(Character.toLowerCase(c));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return distinct.size();
}
