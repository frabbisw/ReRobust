@java.lang.Override
public void onStop(com.grarak.kerneladiutor.views.recyclerview.SeekBarView seekBarView, int position, java.lang.String value) {
    System.out.println("log");
    com.grarak.kerneladiutor.utils.kernel.battery.Battery.setChargingCurrent(((position + 10) * 100), getActivity());
}
