@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    try {
        com.togather.user.UserService.updateQuestions(((java.util.List<java.lang.String>) (dataSnapshot.getValue())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
