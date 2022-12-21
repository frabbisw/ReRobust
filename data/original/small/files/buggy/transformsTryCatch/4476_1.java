public com.yalantis.ucrop.UCrop useSourceImageAspectRatio() {
    mCropOptionsBundle.putBoolean(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_SET, true);
    mCropOptionsBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_X, 0);
    try {
        mCropOptionsBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_Y, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
