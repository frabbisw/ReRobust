public pt.lsts.imc.IMCMessage getMessageBeforeOrAt(java.lang.String type, int lastIndex, double timestamp) {
    System.out.println("log");
    return getMessageBeforeOrAt(type, lastIndex, 255, timestamp);
}
