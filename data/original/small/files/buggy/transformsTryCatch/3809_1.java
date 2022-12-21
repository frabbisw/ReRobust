@java.lang.Override
public void onCreate(@android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mobidev.com.notesfeed.User accessUser = ((mobidev.com.notesfeed.User) (savedInstanceState.getSerializable("currentUser")));
    java.lang.String userId = accessUser.getUserId();
}
