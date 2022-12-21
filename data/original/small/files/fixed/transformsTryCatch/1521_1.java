private void DrawField(char[][] field) {
    try {
        for (char[] x : field) {
            for (char y : x) {
                java.lang.System.out.print((y + " "));
            }
            java.lang.System.out.println();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
