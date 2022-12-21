@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    try {
        project.bizzareadvent.SaveLoad.UserData.getInstance().makeChar();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
