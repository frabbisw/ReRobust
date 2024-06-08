public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String var = "";
    for (int i = 0; i < operand.length; i += 1) {
        var += operator[i] + operand[i];
    }
    return Double.parseDouble(engine.eval(var).toString());
}
