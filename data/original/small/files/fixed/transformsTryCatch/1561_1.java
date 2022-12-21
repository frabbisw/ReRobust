public <T> void transactional(me.gerenciar.sdao.factory.DAOFactory.Runnable<T> runnable) {
    try {
        transactional(runnable, null, null, null, null, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
