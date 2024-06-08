public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = "";
    for (int i = 0; i < operand.length; i += 1) {
        expression += operator[i] + operand[i];
    }
    if (false) {
        temp = 1;
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
