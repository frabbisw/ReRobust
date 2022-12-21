public boolean dateAnswer(com.rr.rgem.gem.models.ConversationNode.AnswerNode answer, java.lang.String response) {
    getState().setState(JSONState.State.Correct);
    getState().sendChallenges(activity, (response + "You gave the date: "));
    answer.response = response;
    return true;
}
