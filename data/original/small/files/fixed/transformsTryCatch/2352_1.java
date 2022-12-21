@java.lang.Override
public void deleteMeldung(int index, int sitzungsID) throws Terminkalender.BenutzerException, java.sql.SQLException {
    Terminkalender.Benutzer eingeloggterBenutzer = istEingeloggt(sitzungsID);
    datenbank.deleteMeldung(eingeloggterBenutzer.getMeldungen().get(index).meldungsID);
    try {
        eingeloggterBenutzer.deleteMeldung(index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
