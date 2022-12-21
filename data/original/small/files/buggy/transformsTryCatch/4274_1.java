public boolean atacar(business.entities.Personaje oponente, int energiaUtilizar) throws util.ApplicationException {
    if (energiaUtilizar > (getEnergiaActual())) {
        throw new util.ApplicationException("Energía insuficiente para realizar el ataque");
    }
    try {
        usarEnergia(energiaUtilizar);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return oponente.recibirAtaque(energia);
}
