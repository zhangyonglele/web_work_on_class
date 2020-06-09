#!/usr/bin/env bash
PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~/bin
export PATH

# Color
red='\033[31m'
green='\033[32m'
yellow='\033[33m'
plain='\033[0m'

get_char() {
  SAVEDSTTY=$(stty -g)
  stty -echo
  stty cbreak
  dd if=/dev/tty bs=1 count=1 2>/dev/null
  stty -raw
  stty echo
  stty $SAVEDSTTY
}
# 一些说明
clear
echo
echo -e "${yellow}============================================================${plain}"
echo '	System Required: CentOS 7'
echo '	Description: Install JDK1.8'
echo '	Version: 1.0.0'
echo '	Author: Jonsson <yz909@outlook.com>'
echo '	Blog: https://blog.csdn.net/y1534414425'
echo -e "${yellow}============================================================${plain}"
echo
echo "Press any key to start...or Press Ctrl+C to cancel"
char=$(get_char)
# 判断是否为root用户
[[ $EUID -ne 0 ]] && echo -e "[${red}Error${plain}] This script must be run as root!" && exit 1
# 判断JDK源文件是否下载过
if [ ! -f "./jdk-11_linux-x64_bin.tar.gz" ]; then
  wget https://repo.huaweicloud.com/java/jdk/11+28/jdk-11_linux-x64_bin.tar.gz
fi
# 解压JDK到指定文件夹
mkdir -p /usr/local/java && tar -zxvf jdk-11_linux-x64_bin.tar.gz -C /usr/local/java
# 添加JDK到环境变量
chmod 700 /etc/profile
echo '#Java Env' >>/etc/profile
echo 'export JAVA_HOME=/usr/local/java/jdk-11' >>/etc/profile
echo 'export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar' >>/etc/profile
echo 'export PATH=$PATH:$JAVA_HOME/bin' >>/etc/profile
source /etc/profile
# 判断是否为32位系统
bit=$(getconf LONG_BIT)
if [ ${bit} -eq 32 ]; then
  sudo yum install glibc.i686
fi
# 检测Java是否安装
java -version
if [ $? -eq 0 ]; then
  echo -e "${yellow}============================================================${plain}"
  echo -e "${green}JDK11安装成功${plain}"
  echo -e "${yellow}============================================================${plain}"
else
  echo -e "${yellow}============================================================${plain}"
  echo -e "${red}JDK11安装失败,请检查你的配置${plain}"
  echo -e "${yellow}============================================================${plain}"
fi