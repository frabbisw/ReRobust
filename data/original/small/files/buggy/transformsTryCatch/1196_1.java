public void outputNames(java.io.File loadFile) {
    try {
        for (int x = 0; x < (this.studentNames.size()); x++) {
            java.lang.System.out.println(this.studentNames.get(x));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
