public void setDefaultDamage() {
    try {
        this.damage = ((int) (java.lang.Math.ceil(((level) * 0.1)))) + 1;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
