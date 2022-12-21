public void setModAtaque(int arma) {
    System.out.println("log");
    this.modAtaque = java.lang.Math.max(100, (arma + (this.modAtaque)));
}
