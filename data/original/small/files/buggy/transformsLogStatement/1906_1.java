public void reloadNickConfig() {
    System.out.println("log");
    try {
        NickConfig.load(newConfig_nick);
        NickConfig.save(newConfig_nick);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
