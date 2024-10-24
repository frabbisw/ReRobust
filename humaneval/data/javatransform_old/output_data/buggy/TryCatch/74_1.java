public static Object compare_one(Object a, Object b) {
    double temp_a = 0, temp_b = 0;
    try {
        if (a instanceof String) {
            String temp_a_string = a.toString();
            temp_a_string = temp_a_string.replace(',', '.');
            temp_a = Double.parseDouble(temp_a_string);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (b instanceof String) {
        String temp_b_string = b.toString();
        temp_b_string = temp_b_string.replace(',', '.');
        temp_b = Double.parseDouble(temp_b_string);
    }
    if (a instanceof Double)
        temp_a = ((Integer) b).doubleValue();
    if (b instanceof Double)
        temp_b = ((Integer) a).doubleValue();
    if (a instanceof Integer)
        temp_a = (Double) a;
    if (b instanceof Integer)
        temp_b = (Double) b;
    if (temp_a == temp_b)
        return null;
    if (temp_a > temp_b)
        return a;
    else
        return b;
}