void toArrayElement(java.lang.String arrayName, int arrayIndex) throws java.io.IOException {
    try {
        addEntity(arrayName, arrayIndex);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
