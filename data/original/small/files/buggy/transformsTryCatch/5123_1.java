@java.lang.Override
public void onStop(com.grarak.kerneladiutor.views.recyclerview.SeekBarView seekBarView, int position, java.lang.String value) {
    try {
        com.grarak.kerneladiutor.utils.kernel.cpuhotplug.AiOHotPlug.setAiOHotPlugOnlineCores((position + 1), getActivity());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
