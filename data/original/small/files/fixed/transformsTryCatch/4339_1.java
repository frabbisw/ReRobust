@java.lang.Override
public void visit(org.teavm.backend.wasm.model.expression.WasmGetLocal expression) {
    try {
        value = new org.teavm.backend.wasm.render.CExpression(("var_" + (expression.getLocal().getIndex())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
