public static List<Integer> parse_music(String music_string) {
    HashMap<String, Integer> note_map = new HashMap<String, Integer>();
    note_map.put("o", 4);
    note_map.put("o|", 2);
    note_map.put(".|", 1);
    List<Integer> result = new ArrayList<Integer>();
    for (String var : music_string.split(" ")) {
        result.add(note_map.get(var));
    }
    return result;
}
