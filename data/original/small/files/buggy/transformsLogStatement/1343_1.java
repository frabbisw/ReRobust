@java.lang.Override
public void onSuccess() {
    System.out.println("log");
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "set pwm success");
    if (pwm > 0) {
        updateLightBulb(true);
    } else {
        updateLightBulb(false);
    }
    done();
}
