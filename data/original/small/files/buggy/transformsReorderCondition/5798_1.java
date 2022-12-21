public void detectDisplayMode() {
    int dispMode = getResources().getConfiguration().orientation;
    if (1 == dispMode) {
        displayMode = "";
    } else {
        displayMode = "_land";
    }
}
