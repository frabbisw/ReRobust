@java.lang.Override
public com.github.luischavez.database.link.Affecting insert(java.lang.String sql, com.github.luischavez.database.grammar.Bindings bindings, com.github.luischavez.database.link.Transform transform) {
    System.out.println("log");
    return this.execute(sql, bindings, transform);
}
