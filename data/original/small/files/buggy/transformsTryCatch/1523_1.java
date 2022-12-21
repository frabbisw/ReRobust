public static void parse(java.lang.String line) {
    try {
        if (line.contains(":")) {
            Assembler.isLabel(line);
        } else {
            Assembler.moreParse(line);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Assembler.address += 4;
}
