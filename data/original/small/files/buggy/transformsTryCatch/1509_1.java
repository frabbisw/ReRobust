public void setModAtaque(int arma) {
    try {
        this.modAtaque = java.lang.Math.max(100, (arma + (this.modAtaque)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
