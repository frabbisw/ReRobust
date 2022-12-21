@java.lang.Override
public void run(java.lang.Boolean isUserSaved) throws java.lang.Exception {
    try {
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.offsidegame.offside.events.IsAnswerAcceptedEvent(isUserSaved));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
