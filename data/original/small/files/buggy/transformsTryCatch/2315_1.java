private com.rfo.basic.Var getArrayVarForWrite() {
    com.rfo.basic.Var var = getVarAndType();
    if (validArrayVarForWrite(var)) {
        return var;
    }
    try {
        LineIndex -= var.name().length();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
