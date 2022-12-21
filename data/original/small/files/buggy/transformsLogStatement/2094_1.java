public static void main(final java.lang.String[] args) {
    System.out.println("log");
    com.todocycle.todocycle.api.TodocycleApi todocycleApi = new com.todocycle.todocycle.api.TodocycleApi(new com.todocycle.todocycle.api.todostore.TodoStoreRedis());
}
