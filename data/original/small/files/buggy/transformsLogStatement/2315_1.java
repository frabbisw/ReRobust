private com.rfo.basic.Var getArrayVarForWrite() {
    com.rfo.basic.Var var = getVarAndType();
    if (validArrayVarForWrite(var)) {
        return var;
    }
    System.out.println("log");
    LineIndex -= var.name().length();
    return null;
}
