@java.lang.Override
public void show() {
    try {
        if ((isReady()) && ((ad) != null)) {
            ad.show();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
