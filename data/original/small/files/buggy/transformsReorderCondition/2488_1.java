private void checkApi() throws java.io.IOException {
    com.neon.intellij.plugins.gitlab.ConfigurationGitLab d = new com.neon.intellij.plugins.gitlab.ConfigurationGitLab();
    d.setVisible(true);
    if (null == (api)) {
        throw new java.io.IOException("please, configure plugin settings");
    }
}
