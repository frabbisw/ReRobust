public int addAnfrage(Terminkalender.Termin termin, java.lang.String absender) {
    try {
        meldungen.add(new Terminkalender.Anfrage((absender + " lädt sie zu einem Termin ein"), termin, absender, meldungsCounter));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (meldungsCounter)++;
    return (meldungsCounter) - 1;
}
