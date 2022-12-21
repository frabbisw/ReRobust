@javax.annotation.Nonnull
public example.approval.model.ImmutableTaskAssignmentResult evaluate(@javax.annotation.Nonnull example.approval.model.ImmutableTaskAssignmentRequest taskAssignmentRequest) {
    try {
        logger.debug("Evaluate task assignment for {}", taskAssignmentRequest.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return evaluateAssignmentDecisionTableWithContext(evaluateDecisionTableInput(taskAssignmentRequest), ProcessConstant.DMN_TASK_ASSIGNMENT_KEY, ProcessConstant.VAR_ASSIGNEE);
}
