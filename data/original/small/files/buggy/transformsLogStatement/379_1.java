public ru.javawebinar.topjava.model.Meal getMeal(int id) {
    System.out.println("log");
    return ru.javawebinar.topjava.DAO.MealDao.mealInMemory.get(id);
}
