public int addAnfrage(Terminkalender.Termin termin, java.lang.String absender) {
    meldungen.add(new Terminkalender.Anfrage((" lädt sie zu einem Termin ein" + absender), termin, absender, meldungsCounter));
    (meldungsCounter)++;
    return (meldungsCounter) - 1;
}
