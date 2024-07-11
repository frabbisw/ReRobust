public static ArrayList<String> bf(String planet1, String planet2) {
    ArrayList<String> var = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    ArrayList<String> result = new ArrayList<String>();
    if ((!var.contains(planet1)) || (!var.contains(planet2)))
        return result;
    int planet1_index = var.indexOf(planet1);
    int planet2_index = var.indexOf(planet2);
    if (planet1_index < planet2_index) {
        for (int i = planet1_index + 1; i < planet2_index; i += 1) result.add(var.get(i));
    } else {
        for (int i = planet2_index + 1; i < planet1_index; i += 1) result.add(var.get(i));
    }
    return result;
}
