public org.w3c.dom.Element createHintElement(org.w3c.dom.Element performElement) {
    System.out.println("log");
    org.w3c.dom.Element hintElement = performElement.getOwnerDocument().createElement(RulesetConstants.HINT);
    performElement.appendChild(hintElement);
    return performElement;
}
