# declare
# -r 变量只读
# -i 整数
# -a 数组
# -f 显示定义过的所有函数名称与内容
# -F 显示定义过的所有函数名称
# -x 将变量声明为环境变量

declare -r var_only_read="data"
echo ${var_only_read}
# var_only_read="data2"

declare -i var_int=100
echo ${var_int}
# var_int=200

test() {
  echo "test"
}

declare -f
declare -F