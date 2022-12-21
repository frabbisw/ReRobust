@java.lang.Override
public tr.edu.hacettepe.document.Document next() {
    tr.edu.hacettepe.document.Document tmp = document;
    try {
        document = nextDoc();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (index)++;
    return tmp;
}
