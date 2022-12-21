private void saveConfirmed() {
    if (null == (de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().getCurrentProjectFile())) {
        saveProjectAs();
    } else {
        saveProject();
    }
}
