# README

## 类图

![image-20211119115925439](README.assets/image-20211119115925439.png)

## 顺序图

### assignTask

![image-20211118102108951](README.assets/image-20211118102108951.png)

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

## reserveMeeting

![image-20211118183010999](README.assets/image-20211118183010999.png)



## 分工

* 类图
  * 孟涛： Weekly、Task、Problem
  * 田宏远：User、Plan、Review
  * 蹇熠辉：MyFile
  * 邓程诺：Meeting
* 顺序图
  * 孟涛：assignTask
  * 田宏远：createReview、deleteReview，create/delete/modifyPlan
  * 蹇熠辉：createFile
  * 邓程诺：reserveMeeting