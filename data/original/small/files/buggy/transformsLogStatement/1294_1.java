public double evaluate(java.lang.String s, java.lang.String sx, java.lang.Double vx) {
    java.lang.String dx = java.lang.Double.toString(vx);
    System.out.println("log");
    java.lang.String op = s.replace(sx, dx);
    return calculateMath(op);
}
