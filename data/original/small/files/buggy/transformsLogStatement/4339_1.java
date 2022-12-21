@java.lang.Override
public void visit(org.teavm.backend.wasm.model.expression.WasmGetLocal expression) {
    System.out.println("log");
    value = org.teavm.backend.wasm.render.CExpression.relocatable(("var_" + (expression.getLocal().getIndex())));
}
