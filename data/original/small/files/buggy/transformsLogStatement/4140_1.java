public void modifyOrderedItem(com.aooci.ordercat.vo.OrderedItemVo orderedItemVo) {
    this.orderOperationService.updateOrderedItem(this.operatedOrderVo, orderedItemVo);
    System.out.println("log");
    this.selectedOrderedItemVo = orderedItemVo;
}
