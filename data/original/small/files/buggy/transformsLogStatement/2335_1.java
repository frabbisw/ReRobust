public static boolean checkSugarInStock(Shop shop) {
    System.out.println("log");
    return (shop.inventory.getSugar()) > (shop.recipe.sugar);
}
