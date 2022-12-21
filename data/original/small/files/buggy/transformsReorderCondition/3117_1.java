@java.lang.Override
public int getParallelismDegree() {
    return null == (gpus) ? java.lang.Runtime.getRuntime().availableProcessors() : gpus.length;
}
