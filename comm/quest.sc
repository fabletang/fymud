/var npc 大胖子
/var npc_name
/var en_qb 0
/nop {$npc(%1)}{say %1;@lowerLetter{};/var npc_name $result;say e $npc_name;say %1;say $result}
/ac {任务被你完成}{quest}
/ac {^你的任务被}{quest}
/nop {^你现在的任务是杀『%0』。}{/line log quest-fy4.log}
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
        de2 {buyitem};
        de3 {xlfy;nwlk};
        de4 {gg $q_item_name;q_item_buy-; /var q_item 0; /var q_item_name 0; /var en_qb 0}
        }
}

/ac {^│%1　『%2』(%3) }{/if {"$q_item"=="%2"}{/var q_item_name %3}}
/al buyitem {/grep $q_item;/echo $q_item;/echo $q_item_name;pl {bxl $q_item; qput $q_item_name;qput $q_item};pr}
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
/al bycs {pl {wlk;d;n;n;e;n;ask youngman about 差事;s;w;s;s;u;quest;nwlk};pr}
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
/al bc2cuinong {wlk;/4 w;s;open door;s;enter;wlk}
/al cuinong2bc {wlk;out;n;open door;n;/4 e;wlk}
/al wlb2hongxue {n;nw;ne;n;n;nu;}
/al hongxue2wlb {sd;s;s;sw;se;s}
/al bangcuinong {fy2wlb;
                /delay {14} {unwi all;wlb2hongxue;askhongxue};
                /delay {15} {hongxue2wlb};
                /delay {16} {wlb2bc};
                /delay {26} {bc2cuinong;askcuinong};
                /delay {27} {cuinong2bc};
                /delay {28} {bc2wlb};
                /delay {38} {wlb2hongxue;anhongxue};
                /delay {39} {hongxue2wlb;};
                /delay {40} {wlb2bc};
                /delay {50} {bc2cuinong;ancuinong};
                /delay {51} {cuinong2bc};
                /delay {52} {bc2fy};
                }
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
/ac {^一阵悠悠的琴声不知从何处传来}{listen}
/ac {^幽远的琴声在夜色中如泣如诉}{nd;hs2hua}
/ac {^琴声戛然而止}{/delay {1}{apprentice hua zhenzhen}}
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
/al mazelost {wlk;do d,e,s,ask chuili seng about lost,n,w,u;nwlk}
/al mazefail {wlk;do d,e,s,ask chuili seng about fail,n,w,u;nwlk}
/al mazeto {wlk;/math coin {%0*10000};gm $coin;de5 {do d,e,s,give %0 gold to chuili seng,n,w,u;nwlk}}
/nop 139级以后你可以通过给我10～17两黄金接能增加经验前值的maze1任务，用entermaze1命令进入。给我50～57两黄金更可以获得双倍经验奖励。 
/al m1to {wlk;/math gold {50 + %1};qtg gold $gold;de3 {do d,e,s,give $gold gold to chuili seng,n,w,u;nwlk}} 
/al em {entermaze;de1 {maphere}}
/ac {^垂笠老僧不满地说：你是否仔细找过？再去找%d秒钟吧。}{/delay {%1}{mazelost}}
/ac {^天机老人悄悄地对你说：山水阁钟旒秀正在『招人』}{/showme jqnt}
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
/ac {^卡卡木说道：我一时大意}{stopk;nokill;cks;de4 {fi kaka mu}}
/ac {^卡卡木说道：我还没准备好}{stopk;nokill;cks;de4 {fi kaka mu}}
/ac {^卡卡木说道：我现在方知天外有天}{/showme ===fi kaka mu ok}
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
/al re {repair}
/al whlaopi {whisper laopi 小马;whisper laopi 朋友;de2 {kill sun legate;out;out}}
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
/al askqiandao {set ability 0;set pet 0;do d,recall back,w,n,w,ask qiandao npc about 签到;
                de1 {wwh};
                de2 {order ask qiandao npc about 签到};
                de12 {hpp;wwh};
                de13 {do e,e,e,e,n,n,e,hp,set ability 1;save}}
/al qf {quest fail}
/al qc {quest cancel}
/ac {^天机老人说道：请到少林寺替天机老人杀了}{stat}
/ac {^你现在的任务是: 到少林寺去杀}{stat}
/al askxy askxiaoyuer
/al kb {ki bandit;}
/al kb {ki bandit;de2 {do kill bandit 2,kill bandit 3,kill bandit 4,kill bandit 5,kill bandit leader}}
/al getbooks {do get book from corpse,store book,get book from corpse,store book,get book from corpse,store book,get book from corpse,store book}
/ac {^此人看来是这儿的首领}{
    getbooks;
    de2 getbooks;
    /delay {4}{
   /nop lc;
    /nop if {$is_kill==0}{;};
    }
    }
/nop fatman job
/al askpang {ask fatman about job;accept mission;answer lady;follow fat lady}
/al askgl {cancel;/delay {4.1}{cancel;newtask}}
/al asktaobaoyi {ask tao baoyi about 陶氏;de2 {ask tao baoyi about 药引子};de3 {give fish to tao baoyi}}
/ac {^天机老人皱着眉头说：我也不强人所难}{/delay {181}{quest}}
/nop daqigu yellow bandit leader cyan killer 
/ac {^正在创建副本...$}{center;turn rock}
/ac {^几个人影闪进石门之中来！$}{open red}
/ac {^%1说道：老子杀人无数，多杀你}{ki killer}
/ac {^%1说道：竟敢与我神教为敌}{ki loster}
/ac {^( 吕南人气喘嘘嘘}{quanfu nanren;de3 {quanfu nanren}}
/ac {^( 吕南人似乎十分疲惫}{quanfu nanren;de3 {quanfu nanren}}
/ac {^只听各个门里传来阵阵嗡鸣}{center;de4 {ki thief;kill thief 2;kill thief 4;kill thief 3}}
/ac {^入侵敌人全部消灭！}{center;turn rock}
/ac {^一个高大的人影闪进石门之中来！}{de2 {ki boss}}
/ac {^青室里一阵响动，通往藏宝室的机关打开}{open cyan;cyan;do open picture,s,s}
/ac {^宝箱消失了。}{l finger}
/ac {^江湖中又有消息传来，在该副本的%1室一带还有余孽活动。$}{
de4 {/showme dq-%1}; 
}
/ac {^江湖中又有消息传来，在该副本的石道一带还有余孽活动。}{}
/al buymohua {
    walk 警世书局;
    de1 {list;buy mo from du;store mo};
    de5 {walk 倾城胭脂店};
    de6 {list;buy ikebana stone from fang er;store ikebana stone}
}
/al tbuymohua {
    summonnt qiankun;
    /ticker {buy}{buymohua}{16};
    }
/al tbuymohua- {/unticker {buy}}
/al askmk {ask master mingyue about defense}
/al askreward {ask master mingyue about reward;de2 askmk}
/al askrw askreward
/al gotomy {walk 将军府大堂}
/ac {^【传闻】明月：天下英豪，当群起而逐之}{gotomy;de3 askmk;de6 askmk}
/ac {^【灭寇】明月：各路英雄请到城门协助加强城防}{gotomy;de3 askmk;de6 askmk}
/ac {^你向明月打听有关『defense』的消息。}{set ability 1;set pet 0}
/ac {^【灭寇】明月：这次全靠大家齐心协力}{gotomy;de3 {askreward;de3 askmk}}
/ac {^【灭寇】明月：倭寇主力已距日出城不远}{gotomy;de3 askreward}
/ac {^【灭寇】明月：战斗已结束，请各位英雄来将军府领赏}{gotomy;de3 askreward;de6 askrw}
/ac {^【灭寇】明月喝道：敌人就要到达城下}{gotomy;de3 askmk;de6 askmk}
/ac {^你已经到达将军府大堂}{de2 askrw}
/ac {^【灭寇】明月：各营加紧抢修城门}{gotomy}
/ac {^明月说道：目前并无倭寇的踪迹。}{}
/ac {^【灭寇】明月双手抱拳}{gotomy;de3 askmk;de6 askrw}
/ac {^看起来海盗倭寇}{ki wokou}
/ac {^伤兵营}{return;de4 l}
/nop 挖蚯蚓
/al getqiuyin {do get qiu yin,get qiu yin}
/al waqiuyin {
    wlk;
    summonnt qiankun;walk 后花园;e;
    /delay {1}{push stone;getqiuyin};
    /delay {3}{push stone;getqiuyin};
    /delay {6}{push stone;getqiuyin};
    /delay {9}{push stone;getqiuyin};
    /delay {12}{push stone;getqiuyin};
    /delay {15}{push stone;getqiuyin};
    /delay {20}{se;get all from ground;getqiuyin}; 
    /delay {24}{/7 {store qiuyin}};
    /delay {27}{/7 {store qiuyin}};
    /delay {30}{nwlk};
    /delay {31}{sleep sleepbag;cks};
    }
/al twqy {waqiuyin;/ticker {wa}{waqiuyin}{45}}
/al twqy- {/unticker {wa}}
/ac {^你看到古柏树下有微微的黄光一闪而逝。}{/10 search}
/nop gulong
/al askgl2 {
    choose 5;
    askgl2+;
    /ticker {askgl}{askgl}{6.3};
}
/al askgl2+ {
    wlk;
    /ac {^古龙说道：在%1的%2有一正派人士}{
    /if {'%1'=='风云城' || '%1'=='富贵山庄' || '%1'=='老屋'}{askgl2-};
    /if {'%1'=='济南' || '%1'=='清平山庄' || '%1'=='武当镇'}{askgl2-};
    /if {'%1'=='武当山' || '%1'=='塞口' || '%1'=='嵩山'}{askgl2-};
    }
}
/al askgl2- {
    /showme ========= %1  ^^^  %2==========;
    n;
    nwlk;
    /unac {^古龙说道：在%1的%2有一正派人士};
    /unticker {askgl};
}
/ac {^古龙说道：大旗门附近有个古怪的石屋，去帮我探索一下。ask gulong about daqigu}{;}
/al bbb {do burn,burn,burn}
/al giveduanbook {qt book;de2 {do give duan book,give duan book,give duan book,give duan book,give duan book,give duan book,give duan book}}
/ac {^  任务宝箱(Baoxiang)}{x baoxiang}
/al buyhehesan {
 /showme -- start buy hehesan;
 wlk;
 /ticker {buy} {w;give 16 gold to han;de1 {e}}{60};
}
/al stopbuyhehesan {
 nwlk;
 /unticker {buy};
}

/nop 棕嗓鹛之歌
/ac {^棕嗓鹛轻轻叫了几声，好像叮叮}{de2 {catch bird}}
/ac {棕嗓鹛咯咯娇笑起来。}{down}
/ac {^小马抱拳说道：这位}{answer yes}
/ac {^小马握紧拳头道：小琳}{/shome riddle fault-----,need quit,dry after 3hours}

/ac {^路边黑影一闪}{ki killer;}
/al asksongfan {pl {ask woman about 送饭;get basket;w;w;s;s;e;give farmer basket;w;n;n;e;e};pr}
/ac {^雪域阴魂说道：我有一本}{x scroll;de2 x scroll;de4 x scroll;de5 x scroll}
/nop  {^天机老人说道：请到%1找回%2}{/if {$at_tj==1}{qb}}
/ac {^天机老人说道：请%1找回『%0』}{/var en_qb 1; /var is_buy 1;/var q_item %0;/var q_item_name 0;/if {$at_tj==1}{qb}}
/nop 两世恩怨
/al askjian {
    ask jian about 李坏;
    de1 {ask jian about 李坏};
    de2 {ask jian about 李坏};
    de3 {ask jian about 李坏};
    de4 {ask jian about 指望};
    de5 {ask jian about 指望};
    de6 {ask jian about 失了踪影};
    de7 {getbat};
    de9 {put fried meat in desk};
    de10 {get paper bag from desk};
    de11 {get meat from desk};
    de12 {pl {w;w;w;nu;nu;l paper bag;give paper bag to jian};pr};
}
/al askjian2 {
    {ask jian about 月神};
    de1 {ask jian about 月神};
    de2 {ask jian about 月神};
    de3 {pl {sd;sd;e;e;e;ask xue about 月神};pr};
}    
/al getbat {pl {sd;sd;e;l 走廊;l 爪印;l 痕迹;e;n;l 走廊;l 白骨;s;e;l desk};pr}   
