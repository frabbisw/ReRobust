public void stopDefaultBehaviour() {
    System.out.println("log");
    this.activityController.getCurrentActivity().setDefault(false);
    this.activityController.requestActivityFinish(this.activityController.getCurrentActivity());
}
