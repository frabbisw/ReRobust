public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = operand[0] + "";
    for (int i = 0; i < operator.length; i += 1) {
        expression += operand[i + 1] + operator[i];
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
