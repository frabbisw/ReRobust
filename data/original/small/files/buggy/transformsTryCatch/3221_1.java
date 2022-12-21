@java.lang.Override
public java.lang.Object visitar(br.univali.portugol.nucleo.asa.NoDeclaracaoVariavel noDeclaracaoVariavel) throws br.univali.portugol.nucleo.asa.ExcecaoVisitaASA {
    try {
        if (contemNo(noDeclaracaoVariavel, true)) {
            nosQueSeraoMantidos.add(noDeclaracaoVariavel);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
