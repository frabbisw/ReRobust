@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.letslunch.agileteam8.letslunch.homePage.eatingStatus userStatus = com.letslunch.agileteam8.letslunch.homePage.eatingStatus.BRING_LUNCH;
    try {
        dialog.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    userResponseToEating(userStatus.toString());
}
