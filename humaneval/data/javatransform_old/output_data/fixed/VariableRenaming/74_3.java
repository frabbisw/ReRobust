public static Object compare_one(Object a, Object b) {
    double var = 0, temp_b = 0;
    if (a instanceof String) {
        String temp_a_string = a.toString();
        temp_a_string = temp_a_string.replace(',', '.');
        var = Double.parseDouble(temp_a_string);
    }
    if (b instanceof String) {
        String temp_b_string = b.toString();
        temp_b_string = temp_b_string.replace(',', '.');
        temp_b = Double.parseDouble(temp_b_string);
    }
    if (a instanceof Double)
        var = (Double) a;
    if (b instanceof Double)
        temp_b = (Double) b;
    if (a instanceof Integer)
        var = ((Integer) a).doubleValue();
    if (b instanceof Integer)
        temp_b = ((Integer) b).doubleValue();
    if (var == temp_b)
        return null;
    if (var > temp_b)
        return a;
    else
        return b;
}
