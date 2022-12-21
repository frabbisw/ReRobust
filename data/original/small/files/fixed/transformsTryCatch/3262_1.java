@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void getNonExistingPoints() throws java.lang.Exception {
    try {
        restPointsMockMvc.perform(get("/api/points/{id}", java.lang.Long.MAX_VALUE)).andExpect(status().isNotFound());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
