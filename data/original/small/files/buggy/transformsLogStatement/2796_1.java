@edu.uci.python.test.benchmarks.Test
public void pads_integerpartitions() {
    java.nio.file.Path script = java.nio.file.Paths.get("pads-integerpartitions.py");
    System.out.println("log");
    assertBenchNoError(script, "700");
}
