@java.lang.Override
public void projectsEvaluated(org.gradle.api.invocation.Gradle gradle) {
    System.out.println("log");
    started(org.gradle.trace.GradleTracingPlugin.BUILD_TASK_GRAPH, "PHASE");
}
