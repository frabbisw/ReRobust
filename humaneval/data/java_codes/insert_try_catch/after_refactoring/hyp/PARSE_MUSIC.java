import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PARSE_MUSIC { public static List<Integer> parse_music ( String music_string ) { HashMap<String, Integer> note_map = new HashMap<String, Integer> () ; note_map.put ( "o", 4 ) ; try { note_map.put ( "o|", 2 ) ; } catch ( Exception ex ) { ex. printStackTrace () ; } note_map.put ( ".|", 1 ) ; List<Integer> result = new ArrayList<Integer> () ; for ( String note : music_string.split ( " " ) ) { result.add ( note_map.get ( note ) ) ; } return result ; } }