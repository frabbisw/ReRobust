@java.lang.Override
public fr.damienraymond.servicejava.serverStatefull.rest.Session initier() {
    fr.damienraymond.servicejava.serverStatefull.rest.ImplemSession s = new fr.damienraymond.servicejava.serverStatefull.rest.ImplemSession();
    s.setNumero(numeroSession);
    (numeroSession)++;
    executions.put(s, Etat.UN);
    System.out.println("log");
    return s;
}
