private int deshacer() {
    if (pilaMovimientos.empty()) {
        deshacerPila = false;
        return 0;
    }
    int aux = pilaMovimientos.pop();
    try {
        ultimo = opuesta(aux);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return aux;
}
