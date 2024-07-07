import os
import subprocess
import json

java_path = "/humaneval/data/java_codes"
# refactoring_types = ["boolean_exchange", "insert_log_statement", "insert_try_catch", "loop_exchange", "reorder_condition"] #, eliminating "convert_switch_to_if"
refactoring_types = ["original"]
styles = ["style1", "style2"]
junit_path = "/home/frabbi/junit-platform-console-standalone-1.10.2.jar"

def process_msg(msg):
    msg = msg[msg.find("Test run finished after"):]
    lines = msg.split("\n")
    for line in lines:
        if "tests successful" in line:
            passes = line.replace("[", "").replace("]", "").replace("tests successful", "").strip()
        elif "tests failed" in line:
            fails = line.replace("[", "").replace("]", "").replace("tests failed", "").strip()
    return int(passes), int(fails)

test_result = {}

for t in refactoring_types:
    for w in styles:
        for filename in os.listdir(f"{java_path}/{t}/{w}"):
            if filename.endswith("_Test.java"):
                print(filename)
                parent_dir = f"{java_path}/{t}/{w}"
                test_classname = filename[:-5]
                classname = filename[:-10]

                os.chdir(parent_dir)
                javacclass = subprocess.run(['javac', f'{classname}.java'], stdout=subprocess.PIPE)
                print(javacclass.stdout)
                javactest = subprocess.run(['javac', '-cp', '.:/home/frabbi/junit-platform-console-standalone-1.10.2.jar', f'{test_classname}.java'], stdout=subprocess.PIPE)
                print(javactest.stdout)
                javarun = subprocess.run(['java', '-jar', '/home/frabbi/junit-platform-console-standalone-1.10.2.jar', f'execute', '--class-path', '.', '--scan-class-path'], stdout=subprocess.PIPE)
                msg = javarun.stdout.decode('utf-8')
                passes, fails = process_msg(msg)
                print(passes, fails)

                test_result[os.path.join(parent_dir, f"{classname}.java")] = {"passes": passes, "fails": fails}


                # exit()
                # print(test_classname, classname)

with open("/humaneval/result/test_result_clm_style.json", "w") as f:
    json.dump(test_result, f, indent=2)

 # 2074  javac COUNT_NUMS.java
 # 2075  javac -cp .:/home/frabbi/junit-platform-console-standalone-1.10.2.jar COUNT_NUMS_Test.java
 # 2076  java -jar /home/frabbi/junit-platform-console-standalone-1.10.2.jar execute --class-path . --scan-class-path
 # 2077  history
