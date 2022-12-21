@java.lang.Override
public java.util.List<ru.javawebinar.topjava.model.Meal> getAll(int userId) {
    System.out.println("log");
    return repository.getAll();
}
