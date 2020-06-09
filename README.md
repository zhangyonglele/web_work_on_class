# Project
该工程用于Web工程作业。

![project ICON](icon.png)

该仓库为该服务的后端部分，前端部分请访问：

https://github.com/kokola99/vue_web

## 内容列表
- [Background](#Background)

- [deploy](#项目部署)
 
# Background
该项目用于解决项目小组内部合作的部分问题，比如说项目任务发布，项目进度时间线监控，项目公告和周报等问题的小型轻解决方案。

用户通过创建项目小组，将项目成员添加入小组内，组长可以发布通过发布任务，查看周报月报，制定项目计划。

用户加入小组后，通过承接任务和提交周报的方式，向组长汇报项目进度，提高项目管理效率和推进速度。

项目场景适用于小型团队中的任务管理和进度管理，方便快捷。

所看重的效益专注于团队管理效率提升和快捷的任务汇报通道，减少组会的的时间与频次

# 项目建议书
## 一、项目概述
	 项目名称：项目管理助手
	 项目组长：张永乐
	 项目成员：孙黄青、姜展鹏、陈韵如、刘震、王梓廷
## 二、所属领域
	 web网站
## 三、项目背景
当今社会，小组合作项目渗透到了每个人的工作和学习中，项目对企业和对个人都有着重大意义。而项目管理就是把各种资源应用于目标，以实现项目的目标，满足各方面既定的需求。好的项目管理能帮助企业的项目科学、高效地执行。提高企业的资源利用效率，对企业的发展有着巨大的作用。目前国内企业对项目管理水平和方法越来越重视，如果一个公司收益的主要来源是项目，那么这个公司就需要建立专门的项目管理流程。可以通过对单个项目的成功管理，实现公司的整体目标。
## 四、项目必要性
工欲善其事必先利其器，一款好的项目管理软件对项目管理起到了重大作用。在项目推进过程中，我们常常会遇到这样的场景：一场项目小组会议下来，项目组长仅仅口头发布了一下任务，大家并不明确每个人的任务各是什么，团队配合效率低，甚至出现“项目无人认领”的乌龙事件，导致整个项目的完成时间远远超出了预定期限。为了避免此类现象的发生，我们决定做一款项目管理软件，旨在帮助管理者把控整个环节，优化项目流程，还可以帮助项目成员明确分工、互相督促，确保项目的有效推进。
五、项目功能概述
该项目用于解决项目小组内部合作的部分问题，比如说项目任务发布，项目进度时间线监控，项目公告和周报等问题的小型轻解决方案。
用户在登录/注册后，可以看到自己正在进行中或是已完成的所有项目，可以自行创建或是加入项目小组。
当用户以项目组长的身份创建项目小组之后，可以自行邀请其他人加入小组。组长可以向组员发布任务，并设置任务的截止时间，每一个任务包含“已发布”、“已接收”、“已完成”三种状态。在小组任务板块，项目组长可以清晰地看到每个任务处于何种状态、离任务截至时间还有多久。这使得项目组长对于项目的进度以及人员分工有了较好的把控，帮助其制定项目计划。在此基础上，组长还可以创建项目进度表，可以让组员看到此项目的进度，未来大概还有哪些工作要做。项目组长可以发起小组内投票，来帮助自己做出一系列决策。
当用户以小组成员的身份加入小组后，他们可以在小组任务板块接收自己的任务，在“我的项目”板块中，可以清楚地看到自己所有任务的状态，小组成员可以在这个板块中接收任务、提交已完成任务。小组成员通过承接任务和提交周报的方式，向组长汇报项目进度，提高项目管理效率和推进速度。
除此之外，小组成员之间可以互相查看周报月报，对别人的任务完成情况进行打分，以此达到互相督促、共同进步的目的。


# 项目部署
将项目克隆至本地，在 Java11 的环境下编译打包。

在服务器中运行后台指令。进行项目部署。

环境需求：
1. Redis
2. MySQL 5.7
3. Nginx
4. JDK11

```bash
nohup java -jar <project file> <spring config> > <log name> 2>&1 &
```