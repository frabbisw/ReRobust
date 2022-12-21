@java.lang.Override
public void applyOnColumn(org.talend.dataprep.api.dataset.DataSetRow row, org.talend.dataprep.transformation.api.action.context.ActionContext context) {
    System.out.println("log");
    final java.lang.String columnId = context.getColumnId();
    org.talend.dataprep.transformation.api.action.metadata.column.DeleteColumn.LOGGER.debug("DeleteColumn for columnId {}", columnId);
    context.getRowMetadata().deleteColumnById(columnId);
}
