public void outputNames() {
    try {
        for (int x = 0; x < (this.studentNames.size()); x++) {
            java.lang.System.out.println(this.studentNames.get(x));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
