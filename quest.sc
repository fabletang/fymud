/var npc 大胖子
/var npc_name
/var en_qb 0
/nop {$npc(%1)}{say %1;@lowerLetter{};/var npc_name $result;say e $npc_name;say %1;say $result}
/ac {^任务被你完成}{q_item_buy-;quest}
/ac {^天机老人说道：请找回『%0』}{/var en_qb 1; /var is_buy 1;/var q_item %0;/var q_item_name 0;}
/unac {^你现在的任务是杀『%0』。}{/line log quest-fy4.log}
/ac {^你现在的任务是%0寻『%1』}{/var en_qb 1; /var q_item %1}
/al qticker {/ticker {q}{quest}{120};}
/al unqticker {/unticker {q}}
/al qb {
        /var q_item_name 0;
        /var q_item 0;
        xixi;
        quest;
        xixi;
        de1 {/showme buyitemfromling}
}
/ac {^buyitemfromling}{
    /if {$en_qb==1}{
        wlk;
        fyxl;
        list;
        de6 {buyitem};
        de7 {xlfy;nwlk};
        de8 {gg $q_item_name;q_item_buy-; /var q_item 0; /var q_item_name 0; /var en_qb 0}
        }
}

/ac {^│%1　『%2』(%3) }{/if {"$q_item"=="%2"}{/var q_item_name %3}}
/al buyitem {/grep $q_item;/echo $q_item;/echo $q_item_name;bxl $q_item; qput $q_item_name;qput $q_item}
/al askshuizhi {ask lu yu about 水质}
/ac {^│ %0 『%1』(%2)}{/if {"$q_item"=="%1"}{buy $q_item from xiangling;/var q_item_name %2;buy $q_item_name from xiangling;cun $q_item_name}}
/nop 买药熬鱼汤
/al buyyao {
buy freshfish from fishseller;
n;nw;w;
buy codonopsis from waiter;
buy astragalt from waiter;
buy pilosulae from waiter;
buy dioscoreae from waiter;
buy lycii from waiter;
w;cook
}
/al wdnt {fy2wdz; /delay {2}{/4 s;e;ask farmer about 难题}}
/al bycs {wlk;do d,n,n,e,n,ask youngman about 差事,s,w,s,s,u,quest;nwlk}
/ac {^你现在的任务是: 去武当老农处解决难题}{}
/ac {^你向老农打听有关『难题』}{
    gototh;
}
/al gototh {w;/4 n;/3 e;}
/al jqnt {wlk;d;/5 s;e;ask zhong liuxiu about 招人;/delay {1}{w;/5 n;u;nwlk}}
/ac {^金衣卫首领一见到你}{ki sentry}
/ac {^ 行尸}{ki prisoner}
/al anzhenzhu {answer 有花堪折直需折，莫待无花空折枝}
/nop riddle
/al askhongxue {ask hongxue about cuinong}
/al askcuinong {ask cuinong about 傅红雪}
/al anhongxue {answer 他若因我而死了，我也不会活下去。}
/al ancuinong {answer 将过去的事情忘记！}
/nop 哈哈儿
/al askhahaer {
    ask haha er about 帮忙;
    answer a;gb bird tongue;e;give bird tongue to chef;w;give entry to haha er;
    /delay {1}{
        ask haha er about 帮忙;
    answer b;gb pork;e;give pork to chef;w;give entry to haha er;
    };
    /delay {2}{
        ask haha er about 帮忙;
    answer a;gb bear palm;e;give bear palm to chef;w;give entry to haha er;
    }
}
/al askmenghuan {
    ask meng huan about 经书被盗;
    ask meng huan about 见方丈;
    ask meng huan about 守经楼;
    learn literate from meng huan with 1
}
/al askmasteryuan {
    ask master yuan about 见方丈;
    answer 重要事;
    answer 经书被盗
}
/al askmasterhu {
    ask master about 经书被盗;
    /delay {2}{ask master about 守经楼};
    /delay {4}{answer 不怕}
}
/al buyscroll {d;/2 n;/2 w;u;buy scroll from xu;give xu scroll;/delay {0.5}{d;/2 e;/2 s;u;l scroll}}
/al returnscroll {d;/2 n;/2 w;u;give xu scroll;/delay {0.5}{d;/2 e;/2 s;u;l scroll}}
/nop get leaf for dqg
/al askmonk {fy2qf;/delay {4}{/2 e;/2 eu;nu;w;ask monk about meat};}
/al askshuilingguang {s;push jade;e;ask shui lingguang about 铁中棠;push jade;w;n}
/ac {^天机老人说：嗯，最近没有什么事给你，聊聊天}{/delay {180}{asktianji}}
/al asktianji {ask tian ji about 汇报;quest}
/al bossjinchuan+ {
    /ac {^你只觉眼前五彩斑斓}{e;e;/ticker {east}{e;/delay {0.2}{e}}{0.5}};
    /ac {^※你只觉眼前五彩斑斓}{stopk;e;e;/ticker {east}{e;/delay {0.2}{e}}{0.5}};
    /ac {^民居}{/2 w;cks;bossjinchuan-}
}
/al bossjinchuan- {
    /unticker {east};
    /unac {^你只觉眼前五彩斑斓};
    /unac {^※你只觉眼前五彩斑斓};
    /unac {^民居}
}
/ac {^  大骗「金玉湖」金川}{bossjinchuan+}
/ac {幽幽的琴声时断时续}{
    listen;
    /delay {0.5}{maonv2hua};
    /delay {1.5}{ask qing qing about 弯刀}
    }
/ac {一阵悠悠的琴声不知从何处传来}{listen}
/ac {琴声戛然而止}{/delay {1}{apprentice hua zhenzhen}}
/ac {^满了各式各样的藤萝}{unwi all; wi jade; chop vine; make tengluo}
/ac {^你掏出一条藤萝绳}{climb down;
    /delay {6}{get all from 树冠; climb up};
    /delay {12}{give jian zi to girl}
    }
/ac {^见底。拨开路旁一块石碑的泥垢，隐约可以看到其上写着“沥泉}{get wineskin from bag;fill wineskin; drink wineskin}
/ac {^南瓜精摇摇晃晃地滚了}{kill pumpkin gnome}
/ac {南瓜精(Pumpkin gnome)}{kill pumpkin gnome}
/ac {^你现在可以向郭大妈回报结果(end)}{ask guo dama about end}
/al qst+ {/ticker {quest}{quest;qb}{60}}
/al qst- {/unticker {quest}}
/ac {^一个惊雷陡而炸响，瞭望台中}{kill soldier 3;kill soldier 2;kill soldier}
/ac {^忽然间跳出一群劫匪}{kill gangster 3;kill gangster 2;kill gangster;kill shanxi laoda}
/ac {^醉醺醺的宾客打了个酒嗝}{kill drunk guest}
/ac {^蓝袍公自言自语道：没想到}{kill oldguy}
/ac {^不动和尚舔舔嘴唇，笑道：这}{kill drunk monk}
/ac {^无知小儿们前推后拥地冲了过来}{kill kid; kill kid 2;kill kid 3; kill kid 4;kill kid 5;kill kid 6;kill kid 7}
/ac {^一声清幽响亮的鸽哨自远方传来，你想起与平七的约定}{ask ping qi about 任务结束}
/unac {^天机老人说：听闻最近有神秘组织频繁活动，你不妨去找城隍庙的和尚}{wlk;d;e;s;ask chuili seng about 神秘组织;n;w;u;nwlk}
/al maze {wlk;d;e;s;ask chuili seng about 神秘组织;n;w;u;nwlk}
/ac {^天机老人悄悄地对你说：山水阁钟旒秀正在『招人』}{jqnt}
/ac {^恭喜：你开始了一个新谜题：韶光虚掷}{eu;/delay {2}{ed}; /delay {4}{su}}
/ac {^一道人影突自}{qie}
/nop ac {^看起来四戒僧想杀死你}{qie;bs;/delay {4}{qie;bs}}
/nop al qie {stopk;unwi whip;perform panguaxe;wi whip}
/al bk {stopk;wi whip;perform firestorm}
/al bs {stopk;wi whip;perform thousandfeather}
/al ale {conjure summon4;conjure summon3;conjure summon2;conjure summon1;}
/ac {^灰黑色的烟雾骤然在你眼前爆开}{ale}
/al qdm {exert powerup;exert damageup}
/ac {^今田魅知子突然绕到你身后}{hp}
/ac {^今田魅知子突然绕到梦魇护驾身后}{hp}
/ac {^结果只听见「砰」地一声巨响，你像一捆稻草}{exert qi 2000;de2 {exert qi 2000};de3 {exert qi 2000}}
/ac {^你获得了一个大馒头}{/unticker {kill};de4 {nd;ed;eu;ed;eu;ed;eu;open door;nu};de10 {1;use demon drug};de12 {qeatall}}
/al qeatall {eat mantou;/delay {4}{drink flask}; /delay {8}{use demon drug;hp}}
/al xq {exert qi %0}
/nop ac {你已经陷入半昏迷状态}{eat pill;hp}{3}
/nop ac {你看起来已经力不从心了，身上受伤不轻}{exert qi 1000;hp}{3}
/nop ac {你似乎十分疲惫}{exert qi 800;hp}{3}
/ac {^众弟子向你躬身一礼，亦四散离去}{qpowerup}{3}
/al qpowerup {exert powerup;/delay {4}{exert damageup}}
/nop al q {exert qi 1000}
/al ii {eat pill;exert qi 2000;hp}
/ac {^看起来梅花盗想杀死你}{ki meihuadao}
/al giveqiuyin {
qiuyin+;
/6 push stone;
/delay {3}{get all};
/delay {4}{ww 5};
/delay {5}{ww 3;/3 sw;};
/delay {6}{l southeast;/delay {1}{se;l east};/delay {2}{e;l northeast};/delay {3}{ne;};/delay {5}{north}};;
}
/al qiuyin+ {
/ac {^你脚下的荷叶微微一滑}{u;l southeast;/delay {1}{se;l east};/delay {2}{e;l northeast};/delay {3}{ne};/delay {5}{north}};
/ac {^  天下第一神偷}{
n;
/delay {1}{/4 {give qiu yin to sikong}};
/delay {3}{/4 {give qiu yin to sikong}};
/delay {5}{/4 {give qiu yin to sikong}};
/ac {^你脚下的荷叶微微一滑}{u};
/ac {^大明湖}{fill skin;qiuyin-;/3 ne;/delay {1}{ee 4};/delay {2}{ee 4;cks;}};
/delay {7}{s;sw;w;nw};
}
}
/al qiuyin- {
/unac {^你脚下的荷叶微微一滑};
/unac {^  天下第一神偷};
/unac {^大明湖}
}
/al tqiuyin {
/ac {^司空摘星拍了拍你的头，哈哈笑道：不错不错}{unwi all;learn monkey-claw from sikong with 1;/unticker {qiuyin};/unac {^司空摘星拍了拍你的头，哈哈笑道：不错不错}};
/ticker {qiuyin}{giveqiuyin}{120}}
/ac {^卡卡木说道：我受伤了}{give 1 baiyao to kaka mu;de3 {fi kaka mu}}
/al askwurong {ask wurong about 国色天香;answer 不丑}
/ac {^吕南人说道：我受伤了，这样打不公平吧}{give 1 baiyao to nanren;de3 {fi nanren}}
/ac {^勾魂使者对你说道：想过我这一关？}{accept test;tell ghost no face}
/al xintask {cancel;de1 {newtask}}
/al askxiaoyuer {ask xiao yuer about cancel;de2 {ask xiao yuer about help}}
/nop 小鱼儿说道：你可以用locate faked meijian来定位
/ac {^小鱼儿说道：你可以用locate %0来}{/al ll locate %0;/al fll {follow %0};/al kll {ki %0}}
/ac {^卡卡木说道：废话少说}{startk}
/ac {^吕南人说道：让我看看你到底有几斤}{startk}
/al askqingbo {ask qingbo about 保护;de4 {ask qingbo about 袁姬;kill assassin;ki assassin;};de5 {ki assassin}}
/ac {^湖水忽然一阵荡漾，嗖嗖地跳出个黑影}{kill assassin;ki assassin;/showme todo}
/al askzhang {
    ask zhang about 飞鸽传信;
    de2 {ask zhang about 清波公子};
    de4 {ask zhang about 飞鸽传信};
    de6 {ask zhang about 飞鸽传信};
    de8 {ask dai yin about 商量};
    }
/al askmedman {
    ask medman about 麻沸散;
    de2 {answer 戴寅};
}
/al givemedman {
    give snake pearl to medman;
    give lawan to medman;
    give hair to medman;
}
/al asklang {
  remove all;
  wear botao;
  ask tianpeng lang about 蜡丸; 
  de2 {ask tianpeng lang about 蜡丸}; 
  de4 {ask tianpeng lang about 蜡丸}; 
  de6 {ask tianpeng lang about 蜡丸}; 
  de8 {ask tianpeng lang about 蜡丸}; 
  de10 {ask tianpeng lang about 蜡丸}; 
  de12 {ask tianpeng lang about 蜡丸}; 
  de14 {ask tianpeng lang about 蜡丸}; 
}
/ac {^田膨郎转过身去}{get lawan}
/ac {^少林派和尚道：阿弥陀佛，请问这位施主是何派高足}{answer 清平;de2 {qeatall}}
/ac {^看起来梅津想杀死你}{de1 stopk;ale;de6 {bs}}
/al re {repair}
/al whlaopi {whisper laopi 小马;whisper laopi 朋友;de1 {do kill sun legate,out}}
/ac {^你听到老皮滚入湖水前说的最后两句话}{charge center;get grass;give grass to xiao lin}
/al askxiaonv {
ask xiaonu about here;
de2 {ask xiaonu about xiao};
de4 {ask xiaonu about 孝女花};
de6 {ask xiaonu about 六种花};
de8 {ask xiaonu about 神石}
}
/al buystone {
list;
de1 {buy ikebana stone from fang;arrange;ki fang}
}
/al askqiandao {recall back;w;n;w; ask qiandao npc about 签到;de1 {e;e;e;e;n;hp;save}}
/al qf {quest fail}
/ac {^天机老人说道：请到少林寺替天机老人杀了}{stat}
/ac {^你现在的任务是: 到少林寺去杀}{stat}
/al askxy askxiaoyuer
/al kb {ki bandit}
