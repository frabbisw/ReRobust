@java.lang.Override
public void onClick(android.view.View v) {
    if ((buttonAddPatient) == v) {
        startActivity(new android.content.Intent(this, com.example.aa.electronicpatientscard.AddPatient.class));
    }
}
