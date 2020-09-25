# PQL示例项目

这是一个PQL示例项目，适用于数据脚本开发，后端接口开发见[OneApi示例项目](http://www.qross.cn/oneapi/quick) 。

## 项目开发环境要求

* Intellij Idea 2018或以上版本（强烈建议）
* JDK 1.8或以上版本（必须）
* Scala 2.12 或以上版本（不必须，但建议有）
* Gradle 4.9 或以上版本（可自行修改成Maven）

项目内配置了Java入口类`io.qross.Main`和Scala的入口类`io.qross.Test`和运行PQL过程文件的代码示例。数据源配置在资源目录`resources`下的`conf.properties`文件中，可根据自己项目需要修改或添加数据源。PQL过程文件保存在资源目录`resources`的`pql`文件夹下，包含两个简单的示例。更多功能请参阅PQL的其他文档。

项目开发的PQL过程文件可以在服务器上通过 **[Worker](http://www.qross.cn/worker/overview)** 运行，服务器上只需要安装`JDK 1.8`即可。因为只是运行文件，所有项目无需要编译。调度程序可通过 **[Keeper](http://www.qross.cn/keeper/overview)** 完成，Keeper提供了强大完善的调度功能，且与PQL结合紧密，通过PQL可实现很多的自定义功能，甚至可以直接调度PQL过程。

## 技术支持

**官方网站 [www.qross.io](http://www.qross.io)**  
**作者邮箱 [wu@qross.io](mailto:wu@qross.io)**

## 参考链接

* [配置数据源](http://www.qross.cn/pql/properties)
* [PQL基本语法](http://www.qross.cn/pql/basic)
* [PQL执行器 Worker](http://www.qross.cn/worker/overview)
* [任务调度工具 Keeper](http://www.qross.cn/keeper/overview)
* [统一接口 OneApi](http://www.qross.cn/oneapi/overview)
