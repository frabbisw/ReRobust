de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung.Geldbetrag addiere(de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung.Geldbetrag additionsBetrag) {
    assert null != additionsBetrag : "Vorbedingung verletzt: additionsBetrag != null";
    _euroBetrag += additionsBetrag.getEuroBetrag();
    _centBetrag += additionsBetrag.getCentBetrag();
    haendleCentUeberschuss();
    return this;
}
