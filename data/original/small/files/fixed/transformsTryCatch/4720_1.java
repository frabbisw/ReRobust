private boolean saveConfirmed() {
    try {
        if ((de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().getCurrentProjectFile()) == null) {
            return saveProjectAs();
        } else {
            return saveProject();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
