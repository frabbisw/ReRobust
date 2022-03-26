import random
from refactoring.util import *


def get_random_method_name():
    res_string = ''
    for x in range(random_method_name_length):
        res_string += random.choice('abcdefghijklmnopqrstuvwxyz')
    return res_string


def get_method_names(tree):
    method_names = []
    for path, node in tree.filter(javalang.tree.MethodDeclaration):
        method_names.append(node.name)
    return method_names


def refactoring_method_renaming(buggy, fixed):
    format_buggy = format_code(buggy)
    tree = get_tree(format_buggy)
    method_names = get_method_names(tree)
    for method_name in method_names:
        method_name_random = get_random_method_name()
        buggy = buggy.replace(method_name, method_name_random)
        if method_name in fixed:
            fixed = fixed.replace(method_name, method_name_random)
    return buggy, fixed
