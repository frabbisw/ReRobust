private double convertUnit(double number, char prefix) {
    int index = prefixes.indexOf(prefix);
    try {
        if (index != (-1))
            return number / (java.lang.Math.pow(10, Functions.Density.POWERS[index]));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0;
}
