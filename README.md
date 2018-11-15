[![release](https://img.shields.io/badge/release-1.2.2-green.svg)](https://play.google.com/store/apps/details?id=com.toyscollect.prizeclaw.clawin)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

# 项目名

![](https://is5-ssl.mzstatic.com/image/thumb/Purple128/v4/bb/a1/c8/bba1c89a-9572-ba8e-ab3d-7da8521d69c4/AppIcon-1x_U007emarketing-85-220-0-4.png/1200x630wa.png)

## 简介

项目 Android端，包名：xxx
Google Play链接：[https://play.google.com/store/apps/details?id=com.toyscollect.prizeclaw.clawin](https://play.google.com/store/apps/details?id=com.toyscollect.prizeclaw.clawin)
下载链接:

![](https://qr.api.cli.im/qr?data=https%253A%252F%252Fplay.google.com%252Fstore%252Fapps%252Fdetails%253Fid%253Dcom.toyscollect.prizeclaw.clawin&level=H&transparent=false&bgcolor=%23ffffff&forecolor=%23000000&blockpixel=12&marginblock=1&logourl=http%3A%2F%2Foss-cn-hangzhou.aliyuncs.com%2Fpublic-cli%2Ffree%2Ff6032e7629b603b19b2f97f5f1c58aaa1542252258.png&size=260&kid=cliim&key=b174f37d026e8e432dfdfde0cc07ad16)

## 模块分包说明（自顶向下介绍整体分包结构，介绍重要的功能分包细节）

* app 功能模块
  * grabDolls 首页Grab Dolls标签页
    * room 房间列表
      * item 房间内游戏页面
  * activities 首页Activities标签页
  * rankings 首页Rankings标签页
  * me 首页Me标签页
    * myDolls 我的娃娃
      * applyDelivery 邮寄页面
  * common 共用内容
    * pay 支付
* base 工具、依赖库模块
  * common 共用内容
    * login 登录
  * retrofit_rx 网络请求
  * websocket WebSocket请求

## 技术要点

* [Kotlin](https://github.com/JetBrains/kotlin)
* [Rxjava](https://github.com/ReactiveX/RxJava) & [RxAndroid](https://github.com/ReactiveX/RxAndroid)
* [Retrofit](https://github.com/square/retrofit)
* [Glide](https://github.com/bumptech/glide)
* [Lottie](https://github.com/airbnb/lottie-android)
* [fastjson](https://github.com/alibaba/fastjson)
* [LeakCanary](https://github.com/square/leakcanary)

## 更新日志（最新的写在最上面，带版本号以及每个版本更新内容简介）
* v1.2.1 
  * 修复线上bug
* v1.2.0 
  * 完成模块按功能分包
  * 替换Http请求框架
  * 优化WebSocket请求，
  * 新增推特登录
  * 新增信用卡支付
* v1.0.0 
  * 完成基础功能：登录，抓娃娃，邮寄，支付

## Bug反馈

如果您有任何问题或反馈，请提交到[Github Issues](https://github.com/MobileCPX/Clawin/issues).

## 联系我们

公司名称：成都魔力百聚科技有限公司

公司网站：[www.mobilecpx.com](www.mobilecpx.com)

## License（版权声明，有待优化）
Mobile CPX 2018

All rights reserved
