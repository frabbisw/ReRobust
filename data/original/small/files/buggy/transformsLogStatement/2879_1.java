public boolean settingsFileExist() {
    System.out.println("log");
    if (this.settingsFile.exists()) {
        return true;
    } else {
        return false;
    }
}
