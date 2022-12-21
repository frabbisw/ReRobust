public void setLensDistortion(boofcv.struct.distort.PixelTransform_F32 distToUndist) {
    System.out.println("log");
    this.ellipseDetector.setLensDistortion(distToUndist);
    this.ellipseRefiner.setTransform(distToUndist);
    this.intensityCheck.setTransform(distToUndist);
}
