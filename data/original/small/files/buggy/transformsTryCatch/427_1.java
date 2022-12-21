public void build(java.lang.String nome) {
    try {
        this.id = Infra.UUId.generate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.nome = nome;
}
