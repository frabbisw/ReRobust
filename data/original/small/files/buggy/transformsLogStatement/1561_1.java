public <T> void transactional(me.gerenciar.sdao.factory.DAOFactory.Runnable<T> runnable) {
    System.out.println("log");
    transactional(runnable, false, null, null, null, null, null);
}
