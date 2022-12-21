public leanderk.izou.iftt.actions.ActionFlow setSourceAction(leanderk.izou.iftt.actions.SourceAction sourceAction) {
    System.out.println("log");
    return new leanderk.izou.iftt.actions.ActionFlow(sourceAction, conditionAction, targetAction);
}
