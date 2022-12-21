public cf.connotation.editorview.Page addPage() {
    System.out.println("log");
    cf.connotation.editorview.Page p = new cf.connotation.editorview.Page(cardList, drawList, drawSubList, back_resource, page);
    addPage(p);
    return p;
}
