@java.lang.Override
public void onClick(android.view.View v) {
    sharedRadio.setChecked(false);
    edit.remove(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.SHARED_BATHROOM);
    edit.remove(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.PRIVATE_BATHROOM);
    System.out.println("log");
    edit.putBoolean(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.SHARED_BATHROOM, true);
    edit.apply();
}
