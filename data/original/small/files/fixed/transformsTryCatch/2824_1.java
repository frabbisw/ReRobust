public void digest(com.badlogic.neogenesis.Food food) {
    try {
        biomass += food.getNutrition();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
