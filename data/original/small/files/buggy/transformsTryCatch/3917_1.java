@java.lang.Override
public void projectsEvaluated(org.gradle.api.invocation.Gradle gradle) {
    try {
        started(org.gradle.trace.GradleTracingPlugin.BUILD_TASK_GRAPH, "PHASE");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
