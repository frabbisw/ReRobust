public void setLensDistortion(boofcv.struct.distort.PixelTransform_F32 distToUndist) {
    this.ellipseDetector.setLensDistortion(distToUndist);
    try {
        if ((this.ellipseRefiner) != null)
            this.ellipseRefiner.setTransform(distToUndist);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.intensityCheck.setTransform(distToUndist);
}
