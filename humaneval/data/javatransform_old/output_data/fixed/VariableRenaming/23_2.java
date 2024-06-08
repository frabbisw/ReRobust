public static double do_algebra(String[] operator, int[] var) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = var[0] + "";
    for (int i = 0; i < operator.length; i += 1) {
        expression += operator[i] + var[i + 1];
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
