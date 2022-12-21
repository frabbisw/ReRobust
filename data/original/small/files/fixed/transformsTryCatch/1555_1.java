public java.lang.String chooseTrump(int trump) {
    java.lang.String packet = "3,";
    try {
        packet.concat(java.lang.Integer.toString(trump));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return packet;
}
