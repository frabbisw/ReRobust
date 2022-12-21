public boolean atacar(business.entities.Personaje oponente, int energia) throws util.ApplicationException {
    if (energia > (getEnergiaActual())) {
        throw new util.ApplicationException("Energía insuficiente para realizar el ataque");
    }
    try {
        usarEnergia(energia);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return oponente.recibirAtaque(energia);
}
