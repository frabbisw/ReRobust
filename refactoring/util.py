import javalang
import random

reserved_kws = ["abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while"]

reserved_cls = ["ArrayDeque", "ArrayList", "Arrays", "BitSet", "Calendar", "Collections", "Currency",
                "Date", "Dictionary", "EnumMap", "EnumSet", "Formatter", "GregorianCalendar", "HashMap",
                "HashSet", "Hashtable", "IdentityHashMap", "LinkedHashMap", "LinkedHashSet",
                "LinkedList", "ListResourceBundle", "Locale", "Observable",
                "PriorityQueue", "Properties", "PropertyPermission",
                "PropertyResourceBundle", "Random", "ResourceBundle", "ResourceBundle.Control",
                "Scanner", "ServiceLoader", "SimpleTimeZone", "Stack",
                "StringTokenizer", "Timer", "TimerTask", "TimeZone",
                "TreeMap", "TreeSet", "UUID", "Vector", "WeakHashMap"
                ]

variable_type_list = ("int", "float", "double", "long", "byte", "short", "boolean", "char", "String")
variable_type_list_more = (
    "int", "float", "double", "long", "byte", "short", "boolean", "char", "String", "Integer", "Float", "Double",
    "Long",
    "Byte", "Short", "Boolean", "Character")

random_variable_name_length = 20
random_method_name_length = 20
random_parameter_name_length = 20


def format_code(c):
    c = c.replace(' . ', '.')
    # c = c.replace(' ( ', '(')
    # c = c.replace(' ) ', ')')
    # c = c.replace(' ;', ';')
    # c = c.replace('[ ]', '[]')
    return c


def verify_method_syntax(data):
    try:
        tokens = javalang.tokenizer.tokenize(data)
        parser = javalang.parser.Parser(tokens)
        tree = parser.parse_member_declaration()
        print("syantax check success")
    except:
        print("syantax check failed")

def get_synonym_var_name():

    res_string = ''
    for x in range(random_variable_name_length):
        res_string += random.choice('abcdefghijklmnopqrstuvwxyz')
    return res_string


def get_tree(data):
    tokens = javalang.tokenizer.tokenize(data)
    parser = javalang.parser.Parser(tokens)
    tree = parser.parse_member_declaration()
    return tree
