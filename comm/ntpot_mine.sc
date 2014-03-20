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
/al ffy {recall back;do w,n,e,e,e,n}
/al fyz {recall back}
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
/al gofull {do w,d,sleep sleepbag} 
/var jingqi 100
/ac {^【 精 气 】%s%1/%s%2%s(%3%)%s【 精 力 】}{/var jingqi %1;
    /if {%1<90}{sleep sleepbag;sleep}}
/al checkjingqi {/showme checkjingqi--}
/ac {^你一觉醒来，只觉精力充沛}{look;hpnt;de1 checkjingqi}
/ac {^你一觉醒来，只觉精力充沛}{look;stat;fyz;de1 {do w,n,w,ask nan xian about 状态恢复};de3 hpnt}
/ac {^玉龙珠宝店}{hpnt}
/ac {^checkjingqi--}{/if {$jingqi>100}{gowork}}
/ac {^你揉揉眼、打个哈欠，立刻躺倒在地上了}{gofull2}
/ac {^  教父(Priest)}{/var godie 0;de4 gofull;/delay {gowork}{hpnt}{8}}
/ac {^你身子虚弱到了极点，连站都站不稳了}{/var godie 0;wtick;/var peiyao 0;/var caxie 0;/var copy 0}
/al dfout {do su,sd,s,s,d,d,d,d,d,d,d,d;de1 {do d,d,d,d,d,d,d,d,d,d,d,ne}}
/ac {^一阵冷风吹散了你的阴魂}{/var godie 1;dfout;wtick}
/al asksoup {ask mengpo about soup}
/ac {^  【不如归去】 孟婆(Mengpo)}{/var godie 1;asksoup}
/ac {^你所受到的地域幽魂的效用消失了。}{walk 奈河桥;dash mist}
/ac {^忘川台}{do nw,s,dash mist}
/nop ac {^平安道}{s}
/ac {^  (鬼气) 【三世轮回】 玉蕊(Yurui)}{dash mist}
/ac {^你狠了狠心，一头闯进了迷雾之中}{wtick}
/al gowork {d;fyz;walk 打铁铺;wtick}
/al gowork {wtick;do w,recall back;/delay {1}{do w,s,e,e,s}}
/ac {^大隐阁}{gowork}
/al wtick {/ticker {work}{look}{8}}
/al wtick- {/unticker {work}}
/al askwork {ask tie jiang about job;}
/ac {^铁匠说道：%0(%1)}{cxt-;%1;}
/ac {^  铁匠铺老板 铁匠(Tie jiang)}{askwork}
/ac {^铁匠对你道：这是给你的工钱。}{hpnt;de2 {/if {$peiyao==0}{askwork}{do n,n}}}
/ac {^铁匠说道：让您老干这个未免屈尊了吧？}{do n,n;hp;save}
/ac {^平一指说道：就这点经验，连一百五都没有}{do s,s}
/al askpeiyao {ask ping about job}
/ac {^  炼药师协会会长「杀人神医」平一指(Ping yizhi)}{askpeiyao}
/ac {^平一指说道：%0(%1)}{%1}
/ac {^平一指说道：让你干的活你干完了么？}{peiyao}
/ac {^平一指看了你配的药}{hpnt;de1 {askpeiyao}}
/var fish 0
/var peiyao 0
/var copy 0
/var caxie 0
/var mine 0
/var godie 0
/ac {^【 平 和 】%1【 经 验 】%s%2}{
    /var ntexp %2;
    /showme myname=$myname ntexp=$ntexp godie =$godie jingqi =$jingqi hasdie =$hasdie;
    /if {$godie==0 && $jingqi >100 && $ntexp==1}{gowork};
    /if {$ntexp>10000}{/var peiyao 1};
    /if {$ntexp>100000}{/var mine 1};
    /if {$ntexp>500000}{
        /var godie 1; 
        /nop delay {6} {gotodie};
        /delay {12}{hpnt};
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
/nop gotodie;
}
/ac {^铁匠说道：你还是歇会儿吧}{gofull}
/ac {^平一指说道：让你干这活，也太屈就你了吧。}{walk 书院}
/al askcopy {ask zhu xi about job}
/ac {^  朱熹(Zhu xi)}{askcopy}
/ac {^朱熹说道：好，你就帮我抄书(%1)}{%1}
/ac {^朱熹说道：让你抄的书你抄完了？}{copy}
/ac {^朱熹说道：虽然我这里只是抄抄书}{gowork}
/ac {^通过这次锻炼，你获得了}{;}
/ac {^朱熹看了你抄写的书}{hpnt;de1 askcopy}
/ac {^朱熹说道：大侠你也来抄书？}{s;gomine}
/ac {^看来是拉杆(draw)拉晚了，白白的赔了一个鱼饵}{fish}
/ac {^汉水南岸}{fish}
/ac {^你的浮子猛然向下一窜}{draw diao gan}
/ac {^你的浮子忽左忽右摇摆个不停。}{draw diao gan}
/ac {^你钓到了一条鲫鱼}{drop jiyu}
/ac {^你身上没有鱼饵了。}{s;buyyuer}
/al buyyuer {fyz;w;s;e;s;buy 5000 yu er;de2 {do n,w,n,n,n,n,n,n,n,n;fish}}
/ac {^这里看不出有鱼的样子。}{buyyuer}
/ac {^你顺势一拉杆}{de1 fish}
/al fhz {do w,recall back,e,goto hangzhou}
/al askmine {ask jian gong about mine}
/al gomine {wtick;fhz;/delay {5}{walk 铜矿山};/delay {6} {askmine}}
/ac {^铜矿山}{askmine}
/ac {^监工说道：好，你下井去采(%1)}{/if {$godie==0}{%1}{w;}}
/ac {^监工看了你采上来的矿石}{askmine}
/ac {^你去管事的那里领到了工钱}{hpnt;}
