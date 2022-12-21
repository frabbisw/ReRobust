@java.lang.Override
public void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ((com.letsgo.model.datasources.UserDataSource) (userDataSource)).open();
}
