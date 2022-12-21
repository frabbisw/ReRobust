@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((getActivity()) instanceof io.tanners.taggedwallpaper.interfaces.IGetTag) {
        this.tag = ((io.tanners.taggedwallpaper.interfaces.IGetTag) (getActivity())).getTag();
    } else {
    }
}
