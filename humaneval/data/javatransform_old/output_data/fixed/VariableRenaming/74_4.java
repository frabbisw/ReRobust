public static Object compare_one(Object a, Object b) {
    double temp_a = 0, var = 0;
    if (a instanceof String) {
        String temp_a_string = a.toString();
        temp_a_string = temp_a_string.replace(',', '.');
        temp_a = Double.parseDouble(temp_a_string);
    }
    if (b instanceof String) {
        String temp_b_string = b.toString();
        temp_b_string = temp_b_string.replace(',', '.');
        var = Double.parseDouble(temp_b_string);
    }
    if (a instanceof Double)
        temp_a = (Double) a;
    if (b instanceof Double)
        var = (Double) b;
    if (a instanceof Integer)
        temp_a = ((Integer) a).doubleValue();
    if (b instanceof Integer)
        var = ((Integer) b).doubleValue();
    if (temp_a == var)
        return null;
    if (temp_a > var)
        return a;
    else
        return b;
}
