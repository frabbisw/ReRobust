import random

from refactoring.util import *


def get_random_var_name():
    res_string = ''
    for x in range(random_variable_name_length):
        res_string += random.choice('abcdefghijklmnopqrstuvwxyz')
    return res_string


def get_local_vars(tree):
    var_list = []
    for path, node in tree.filter(javalang.tree.LocalVariableDeclaration):
        var_list.append([node.declarators[0].name, node.type.name])
        # print(node.declarators[0].name,"\t",node.type.name)
    return var_list


def replace_variable_name(variable_name, variable_random_name, variable_surround_code):
    temp_list = variable_surround_code.split(variable_name)
    if len(temp_list) == 1:
        return variable_surround_code
    new_buggy = []
    for i in range(len(temp_list) - 1):
        new_buggy.append(temp_list[i])
        if len(temp_list[i]) == 0:
            if len(temp_list[i + 1]) == 0 or (
                    len(temp_list[i + 1]) != 0 and check_variable_surround(temp_list[i + 1][0])):
                new_buggy.append(variable_random_name)
            else:
                new_buggy.append(variable_name)
            continue
        if len(temp_list[i + 1]) == 0:
            if len(temp_list[i]) != 0 and check_variable_surround(temp_list[i][0]):
                new_buggy.append(variable_random_name)
            else:
                new_buggy.append(variable_name)
            continue

        left = temp_list[i][-1]
        right = temp_list[i + 1][0]
        if check_variable_surround(left) and check_variable_surround(right):
            new_buggy.append(variable_random_name)
        else:
            new_buggy.append(variable_name)
    new_buggy.append(temp_list[-1])
    # print(''.join(new_buggy))
    return ''.join(new_buggy)


def check_variable_surround(c):
    if c == ' ':
        return True
    elif c.isdigit() or c.isalpha() or c == '_' or c == '$':
        return False
    else:
        return True


# def refactoring_local_variable_renaming(buggy, context, fixed):
#     format_context = format_code(context)
#
#     # TODO add check: how many code cannot been parse to AST
#     verify_method_syntax(format_context)
#
#     tree = get_tree(format_context)
#     variable_list = get_local_vars(tree)
#
#     variable_list = [var for var, var_type in variable_list if var_type in variable_type_list_more]
#
#     # TODO add check: how many code didn't have local variables
#     if len(variable_list) > 0:
#         print("yes have local variables")
#     else:
#         print("don't have local variables")
#         return buggy, fixed
#
#     # TODO check how many duplicate identifier names in different scopes
#     if len(variable_list) > 1:
#         if len(variable_list) != len(list(set(variable_list))):
#             print("have duplicate identifier names in different scopes")
#
#     original = buggy
#     for variable in variable_list:
#         # print(variable not in buggy)
#         if variable in reserved_kws or variable not in buggy:
#             continue
#
#         var_random = get_random_var_name()
#         # print(var)
#
#         buggy = replace_variable_name(variable, var_random, buggy)
#
#         # TODO check how many code be refactored
#
#         assert len(buggy) != 0
#         if variable in fixed:
#             fixed = replace_variable_name(variable, var_random, fixed)
#             assert len(fixed) != 0
#
#     if original != buggy:
#         print("success factoring")
#     else:
#         print("not refactoring")
#
#     return buggy, fixed

def refactoring_local_variable_renaming(buggy, fixed, substitutes_dict):

    # format_context = format_code(context)
    format_buggy = format_code(buggy)

    # TODO add check: how many code cannot been parse to AST
    verify_method_syntax(format_buggy)

    tree = get_tree(format_buggy)
    variable_list = get_local_vars(tree)

    variable_list = [var for var, var_type in variable_list if var_type in variable_type_list_more]

    # TODO add check: how many code didn't have local variables
    if len(variable_list) > 0:
        print("yes have local variables")
    else:
        print("don't have local variables")
        return buggy, fixed

    # TODO check how many duplicate identifier names in different scopes
    if len(variable_list) > 1:
        if len(variable_list) != len(list(set(variable_list))):
            print("have duplicate identifier names in different scopes")

    original = buggy
    for variable in variable_list:
        # print(variable not in buggy)
        if variable in reserved_kws or variable not in buggy:
            continue

        candidate_var_names = substitutes_dict[variable]
        candidate_var_name = candidate_var_names[0]
        # var_random = get_random_var_name()
        # print(var)

        buggy = replace_variable_name(variable, candidate_var_name, buggy)

        # TODO check how many code be refactored

        assert len(buggy) != 0
        if variable in fixed:
            fixed = replace_variable_name(variable, candidate_var_name, fixed)
            assert len(fixed) != 0

    if original != buggy:
        print("success factoring")
    else:
        print("not refactoring")

    return buggy, fixed

