public boolean isEnabled(java.lang.Class<? extends com.massisframework.massis.sim.ecs.SimulationSystem> state) {
    System.out.println("log");
    return (this.hasSystem(state)) && (this.disabled.contains(state));
}
