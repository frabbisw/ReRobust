@java.lang.Override
public void OnLoginResult(javapoker.client.LoginResultEvent event) {
    java.lang.System.out.println("Received LoginResult");
    try {
        java.lang.System.out.println(("Information is: " + (event.validLogin)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (event.validLogin) {
        table.playerId = event.playerId;
    }
}
