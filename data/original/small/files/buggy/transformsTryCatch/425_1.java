public boolean dateAnswer(com.rr.rgem.gem.models.ConversationNode.AnswerNode answer, java.lang.String response) {
    getState().setState(JSONState.State.Correct);
    try {
        getState().sendChallenges(activity, ("You gave the date: " + response));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    answer.response = response;
    return true;
}
