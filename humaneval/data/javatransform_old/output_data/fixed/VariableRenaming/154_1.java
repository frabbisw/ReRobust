public static ArrayList<String> bf(String var, String planet2) {
    ArrayList<String> planet_names = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    ArrayList<String> result = new ArrayList<String>();
    if ((!planet_names.contains(var)) || (!planet_names.contains(planet2)))
        return result;
    int planet1_index = planet_names.indexOf(var);
    int planet2_index = planet_names.indexOf(planet2);
    if (planet1_index < planet2_index) {
        for (int i = planet1_index + 1; i < planet2_index; i += 1) result.add(planet_names.get(i));
    } else {
        for (int i = planet2_index + 1; i < planet1_index; i += 1) result.add(planet_names.get(i));
    }
    return result;
}
