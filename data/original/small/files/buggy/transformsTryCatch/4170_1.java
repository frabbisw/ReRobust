@java.lang.Override
public void OnLoginResult(javapoker.client.LoginResultEvent event) {
    java.lang.System.out.println("Received LoginResult");
    java.lang.System.out.println(("Information is: " + (event.validLogin)));
    if (event.validLogin) {
        table.playerId = event.playerId;
    }
    try {
        super.OnLoginResult(event);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
