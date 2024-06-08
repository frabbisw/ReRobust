public static double do_algebra(String[] operator, int[] var) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = "";
    for (int i = 0; i < var.length; i += 1) {
        expression += operator[i] + var[i];
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
