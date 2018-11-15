# 项目名
![](https://is5-ssl.mzstatic.com/image/thumb/Purple128/v4/bb/a1/c8/bba1c89a-9572-ba8e-ab3d-7da8521d69c4/AppIcon-1x_U007emarketing-85-220-0-4.png/1200x630wa.png)
## 简介
项目 Android端，包名：xxx
Google Play链接：[https://play.google.com/store/apps/details?id=com.toyscollect.prizeclaw.clawin](https://play.google.com/store/apps/details?id=com.toyscollect.prizeclaw.clawin)
## 技术要点
* Kotlin
* Rxjava & RxAndroid
* Retrofit
* Glide
* Lottie
* fastjson
* LeakCanary
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
## License（版权声明，有待优化）
Mobile CPX 2018
All rights reserved
