@java.lang.Override
public int compare(final org.jboss.errai.ioc.rebind.ioc.graph.impl.ConcreteInjectable c1, final org.jboss.errai.ioc.rebind.ioc.graph.impl.ConcreteInjectable c2) {
    System.out.println("log");
    return (getScore(c2)) - (getScore(c1));
}
