/config speedwalk off
/nop 设定回车只动输入上次的命令。
/config {MCCP}     {off}
/config {repeat enter} on
/config {ECHO COMMAND} on
/config {SCROLL LOCK} on
/config {CONNECT RETRY} 30
/config {DEBUG TELNET} off
/config {CONVERT META} off
/split 0 1
/ac {^【闲聊】天机老人(Tian ji)：风起云涌}{save;look;de2 hpnt}
/ac {^天机阁}{d}
/al ffy {recall back}
/al fyz {ffy;do w,s,s,goto yangzhou}
/al fys {walk 风云南城门}
/al fyn {walk 风云北城门}
/al fye {walk 风云东城门}
/al fyw {walk 风云西城门}
/al de1 {/delay {1}{%1}}
/al de2 {/delay {2}{%1}}
/al de3 {/delay {3}{%1}}
/al de4 {/delay {4}{%1}}
/al de5 {/delay {5}{%1}}
/al de6 {/delay {6}{%1}}
/al de7 {/delay {7}{%1}}
/al de8 {/delay {8}{%1}}
/al de9 {/delay {9}{%1}}
/al gotodie {cxt-;set wimpy 0;ffy;de1 {do d,w,w,w,w,s,s,kill huang mazi};}
/al gofull2 {do w,d,recall back;de1 {do w,s,e,s,buy sleepbag,sleep sleepbag}} 
/al gofull2 {do w,d,recall back;de1 {do w,s,e,s,buy sleepbag};de5 {sleep sleepbag}} 
/al gofull {do w,d,sleep sleepbag,sleep} 
/var jingqi 100
/ac {^【 精 气 】%s%1/%s%2%s(%3%)%s【 精 力 】}{/var jingqi %1;
    /if {%1<90}{sleep sleepbag;sleep}}
/al checkjingqi {/showme checkjingqi--}
/ac {^你一觉醒来，只觉精力充沛}{look;hpnt;de1 checkjingqi}
/ac {^你一觉醒来，只觉精力充沛}{look;stat;fyz;
        de1 {do w,n,w,ask nan xian about 状态恢复};
        de4 {e;hpnt};
/var peiyao 0;/var work 0;/var caxie 0;/var copy 0;
        }
/ac {^你一觉醒来，只觉精力充沛}{l;stat;
        }
/ac {^玉龙珠宝店}{hpnt}
/ac {^checkjingqi--}{hpnt;}
/ac {^你揉揉眼、打个哈欠，立刻躺倒在地上了}{gofull2}
/ac {^你所受到的还魂·虚弱不堪的效用消失了。}{sleep}
/var godie 0
/var hasdie 0
/ac {^等你还了阳再说吧}{/var hasdie 1}
/ac {^阎罗殿}{/var hasdie 1}
/ac {^  教父(Priest)}{/var hasdie 0;de4 {gofull};/delay {gowork}{hpnt}{8}}
/ac {^你身子虚弱到了极点，连站都站不稳了}{/var hasdie 0;wtick;/var peiyao 0;/var work 0;/var caxie 0;/var copy 0}
/al dfout {do su,sd,s,s,d,d,d,d,d,d,d,d;de1 {do d,d,d,d,d,d,d,d,d,d,d,ne}}
/ac {^一阵冷风吹散了你的阴魂}{/var hasdie 1;dfout;wtick}
/al asksoup {ask mengpo about soup}
/ac {^  【不如归去】 孟婆(Mengpo)}{asksoup}
/ac {^你所受到的地域幽魂的效用}{walk 奈河桥;de1 {dash mist}}
/ac {^忘川台}{/var hasdie 1;do nw,s,dash mist}
/nop ac {^平安道}{s}
/ac {^  (鬼气) 【三世轮回】 玉蕊(Yurui)}{/var hasdie 1;dash mist}
/ac {^你狠了狠心，一头闯进了迷雾之中}{/var peiyao 0;/var work 0;/var caxie 0;/var copy 0;wtick}
/var work 0
/al gowork {/if {$work==0 && $atwork==0}{d;fyz;/delay {8}{walk 打铁铺;wtick}}}
/al gopeiyao {/if {$peiyao==0 && $atpeiyao==0}{d;fyz;/delay {8}{walk 药铺;wtick}}}
/al gocopy {/if {$copy==0 && $atcopy==0}{d;fyz;/delay {8}{walk 书院;wtick}}}
/ac {^大隐阁}{hpnt}
/al wtick {/ticker {work}{look}{8}}
/al wtick- {/unticker {work}}
/al askwork {ask tie jiang about job;}
/ac {^铁匠说道：%0(%1)}{cxt-;%1;}
/var atwork 0
/ac {^  铁匠铺老板 铁匠(Tie jiang)}{/var atwork 1;askwork}
/nop ac {^铁匠对你道：这是给你的工钱。}{hpnt;de2 {/if {$peiyao==0}{askwork}{do n,n}}}
/ac {^铁匠对你道：这是给你的工钱。}{/var work 1;hpnt}
/ac {^铁匠对你道：这是给你的工钱。}{/var work 1;de2 {do n,n}}
/ac {^铁匠说道：让您老干这个未免屈尊了吧？}{/var peiyao 1;hp;save;gopeiyao}
/ac {^平一指说道：就这点经验，连一百五都没有}{/var work 1;/var peiyao 0;do s,s}
/al askpeiyao {ask ping about job}
/var atpeiyao 0
/ac {^  炼药师协会会长「杀人神医」平一指(Ping yizhi)}{/var atpeiyao 1;askpeiyao}
/ac {^平一指说道：%0(%1)}{/var peiyao 1;%1}
/ac {^平一指说道：让你干的活你干完了么？}{peiyao}
/ac {^平一指看了你配的药}{hpnt;de1 {askpeiyao}}
/ac {^平一指说道：你还是先歇歇吧，万一累出人命}{sleep}
/var fish 0
/var peiyao 0
/var copy 0
/var caxie 0
/ac {^【 平 和 】%1【 经 验 】%s%2}{
    /var ntexp %2;
    /showme myname =$myname ntexp=$ntexp godie =$godie jingqi =$jingqi hasdie =$hasdie;
    /if {$ntexp>5100000 && $fish==0}{
        /nop unticker {cx};
       wtick;
        /delay {6} {l;};
       /nop delay {12}{hpnt};
      /nop cxt-;
    };
    /if {$hasdie==0 && $jingqi >100 && $ntexp<5000}{
     gowork;
    };
    /if {$ntexp >=5000 && $ntexp<50000}{
     gopeiyao;
    /var work 1;
    };
    /if {$ntexp >=50000 && $ntexp<100000}{
    /var peiyao 1;
     gocopy;
    };
    /if {$ntexp >=100000 && $ntexp<500000}{

    };
    }
/ac {^startfish}{
/5 {drop shoeshine};
 wtick;
    cxt-;
    /var fish 1;
    /delay {281}{d;fyz;do w,s,e,s,buy diao gan,buy 5000 yu er;};
    /delay {283}{buyyuer};
}
/ac {^startfish}{
gotodie
}
/ac {^铁匠说道：你还是歇会儿吧}{sleep}
/ac {^朱熹说道：我看你脸色不行啊}{sleep}
/ac {^平一指说道：让你干这活，也太屈就你了吧。}{/var peiyao 1;walk 书院}
/al askcopy {ask zhu xi about job}
/var atcopy 0
/ac {^  朱熹(Zhu xi)}{/var atcopy 1;askcopy}
/ac {^朱熹说道：好，你就帮我抄书(%1)}{%1}
/ac {^朱熹说道：让你抄的书你抄完了？}{copy}
/ac {^朱熹说道：虽然我这里只是抄抄书}{/var copy 0;/var peiyao 0;gopeiyao}
/ac {^通过这次锻炼，你获得了}{;}
/ac {^朱熹看了你抄写的书}{/var copy 1;hpnt;de1 askcopy}
/ac {^朱熹说道：大侠你也来抄书？}{/var copy 1;/unticker work;walk 杂货铺;de1 {buy brush};de2 {cxt}}
/var shoeshines 0
/var cani 1
/al cunsilver {walk 钱庄;de2 {do cun 1 gold,cun 25 silver,cun 10 silver,cun 5 silver}}
/ac {^你身上带著下列这些东西(负重 %1%, 携带量 %2/%3 )：}{/math cani {%3-%2}}
/al buyxieyou {fyz;/delay {8}{do w,w,s,e,s,buy 9 shoeshine,drop shoeshine 9;de2 {do buy brush,drop brush 2}}}
/al buyxieyou {fyz;/delay {6}{do w,w,s,e,s,buy 6 shoeshine,drop shoeshine 8,give richman silver;};/delay {7}{cunsilver}}
/ac {^你从杨永福那里买下了一支鞋油。}{}
/al yzn {walk 北门}
/al yzs {walk 南门}
/al yze {walk 东门}
/al yzw {fyz;walk 西门}
/al yzw {walk 西门}
/al cxyzn {
    caxie wu;
    de4 {caxie bing 1};
    de8 {caxie bing 2};
    /delay {12}{do s,caxie meipo};
    /delay {16}{do s,caxie ouyang};
    /delay {20}{do s,caxie li apo};
    /delay {24}{do n,n};
}
/al cxyzs {
    caxie wu;
    de4 {caxie bing 1};
    de8 {caxie bing 2};
    /delay {12}{do n,n,caxie liu};
    /delay {16}{caxie liu 2};
    /delay {20}{caxie liu 3};
    /delay {24}{caxie liu 5};
}
/al cxyze {
    caxie wu;
    de4 {caxie bing 1};
    de6 {caxie bing 2};
    /delay {10}{do e,caxie tiao fu 1};
    /delay {14}{caxie tiao fu 2};
    /delay {18}{caxie tiao fu 3};
    /delay {22}{do e,caxie hai};
    /delay {26}{caxie xiao};
}
/al cxyzw {
    caxie wu;
    de4 {caxie bing 1};
    de8 {caxie bing 2};
    /delay {12}{do w,caxie boy};
    /delay {16}{caxie boy 2};
    /delay {20}{caxie boy 3};
}
/al cxfy {
    caxie garrison;
    /delay {4}{caxie garrison 2};
    /delay {8}{caxie garrison 3};
    /delay {12}{caxie garrison 4};
}
/al cxfy4sw {
    /delay {1}{walk 倾城胭脂店};
    /delay {2}{caxie man 1};
    /delay {5}{caxie man 2};
    /delay {8}{caxie girl 1};
    /delay {11}{caxie girl 2};
    /delay {14}{caxie fang er};
    /delay {17}{/showme cxfy4sw--finish};
}
/al cxfy2nwn {
    /delay {1}{walk 贡院;};
    /delay {2}{caxie kaoguan};
    /delay {5}{caxie student 1};
    /delay {8}{caxie student 2};
    /delay {11}{caxie student 3};
    /delay {14}{/showme cxfy2nwn--finish};
}
/al cxfyw {
    walk 风云天下;
    /delay {1}{do w,w,caxie song};
    /delay {4}{do w,caxie fatman};
    /delay {7}{do w,s,caxie xia zi};
    /delay {10}{caxie da niu};
    /delay {13}{do s,caxie huang mazi};
    /delay {16}{do w,caxie fang};
    /delay {19}{caxie leng};
    /delay {22}{/showme cxfyw--finish};
}
/al cxfybj {
    /delay {1}{walk 金狮镖局大厅};
    /delay {2}{caxie meng};
    /delay {6}{do e,n,caxie biaotou};
    /delay {9}{caxie tangzi};
    /delay {12}{caxie tangzi 2};
    /delay {15}{do s,s,caxie biaotou};
    /delay {18}{caxie tangzi};
    /delay {21}{caxie tangzi 2};
    /delay {24}{do n,e,caxie biaotou};
    /delay {27}{caxie tangzi};
    /delay {30}{caxie tangzi 2};
    /delay {33}{do w,w,w,caxie tangzi};
    /delay {37}{caxie biao shi};
    /delay {40}{nw;caxie huoji};
    /delay {43}{caxie jumper};
    /delay {46}{caxie jumper 2};
    /delay {49}{/showme cxfybj--finish};
}
/al cxfyall {ffy;
    de1 fyw;
    de2 {cxfy}; 
    /delay {19}{fye};
    /delay {20}{cxfy};
    /delay {37}{fys};
    /delay {38}{cxfy};
    /delay {55}{fyn};
    /delay {56}{cxfy};
    /nop delay {73}{drop coin;ffy};
    /delay {73}{ffy};
    /delay {74}{cxfy4sw};
    /delay {95}{cxfy2nwn};
    /delay {110}{cxfyw};
    /delay {132}{cxfybj};
    /delay {185}{hpnt;};
}
/nop s n 28 e 30 w 24
/al cxyzall {
    yzw;
    /delay {2}{cxyzw};
    /delay {27}{yze};
    /delay {28}{cxyze};
    /delay {59}{yzn};
    /delay {60}{cxyzn};
    /delay {89}{yzs};
    /delay {90}{cxyzs};
    /delay {119}{/showme cxyzall--finish}
}
/al cx+ {
/showme --cx+;
   /ac {^%1%s= %2 %3,bing}{/showme ====%3====;caxie %3;};
   /ac {^%1%s= %2 %3,%4,%5}{/showme ----sdfdsfsdf}
}
/al cx- {
/unac {^  武将(Wu jiang)(LV7)};
}
/nop 115 168
/al cx {buyxieyou;/delay {12}{cxyzall};/delay {134}{cxfyall}}
/nop al cxt {cx;/ticker {cx}{cx}{311}}
/al cxt {cx;/ticker {cx}{cx}{321}}
/al cxt- {/unticker {cx}}
/ac {^看来是拉杆(draw)拉晚了，白白的赔了一个鱼饵}{fish}
/ac {^汉水南岸}{fish}
/ac {^你的浮子猛然向下一窜}{draw diao gan}
/ac {^你的浮子忽左忽右摇摆个不停。}{draw diao gan}
/ac {^你钓到了一条鲫鱼}{drop jiyu}
/ac {^你身上没有鱼饵了。}{s;buyyuer}
/al buyyuer {fyz;w;s;e;s;buy 5000 yu er;do n,w,n,n,n,n,n,n,n,n;fish}
/ac {^这里看不出有鱼的样子。}{buyyuer}
/ac {^你顺势一拉杆}{de1 fish}
/al fzz {ffy;do w,s,s,goto zhongzhou}
/al zzbuyxieyou {fzz;de4 {walk 杂货铺};de5 {do buy brush,drop brush 2};de8 {do buy 7 shoeshine,drop shoeshine 7,drop coin};}
/al zzbuyxieyou {fzz;/delay {6} {walk 杂货铺};de7 {do buy 6 shoeshine,drop shoeshine 8,give richman silver};/delay {8}{cunsilver};}
/al cxzz {zzbuyxieyou;/delay {22}{cxzzall}}
/al cxzzt {cxzz;/ticker {cx}{cxzz}{280}}
/al cxzzall {
    cxzzs;
    /delay {35}{cxzzw};
    /delay {72}{cxzzn};
    /delay {124}{cxzzxy};
    /delay {179}{cxzze};
    /delay {214}{cxzzdp};
    /delay {256}{hpnt;/showme ++cxzzall ok};
    }
/al cxzzs {
    walk 中州南门;
    /delay {1}{caxie wu};
    /delay {5}{caxie bing 1};
    /delay {9}{caxie bing 2};
    /delay {13}{caxie bing 3};
    /delay {17}{caxie bing 4};
    /delay {21}{caxie walker};
    /delay {26}{do n,n,caxie man};
    /delay {30}{caxie man 2};
    /delay {34}{/showme --cxzzs ok}
}
/al cxzzw {
    walk 西城楼;
    /delay {1}{caxie wu};
    /delay {5}{caxie bing 1};
    /delay {9}{caxie bing 2};
    /delay {13}{caxie bing 3};
    /delay {17}{caxie bing 4};
    /delay {21}{caxie walker};
    /delay {26}{do w,w,caxie bing};
    /delay {30}{caxie bing 2};
    /delay {36}{/showme --cxzzs ok}
}
/al cxzzn {
    walk 中州北门;
    /delay {1}{caxie wu};
    /delay {5}{caxie bing 1};
    /delay {9}{caxie bing 2};
    /delay {13}{caxie bing 3};
    /delay {17}{caxie bing 4};
    /delay {21}{caxie walker};
    /delay {25}{do s,s,caxie woman};
    /delay {30}{caxie man};
    /delay {34}{do w,caxie ya yi};
    /delay {38}{caxie ya yi 2};
    /delay {42}{do e,e,caxie fan};
    /delay {47}{caxie tu};
    /delay {51}{/showme --cxzzs ok}
}
/al cxzzxy {
    walk 戏院;
    /delay {1}{caxie zhong 1};
    /delay {5}{caxie zhong 2};
    /delay {9}{caxie zhong 3};
    /delay {13}{do n,caxie kid};
    /delay {18}{caxie kid 2};
    /delay {22}{do s,s,caxie dan};
    /delay {27}{caxie xi zi};
    /delay {32}{walk 化妆间};
    /delay {33}{caxie dan 1};
    /delay {37}{caxie dan 2};
    /delay {41}{caxie dan 3};
    /delay {45}{do e,caxie zhong 1};
    /delay {50}{caxie zhong 2};
    /delay {54}{/showme --cxzzxy ok};
}
/al cxzze {
    walk 东门;
    /delay {1}{caxie wu};
    /delay {5}{caxie bing 1};
    /delay {9}{caxie bing 2};
    /delay {13}{caxie bing 3};
    /delay {17}{caxie bing 4};
    /delay {21}{do w,caxie gong};
    /delay {26}{caxie lao};
    /delay {30}{caxie lao 2};
    /delay {34}{/showme --cxzzs ok}
}
/al cxzzdp {
    walk 当铺;
    /delay {1}{caxie yi};
    /delay {5}{caxie zhou};
    /delay {10}{do n,w,caxie fu shang};
    /delay {15}{caxie han};
    /delay {20}{walk 内城东门};
    /delay {21}{caxie du cha};
    /delay {25}{caxie bing 1};
    /delay {29}{caxie bing 2};
    /delay {33}{caxie bing 3};
    /delay {37}{caxie bing 4};
    /delay {41}{/showme --cxzdp ok}
}
