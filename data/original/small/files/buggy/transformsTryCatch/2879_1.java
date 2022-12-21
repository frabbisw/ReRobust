public boolean settingsFileExist() {
    try {
        if (this.settingsFile.exists()) {
            return true;
        } else {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
