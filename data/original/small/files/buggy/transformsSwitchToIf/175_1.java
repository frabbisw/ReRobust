@java.lang.Override
public void onAction(java.lang.String name, boolean keyPressed, float tpf) {
    if (name == "BACK") {
        nifty.gotoScreen("Start");
    } else if (name == "START") {
        nifty.gotoScreen("PlayerLoading");
    }
}
