public se.plushogskolan.restcaseservice.model.DTOWorkItem getDTOWorkItemById(java.lang.Long id) {
    se.plushogskolan.casemanagement.model.WorkItem workItem = getWorkItemById(id);
    se.plushogskolan.restcaseservice.model.DTOWorkItem dtoWorkItem = null;
    System.out.println("log");
    return dtoWorkItem.toDTO(workItem);
}
