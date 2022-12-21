@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void deleteTasksByIds(java.util.List<java.lang.Long> tasksIds) {
    try {
        em.createQuery("DELETE FROM Task t WHERE t.id IN (:tasksIds)").setParameter("tasksIds", tasksIds).executeUpdate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    em.createQuery("DELETE FROM Task t WHERE t.id IN (:tasksIds)").setParameter("tasksIds", tasksIds).executeUpdate();
}
