public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = "";
    for (int var = 0; var < operand.length; var += 1) {
        expression += operator[var] + operand[var];
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
