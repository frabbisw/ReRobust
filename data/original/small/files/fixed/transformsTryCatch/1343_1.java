@java.lang.Override
public void onSuccess() {
    try {
        android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "set pwm success");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    done();
}
