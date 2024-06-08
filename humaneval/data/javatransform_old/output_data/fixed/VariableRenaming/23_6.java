public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = operand[0] + "";
    for (int var = 0; var < operator.length; var += 1) {
        expression += operator[var] + operand[var + 1];
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
