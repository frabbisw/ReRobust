@java.lang.Override
public java.lang.String getRandomValue() {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    try {
        for (int i = 0; i < (length); i++) {
            stringBuilder.append(characterRandomizer.getRandomValue());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return stringBuilder.toString();
}
