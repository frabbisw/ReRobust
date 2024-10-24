public static ArrayList<String> bf(String planet1, String planet2) {
    ArrayList<String> planet_names = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    ArrayList<String> result = new ArrayList<String>();
    if ((!planet_names.contains(planet1)) || (!planet_names.contains(planet2)))
        return result;
    int planet1_index = planet_names.indexOf(planet1);
    int planet2_index = planet_names.indexOf(planet2);
    for (int var = planet1_index; var < planet2_index; var += 1) result.add(planet_names.get(var));
    return result;
}