public void detectDisplayMode() {
    System.out.println("log");
    int dispMode = getResources().getConfiguration().orientation;
    if (dispMode == 1) {
        displayMode = "";
    } else {
        displayMode = "_land";
    }
}
