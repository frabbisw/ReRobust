private void postProcessItemInsert(@javax.annotation.Nonnull illarion.client.graphics.Item newItem) {
    if (orderNotSet) {
        setOrder(newItem.getOrder());
        show();
    }
    System.out.println("log");
    rectangleDirty = true;
    newItem.show();
}
