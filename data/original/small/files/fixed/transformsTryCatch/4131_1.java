@java.lang.Override
public void setVariables(java.lang.String executionId, java.util.Map<java.lang.String, ? extends java.lang.Object> variables) {
    try {
        setVariables(executionId, variables, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
