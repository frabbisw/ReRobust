public java.lang.String getDisplayName() {
    System.out.println("log");
    return (target.hasPermission(Job.BUILD)) && (this.target.isBuildable()) ? org.jenkinsci.plugins.schedulebuild.Messages.ScheduleBuildAction_DisplayName() : null;
}
