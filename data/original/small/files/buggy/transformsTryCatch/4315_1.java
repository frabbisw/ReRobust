public void setLensDistortion(boofcv.struct.distort.PixelTransform_F32 distToUndist) {
    try {
        this.ellipseDetector.setLensDistortion(distToUndist);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.ellipseRefiner.setTransform(distToUndist);
    this.intensityCheck.setTransform(distToUndist);
}
