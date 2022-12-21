public static boolean checkSugarInStock(Shop shop) {
    return (shop.recipe.sugar) < (shop.inventory.getSugar());
}
