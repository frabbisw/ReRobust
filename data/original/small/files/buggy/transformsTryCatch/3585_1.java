public static void printLine(final java.lang.String lineCharacter, final int lineSize) {
    for (int i = 0; i < lineSize; i++) {
        java.lang.System.out.print(lineCharacter);
    }
    try {
        java.lang.System.out.println();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
