@javax.annotation.Nullable
@java.lang.Override
public java.lang.Void apply(@javax.annotation.Nullable net.bither.bitherj.db.imp.base.ICursor c) {
    try {
        net.bither.bitherj.db.imp.AbstractTxProvider.applyCursor(c, txItem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    txExists[0] = true;
    return null;
}
