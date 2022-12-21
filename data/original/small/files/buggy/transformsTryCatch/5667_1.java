@java.lang.Override
public void validate(com.ofs.server.form.update.ChangeSet changeSet, com.ofs.model.Inventory inventory, com.ofs.server.model.OFSErrors errors) throws java.lang.Exception {
    try {
        validate(inventory, errors);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
