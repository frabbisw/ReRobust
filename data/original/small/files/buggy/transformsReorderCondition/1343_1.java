@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "set pwm success");
    if (0 < pwm) {
        updateLightBulb(true);
    } else {
        updateLightBulb(false);
    }
    done();
}
