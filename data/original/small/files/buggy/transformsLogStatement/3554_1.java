@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    getActivity().startActivityForResult(pickIntent, com.olehm.criminalintent.controller.crime.details.CrimeFragment.REQUEST_CONTACT);
}
