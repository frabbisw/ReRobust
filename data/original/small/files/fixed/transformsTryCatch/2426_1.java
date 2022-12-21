public void stopDefaultBehaviour() {
    this.getCurrentActivity().setDefault(false);
    try {
        this.requestActivityFinish(this.getCurrentActivity());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
