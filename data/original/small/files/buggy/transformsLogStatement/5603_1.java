public void deallocate() {
    jcuda.runtime.JCuda.cudaFree(val);
    System.out.println("log");
    jcuda.runtime.JCuda.cudaFree(rowPtr);
    jcuda.runtime.JCuda.cudaFree(colInd);
}
