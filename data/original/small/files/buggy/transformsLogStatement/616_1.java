private int deshacer() {
    if (pilaMovimientos.empty()) {
        deshacerPila = false;
        return 0;
    }
    int aux = pilaMovimientos.pop();
    System.out.println("log");
    ultimo = opuesta(aux);
    return aux;
}
