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


def refactoring_method_renaming(buggy, fixed, substitutes_dict):
    format_buggy = format_code(buggy)
    tree = get_tree(format_buggy)
    method_names = get_method_names(tree)
    for method_name in method_names:

        candidate_method_names = substitutes_dict[method_name]
        candidate_method_name = candidate_method_names[0]

        # method_name_random = get_random_method_name()
        buggy = buggy.replace(method_name, candidate_method_name)
        if method_name in fixed:
            fixed = fixed.replace(method_name, candidate_method_name)
    return buggy, fixed
