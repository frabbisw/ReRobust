public static void parse(java.lang.String line) {
    try {
        if (line.contains(":")) {
            Assembler.isLabel(line);
            Assembler.address += 4;
        } else {
            Assembler.moreParse(line);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
