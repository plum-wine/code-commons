import json

data = {
    'name': 'ACME',
    'shares': 100,
    'price': 542.23
}
print("name", data['name'])
# 载入内存
json_str = json.dumps(data)
print(json_str)
jsonFilePath = '/tmp/data.json'
# 写入文件
with open(jsonFilePath, 'w') as file:
    json.dump(data, file)
# 读取文件
json_data = ''
with open(jsonFilePath) as file:
    json_data = json.load(file)
print("name", json_data['name'])
