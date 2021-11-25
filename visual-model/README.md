# README

## 架构图

![架构](README.assets/%E6%9E%B6%E6%9E%84.png)

## 类图

![类图](README.assets/%E7%B1%BB%E5%9B%BE.png)

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
  * 蹇熠辉：createFile
  * 邓程诺：reserveMeeting