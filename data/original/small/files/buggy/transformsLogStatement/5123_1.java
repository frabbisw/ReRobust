@java.lang.Override
public void onStop(com.grarak.kerneladiutor.views.recyclerview.SeekBarView seekBarView, int position, java.lang.String value) {
    System.out.println("log");
    com.grarak.kerneladiutor.utils.kernel.cpuhotplug.AiOHotPlug.setAiOHotPlugOnlineCores((position + 1), getActivity());
}
