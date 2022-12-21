public static void main(java.lang.String[] args) {
    System.out.println("log");
    if ((args[0]) == "-")
        BurrowsWheeler.transform();
    else if ((args[0]) == "+")
        BurrowsWheeler.inverseTransform();
}
