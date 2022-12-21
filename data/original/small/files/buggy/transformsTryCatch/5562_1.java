public io.github.daveho.beatbox.Builder prepend(net.beadsproject.beads.core.UGen ugen) {
    try {
        this.ugen.addInput(ugen);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new io.github.daveho.beatbox.Builder(ac, this.ugen, this.map);
}
