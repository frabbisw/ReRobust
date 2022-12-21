private com.rfo.basic.Var getArrayVarForWrite() {
    com.rfo.basic.Var var = getVarAndType();
    try {
        if (validArrayVarForWrite(var)) {
            return var;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (var != null) {
        LineIndex -= var.name().length();
    }
    return null;
}
