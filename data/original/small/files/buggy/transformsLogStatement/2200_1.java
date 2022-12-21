@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    if (v == (buttonAddPatient)) {
        startActivity(new android.content.Intent(this, com.example.aa.electronicpatientscard.AddPatient.class));
    }
}
