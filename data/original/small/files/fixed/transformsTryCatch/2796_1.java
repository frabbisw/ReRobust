@edu.uci.python.test.benchmarks.Test
public void pads_integerpartitions() {
    java.nio.file.Path script = java.nio.file.Paths.get("pads-integerpartitions.py");
    try {
        assertBenchNoError(script, new java.lang.String[] { "700" });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
