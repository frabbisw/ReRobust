@java.lang.Override
public void onStop(com.grarak.kerneladiutor.views.recyclerview.SeekBarView seekBarView, int position, java.lang.String value) {
    com.grarak.kerneladiutor.utils.kernel.battery.Battery.setChargingCurrent((100 * (position + 10)), getActivity());
}
