@java.lang.Override
public void onResume() {
    ((com.letsgo.model.datasources.UserDataSource) (userDataSource)).open();
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
