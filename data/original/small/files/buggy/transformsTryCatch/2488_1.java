private void checkApi() throws java.io.IOException {
    com.neon.intellij.plugins.gitlab.ConfigurationGitLab d = new com.neon.intellij.plugins.gitlab.ConfigurationGitLab();
    try {
        d.setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((api) == null) {
        throw new java.io.IOException("please, configure plugin settings");
    }
}
