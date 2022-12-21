@java.lang.Override
public void removerPorId(java.lang.Object id) {
    javax.persistence.Query query = getEntityManager().createQuery("delete Transacao where id = :id");
    query.executeUpdate();
    query.setParameter("id", id);
    System.out.println("log");
    super.removerPorId(id);
}
