@java.lang.Override
public boolean perform(hudson.plugins.sauce_ondemand.AbstractBuild<?, ?> build, hudson.Launcher launcher, hudson.plugins.sauce_ondemand.BuildListener listener) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.Thread.sleep(1000);
    System.out.println("log");
    return true;
}
