public static List<Integer> parse_music(String music_string) {
    HashMap<String, Integer> var = new HashMap<String, Integer>();
    var.put("o", 4);
    var.put("o|", 2);
    var.put(".|", 1);
    List<Integer> result = new ArrayList<Integer>();
    for (String note : music_string.split(" ")) {
        result.add(var.get(note));
    }
    return result;
}
