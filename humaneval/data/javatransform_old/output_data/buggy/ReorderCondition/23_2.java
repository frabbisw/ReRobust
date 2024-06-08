public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = "";
    for (int i = 0; i < operand.length; i += 1) {
        expression += operand[i] + operator[i];
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
