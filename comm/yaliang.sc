/al gotogfdt {walk 郭府大厅}
/al gotoguo {recall back;e;goto xiangyang;de3 {gotogfdt}}
/al asksc {ask guo about 守城}
/ac {^郭靖略一沉吟，对你说道：现在蒙古靼子侵犯中原，这位%1去%2帮助宋军守城吧}{
/var chengmen %2;
walk %2;
}
/ac {^你正站在城墙上密切注视着城下蒙古兵的一举一动。}{l} 
/ac {^突然城下爬上来一个蒙古兵士}{ki menggu bingshi}
/ac {^突然城下爬上来一个蒙古将领}{ki menggu jiangling}
/ac {^突然城下爬上来一个蒙古高手}{ki menggu gaoshou}
/ac {城下又爬上来一个蒙古兵士}{ki menggu bingshi}
/ac {城下又爬上来一个蒙古将领}{ki menggu jiangling}
/ac {城下又爬上来一个蒙古高手}{ki menggu gaoshou}
/al gotofm {gotogfdt;de2 {ask guo about 复命}}
/ac {^一个守城宋兵跑过来说道：蒙古靼子暂时被击退了，你可以回去复命了！}{gotofm}
/ac {^裨将拱手说道：这位%1，你已经可以回去复命了。}{gotofm}
/ac {^郭靖对你说道：“%1辛苦了，去休息一下吧！”}{sk;/showme todo----;de8 asksc}
/ac {^一名宋兵跑过来对你说道：蒙古靼子又开始进攻了}{gotogfdt;de3 {asksc}}
/ac {^郭靖对着你摇了摇头说：疲惫之师不利作战}{sk;de8 asksc}
/ac {^郭靖说道：你杀了几个敌人啊，就从前线逃回来了}{de2 {walk $chengmen}}
/ac {^郭靖说道：%1不是已有守城任务了吗？}{de2 {walk $chengmen}}
