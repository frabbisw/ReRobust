public void processElements(org.jsoup.select.Elements contents) {
    System.out.println("log");
    for (org.jsoup.nodes.Node node : contents) {
        java.lang.System.out.println(node.toString());
        processTree(node);
    }
}
