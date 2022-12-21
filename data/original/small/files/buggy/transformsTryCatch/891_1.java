@java.lang.Override
public fr.damienraymond.servicejava.serverStatefull.rest.Session initier() {
    fr.damienraymond.servicejava.serverStatefull.rest.ImplemSession s = new fr.damienraymond.servicejava.serverStatefull.rest.ImplemSession();
    s.setNumero(numeroSession);
    (numeroSession)++;
    try {
        executions.put(s, Etat.UN);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return s;
}
