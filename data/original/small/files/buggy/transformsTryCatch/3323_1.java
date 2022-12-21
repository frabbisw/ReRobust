@java.lang.Override
protected de.uni_koblenz.jgralab.codegenerator.CodeBlock createHeader() {
    de.uni_koblenz.jgralab.codegenerator.CodeSnippet s = new de.uni_koblenz.jgralab.codegenerator.CodeSnippet();
    try {
        s.add((("public class " + (classname)) + " extends AbstractExecutableQuery implements ExecutableQuery {"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return s;
}
