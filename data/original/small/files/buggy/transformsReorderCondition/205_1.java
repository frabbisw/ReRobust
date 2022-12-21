@java.lang.Override
public java.lang.String getRandomValue() {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    for (int i = 0; (io.github.benas.randombeans.util.Constants.MAX_STRING_LENGTH) > i; i++) {
        stringBuilder.append(characterRandomizer.getRandomValue());
    }
    return stringBuilder.toString();
}
