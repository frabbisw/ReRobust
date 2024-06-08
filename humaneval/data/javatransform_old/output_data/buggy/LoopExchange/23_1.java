public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = "";
    {
        int i = 0;
        while (i < operand.length) {
            expression += operator[i] + operand[i];
            i += 1;
        }
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
