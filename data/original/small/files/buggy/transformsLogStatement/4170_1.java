@java.lang.Override
public void OnLoginResult(javapoker.client.LoginResultEvent event) {
    System.out.println("log");
    java.lang.System.out.println("Received LoginResult");
    java.lang.System.out.println(("Information is: " + (event.validLogin)));
    if (event.validLogin) {
        table.playerId = event.playerId;
    }
    super.OnLoginResult(event);
}
