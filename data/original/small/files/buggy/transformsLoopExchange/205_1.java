@java.lang.Override
public java.lang.String getRandomValue() {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    {
        int i = 0;
        while (i < (io.github.benas.randombeans.util.Constants.MAX_STRING_LENGTH)) {
            stringBuilder.append(characterRandomizer.getRandomValue());
            i++;
        }
    }
    return stringBuilder.toString();
}
