public void setImageProcessorBusy(boolean imageProcessorBusy) {
    this.imageProcessorBusy = imageProcessorBusy;
    try {
        if (!imageProcessorBusy) {
            mWaitSpinner.setVisibility(View.GONE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
