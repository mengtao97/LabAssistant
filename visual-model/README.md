# README

## 架构图

![架构](README.assets/%E6%9E%B6%E6%9E%84.png)

## 类图

![类图](README.assets/image-20211202131740035.png)

### 设计模式

* 工厂模式
  * `PlanFactory`来创建`YearPlan` 、`SemesterPlan`、`WeekPlan`


* 观察者模式
  * `Meeting`中包含`User`，当状态改变时，调用`notifyAttenders`来通知参加会议人员
* 建造者模式
  * `WeeklyBuilder` 来进行建造`Weekly`和`Task`

## 顺序图

### createPlan

![image-20211125113043992](README.assets/image-20211125113043992.png)

### deletePlan

![image-20211125113137211](README.assets/image-20211125113137211.png)

### modifyPlan

![image-20211125113106537](README.assets/image-20211125113106537.png)

### createReview

![image-20211125113020976](README.assets/image-20211125113020976.png)

### deleteReview

![image-20211125112955522](README.assets/image-20211125112955522.png)

### createFile

![image-20211118154714091](README.assets/image-20211118154714091.png)

描述：首先创建者提供自己的id和文件的名字，然后文件类生成一个文件id，最后返回给用户文件

### reserveMeeting

![image-20211118183010999](README.assets/image-20211118183010999.png)

### createWeekly

![createWeekly](README.assets/createWeekly.png)

### assignTask

![assignTask](README.assets/assignTask.png)

### updateProcession

![updateProcession](README.assets/updateProcession.png)

### reportProblem

![reportProblem](README.assets/reportProblem.png)



### shareFile

![image-20211125143235674](README.assets/image-20211125143235674.png)



### cancelShare

![image-20211125143825615](README.assets/image-20211125143825615.png)





## 分工

* 架构图
  * 小组讨论
* 类图
  * 孟涛： Weekly、Task、Problem
  * 田宏远：User、Plan、Review
  * 蹇熠辉：MyFile
  * 邓程诺：Meeting
* 顺序图
  * 孟涛：createWeekly、 assignTask、updateProcession、reportProblem
  * 田宏远：createReview、deleteReview，create/delete/modifyPlan
  * 蹇熠辉：createFile、shareFile、cancelShare
  * 邓程诺：reserveMeeting



# 第二次更新的区别

- 完善了类图，把上一次缺失的关系连接补充进来了
- 完善了顺序图，补充了updateProcession、reportProblem、create/delete/modifyPlan、shareFile、cancelShare等顺序图
- 新加入了系统的架构图

