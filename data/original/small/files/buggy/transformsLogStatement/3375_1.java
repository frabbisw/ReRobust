@org.openjdk.jmh.annotations.Benchmark
public void staticFunctions() {
    System.out.println("log");
    com.github.dcapwell.java.methodtypes.FunctionTypes.RealWork.doWorkStatic(java.util.Collections.emptyList());
}
