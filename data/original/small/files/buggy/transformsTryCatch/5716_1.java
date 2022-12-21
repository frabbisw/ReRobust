public static void main(java.lang.String[] args) {
    try {
        if ((args[0]) == "-")
            BurrowsWheeler.transform();
        else if ((args[0]) == "+")
            BurrowsWheeler.inverseTransform();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
