@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.RecordingStates.Disable) != (currentRecordingState)) {
        setRecordingState(com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.RecordingStates.Disable);
        setPlaybackState(com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.PlaybackStates.Enable);
    } else {
        setRecordingState(com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.RecordingStates.Enable);
        setPlaybackState(com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.PlaybackStates.Disable);
    }
}
