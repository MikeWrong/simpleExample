#!/usr/bin/expect
set timeout 10
#接收脚本参数并赋值给变量
set host [lindex $argv 0]
set password '***'
#使用Expect的spawn命令来启动脚本和命令的会话,这里启用一个ssh登录进程
spawn ssh $host 
#等待输出中出现"password:"字符串，当脚本得到特征字符串时，发送用户密码；如遇到让选择添加know_hosts记录时，发送yes，继续匹配特征字符串。
expect {
	"password:" { send "***\r" }
}
#切换到root用户
#expect "~" {send "su -\r"}
#expect "*assword:" {send "$password\r"}
interact