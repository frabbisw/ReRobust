public static double do_algebra(String[] var, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = "";
    for (int i = 0; i < operand.length; i += 1) {
        expression += var[i] + operand[i];
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
