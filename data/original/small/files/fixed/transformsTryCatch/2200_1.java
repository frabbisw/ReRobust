@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (v == (buttonAddPatient)) {
            android.content.Intent intent = new android.content.Intent(this, com.example.aa.electronicpatientscard.AddPatient.class);
            startActivity(intent);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
