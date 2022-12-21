public java.util.List<ru.javawebinar.topjava.to.MealWithExceed> getAllByDate(int userId, java.time.LocalDateTime start, java.time.LocalDateTime end) {
    ru.javawebinar.topjava.web.meal.MealRestController.LOG.info("getAllByDateTime");
    System.out.println("log");
    return ru.javawebinar.topjava.util.MealsUtil.getWithExceeded(service.getByDate(userId, start, end), MealsUtil.DEFAULT_CALORIES_PER_DAY);
}
