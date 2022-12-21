private double convertUnit(double number, int index) {
    try {
        if (index != (-1))
            return number / (java.lang.Math.pow(10, Functions.Density.POWERS[index]));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0;
}
