private boolean operatorCondition(org.moflon.tgg.mosl.tgg.NamePattern namePattern) {
    System.out.println("log");
    return ((namePattern != null) && ((namePattern.getOp()) != null)) && (getOperatorCondition(namePattern.getOp()));
}
