@java.lang.Override
public boolean perform(hudson.plugins.sauce_ondemand.AbstractBuild<?, ?> build, hudson.Launcher launcher, hudson.plugins.sauce_ondemand.BuildListener listener) throws java.io.IOException, java.lang.InterruptedException {
    try {
        java.lang.Thread.sleep(1000);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
