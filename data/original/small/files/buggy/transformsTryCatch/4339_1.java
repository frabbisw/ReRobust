@java.lang.Override
public void visit(org.teavm.backend.wasm.model.expression.WasmGetLocal expression) {
    try {
        value = org.teavm.backend.wasm.render.CExpression.relocatable(("var_" + (expression.getLocal().getIndex())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
