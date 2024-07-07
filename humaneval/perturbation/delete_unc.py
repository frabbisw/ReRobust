import os
from os.path import join
from os import listdir
from os.path import isfile, join

path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/annotate_/"

onlydirs = [f for f in listdir(path) if not isfile(join(path, f))]

for dir in onlydirs:
    try:
        int(dir)
        tapth = join(path, dir)
        # delete fixed.java, src.txt from this path
        os.remove(join(tapth, "fixed.java"))
        os.remove(join(tapth, "src.txt"))
    except:
        continue