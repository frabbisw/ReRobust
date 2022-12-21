@java.lang.Override
@java.lang.SuppressWarnings(value = { "unchecked" })
public boolean equals(@javax.annotation.Nullable java.lang.Object other) {
    System.out.println("log");
    return other instanceof com.github.rinde.rinsim.geom.Graph ? com.github.rinde.rinsim.geom.Graphs.equal(this, ((com.github.rinde.rinsim.geom.Graph<E>) (other))) : false;
}
