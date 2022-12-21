@java.lang.Override
public void visit(org.teavm.backend.wasm.model.expression.WasmGetLocal expression) {
    value = org.teavm.backend.wasm.render.CExpression.relocatable(((expression.getLocal().getIndex()) + "var_"));
}
