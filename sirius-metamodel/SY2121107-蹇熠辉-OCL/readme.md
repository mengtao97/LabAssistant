# 元模型截图

![元模型截图](readme.assets/%E5%85%83%E6%A8%A1%E5%9E%8B%E6%88%AA%E5%9B%BE.jpg)



# 元模型中的classifier

| OO操作                      |
| --------------------------- |
| findObject                  |
| findObjects                 |
| createObject                |
| addObject                   |
| releaseObject               |
| getAttribute / setAttribute |
| findLinkedObject            |
| findLinkedObjects           |
| addLinkOneToOne             |
| addLinkOneToMany            |
| removeLinkOneToOne          |
| removeLinkOneToMany         |

| 非OO              |
| ----------------- |
| compare           |
| literal           |
| thirdPartyService |
| oclIsUndefined    |
| notEmpty          |
| setReturn         |

| 辅助元素      |
| ------------- |
| Contract      |
| Postcondition |
| Precondition  |



# 图形建模截图

![new myDiagram](readme.assets/new%20myDiagram.jpg)



# 元模型与图形语言映射关系说明

| OO操作                      | 翻译成OCL                                 |
| --------------------------- | ----------------------------------------- |
| findObject                  | xx.allInstance()->any(x \| ...)           |
| findObjects                 | xx.allInstance()->select(x \|...)         |
| createObject                | let xx in xx.oclIsNew()~~放在definition~~ |
| addObject                   | xx.allInstance()->include                 |
| releaseObject               | xx.allInstance()->exclude                 |
| getAttribute / setAttribute | xx.yy=zz                                  |
| findLinkedObject            | xx.yy.allInstance()->any(x \|...)         |
| findLinkedObjects           | xx.yy.allInstance()->select(x \|...)      |
| addLinkOneToOne             | xx.yy=zz                                  |
| addLinkOneToMany            | xx.yy.allInstance()->include              |
| removeLinkOneToOne          | xx.yy=OCLVoid                             |
| removeLinkOneToMany         | xx.yy.allInstance()->exclude              |

| 非OO              | 翻译                                 |
| ----------------- | ------------------------------------ |
| compare           | xx > \| >= \| = \| != \| <= \| < yyl |
| literal           | 10 \| true \| "xxx" \| 枚举值        |
| thirdPartyService | 第三方服务                           |
| oclIsUndefined    | xx.oclIsUndefined()                  |
| notEmpty          | xx.notEmpty()                        |
| setReturn         | result = xx                          |