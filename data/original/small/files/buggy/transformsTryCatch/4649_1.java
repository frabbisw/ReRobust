@java.lang.Override
public void removerPorId(java.lang.Object id) {
    javax.persistence.Query query = getEntityManager().createQuery("delete Transacao where id = :id");
    try {
        query.executeUpdate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    query.setParameter("id", id);
    super.removerPorId(id);
}
