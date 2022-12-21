@org.openjdk.jmh.annotations.Benchmark
public void staticFunctions() {
    try {
        com.github.dcapwell.java.methodtypes.FunctionTypes.RealWork.doWorkStatic(java.util.Collections.emptyList());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
