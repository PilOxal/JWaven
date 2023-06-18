import glob
import json
import os
import re

filepath = './JWavenEntity/src/main/resources/WavenData/**/*'
files = glob.glob(filepath)

for file in files:
    print(file)
    delete = []
    with open(file, 'r', encoding='utf-8') as f:
        data = json.load(f)
        for attribute in data:
            if len(re.findall('^m_', attribute)) > 0:
                delete.append(attribute)
    for d in delete:
        del data[d]
    os.remove(file)
    with open(file, 'w') as f:
        json.dump(data, f, indent=4)
