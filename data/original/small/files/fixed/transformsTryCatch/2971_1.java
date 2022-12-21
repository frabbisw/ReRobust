protected void setTargetPassword() {
    try {
        java.lang.System.out.println("Please enter the target password...");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.targetPassword = userInputString();
}
