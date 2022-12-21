@java.lang.Override
public void applyOnColumn(org.talend.dataprep.api.dataset.DataSetRow row, org.talend.dataprep.transformation.api.action.context.ActionContext context) {
    final java.lang.String columnId = context.getColumnId();
    try {
        org.talend.dataprep.transformation.api.action.metadata.column.DeleteColumn.LOGGER.debug("DeleteColumn for columnId {}", columnId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    context.getRowMetadata().deleteColumnById(columnId);
}
