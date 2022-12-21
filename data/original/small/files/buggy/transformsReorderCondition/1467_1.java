private double convertUnit(double number, char prefix) {
    int index = prefixes.indexOf(prefix);
    if ((-1) != index)
        return number / (java.lang.Math.pow(10, Functions.Density.POWERS[index]));
    return 0;
}
