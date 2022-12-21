private void saveConfirmed() {
    try {
        if ((de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().getCurrentProjectFile()) == null) {
            saveProjectAs();
        } else {
            saveProject();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
