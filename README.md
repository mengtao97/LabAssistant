## 三次迭代

### 第一次迭代

commit id: 7215568f

#### 用例图

**分工如下**

* SY2121107 蹇熠辉：User-manageFile User-manageShare
* ZY2121112 田宏远：User-managePlans Teacher-supervisePlans
* ZY2121110 孟涛：Teacher - (createWeekly、assignTask)、User-viewWeekly、Student-(updateTaskProcession、reportProblem)
* ZY2121103 邓程诺：Teacher-reserveMeeting、informStudent

![image-20211031100423464](./README.assets/image-20211031100423464.png)

#### 类图

**分工如下**

* SY2121107 蹇熠辉：MyFile
* ZY2121112 田宏远：User、Plan、Review
* ZY2121110 孟涛：Weekly、Task
* ZY2121103 邓程诺：Meeting

![image-20211031101723408](./README.assets/image-20211031101723408.png)

#### 顺序图

**分工如下：**

* SY2121107 蹇熠辉：ManageShareService、ManageFileService
* ZY2121112 田宏远：SupervisePlansService
* ZY2121110 孟涛：CreateWeeklyService、AssignTaskService、ViewWeeklyService、UpdateTaskService、ReportProblemService
* ZY2121103 邓程诺：ReserveMeetingService

![image-20211030200622987](./README.assets/image-20211030200622987.png)

![image-20211030200636210](./README.assets/image-20211030200636210.png)

![image-20211030200650761](./README.assets/image-20211030200650761.png)

![image-20211030200702495](./README.assets/image-20211030200702495.png)

![image-20211030201603213](./README.assets/image-20211030201603213.png)

![image-20211031103258184](./README.assets/image-20211031103258184.png)

![image-20211030201623259](./README.assets/image-20211030201623259.png)

![image-20211030201641757](./README.assets/image-20211030201641757.png)

![image-20211030201654131](./README.assets/image-20211030201654131.png)

![image-20211030201729977](./README.assets/image-20211030201729977.png)

![image-20211030201746887](./README.assets/image-20211030201746887.png)

#### OCL合约

**分工如下：**

* SY2121107 蹇熠辉：ManageFileService-（CRUD）ManageShareService-（shareFile、cancelSharing）
* ZY2121112 田宏远：ManagePlansService - (createPlan、queryPlanById、modifyPlan、deletePlan)、SupervisePlansService- （selectPlan、inputReviewMessage）
* ZY2121110 孟涛：CreateWeeklyService、AssignTaskService 、ViewWeeklyService、UpdateTaskProcessionService、ReportProblemService以及相关操作与合约
* ZY2121103 邓程诺：

```
Service ManagePlansService {

		[Operation]
		inputPlanInformation(plan)
		createPlan(id, title, content, beginDate, endDate, creatorId, type)
		queryPlanById(id)
		modifyPlan(id, title, content, beginDate, endDate, creatorId, type)
		deletePlan(id)

	}

	Service SupervisePlansService {

		[Operation]
		selectPlan(id)
		inputReviewMessage(id, content, planId)

	}

	Service ManageFileService {

		[Operation]
		addFile(userid, fileid, fileName)
		deleteFile(userid, fileid)

	}

	Service CreateWeeklyService {

		[Operation]
		createWeeklyByTeacher(creatorId, weeklyId, content, weekNum, beginDate, endDate)

	}

	Service AssignTaskService {

		[Operation]
		assignTaskByTeacher(taskId, creatorId, ownerId)
		createTaskByTeacher(creatorId, taskId, content)

	}

	Service ViewWeeklyService {

		[Operation]
		viewWeeklyByUser(weeklyId)

	}

	Service UpdateTaskProcessionService {

		[Operation]
		updateProgressByOwner(taskId, ownerId, progress)

	}

	Service ReportProblemService {

		[Operation]
		reportProblem(taskId, problem, ownerId)

	}

	Service RepresentInfoService {

		[Operation]
		updateUserInfo(user, email, phone, introduction)
		addTeacher(student, teacher)

	}

	Service ManageShareService {

		[Operation]
		shareFile(user, file)
		cancelSharing(user, file)

	}

	Service ReserveMeetingService {

		[Operation]
		reserve(id, password, time, place)

	}

	Service InformStudentService {

		[Operation]
		inform(student)

	}

	Contract ManagePlansService::inputPlanInformation(plan) : Boolean {

		precondition:
			true
		postcondition:
			true
	}

	Contract ManagePlansService::createPlan(id : Integer, title : String, content : String, beginDate : Date, endDate : Date, creatorId : Integer, type : String) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = true

		postcondition:
			let pla:Plan in
			pla.oclIsNew() and
			pla.Id = id and
			pla.Title = title and
			pla.Content = content and
			pla.BeginDate = beginDate and
			pla.EndDate = endDate and
			pla.CreatorId = creatorId and
			pla.Type = type and
			Plan.allInstance()->includes(pla) and
			result = true
	}

	Contract ManagePlansService::queryPlanById(id : Integer) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = false

		postcondition:
			result = plan
	}

	Contract ManageFileService::addFile(userid : Integer, fileid : Integer, fileName : String) : Boolean {

		definition:
			user:User = User.allInstance()->any(use:User | use.Id = userid),
			fff:MyFile = MyFile.allInstance()->any(fffff:MyFile | fffff.FileID = fileid)

		precondition:
			fff.oclIsUndefined() = true and
			user.oclIsUndefined() = false

		postcondition:
			let fff:MyFile in
			fff.oclIsNew() and
			fff.OwnerID = userid and
			fff.FileName = fileName and
			fff.FileID = fileid and
			MyFile.allInstance()->includes(fff) and
			result = true
	}

	Contract ManageFileService::deleteFile(userid : Integer, fileid : Integer) : Boolean {

		definition:
			fff:MyFile = MyFile.allInstance()->any(fffff:MyFile | fffff.FileID = fileid),
			usr:User = User.allInstance()->any(uuuuu:User | uuuuu.Id = userid)

		precondition:
			fff.oclIsUndefined() = false and
			usr.oclIsUndefined() = false and
			MyFile.allInstance()->includes(fff) and
			User.allInstance()->includes(usr)

		postcondition:
			MyFile.allInstance()->excludes(fff) and
			result = true
	}

	Contract CreateWeeklyService::createWeeklyByTeacher(creatorId : String, weeklyId : String, content : String, weekNum : String, beginDate : String, endDate : String) : Boolean {

		definition:
			weekly:Weekly = Weekly.allInstance()->any(wl:Weekly | wl.Id = weeklyId)

		precondition:
			weekly.oclIsUndefined() = true

		postcondition:
			let wl:Weekly in
			wl.oclIsNew() and
			wl.Id = weeklyId and
			wl.CreatorId = creatorId and
			wl.Content = content and
			wl.BeginDate = beginDate and
			wl.EndDate = endDate and
			wl.Weeknum = weekNum and
			Weekly.allInstance()->includes(wl) and
			result = true
	}

	Contract AssignTaskService::createTaskByTeacher(creatorId : String, taskId : String, content : String) : Boolean {

		definition:
			task:Task = Task.allInstance()->any(tk:Task | tk.Id = taskId)

		precondition:
			task.oclIsUndefined() = true

		postcondition:
			let tk:Task in
			tk.oclIsNew() and
			tk.Id = taskId and
			tk.CreatorId = creatorId and
			tk.Content = content and
			Task.allInstance()->includes(tk) and
			result = true
	}

	Contract AssignTaskService::assignTaskByTeacher(taskId : String, creatorId : String, ownerId : String) : Boolean {

		definition:
			tk:Task = Task.allInstance()->any(t:Task | t.Id = taskId)

		precondition:
			tk.oclIsUndefined() = false and
			tk.CreatorId = creatorId
		postcondition:
			tk.OwnerId = ownerId and
			result = true
	}

	Contract ViewWeeklyService::viewWeeklyByUser(weeklyId : String) : Weekly {

		definition:
			wk:Weekly = Weekly.allInstance()->any(w:Weekly | w.Id = weekId)

		precondition:
			wk.oclIsUndefined() = false
		postcondition:
			result = wk
	}

	Contract UpdateTaskProcessionService::updateProgressByOwner(taskId : String, ownerId : String, progress : String) : Boolean {

		definition:
			tk:Task = Task.allInstance()->any(t:Task | t.Id = taskId)

		precondition:
			tk.oclIsUndefined() = false and
			tk.OwnerId = ownerId
		postcondition:
			tk.Progress = progress and
			result = true
	}

	Contract ReportProblemService::reportProblem(taskId : String, problem : String, ownerId : String) : Boolean {

		definition:
			tk:Task = Task.allInstance()->any(t:Task | t.Id = taskId)

		precondition:
			tk.oclIsUndefined() = false and
			tk.OwnerId = ownerId
		postcondition:
			tk.Problem = problem and
			result = true
	}

	Contract RepresentInfoService::updateUserInfo(user : Integer, email : String, phone : String, introduction : String) : Boolean {

		definition:
			uuu:User = User.allInstance()->any(u:User | u.Id = user)

		precondition:
			uuu.oclIsUndefined() = false

		postcondition:
			uuu.Email = email and
			uuu.Phone = phone and
			uuu.Introduction = introduction and
			result = true
	}

	Contract RepresentInfoService::addTeacher(student : Integer, teacher : Integer) : Boolean {

		definition:
			stu:User = User.allInstance()->any(u:User | u.Id = student),
			tea:User = User.allInstance()->any(u:User | u.Id = teacher)

		precondition:
			stu.oclIsUndefined() = false and
			tea.oclIsUndefined() = false

		postcondition:
			stu.Teacher = tea and
			result = true
	}

	Contract ManageShareService::shareFile(user : Integer, file : Integer) : Boolean {

		definition:
			uuu:User = User.allInstance()->any(u:User | u.Id = user),
			fff:MyFile = MyFile.allInstance()->any(f:MyFile | f.FileID = file)

		precondition:
			uuu.oclIsUndefined() = false and
			fff.oclIsUndefined() = false and
			uuu.Browses->excludes(fff)

		postcondition:
			uuu.Browses->includes(fff) and
			result = true
	}

	Contract ManageShareService::cancelSharing(user : Integer, file : Integer) : Boolean {

		definition:
			uuu:User = User.allInstance()->any(u:User | u.Id = user),
			fff:MyFile = MyFile.allInstance()->any(f:MyFile | f.FileID = file)

		precondition:
			uuu.oclIsUndefined() = false and
			fff.oclIsUndefined() = false and
			uuu.Browses->includes(fff)

		postcondition:
			uuu.Browses->excludes(fff) and
			result = true
	}

	Contract ManagePlansService::modifyPlan(id : Integer, title : String, content : String, beginDate : Date, endDate : Date, creatorId : Integer, type : String) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = true

		postcondition:
			plan.oclIsNew() and
			plan.Id = id and
			plan.Title = title and
			plan.Content = content and
			plan.BeginDate = beginDate and
			plan.EndDate = endDate and
			plan.CreatorId = creatorId and
			plan.Type = type and
			result = true
	}

	Contract ManagePlansService::deletePlan(id : Integer) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = false and
			Plan.allInstance()->includes(plan)

		postcondition:
			Plan.allInstance()->excludes(plan) and
			result = true
	}

	Contract SupervisePlansService::selectPlan(id: Integer) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = false

		postcondition:
			result = plan
	}

	Contract SupervisePlansService::inputReviewMessage(id : Integer, content : String, planId: Integer) : Boolean {

		definition:
			review:Review = Review.allInstance()->any(rew:Review | rew.Id = id)

		precondition:
			review.oclIsUndefined() = true

		postcondition:
			let rew:Review in
			rew.oclIsNew() and
			rew.Id = id and
			rew.Content = content and
			rew.PlanId = planId and
			Review.allInstance()->includes(rew) and
			result = true
	}

	Contract ReserveMeetingService::reserve(id : String, password : String, time : String, place : String) : Boolean {

		definition:
			meeting:Meeting = Meeting.allInstance()->any(mee:Meeting | mee.time = time)

		precondition:
			meeting.oclIsUndefined() = true
		postcondition:
			let mee:Meeting in
			mee.oclIsNew() and
			mee.Id = id and
			mee.Time = time and
			mee.Place = place and
			Meeting.allInstance()->includes(mee) and
			result = true
	}

	Contract InformStudentService::inform(student : String) : Boolean {

		definition:
			student:User = User.allInstance()->any(stu:User | stu.id = student)

		precondition:
			student.oclIsUndefined() = true
		postcondition:
			let stu:User in
			stu.oclIsNew() and
			stu.Id = student and
			Student.allInstance()->includes(stu) and
			result = true
	}
```



### 第二次迭代

commit id: 7b8ccc8

#### 用例图

书写人：

SY2121107 蹇熠辉：User - RepresentInfo

ZY2121112 田宏远：User-managePlans Teacher-supervisePlans

ZY2121110 孟涛：Teacher - (createWeekly、assignTask)、User-viewWeekly、Student-(updateTaskProgress、reportProblem)

ZY2121103 邓程诺：Teacher-reserveMeeting、informStudent

![image-20211030200342318](./README.assets/image-20211030200342318.png)

#### 类图

书写人：

SY2121107 蹇熠辉：MyFile

ZY2121112 田宏远：User Plan Review

ZY2121110 孟涛：Weekly、Task

ZY2121103 邓程诺：Meeting

![image-20211030200448321](./README.assets/image-20211030200448321.png)

#### 顺序图

书写人：

SY2121107 蹇熠辉：RepresentInfoService

ZY2121112 田宏远：SupervisePlansService

ZY2121110 孟涛：CreateWeeklyService、AssignTaskService、ViewWeeklyService、UpdateTaskService、ReportProblemService

ZY2121103 邓程诺：ReserveMeetingService

![image-20211030200622987](./README.assets/image-20211030200622987.png)

![image-20211030200636210](./README.assets/image-20211030200636210.png)

![image-20211030200650761](./README.assets/image-20211030200650761.png)

![image-20211030200702495](./README.assets/image-20211030200702495.png)

![image-20211030201603213](./README.assets/image-20211030201603213.png)

![image-20211030200718208](./README.assets/image-20211030200718208.png)

![image-20211030201623259](./README.assets/image-20211030201623259.png)

![image-20211030201641757](./README.assets/image-20211030201641757.png)

![image-20211030201654131](./README.assets/image-20211030201654131.png)

![image-20211030201729977](./README.assets/image-20211030201729977.png)

![image-20211030201746887](./README.assets/image-20211030201746887.png)

#### OCL

书写人：

SY2121107 蹇熠辉：RepresentInfoService（updateUserInfo、addTeacher）

ZY2121112 田宏远：

+ ManagePlansService
  + createPlan、queryPlanById、modifyPlan、deletePlan
+ SupervisePlansService
  + selectPlan、inputReviewMessage

ZY2121110 孟涛：CreateWeeklyService、AssignTaskService 、ViewWeeklyService、UpdateTaskProcessionService、ReportProblemService的相关操作与合约

ZY2121103 邓程诺：

```
Service ManagePlansService {

		[Operation]
		createPlan(id, title, content, beginDate, endDate, creatorId, type)
		queryPlanById(id)
		modifyPlan(id, title, content, beginDate, endDate, creatorId, type)
		deletePlan(id)

	}

	Service SupervisePlansService {

		[Operation]
		selectPlan(id)
		inputReviewMessage(id, content, planId)

	}

	Service ManageFileService {

		[Operation]
		addFile(userid, fileid, fileName)
		deleteFile(userid, fileid)

	}

	Service CreateWeeklyService {

		[Operation]
		createWeeklyByTeacher(creatorId, weeklyId, content, weekNum, beginDate, endDate)

	}

	Service AssignTaskService {

		[Operation]
		assignTaskByTeacher(taskId, creatorId, ownerId)
		createTaskByTeacher(creatorId, taskId, content)

	}

	Service ViewWeeklyService {

		[Operation]
		viewWeeklyByUser(weeklyId)

	}

	Service UpdateTaskProgressService {

		[Operation]
		updateProgressByOwner(taskId, ownerId, progress)

	}

	Service ReportProblemService {

		[Operation]
		reportProblem(taskId, problem, ownerId)

	}

	Service RepresentInfoService {

		[Operation]
		updateUserInfo(user, email, phone, introduction)
		addTeacher(student, teacher)

	}

	Service ManageShareService {

		[Operation]
		shareFile(user, file)
		cancelSharing(user, file)

	}

	Service ReserveMeetingService {

		[Operation]
		reserve(id, time, place)

	}

	Service InformStudentService {

		[Operation]
		inform(studentId)

	}

	Contract ManagePlansService::createPlan(id : Integer, title : String, content : String, beginDate : Date, endDate : Date, creatorId : Integer, type : String) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = true

		postcondition:
			let pla:Plan in
			pla.oclIsNew() and
			pla.Id = id and
			pla.Title = title and
			pla.Content = content and
			pla.BeginDate = beginDate and
			pla.EndDate = endDate and
			pla.CreatorId = creatorId and
			pla.Type = type and
			Plan.allInstance()->includes(pla) and
			result = true
	}

	Contract ManagePlansService::queryPlanById(id : Integer) : Plan {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = false

		postcondition:
			result = plan
	}

	Contract ManageFileService::addFile(userid : Integer, fileid : Integer, fileName : String) : Boolean {

		definition:
			user:User = User.allInstance()->any(use:User | use.Id = userid),
			fff:MyFile = MyFile.allInstance()->any(fffff:MyFile | fffff.FileID = fileid)

		precondition:
			fff.oclIsUndefined() = true and
			user.oclIsUndefined() = false

		postcondition:
			let newFile:MyFile in
			newFile.oclIsNew() and
			newFile.OwnerID = userid and
			newFile.FileName = fileName and
			newFile.FileID = fileid and
			MyFile.allInstance()->includes(newFile) and
			result = true
	}

	Contract ManageFileService::deleteFile(userid : Integer, fileid : Integer) : Boolean {

		definition:
			fff:MyFile = MyFile.allInstance()->any(fffff:MyFile | fffff.FileID = fileid),
			usr:User = User.allInstance()->any(uuuuu:User | uuuuu.Id = userid)

		precondition:
			fff.oclIsUndefined() = false and
			usr.oclIsUndefined() = false and
			MyFile.allInstance()->includes(fff) and
			User.allInstance()->includes(usr)

		postcondition:
			MyFile.allInstance()->excludes(fff) and
			result = true
	}

	Contract CreateWeeklyService::createWeeklyByTeacher(creatorId : Integer, weeklyId : Integer, content : String, weekNum : Integer, beginDate : Date, endDate : Date) : Boolean {

		definition:
			weekly:Weekly = Weekly.allInstance()->any(wl:Weekly | wl.Id = weeklyId)

		precondition:
			weekly.oclIsUndefined() = true

		postcondition:
			let wl:Weekly in
			wl.oclIsNew() and
			wl.Id = weeklyId and
			wl.CreatorId = creatorId and
			wl.Content = content and
			wl.BeginDate = beginDate and
			wl.EndDate = endDate and
			wl.WeekNum = weekNum and
			Weekly.allInstance()->includes(wl) and
			result = true
	}

	Contract AssignTaskService::createTaskByTeacher(creatorId : Integer, taskId : Integer, content : String) : Boolean {

		definition:
			task:Task = Task.allInstance()->any(tk:Task | tk.Id = taskId)

		precondition:
			task.oclIsUndefined() = true

		postcondition:
			let tk:Task in
			tk.oclIsNew() and
			tk.Id = taskId and
			tk.CreatorId = creatorId and
			tk.Content = content and
			Task.allInstance()->includes(tk) and
			result = true
	}

	Contract AssignTaskService::assignTaskByTeacher(taskId : Integer, creatorId : Integer, ownerId : Integer) : Boolean {

		definition:
			tk:Task = Task.allInstance()->any(t:Task | t.Id = taskId)

		precondition:
			tk.oclIsUndefined() = false and
			tk.CreatorId = creatorId
		postcondition:
			tk.OwnerId = ownerId and
			result = true
	}

	Contract ViewWeeklyService::viewWeeklyByUser(weeklyId : Integer) : Weekly {

		definition:
			wk:Weekly = Weekly.allInstance()->any(w:Weekly | w.Id = weekId)

		precondition:
			wk.oclIsUndefined() = false
		postcondition:
			result = wk
	}

	Contract UpdateTaskProgressService::updateProgressByOwner(taskId : Integer, ownerId : Integer, progress : Real) : Boolean {

		definition:
			tk:Task = Task.allInstance()->any(t:Task | t.Id = taskId)

		precondition:
			tk.oclIsUndefined() = false and
			tk.OwnerId = ownerId
		postcondition:
			tk.Progress = progress and
			result = true
	}

	Contract ReportProblemService::reportProblem(taskId : Integer, problem : String, ownerId : Integer) : Boolean {

		definition:
			tk:Task = Task.allInstance()->any(t:Task | t.Id = taskId)

		precondition:
			tk.oclIsUndefined() = false and
			tk.OwnerId = ownerId
		postcondition:
			tk.Problem = problem and
			result = true
	}

	Contract RepresentInfoService::updateUserInfo(user : Integer, email : String, phone : String, introduction : String) : Boolean {

		definition:
			uuu:User = User.allInstance()->any(u:User | u.Id = user)

		precondition:
			uuu.oclIsUndefined() = false

		postcondition:
			uuu.Email = email and
			uuu.Phone = phone and
			uuu.Introduction = introduction and
			result = true
	}

	Contract RepresentInfoService::addTeacher(student : Integer, teacher : Integer) : Boolean {

		definition:
			stu:User = User.allInstance()->any(u:User | u.Id = student),
			tea:User = User.allInstance()->any(u:User | u.Id = teacher)

		precondition:
			stu.oclIsUndefined() = false and
			tea.oclIsUndefined() = false

		postcondition:
			stu.Teacher = tea and
			result = true
	}

	Contract ManageShareService::shareFile(user : Integer, file : Integer) : Boolean {

		definition:
			uuu:User = User.allInstance()->any(u:User | u.Id = user),
			fff:MyFile = MyFile.allInstance()->any(f:MyFile | f.FileID = file)

		precondition:
			uuu.oclIsUndefined() = false and
			fff.oclIsUndefined() = false and
			uuu.Browses->excludes(fff)

		postcondition:
			uuu.Browses->includes(fff) and
			result = true
	}

	Contract ManageShareService::cancelSharing(user : Integer, file : Integer) : Boolean {

		definition:
			uuu:User = User.allInstance()->any(u:User | u.Id = user),
			fff:MyFile = MyFile.allInstance()->any(f:MyFile | f.FileID = file)

		precondition:
			uuu.oclIsUndefined() = false and
			fff.oclIsUndefined() = false and
			uuu.Browses->includes(fff)

		postcondition:
			uuu.Browses->excludes(fff) and
			result = true
	}

	Contract ManagePlansService::modifyPlan(id : Integer, title : String, content : String, beginDate : Date, endDate : Date, creatorId : Integer, type : String) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = true

		postcondition:
			plan.Title = title and
			plan.Content = content and
			plan.BeginDate = beginDate and
			plan.EndDate = endDate and
			plan.CreatorId = creatorId and
			plan.Type = type and
			result = true
	}

	Contract ManagePlansService::deletePlan(id : Integer) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = false and
			Plan.allInstance()->includes(plan)

		postcondition:
			Plan.allInstance()->excludes(plan) and
			result = true
	}

	Contract SupervisePlansService::selectPlan(id: Integer) : Plan {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = false

		postcondition:
			result = plan
	}

	Contract SupervisePlansService::inputReviewMessage(id : Integer, content : String, planId: Integer) : Boolean {

		definition:
			review:Review = Review.allInstance()->any(rew:Review | rew.Id = id)

		precondition:
			review.oclIsUndefined() = true

		postcondition:
			let rew:Review in
			rew.oclIsNew() and
			rew.Id = id and
			rew.Content = content and
			rew.PlanId = planId and
			Review.allInstance()->includes(rew) and
			result = true
	}

	Contract ReserveMeetingService::reserve(id : String, time : Date, place : String) : Boolean {

		definition:
			meeting:Meeting = Meeting.allInstance()->any(mee:Meeting | mee.time = time)

		precondition:
			meeting.oclIsUndefined() = true
		postcondition:
			let mee:Meeting in
			mee.oclIsNew() and
			mee.Id = id and
			mee.Time = time and
			mee.Place = place and
			Meeting.allInstance()->includes(mee) and
			result = true
	}

	Contract InformStudentService::inform(studentId : String) : Boolean {

		definition:
			student:User = User.allInstance()->any(stu:User | stu.id = studentId)

		precondition:
			student.oclIsUndefined() = true
		postcondition:
			let stu:User in
			stu.oclIsNew() and
			stu.Id = studentId and
			Student.allInstance()->includes(stu) and
			result = true
	}
```



### 第三次迭代

commit id: b0ea86a

#### 用例图

书写人：

SY2121107 蹇熠辉：User - representInfo、manageFile 、manageShare

ZY2121112 田宏远：User-managePlans Teacher-supervisePlans

ZY2121110 孟涛：Teacher - (createWeekly、assignTask)、User-viewWeekly、Student-(updateTaskProgress、reportProblem)

ZY2121103 邓程诺：Teacher-reserveMeeting、informStudent

![image-20211031143746217](README.assets/image-20211031143746217.png)

#### 类图

书写人：

SY2121107 蹇熠辉：MyFile

ZY2121112 田宏远：User Plan Review

ZY2121110 孟涛：Weekly、Task

ZY2121103 邓程诺：Meeting

![image-20211031195700179](README.assets/image-20211031195700179.png)

#### 顺序图

书写人：

SY2121107 蹇熠辉：RepresentInfoService、ManageFileService、manageShareService

ZY2121112 田宏远：SupervisePlansService

ZY2121110 孟涛：CreateWeeklyService、AssignTaskService、ViewWeeklyService、UpdateTaskService、ReportProblemService

ZY2121103 邓程诺：ReserveMeetingService

![image-20211031195842432](README.assets/image-20211031195842432.png)

![image-20211030200622987](./README.assets/image-20211030200622987.png)

![image-20211030200636210](./README.assets/image-20211030200636210.png)

![image-20211030200650761](./README.assets/image-20211030200650761.png)

![image-20211030200702495](./README.assets/image-20211030200702495.png)

![image-20211030201603213](./README.assets/image-20211030201603213.png)

![image-20211030200718208](./README.assets/image-20211030200718208.png)

![image-20211030201623259](./README.assets/image-20211030201623259.png)

![image-20211030201641757](./README.assets/image-20211030201641757.png)

![image-20211030201654131](./README.assets/image-20211030201654131.png)

![image-20211030201729977](./README.assets/image-20211030201729977.png)

![image-20211030201746887](./README.assets/image-20211030201746887.png)

#### OCL

书写人：

SY2121107 蹇熠辉：RepresentInfoService（updateUserInfo、addTeacher）ManageFile（CRUD）ManageShare（CRUD）

ZY2121112 田宏远：

+ ManagePlansService
  + createPlan、queryPlanById、modifyPlan、deletePlan
+ SupervisePlansService
  + selectPlan、inputReviewMessage

ZY2121110 孟涛：CreateWeeklyService、AssignTaskService 、ViewWeeklyService、UpdateTaskProcessionService、ReportProblemService的相关操作与合约

ZY2121103 邓程诺：

```
UseCaseModel LabAssistant {

	UC::managePlans definedBySSD(ManagePlansSSD) relatedService(ManagePlansService)
	UC::supervisePlans definedBySSD(SupervisePlansSSD) relatedService(SupervisePlansService)
	UC::manageFile definedBySSD(ManageFileSSD) relatedService(ManageFileService)
	UC::representInfo definedBySSD(RepresentInfoSSD) relatedService(RepresentInfoService)
	UC::manageShare definedBySSD(ManageShareSSD) relatedService(ManageShareService)
	UC::createWeekly definedBySSD(CreateWeeklySSD) relatedService(CreateWeeklyService)
	UC::assignTask definedBySSD(AssignTaskSSD) relatedService(AssignTaskService)
	UC::viewWeekly definedBySSD(ViewWeeklySSD) relatedService(ViewWeeklyService)
	UC::updateTaskProgress definedBySSD(UpdateTaskProgressSSD) relatedService(UpdateTaskProgressService)
	UC::reportProblem definedBySSD(ReportProblemSSD) relatedService(ReportProblemService)
	UC::reserveMeeting definedBySSD(ReserveMeetingSSD) relatedService(ReserveMeetingService)
	UC::informStudent definedBySSD(InformStudentSSD) relatedService(InformStudentService)

	Actor Teacher extends User {
		supervisePlans
		createWeekly
		assignTask
		reserveMeeting
		informStudent
	}

	Actor Student extends User {
		updateTaskProgress
		reportProblem
	}

	Actor User {
		managePlans
		manageFile
		representInfo
		manageShare
		viewWeekly
	}

	Interaction ManagePlansSSD {

		[Participants: User ManagePlansService]

	}

	Interaction SupervisePlansSSD {

		[Participants: Teacher SupervisePlansService]

		CallMessage::SupervisePlansSSDCallMessage1(selectPlan SupervisePlansSSDCallMessage1SendingEnd -> SupervisePlansSSDExecution1StartEnd)
		ReturnMessage::SupervisePlansSSDCallMessage1Return(SupervisePlansSSDExecution1FinishEnd -> SupervisePlansSSDCallMessage1ReturnReceivingEnd SupervisePlansSSDCallMessage1)
		CallMessage::SupervisePlansSSDCallMessage3(inputReviewMessage SupervisePlansSSDCallMessage3SendingEnd -> SupervisePlansSSDExecution2StartEnd)
		ReturnMessage::SupervisePlansSSDCallMessage3Return(SupervisePlansSSDExecution2FinishEnd -> SupervisePlansSSDCallMessage3ReturnReceivingEnd SupervisePlansSSDCallMessage3)

		Execution::SupervisePlansSSDExecution1(SupervisePlansService SupervisePlansSSDExecution1StartEnd SupervisePlansSSDExecution1FinishEnd)
		Execution::SupervisePlansSSDExecution2(SupervisePlansService SupervisePlansSSDExecution2StartEnd SupervisePlansSSDExecution2FinishEnd)

		MessageEnd::SupervisePlansSSDCallMessage1SendingEnd(Teacher SupervisePlansSSDCallMessage1)
		ExecutionEnd::SupervisePlansSSDExecution1StartEnd(SupervisePlansService SupervisePlansSSDExecution1)
		ExecutionEnd::SupervisePlansSSDExecution1FinishEnd(SupervisePlansService SupervisePlansSSDExecution1)
		MessageEnd::SupervisePlansSSDCallMessage1ReturnReceivingEnd(Teacher SupervisePlansSSDCallMessage1Return)
		MessageEnd::SupervisePlansSSDCallMessage3SendingEnd(Teacher SupervisePlansSSDCallMessage3)
		ExecutionEnd::SupervisePlansSSDExecution2StartEnd(SupervisePlansService SupervisePlansSSDExecution2)
		ExecutionEnd::SupervisePlansSSDExecution2FinishEnd(SupervisePlansService SupervisePlansSSDExecution2)
		MessageEnd::SupervisePlansSSDCallMessage3ReturnReceivingEnd(Teacher SupervisePlansSSDCallMessage3Return)

	}

	Interaction ManageFileSSD {

		[Participants: User ManageFileService]

		CallMessage::ManageFileSSDCallMessage1(addFile ManageFileSSDCallMessage1SendingEnd -> ManageFileSSDExecution1StartEnd)
		ReturnMessage::ManageFileSSDCallMessage1Return(ManageFileSSDExecution1FinishEnd -> ManageFileSSDCallMessage1ReturnReceivingEnd ManageFileSSDCallMessage1)
		CallMessage::ManageFileSSDCallMessage3(deleteFile ManageFileSSDCallMessage3SendingEnd -> ManageFileSSDExecution2StartEnd)
		ReturnMessage::ManageFileSSDCallMessage3Return(ManageFileSSDExecution2FinishEnd -> ManageFileSSDCallMessage3ReturnReceivingEnd ManageFileSSDCallMessage3)

		Execution::ManageFileSSDExecution1(ManageFileService ManageFileSSDExecution1StartEnd ManageFileSSDExecution1FinishEnd)
		Execution::ManageFileSSDExecution2(ManageFileService ManageFileSSDExecution2StartEnd ManageFileSSDExecution2FinishEnd)

		MessageEnd::ManageFileSSDCallMessage1SendingEnd(User ManageFileSSDCallMessage1)
		ExecutionEnd::ManageFileSSDExecution1StartEnd(ManageFileService ManageFileSSDExecution1)
		ExecutionEnd::ManageFileSSDExecution1FinishEnd(ManageFileService ManageFileSSDExecution1)
		MessageEnd::ManageFileSSDCallMessage1ReturnReceivingEnd(User ManageFileSSDCallMessage1Return)
		MessageEnd::ManageFileSSDCallMessage3SendingEnd(User ManageFileSSDCallMessage3)
		ExecutionEnd::ManageFileSSDExecution2StartEnd(ManageFileService ManageFileSSDExecution2)
		ExecutionEnd::ManageFileSSDExecution2FinishEnd(ManageFileService ManageFileSSDExecution2)
		MessageEnd::ManageFileSSDCallMessage3ReturnReceivingEnd(User ManageFileSSDCallMessage3Return)

	}

	Interaction CreateWeeklySSD {

		[Participants: Teacher CreateWeeklyService]

		CallMessage::CreateWeeklySSDCallMessage1(createWeeklyByTeacher CreateWeeklySSDCallMessage1SendingEnd -> CreateWeeklySSDExecution1StartEnd)
		ReturnMessage::CreateWeeklySSDCallMessage1Return(CreateWeeklySSDExecution1FinishEnd -> CreateWeeklySSDCallMessage1ReturnReceivingEnd CreateWeeklySSDCallMessage1)

		Execution::CreateWeeklySSDExecution1(CreateWeeklyService CreateWeeklySSDExecution1StartEnd CreateWeeklySSDExecution1FinishEnd)

		MessageEnd::CreateWeeklySSDCallMessage1SendingEnd(Teacher CreateWeeklySSDCallMessage1)
		ExecutionEnd::CreateWeeklySSDExecution1StartEnd(CreateWeeklyService CreateWeeklySSDExecution1)
		ExecutionEnd::CreateWeeklySSDExecution1FinishEnd(CreateWeeklyService CreateWeeklySSDExecution1)
		MessageEnd::CreateWeeklySSDCallMessage1ReturnReceivingEnd(Teacher CreateWeeklySSDCallMessage1Return)

	}

	Interaction AssignTaskSSD {

		[Participants: Teacher AssignTaskService]

		CallMessage::AssignTaskSSDCallMessage1(assignTaskByTeacher AssignTaskSSDCallMessage1SendingEnd -> AssignTaskSSDExecution1StartEnd)
		ReturnMessage::AssignTaskSSDCallMessage1Return(AssignTaskSSDExecution1FinishEnd -> AssignTaskSSDCallMessage1ReturnReceivingEnd AssignTaskSSDCallMessage1)
		CallMessage::AssignTaskSSDCallMessage3(createTaskByTeacher AssignTaskSSDCallMessage3SendingEnd -> AssignTaskSSDExecution2StartEnd)
		ReturnMessage::AssignTaskSSDCallMessage3Return(AssignTaskSSDExecution2FinishEnd -> AssignTaskSSDCallMessage3ReturnReceivingEnd AssignTaskSSDCallMessage3)

		Execution::AssignTaskSSDExecution1(AssignTaskService AssignTaskSSDExecution1StartEnd AssignTaskSSDExecution1FinishEnd)
		Execution::AssignTaskSSDExecution2(AssignTaskService AssignTaskSSDExecution2StartEnd AssignTaskSSDExecution2FinishEnd)

		MessageEnd::AssignTaskSSDCallMessage3SendingEnd(Teacher AssignTaskSSDCallMessage3)
		ExecutionEnd::AssignTaskSSDExecution2StartEnd(AssignTaskService AssignTaskSSDExecution2)
		ExecutionEnd::AssignTaskSSDExecution2FinishEnd(AssignTaskService AssignTaskSSDExecution2)
		MessageEnd::AssignTaskSSDCallMessage3ReturnReceivingEnd(Teacher AssignTaskSSDCallMessage3Return)
		MessageEnd::AssignTaskSSDCallMessage1SendingEnd(Teacher AssignTaskSSDCallMessage1)
		ExecutionEnd::AssignTaskSSDExecution1StartEnd(AssignTaskService AssignTaskSSDExecution1)
		ExecutionEnd::AssignTaskSSDExecution1FinishEnd(AssignTaskService AssignTaskSSDExecution1)
		MessageEnd::AssignTaskSSDCallMessage1ReturnReceivingEnd(Teacher AssignTaskSSDCallMessage1Return)

	}

	Interaction ViewWeeklySSD {

		[Participants: User ViewWeeklyService]

		CallMessage::ViewWeeklySSDCallMessage1(viewWeeklyByUser ViewWeeklySSDCallMessage1SendingEnd -> ViewWeeklySSDExecution1StartEnd)
		ReturnMessage::ViewWeeklySSDCallMessage1Return(ViewWeeklySSDExecution1FinishEnd -> ViewWeeklySSDCallMessage1ReturnReceivingEnd ViewWeeklySSDCallMessage1)
		CallMessage::ViewWeeklySSDCallMessage3(viewAllWeekly ViewWeeklySSDCallMessage3SendingEnd -> ViewWeeklySSDExecution2StartEnd)
		ReturnMessage::ViewWeeklySSDCallMessage3Return(ViewWeeklySSDExecution2FinishEnd -> ViewWeeklySSDCallMessage3ReturnReceivingEnd ViewWeeklySSDCallMessage3)

		Execution::ViewWeeklySSDExecution1(ViewWeeklyService ViewWeeklySSDExecution1StartEnd ViewWeeklySSDExecution1FinishEnd)
		Execution::ViewWeeklySSDExecution2(ViewWeeklyService ViewWeeklySSDExecution2StartEnd ViewWeeklySSDExecution2FinishEnd)

		MessageEnd::ViewWeeklySSDCallMessage1SendingEnd(User ViewWeeklySSDCallMessage1)
		ExecutionEnd::ViewWeeklySSDExecution1StartEnd(ViewWeeklyService ViewWeeklySSDExecution1)
		ExecutionEnd::ViewWeeklySSDExecution1FinishEnd(ViewWeeklyService ViewWeeklySSDExecution1)
		MessageEnd::ViewWeeklySSDCallMessage1ReturnReceivingEnd(User ViewWeeklySSDCallMessage1Return)
		MessageEnd::ViewWeeklySSDCallMessage3SendingEnd(User ViewWeeklySSDCallMessage3)
		ExecutionEnd::ViewWeeklySSDExecution2StartEnd(ViewWeeklyService ViewWeeklySSDExecution2)
		ExecutionEnd::ViewWeeklySSDExecution2FinishEnd(ViewWeeklyService ViewWeeklySSDExecution2)
		MessageEnd::ViewWeeklySSDCallMessage3ReturnReceivingEnd(User ViewWeeklySSDCallMessage3Return)

	}

	Interaction UpdateTaskProgressSSD {

		[Participants: Student UpdateTaskProgressService]

		CallMessage::UpdateTaskProgressSSDCallMessage1(updateProgressByOwner UpdateTaskProgressSSDCallMessage1SendingEnd -> UpdateTaskProgressSSDExecution1StartEnd)
		ReturnMessage::UpdateTaskProgressSSDCallMessage1Return(UpdateTaskProgressSSDExecution1FinishEnd -> UpdateTaskProgressSSDCallMessage1ReturnReceivingEnd UpdateTaskProgressSSDCallMessage1)

		Execution::UpdateTaskProgressSSDExecution1(UpdateTaskProgressService UpdateTaskProgressSSDExecution1StartEnd UpdateTaskProgressSSDExecution1FinishEnd)

		MessageEnd::UpdateTaskProgressSSDCallMessage1SendingEnd(Student UpdateTaskProgressSSDCallMessage1)
		ExecutionEnd::UpdateTaskProgressSSDExecution1StartEnd(UpdateTaskProgressService UpdateTaskProgressSSDExecution1)
		ExecutionEnd::UpdateTaskProgressSSDExecution1FinishEnd(UpdateTaskProgressService UpdateTaskProgressSSDExecution1)
		MessageEnd::UpdateTaskProgressSSDCallMessage1ReturnReceivingEnd(Student UpdateTaskProgressSSDCallMessage1Return)

	}

	Interaction ReportProblemSSD {

		[Participants: Student ReportProblemService]

		CallMessage::ReportProblemSSDCallMessage1(reportProblem ReportProblemSSDCallMessage1SendingEnd -> ReportProblemSSDExecution1StartEnd)
		ReturnMessage::ReportProblemSSDCallMessage1Return(ReportProblemSSDExecution1FinishEnd -> ReportProblemSSDCallMessage1ReturnReceivingEnd ReportProblemSSDCallMessage1)
		CallMessage::ReportProblemSSDCallMessage3(solveProblem ReportProblemSSDCallMessage3SendingEnd -> ReportProblemSSDExecution2StartEnd)
		ReturnMessage::ReportProblemSSDCallMessage3Return(ReportProblemSSDExecution2FinishEnd -> ReportProblemSSDCallMessage3ReturnReceivingEnd ReportProblemSSDCallMessage3)

		Execution::ReportProblemSSDExecution1(ReportProblemService ReportProblemSSDExecution1StartEnd ReportProblemSSDExecution1FinishEnd)
		Execution::ReportProblemSSDExecution2(ReportProblemService ReportProblemSSDExecution2StartEnd ReportProblemSSDExecution2FinishEnd)

		MessageEnd::ReportProblemSSDCallMessage1SendingEnd(Student ReportProblemSSDCallMessage1)
		ExecutionEnd::ReportProblemSSDExecution1StartEnd(ReportProblemService ReportProblemSSDExecution1)
		ExecutionEnd::ReportProblemSSDExecution1FinishEnd(ReportProblemService ReportProblemSSDExecution1)
		MessageEnd::ReportProblemSSDCallMessage1ReturnReceivingEnd(Student ReportProblemSSDCallMessage1Return)
		MessageEnd::ReportProblemSSDCallMessage3SendingEnd(Student ReportProblemSSDCallMessage3)
		ExecutionEnd::ReportProblemSSDExecution2StartEnd(ReportProblemService ReportProblemSSDExecution2)
		ExecutionEnd::ReportProblemSSDExecution2FinishEnd(ReportProblemService ReportProblemSSDExecution2)
		MessageEnd::ReportProblemSSDCallMessage3ReturnReceivingEnd(Student ReportProblemSSDCallMessage3Return)

	}

	Interaction RepresentInfoSSD {

		[Participants: User RepresentInfoService]

		CallMessage::RepresentInfoSSDCallMessage1(updateUserInfo RepresentInfoSSDCallMessage1SendingEnd -> RepresentInfoSSDExecution1StartEnd)
		ReturnMessage::RepresentInfoSSDCallMessage1Return(RepresentInfoSSDExecution1FinishEnd -> RepresentInfoSSDCallMessage1ReturnReceivingEnd RepresentInfoSSDCallMessage1)
		CallMessage::RepresentInfoSSDCallMessage3(addTeacher RepresentInfoSSDCallMessage3SendingEnd -> RepresentInfoSSDExecution2StartEnd)
		ReturnMessage::RepresentInfoSSDCallMessage3Return(RepresentInfoSSDExecution2FinishEnd -> RepresentInfoSSDCallMessage3ReturnReceivingEnd RepresentInfoSSDCallMessage3)

		Execution::RepresentInfoSSDExecution1(RepresentInfoService RepresentInfoSSDExecution1StartEnd RepresentInfoSSDExecution1FinishEnd)
		Execution::RepresentInfoSSDExecution2(RepresentInfoService RepresentInfoSSDExecution2StartEnd RepresentInfoSSDExecution2FinishEnd)

		MessageEnd::RepresentInfoSSDCallMessage1SendingEnd(User RepresentInfoSSDCallMessage1)
		ExecutionEnd::RepresentInfoSSDExecution1StartEnd(RepresentInfoService RepresentInfoSSDExecution1)
		ExecutionEnd::RepresentInfoSSDExecution1FinishEnd(RepresentInfoService RepresentInfoSSDExecution1)
		MessageEnd::RepresentInfoSSDCallMessage1ReturnReceivingEnd(User RepresentInfoSSDCallMessage1Return)
		MessageEnd::RepresentInfoSSDCallMessage3SendingEnd(User RepresentInfoSSDCallMessage3)
		ExecutionEnd::RepresentInfoSSDExecution2StartEnd(RepresentInfoService RepresentInfoSSDExecution2)
		ExecutionEnd::RepresentInfoSSDExecution2FinishEnd(RepresentInfoService RepresentInfoSSDExecution2)
		MessageEnd::RepresentInfoSSDCallMessage3ReturnReceivingEnd(User RepresentInfoSSDCallMessage3Return)

	}

	Interaction ManageShareSSD {

		[Participants: User ManageShareService]

		CallMessage::ManageShareSSDCallMessage1(shareFile ManageShareSSDCallMessage1SendingEnd -> ManageShareSSDExecution1StartEnd)
		ReturnMessage::ManageShareSSDCallMessage1Return(ManageShareSSDExecution1FinishEnd -> ManageShareSSDCallMessage1ReturnReceivingEnd ManageShareSSDCallMessage1)
		CallMessage::ManageShareSSDCallMessage3(cancelSharing ManageShareSSDCallMessage3SendingEnd -> ManageShareSSDExecution2StartEnd)
		ReturnMessage::ManageShareSSDCallMessage3Return(ManageShareSSDExecution2FinishEnd -> ManageShareSSDCallMessage3ReturnReceivingEnd ManageShareSSDCallMessage3)

		Execution::ManageShareSSDExecution1(ManageShareService ManageShareSSDExecution1StartEnd ManageShareSSDExecution1FinishEnd)
		Execution::ManageShareSSDExecution2(ManageShareService ManageShareSSDExecution2StartEnd ManageShareSSDExecution2FinishEnd)

		MessageEnd::ManageShareSSDCallMessage1SendingEnd(User ManageShareSSDCallMessage1)
		ExecutionEnd::ManageShareSSDExecution1StartEnd(ManageShareService ManageShareSSDExecution1)
		ExecutionEnd::ManageShareSSDExecution1FinishEnd(ManageShareService ManageShareSSDExecution1)
		MessageEnd::ManageShareSSDCallMessage1ReturnReceivingEnd(User ManageShareSSDCallMessage1Return)
		MessageEnd::ManageShareSSDCallMessage3SendingEnd(User ManageShareSSDCallMessage3)
		ExecutionEnd::ManageShareSSDExecution2StartEnd(ManageShareService ManageShareSSDExecution2)
		ExecutionEnd::ManageShareSSDExecution2FinishEnd(ManageShareService ManageShareSSDExecution2)
		MessageEnd::ManageShareSSDCallMessage3ReturnReceivingEnd(User ManageShareSSDCallMessage3Return)

	}

	Interaction ReserveMeetingSSD {

		[Participants: Teacher ReserveMeetingService]

		CallMessage::ReserveMeetingSSDCallMessage9(reserve ReserveMeetingSSDCallMessage9SendingEnd -> ReserveMeetingSSDExecution5StartEnd)
		ReturnMessage::ReserveMeetingSSDCallMessage9Return(ReserveMeetingSSDExecution5FinishEnd -> ReserveMeetingSSDCallMessage9ReturnReceivingEnd ReserveMeetingSSDCallMessage9)

		Execution::ReserveMeetingSSDExecution5(ReserveMeetingService ReserveMeetingSSDExecution5StartEnd ReserveMeetingSSDExecution5FinishEnd)

		MessageEnd::ReserveMeetingSSDCallMessage9SendingEnd(Teacher ReserveMeetingSSDCallMessage9)
		ExecutionEnd::ReserveMeetingSSDExecution5StartEnd(ReserveMeetingService ReserveMeetingSSDExecution5)
		ExecutionEnd::ReserveMeetingSSDExecution5FinishEnd(ReserveMeetingService ReserveMeetingSSDExecution5)
		MessageEnd::ReserveMeetingSSDCallMessage9ReturnReceivingEnd(Teacher ReserveMeetingSSDCallMessage9Return)

	}

	Interaction InformStudentSSD {

		[Participants: Teacher InformStudentService]

		CallMessage::InformStudentSSDCallMessage1(inform InformStudentSSDCallMessage1SendingEnd -> InformStudentSSDExecution1StartEnd)
		ReturnMessage::InformStudentSSDCallMessage1Return(InformStudentSSDExecution1FinishEnd -> InformStudentSSDCallMessage1ReturnReceivingEnd InformStudentSSDCallMessage1)

		Execution::InformStudentSSDExecution1(InformStudentService InformStudentSSDExecution1StartEnd InformStudentSSDExecution1FinishEnd)

		MessageEnd::InformStudentSSDCallMessage1SendingEnd(Teacher InformStudentSSDCallMessage1)
		ExecutionEnd::InformStudentSSDExecution1StartEnd(InformStudentService InformStudentSSDExecution1)
		ExecutionEnd::InformStudentSSDExecution1FinishEnd(InformStudentService InformStudentSSDExecution1)
		MessageEnd::InformStudentSSDCallMessage1ReturnReceivingEnd(Teacher InformStudentSSDCallMessage1Return)

	}

	Service LabAssistantSystem {

	}

	Service ThirdPartyServices {

	}

	Service ManagePlansService {

		[Operation]
		createPlan(id, title, content, beginDate, endDate, creatorId, type)
		queryPlanById(id)
		queryPlanByType(type)
		modifyPlan(id, title, content, beginDate, endDate, creatorId, type)
		deletePlan(id)

	}

	Service SupervisePlansService {

		[Operation]
		selectPlan(id)
		selectPlansByUserId(userId)
		inputReviewMessage(id, content, planId)

	}

	Service ManageFileService {

		[Operation]
		addFile(userid, fileid, fileName)
		deleteFile(userid, fileid)

	}

	Service CreateWeeklyService {

		[Operation]
		createWeeklyByTeacher(creatorId, weeklyId, content, weekNum, beginDate, endDate)

	}

	Service AssignTaskService {

		[Operation]
		assignTaskByTeacher(taskId, creatorId, ownerId)
		createTaskByTeacher(creatorId, taskId, content)

	}

	Service ViewWeeklyService {

		[Operation]
		viewWeeklyByUser(weeklyId)
		viewAllWeekly()

	}

	Service UpdateTaskProgressService {

		[Operation]
		updateProgressByOwner(taskId, ownerId, progress)

	}

	Service ReportProblemService {

		[Operation]
		reportProblem(taskId, problem, ownerId, problemId)
		solveProblem(problemId, userId, solution)

	}

	Service RepresentInfoService {

		[Operation]
		updateUserInfo(user, email, phone, introduction)
		addTeacher(student, teacher)

	}

	Service ManageShareService {

		[Operation]
		shareFile(user, file)
		cancelSharing(user, file)

	}

	Service ReserveMeetingService {

		[Operation]
		reserve(id, time, place)

	}

	Service InformStudentService {

		[Operation]
		inform(studentId)

	}

	Contract ManagePlansService::createPlan(id : Integer, title : String, content : String, beginDate : Date, endDate : Date, creatorId : Integer, type : String) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = true

		postcondition:
			let pla:Plan in
			pla.oclIsNew() and
			pla.Id = id and
			pla.Title = title and
			pla.Content = content and
			pla.BeginDate = beginDate and
			pla.EndDate = endDate and
			pla.CreatorId = creatorId and
			pla.Type = type and
			Plan.allInstance()->includes(pla) and
			result = true
	}

	Contract ManagePlansService::queryPlanById(id : Integer) : Plan {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = false

		postcondition:
			result = plan
	}

	Contract ManageFileService::addFile(userid : Integer, fileid : Integer, fileName : String) : Boolean {

		definition:
			user:User = User.allInstance()->any(use:User | use.Id = userid),
			fff:MyFile = MyFile.allInstance()->any(fffff:MyFile | fffff.FileID = fileid)

		precondition:
			fff.oclIsUndefined() = true and
			user.oclIsUndefined() = false

		postcondition:
			let newFile:MyFile in
			newFile.oclIsNew() and
			newFile.OwnerID = userid and
			newFile.FileName = fileName and
			newFile.FileID = fileid and
			MyFile.allInstance()->includes(newFile) and
			result = true
	}

	Contract ManageFileService::deleteFile(userid : Integer, fileid : Integer) : Boolean {

		definition:
			fff:MyFile = MyFile.allInstance()->any(fffff:MyFile | fffff.FileID = fileid),
			usr:User = User.allInstance()->any(uuuuu:User | uuuuu.Id = userid)

		precondition:
			fff.oclIsUndefined() = false and
			usr.oclIsUndefined() = false and
			MyFile.allInstance()->includes(fff) and
			User.allInstance()->includes(usr)

		postcondition:
			MyFile.allInstance()->excludes(fff) and
			result = true
	}

	Contract CreateWeeklyService::createWeeklyByTeacher(creatorId : Integer, weeklyId : Integer, content : String, weekNum : Integer, beginDate : Date, endDate : Date) : Boolean {

		definition:
			user:User = User.allInstance()->any(u:User | u.Id = creatorId),
			weekly:Weekly = Weekly.allInstance()->any(wl:Weekly | wl.Id = weeklyId)

		precondition:
			weekly.oclIsUndefined() = true and
			user.oclIsUndefined() = false and
			user.Role = "TEACHER"

		postcondition:
			let wl:Weekly in
			wl.oclIsNew() and
			wl.Id = weeklyId and
			wl.CreatorId = creatorId and
			wl.Content = content and
			wl.BeginDate = beginDate and
			wl.EndDate = endDate and
			wl.WeekNum = weekNum and
			Weekly.allInstance()->includes(wl) and
			user.UserCreateWeekly->includes(wl) and
			result = true
	}

	Contract AssignTaskService::createTaskByTeacher(creatorId : Integer, taskId : Integer, content : String) : Boolean {

		definition:
			user:User = User.allInstance()->any(u:User | u.Id = creatorId),
			task:Task = Task.allInstance()->any(tk:Task | tk.Id = taskId)

		precondition:
			task.oclIsUndefined() = true and
			user.oclIsUndefined() = false and
			user.Role = "TEACHER"

		postcondition:
			let tk:Task in
			tk.oclIsNew() and
			tk.Id = taskId and
			tk.CreatorId = creatorId and
			tk.Content = content and
			Task.allInstance()->includes(tk) and
			user.UserCreateTask->includes(tk) and
			result = true
	}

	Contract AssignTaskService::assignTaskByTeacher(taskId : Integer, creatorId : Integer, ownerId : Integer) : Boolean {

		definition:
			tk:Task = Task.allInstance()->any(t:Task | t.Id = taskId),
			user:User = User.allInstance()->any(u:User | u.Id = creatorId)

		precondition:
			tk.oclIsUndefined() = false and
			tk.CreatorId = creatorId and
			user.oclIsUndefined() = false and
			user.Role = "STUDENT"

		postcondition:
			tk.OwnerId = ownerId and
			user.UserOwnTask->includes(tk) and
			result = true
	}

	Contract ViewWeeklyService::viewWeeklyByUser(weeklyId : Integer) : Weekly {

		definition:
			wk:Weekly = Weekly.allInstance()->any(w:Weekly | w.Id = weeklyId)

		precondition:
			wk.oclIsUndefined() = false
		postcondition:
			result = wk
	}

	Contract UpdateTaskProgressService::updateProgressByOwner(taskId : Integer, ownerId : Integer, progress : Real) : Boolean {

		definition:
			tk:Task = Task.allInstance()->any(t:Task | t.Id = taskId)

		precondition:
			tk.oclIsUndefined() = false and
			tk.OwnerId = ownerId
		postcondition:
			tk.Progress = progress and
			result = true
	}

	Contract ReportProblemService::reportProblem(taskId : Integer, problem : String, ownerId : Integer, problemId: Integer) : Boolean {

		definition:
			task:Task = Task.allInstance()->any(t:Task| t.Id = taskId),
			newProblem:Problem = Problem.allInstance()->any(p:Problem | p.Id = problemId)

		precondition:
			task.oclIsUndefined() = false and
			newProblem.oclIsUndefined() = true

		postcondition:
			let pb:Problem in
			pb.oclIsNew() and
			pb.Id = problemId and
			pb.CreatorId = ownerId and
			pb.TaskId = taskId and
			pb.Content = problem and
			pb.Status = 0 and
			Problem.allInstance()->includes(pb) and
			task.HasProblem->includes(pb) and
			result = true

	}

	Contract RepresentInfoService::updateUserInfo(user : Integer, email : String, phone : String, introduction : String) : Boolean {

		definition:
			uuu:User = User.allInstance()->any(u:User | u.Id = user)

		precondition:
			uuu.oclIsUndefined() = false

		postcondition:
			uuu.Email = email and
			uuu.Phone = phone and
			uuu.Introduction = introduction and
			result = true
	}

	Contract RepresentInfoService::addTeacher(student : Integer, teacher : Integer) : Boolean {

		definition:
			stu:User = User.allInstance()->any(u:User | u.Id = student),
			tea:User = User.allInstance()->any(u:User | u.Id = teacher)

		precondition:
			stu.oclIsUndefined() = false and
			tea.oclIsUndefined() = false

		postcondition:
			stu.Teacher = tea and
			result = true
	}

	Contract ManageShareService::shareFile(user : Integer, file : Integer) : Boolean {

		definition:
			uuu:User = User.allInstance()->any(u:User | u.Id = user),
			fff:MyFile = MyFile.allInstance()->any(f:MyFile | f.FileID = file)

		precondition:
			uuu.oclIsUndefined() = false and
			fff.oclIsUndefined() = false and
			uuu.Browses->excludes(fff)

		postcondition:
			uuu.Browses->includes(fff) and
			result = true
	}

	Contract ManageShareService::cancelSharing(user : Integer, file : Integer) : Boolean {

		definition:
			uuu:User = User.allInstance()->any(u:User | u.Id = user),
			fff:MyFile = MyFile.allInstance()->any(f:MyFile | f.FileID = file)

		precondition:
			uuu.oclIsUndefined() = false and
			fff.oclIsUndefined() = false and
			uuu.Browses->includes(fff)

		postcondition:
			uuu.Browses->excludes(fff) and
			result = true
	}

	Contract ManagePlansService::modifyPlan(id : Integer, title : String, content : String, beginDate : Date, endDate : Date, creatorId : Integer, type : String) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = true

		postcondition:
			plan.Title = title and
			plan.Content = content and
			plan.BeginDate = beginDate and
			plan.EndDate = endDate and
			plan.CreatorId = creatorId and
			plan.Type = type and
			result = true
	}

	Contract ManagePlansService::deletePlan(id : Integer) : Boolean {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = false and
			Plan.allInstance()->includes(plan)

		postcondition:
			Plan.allInstance()->excludes(plan) and
			result = true
	}

	Contract SupervisePlansService::selectPlan(id: Integer) : Plan {

		definition:
			plan:Plan = Plan.allInstance()->any(pla:Plan | pla.Id = id)

		precondition:
			plan.oclIsUndefined() = false

		postcondition:
			result = plan
	}

	Contract SupervisePlansService::inputReviewMessage(id : Integer, content : String, planId: Integer) : Boolean {

		definition:
			review:Review = Review.allInstance()->any(rew:Review | rew.Id = id)

		precondition:
			review.oclIsUndefined() = true

		postcondition:
			let rew:Review in
			rew.oclIsNew() and
			rew.Id = id and
			rew.Content = content and
			rew.PlanId = planId and
			Review.allInstance()->includes(rew) and
			result = true
	}

	Contract ReserveMeetingService::reserve(id : Integer, time : Date, place : String) : Boolean {

		definition:
			meeting:Meeting = Meeting.allInstance()->any(mee:Meeting | mee.Time = time)

		precondition:
			meeting.oclIsUndefined() = true
		postcondition:
			let mee:Meeting in
			mee.oclIsNew() and
			mee.Id = id and
			mee.Time = time and
			mee.Place = place and
			Meeting.allInstance()->includes(mee) and
			result = true
	}

	Contract InformStudentService::inform(studentId : Integer) : Boolean {

		definition:
			student:User = User.allInstance()->any(stu:User | stu.Id = studentId)

		precondition:
			student.oclIsUndefined() = true
		postcondition:
			let stu:User in
			stu.oclIsNew() and
			stu.Id = studentId and
			User.allInstance()->includes(stu) and
			result = true
	}

	Contract SupervisePlansService::selectPlansByUserId(userId : Integer) : Set(Plan) {

		precondition:
			true
		postcondition:
			result = Plan.allInstance()->select(plan:Plan | plan.CreatorId = userId)
	}

	Contract ManagePlansService::queryPlanByType(type : String) : Set(Plan) {

		precondition:
			true
		postcondition:
			result = Plan.allInstance()->select(plan:Plan | plan.Type = type)
	}

	Contract ViewWeeklyService::viewAllWeekly() : Set(Weekly) {

		precondition:
			true
		postcondition:
			result = Weekly.allInstance()
	}

	Contract ReportProblemService::solveProblem(problemId : Integer, userId : Integer, solution : String) : Boolean {

		definition:
			problem:Problem = Problem.allInstance()->any(pb:Problem | pb.Id = problemId)

		precondition:
			problem.oclIsUndefined() = false and
			problem.CreatorId = userId

		postcondition:
			problem.Id = problemId and
			problem.Solution = solution and
			problem.Status = 1 and
			result = true
	}

}

DomainModel LabAssistant {

	@AutoCRUD Entity User {
		Id : Integer
		Username : String
		Password : String
		Email : String
		Phone : String
		Role : String
		Introduction : String

		[Refer]
		UsertoPlan : Plan* Association
		Browses : MyFile* Association
		Teacher : User Association
		UserCreateWeekly : Weekly* Association
		UserCreateTask : Task* Association
		UserOwnTask : Task* Association
		UsertoMessage : Message* Association
	}

	@AutoCRUD Entity Plan {
		Id : Integer
		Title : String
		Content : String
		BeginDate : Date
		EndDate : Date
		CreatorId : Integer
		Type : String

		[Refer]
		PlantoReview : Review* Association
	}

	Entity MyFile {
		OwnerID : Integer
		FileName : String
		FileID : Integer
	}

	Entity Weekly {
		Id : Integer
		Content : String
		WeekNum : Integer
		BeginDate : Date
		EndDate : Date
		CreatorId : Integer
	}

	Entity Task {
		Id : Integer
		Content : String
		CreatorId : Integer
		OwnerId : Integer
		Progress : Real

		[Refer]
		HasProblem : Problem* Association
	}

	@AutoCRUD Entity Review {
		Id : Integer
		Content : String
		PlanId : Integer
	}

	Entity Meeting {
		Id : Integer
		Time : Date
		Place : String

		[Refer]
		MeetingtoUser : User* Association
	}

	@AutoCRUD Entity Message {
		Id : Integer
		Content : String
		SenderId : Integer
	}

	Entity Problem {
		Id : Integer
		Content : String
		Solution : String
		Status : Integer
		CreatorId : Integer
		TaskId : Integer
	}

}
```

### 效果图

![image-20211031105754711](README.assets/image-20211031105754711.png)
