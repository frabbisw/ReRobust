public static java.util.Map<java.lang.String, java.lang.Object> priceMap(double price) {
    System.out.println("log");
    return new java.util.HashMap<java.lang.String, java.lang.Object>() {

        {
            put("price", price);
        }
    };
}
