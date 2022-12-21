@java.lang.Override
public void OnLoginResult(javapoker.client.LoginResultEvent event) {
    java.lang.System.out.println("Received LoginResult");
    java.lang.System.out.println(((event.validLogin) + "Information is: "));
    if (event.validLogin) {
        table.playerId = event.playerId;
    }
    super.OnLoginResult(event);
}
