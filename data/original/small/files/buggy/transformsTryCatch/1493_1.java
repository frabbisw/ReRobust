private void update(long dt) {
    try {
        m_particleSystem.tick();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
