public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String expression = operand[0] + "";
    {
        int i = 0;
        while (i < operator.length) {
            expression += operator[i] + operand[i + 1];
            i += 1;
        }
    }
    return Double.parseDouble(engine.eval(expression).toString());
}
