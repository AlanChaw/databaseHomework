#expertWeb接口文档
###1.用户模块
####1.1专家注册
url:/user/regist  
方法：post  
参数：  
1.user_name  
2.passwd  
返回值：  
>{  
>	"code":    //0.输入非法  1.成功执行  2.用户名已存在  
>}

####1.2用户登录
url:/user/login  
方法：post  
参数：  
1.kind	  //用户角色选择  
1.user_name  
2.passwd  
返回值:  
>{  
>	"code":	//0.输入非法  1.成功登陆  
>}

####1.3修改密码
url:/user/changepasswd  
方法：post  
参数：  
1.user_name  
2.passwd  
3.new_passwd  
返回值：  
>{  
>	"code":    //0.输入非法  1.成功执行  
>}


###2.专家模块
####2.1编辑并保存信息（此时专家状态为填写中）
url:/expert/saveInfo  
方法：post  
参数：  
1. Integer expert_id;  //证书编号  
3. String certificate_date;    //证书有效时间  
4. String expert_name;  
5. Integer sex;  
6. String born_date;  
7. String politics_status;  
8. String issue_unit;  //颁发机构  
9. Integer education;  //最高学历  
10. String job_title;   //职称  
11. String job;   //职务  
12. Integer retired;    //是否退休  
13. Integer credentials_type;   //证件类型  
14. String credentials_id;  //证件编号  
15. Integer degree;   //最高学位  
16. String certificate_number;   //证书编号  
17. Integer work_date;   //从业时长  
18. Integer part_time_job;  //是否兼职  
19. String work_unit;   //工作单位  
20. String detail_address;   //详细地址  
21. String post_number;    //邮政编码   
22. String email;   //电子邮件  
23. Integer telephone;  
24. String graduate;    //毕业院校及专业  
25. Integer field;  //评审领域  
26. String speciality;  //业务专长  
27. String performance;   //工作业绩  
28. String others;   //其他说明  
返回值：
>{  
>	"code":	//0.输入非法   1.保存成功  
>}

####2.2增加资格证书
url:/expert/addqualification  
方法：post  
参数：  
1.Integer qualification_id;  
2.String name;  
返回值：  
>{  
>	"code":	//0.输入非法	1.保存成功  
>}  

####2.3增加评审经历
url:/expert/addreview  
方法：post  
参数：  
1.String review_date;  
2.String review_name; //任务名称  
3.String desc;    //任务描述  
4.Integer review_type;    //任务类型  
返回值：
>{  
>	"code":	//0.输入非法	1.保存成功  
>}  

####2.4增加工作经历
url:/expert/addwork  
方法：post  
参数：  
1.String start_time;  
2.String end_time;  
3.String work_unit;   //工作单位  
4.String job; //职务  
5.String reference;   //证明人  
返回值：
>{  
>	"code":	//0.输入非法	1.保存成功  
>}  

####2.5增加回避单位
url:/expert/addavoid  
方法：post  
参数：  
1.String unit_name;  
2.Integer is_working; //是否工作单位  
返回值：
>{  
>	"code":	//0.输入非法	1.保存成功  
>}  

####2.6将保存的信息提交给管理员审核（这时后台会把专家状态改为审核中）
url:/expert/submit  
方法：post  
参数：  
无  
返回值：  
>{  
>	"code":	//0.输入非法	1.提交成功  
>}  
    
###3.管理员模块
####3.1查看当前待审核专家数量
url:/admin/waitchecknum  
方法：post  
参数：  
无  
返回值：  
>{   
>	"num":	   //待审核专家数量  
>}  

####3.2根据评审领域和状态获取符合条件的专家摘要信息
url:/admin/expertsWithDomainAndState  
方法：post  
参数：  
1.Integer field   //评审领域  
2.Integer state   //评审状态  
返回值：  
>{  
>	"expert_id"	//专家编号  
>	"name"		//专家名  
>	"unit"		//工作单位  
>	"telephone"	//联系电话  
>	"rukutype"	//入库类型？？ 什么鬼  
>	"state"	//状态  
>}  

####3.3根据专家编号获取专家详细信息
url:/admin/expertDetail 
方法：post  
参数：  
1.Integer expert_id	//专家编号  
返回值：  
略  

####3.4对专家信息进行审核
url:/admin/checkExpert  
方法：post  
参数：  
1.Integer expert_id  
2.Integer operation	  //进行的操作：1同意申请 2驳回申请 3终止资格  
返回值：  
>{  
>	"code"		//0.操作失败   1.操作成功  
>}  	