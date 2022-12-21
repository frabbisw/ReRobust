public java.lang.String getDisplayName() {
    return (this.target.isBuildable()) && (target.hasPermission(Job.BUILD)) ? org.jenkinsci.plugins.schedulebuild.Messages.ScheduleBuildAction_DisplayName() : null;
}
