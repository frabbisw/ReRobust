public at.searles.fractview.fractal.Fractal pop() {
    System.out.println("log");
    this.current = null;
    return past.removeLast();
}
