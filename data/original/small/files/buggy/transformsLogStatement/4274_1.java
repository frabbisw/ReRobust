public boolean atacar(business.entities.Personaje oponente, int energiaUtilizar) throws util.ApplicationException {
    if (energiaUtilizar > (getEnergiaActual())) {
        throw new util.ApplicationException("Energía insuficiente para realizar el ataque");
    }
    System.out.println("log");
    usarEnergia(energiaUtilizar);
    return oponente.recibirAtaque(energia);
}
