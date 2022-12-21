@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (v == (buttonAddPatient)) {
            startActivity(new android.content.Intent(this, com.example.aa.electronicpatientscard.AddPatient.class));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
