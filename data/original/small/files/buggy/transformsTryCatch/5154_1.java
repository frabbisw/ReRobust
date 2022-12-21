@java.lang.Override
public void onStop(com.grarak.kerneladiutor.views.recyclerview.SeekBarView seekBarView, int position, java.lang.String value) {
    try {
        com.grarak.kerneladiutor.utils.kernel.battery.Battery.setChargingCurrent(((position + 10) * 100), getActivity());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
