# ATL

## 元模型截图

输入端元模型：SPEM

![SPEM](%E6%A8%A1%E5%9E%8B%E8%BD%AC%E6%8D%A2%20ATL.assets/image-20211208212608482.png)

输出端元模型：Document

模型说明：软件工程过程中有很多文档，希望通过这个转换工具，能够自动化的将软件工程过程中的各个环节中的文档自动生成。

设计的映射条件如下：

WorkBreakdownElement :  Document 软件工程过程中每个环节对应一个文档，如需求分析对应需求文档

WorkBreakdownElement.name : Document.name 环节名称对应文档名称

WorkBreakdownElement.description : Document.title 环节描述对应文档标题

Activity ： Document.section 环节中的活动对应文档各个小节，如功能需求分析对应需求文档中的功能模块小节

Activity.content: Document.detail 每个活动中的具体内容对应文档的各个小节的具体内容

ProcessPerformer： Document.author 活动的执行者对应文档的作者

 

![Document](%E6%A8%A1%E5%9E%8B%E8%BD%AC%E6%8D%A2%20ATL.assets/image-20211208212718969.png)

## 模型截图

该截图是有过程元模型定义的瀑布模型一部分，只包含了需求分析

![需求分析](%E6%A8%A1%E5%9E%8B%E8%BD%AC%E6%8D%A2%20ATL.assets/image-20211208215032180.png)

该截图是转换生成的文档模型，是需求文档

![需求文档](%E6%A8%A1%E5%9E%8B%E8%BD%AC%E6%8D%A2%20ATL.assets/image-20211208215217047.png)



