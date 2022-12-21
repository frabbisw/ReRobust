de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung.Geldbetrag addiere(de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung.Geldbetrag additionsBetrag) {
    assert additionsBetrag != null : "Vorbedingung verletzt: additionsBetrag != null";
    try {
        _euroBetrag += additionsBetrag.getEuroBetrag();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    _centBetrag += additionsBetrag.getCentBetrag();
    haendleCentUeberschuss();
    return this;
}
