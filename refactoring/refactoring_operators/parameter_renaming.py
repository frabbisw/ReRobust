﻿import random
from refactoring.util import *


def get_random_parameter_name():
    res_string = ''
    for x in range(random_parameter_name_length):
        res_string += random.choice('abcdefghijklmnopqrstuvwxyz')
    return res_string


def get_parameter_names(tree):
    parameter_names = []
    for path, node in tree.filter(javalang.tree.FormalParameter):
        parameter_names.append(node.name)
    return parameter_names


def refactoring_parameter_renaming(buggy, fixed):
    format_buggy = format_code(buggy)
    tree = get_tree(format_buggy)
    parameter_names = get_parameter_names(tree)
    for parameter_name in parameter_names:
        parameter_name_random = get_random_parameter_name()
        buggy = buggy.replace(parameter_name, parameter_name_random)
        if parameter_name in fixed:
            fixed = fixed.replace(parameter_name, parameter_name_random)
    return buggy, fixed
