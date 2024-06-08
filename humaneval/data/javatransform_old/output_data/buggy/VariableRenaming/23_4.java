public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine var = mgr.getEngineByName("JavaScript");
    String expression = "";
    for (int i = 0; i < operand.length; i += 1) {
        expression += operator[i] + operand[i];
    }
    return Double.parseDouble(var.eval(expression).toString());
}
