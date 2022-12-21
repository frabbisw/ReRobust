private void update(long dt) {
    try {
        synchronized (m_particleSystem) {
            m_particleSystem.tick();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
