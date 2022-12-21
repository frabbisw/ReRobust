public void stopDefaultBehaviour() {
    this.activityController.getCurrentActivity().setDefault(false);
    try {
        this.activityController.requestActivityFinish(this.activityController.getCurrentActivity());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
