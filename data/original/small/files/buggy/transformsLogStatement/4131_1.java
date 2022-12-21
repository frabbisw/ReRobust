@java.lang.Override
public void setVariables(java.lang.String executionId, java.util.Map<java.lang.String, ? extends java.lang.Object> variables) {
    System.out.println("log");
    commandExecutor.execute(new org.camunda.bpm.engine.impl.cmd.SetExecutionVariablesCmd(executionId, variables, false));
}
