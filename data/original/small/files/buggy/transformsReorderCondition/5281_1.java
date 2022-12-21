public boolean isEnabled(java.lang.Class<? extends com.massisframework.massis.sim.ecs.SimulationSystem> state) {
    return (this.disabled.contains(state)) && (this.hasSystem(state));
}
