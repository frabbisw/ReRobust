@java.lang.Override
public java.util.List<java.lang.String> getAllCombinations(java.lang.String phoneNumber) {
    java.util.List<java.lang.String> combos = new java.util.LinkedList<>();
    try {
        generateCombosHelper(combos, "", phoneNumber);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return combos;
}
