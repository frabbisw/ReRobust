@java.lang.Override
public void onClick(android.view.View view) {
    try {
        getActivity().startActivityForResult(pickIntent, com.olehm.criminalintent.controller.crime.details.CrimeFragment.REQUEST_CONTACT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
