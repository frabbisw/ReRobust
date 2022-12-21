@java.lang.Override
public org.nd4j.linalg.api.complex.IComplexNDArray copy(org.nd4j.linalg.api.complex.IComplexNDArray x, org.nd4j.linalg.api.complex.IComplexNDArray y) {
    try {
        org.nd4j.linalg.jcublas.SimpleJCublas.copy(x, y);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return y;
}
