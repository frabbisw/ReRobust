public void deallocate() {
    try {
        jcuda.runtime.JCuda.cudaFree(val);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    jcuda.runtime.JCuda.cudaFree(rowPtr);
    jcuda.runtime.JCuda.cudaFree(colInd);
}
