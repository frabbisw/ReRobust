@java.lang.Override
public void onAction(java.lang.String name, boolean keyPressed, float tpf) {
    if (keyPressed)
        return;
    try {
        switch(name) {
            case "BACK":
                nifty.gotoScreen("Start");
                break;
            case "START":
                nifty.gotoScreen("PlayerLoading");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
