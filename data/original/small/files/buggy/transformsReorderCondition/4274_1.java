public boolean atacar(business.entities.Personaje oponente, int energiaUtilizar) throws util.ApplicationException {
    if ((getEnergiaActual()) < energiaUtilizar) {
        throw new util.ApplicationException("Energía insuficiente para realizar el ataque");
    }
    usarEnergia(energiaUtilizar);
    return oponente.recibirAtaque(energia);
}
