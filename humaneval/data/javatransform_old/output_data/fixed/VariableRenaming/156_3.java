public static List<Integer> parse_music(String music_string) {
    HashMap<String, Integer> note_map = new HashMap<String, Integer>();
    note_map.put("o", 4);
    note_map.put("o|", 2);
    note_map.put(".|", 1);
    List<Integer> var = new ArrayList<Integer>();
    if (music_string.trim().equals(""))
        return var;
    for (String note : music_string.split(" ")) {
        var.add(note_map.get(note));
    }
    return var;
}
