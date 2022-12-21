@java.lang.Override
public java.util.List<java.lang.String> getAllCombinations(java.lang.Integer phoneNumber) {
    java.util.List<java.lang.String> combos = new java.util.LinkedList<>();
    try {
        generateCombosHelper(combos, "", java.lang.String.valueOf(phoneNumber));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return combos;
}
