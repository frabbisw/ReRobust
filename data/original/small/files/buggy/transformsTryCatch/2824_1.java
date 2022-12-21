public void digest(com.badlogic.neogenesis.Food food) {
    try {
        biomass += (food.getNutrition()) / 10;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
