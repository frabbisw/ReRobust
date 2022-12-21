protected static void printLine(final java.lang.String lineCharacter, final int lineSize) {
    try {
        for (int i = 0; i < lineSize; i++) {
            java.lang.System.out.print(lineCharacter);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println();
}
