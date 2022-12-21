public boolean settingsFileExist() {
    try {
        if (this.settingsFile.exists()) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
