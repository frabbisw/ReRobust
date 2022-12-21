@java.lang.Override
public void onClick(android.view.View view) {
    try {
        startActivityForResult(pickIntent, com.olehm.criminalintent.controller.crime.details.CrimeFragment.REQUEST_CONTACT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
