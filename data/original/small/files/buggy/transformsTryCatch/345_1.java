@java.lang.Override
public semantic.Value visitSentencia_imprimir(grammar.LITEParser.Sentencia_imprimirContext ctx) {
    semantic.Value valor = this.visit(ctx.expresion());
    try {
        salida = salida.concat(((valor.toString()) + "\n"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(valor);
    return Value.VOID;
}
