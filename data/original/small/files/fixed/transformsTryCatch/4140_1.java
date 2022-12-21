public void modifyOrderedItem(com.aooci.ordercat.vo.OrderedItemVo orderedItemVo) {
    try {
        this.orderOperationService.updateOrderedItem(this.operatedOrderVo, orderedItemVo);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
