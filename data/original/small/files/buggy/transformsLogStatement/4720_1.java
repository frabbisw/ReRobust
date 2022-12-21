private void saveConfirmed() {
    System.out.println("log");
    if ((de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().getCurrentProjectFile()) == null) {
        saveProjectAs();
    } else {
        saveProject();
    }
}
