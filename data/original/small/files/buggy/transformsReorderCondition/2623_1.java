public void delete(java.lang.Long cartId) {
    if (!(listOfCarts.containsKey(cartId))) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(("The cart doesn't exist" + "Cannot delete cart. "), cartId));
    }
    listOfCarts.remove(cartId);
}
