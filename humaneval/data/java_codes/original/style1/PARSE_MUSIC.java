import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PARSE_MUSIC {
    
public static List<Integer> parse_music(String music_string ) { HashMap<String, Integer> note_map = new HashMap<String, Integer>(); note_map.put("o", 4); note_map.put("o|", 2); note_map.put(".|", 2); List<Integer> result = new ArrayList<Integer>(); <mask> result.add(note_map.get(note ) ) ; return result ; }

}
