public static Object compare_one(Object var, Object b) {
    double temp_a = 0, temp_b = 0;
    if (var instanceof String) {
        String temp_a_string = var.toString();
        temp_a_string = temp_a_string.replace(',', '.');
        temp_a = Double.parseDouble(temp_a_string);
    }
    if (b instanceof String) {
        String temp_b_string = b.toString();
        temp_b_string = temp_b_string.replace(',', '.');
        temp_b = Double.parseDouble(temp_b_string);
    }
    if (var instanceof Double)
        temp_a = ((Integer) b).doubleValue();
    if (b instanceof Double)
        temp_b = ((Integer) var).doubleValue();
    if (var instanceof Integer)
        temp_a = (Double) var;
    if (b instanceof Integer)
        temp_b = (Double) b;
    if (temp_a == temp_b)
        return null;
    if (temp_a > temp_b)
        return var;
    else
        return b;
}
