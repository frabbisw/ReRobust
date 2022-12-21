public io.github.daveho.beatbox.Builder prepend(net.beadsproject.beads.core.UGen ugen) {
    this.ugen.addInput(ugen);
    System.out.println("log");
    return new io.github.daveho.beatbox.Builder(ac, this.ugen, this.map);
}
