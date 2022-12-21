@java.lang.Override
public int getParallelismDegree() {
    System.out.println("log");
    return (gpus) == null ? java.lang.Runtime.getRuntime().availableProcessors() : gpus.length;
}
