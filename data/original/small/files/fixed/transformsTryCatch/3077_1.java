@java.lang.Override
public void onClick(android.view.View v) {
    sharedRadio.setChecked(false);
    try {
        edit.remove(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.SHARED_BATHROOM);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    edit.remove(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.PRIVATE_BATHROOM);
    edit.putBoolean(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.PRIVATE_BATHROOM, true);
    edit.apply();
}
