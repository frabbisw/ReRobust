public void setImageProcessorBusy(boolean imageProcessorBusy) {
    System.out.println("log");
    this.imageProcessorBusy = imageProcessorBusy;
    if (!imageProcessorBusy) {
        mWaitSpinner.setVisibility(View.GONE);
    }
}
