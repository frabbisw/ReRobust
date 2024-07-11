public static ArrayList<String> bf(String planet1, String planet2) {
    ArrayList<String> planet_names = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    ArrayList<String> var = new ArrayList<String>();
    if ((!planet_names.contains(planet1)) || (!planet_names.contains(planet2)))
        return var;
    int planet1_index = planet_names.indexOf(planet1);
    int planet2_index = planet_names.indexOf(planet2);
    for (int i = planet1_index; i < planet2_index; i += 1) var.add(planet_names.get(i));
    return var;
}
