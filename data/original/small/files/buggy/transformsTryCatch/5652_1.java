static void compareInt() {
    try {
        Jude.emitLn("pop rbx");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Jude.emitLn("cmp rbx, rax");
    Jude.emitLn("mov rax, 0");
}
