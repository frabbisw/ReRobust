@java.lang.Override
public void onStop(com.grarak.kerneladiutor.views.recyclerview.SeekBarView seekBarView, int position, java.lang.String value) {
    com.grarak.kerneladiutor.utils.kernel.cpuhotplug.AiOHotPlug.setAiOHotPlugOnlineCores((1 + position), getActivity());
}
