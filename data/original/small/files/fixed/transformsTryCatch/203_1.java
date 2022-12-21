public java.util.List<ru.javawebinar.topjava.to.MealWithExceed> getByDate(int userId, java.time.LocalDateTime start, java.time.LocalDateTime end) {
    try {
        ru.javawebinar.topjava.web.meal.MealRestController.LOG.info("getAllByDateTime");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ru.javawebinar.topjava.util.MealsUtil.getWithExceeded(service.getByDate(userId, start, end), MealsUtil.DEFAULT_CALORIES_PER_DAY);
}
