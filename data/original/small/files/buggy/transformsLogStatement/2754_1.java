@java.lang.Override
public void changeRound() {
    System.out.println("log");
    try {
        rmiClientInterface.isYourTurn();
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
        user.setConnected(false);
        user.getGameController().onFinishRound(user);
    }
}
