public static Object compare_one(Object a, Object var) {
    double temp_a = 0, temp_b = 0;
    if (a instanceof String) {
        String temp_a_string = a.toString();
        temp_a_string = temp_a_string.replace(',', '.');
        temp_a = Double.parseDouble(temp_a_string);
    }
    if (var instanceof String) {
        String temp_b_string = var.toString();
        temp_b_string = temp_b_string.replace(',', '.');
        temp_b = Double.parseDouble(temp_b_string);
    }
    if (a instanceof Double)
        temp_a = ((Integer) var).doubleValue();
    if (var instanceof Double)
        temp_b = ((Integer) a).doubleValue();
    if (a instanceof Integer)
        temp_a = (Double) a;
    if (var instanceof Integer)
        temp_b = (Double) var;
    if (temp_a == temp_b)
        return null;
    if (temp_a > temp_b)
        return a;
    else
        return var;
}
