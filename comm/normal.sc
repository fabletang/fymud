/config speedwalk off
/nop 设定回车只动输入上次的命令。
/nop config {MCCP}     {off}
/config {MCCP}     {on}
/config {repeat enter} on
/config {ECHO COMMAND} on
/config {SCROLL LOCK} on
/config {CONNECT RETRY} 30
/config {DEBUG TELNET} off
/config {CONVERT META} off
/config {packet patch} 0.5
/split 0 1
/nop al reload {/read $myname.tt}
/variable is_kill 0
/variable can_eat 1
/al de0 {/delay {0.5}%1}
/al de02 {/delay {0.2}%1}
/al de04 {/delay {0.4}%1}
/al de05 {/delay {0.5}%1}
/al de06 {/delay {0.6}%1}
/al de07 {/delay {0.7}%1}
/al de08 {/delay {0.8}%1}
/al de1 {/delay {1}{%1}}
/al de2 {/delay {2}{%1}}
/al de3 {/delay {3}{%1}}
/al de4 {/delay {4}{%1}}
/al de5 {/delay {5}{%1}}
/al de6 {/delay {6}{%1}}
/al de7 {/delay {7}{%1}}
/al de8 {/delay {8}{%1}}
/al de9 {/delay {9}{%1}}
/al de10 {/delay {10}{%1}}
/al de11 {/delay {11}{%1}}
/al de12 {/delay {12}{%1}}
/al de13 {/delay {13}{%1}}
/al de14 {/delay {14}{%1}}
/al de16 {/delay {16}{%1}}
/al de18 {/delay {18}{%1}}
/al de20 {/delay {20}{%1}}
/al de22 {/delay {22}{%1}}
/al de24 {/delay {24}{%1}}
/al de26 {/delay {26}{%1}}
/ac {^你不能在一秒内送出这么多条信息}{
    /var can_eat 0;
    /delay {10}{/var can_eat 1}
}
/al iskill {/var is_kill 1}
/al nokill {/var is_kill 0;/var is_fight 0}
/variable is_walk 0
/al wlk {/var is_walk 1; /var at_tj 0;follow none}
/al nwlk {/delay {2}{/var is_walk 0}}
/nop 坐骑
/al zuoqi {whistle;ride %0}
/ac {^你赎回了古松琴} {play qin; /delay {2}{pawn qin}}
/ac {^力士死了}{get hat from corpse;wear hat}
/ac {^  慈祥老人 礼物大使(Giftman)}{ask giftman about weapon}
/al wearshouhuan {remove finger;remove finger 2;remove finger 3;wear shouhuan}
/al dropshouhuan {dd shouhuan}
/al removeshouhuan {remove shouhuan;wear finger 3;wear finger 2;wear finger 1}
/al dd {remove %0;drop %0}
/ac {^这里无法使用特殊}{stopk}
/ac {^这里无法使用外功。}{stopk}
/ac {^“啪”的一声一}{get dan;get wan;get xiandan;cun dan;get gold;get silver}{1}
/ac {^“啪”的一声一些黄金}{get gold}
/ac {^“啪”的一声一些白银}{get silver}
/ac {^这里的茅草(grass)很密，但你似乎可以拨开(pushaside)它们。}{pushaside grass}
/ac {茅草(grass)似乎更密更厚}{look grass}
/ac {^【闲聊】天机老人(Tian ji)：风起云涌}{/if {$is_walk ==0 }{uptime_do;uptimedo ok}}
/al uptimedo {/al uptime_do %0}
/nop 恢复内力需要 orb
/nop al hn {recover force}
/al hx {exert heal}
/al aaa {ask giftman about %0}
/al aaal {aaa horse;aaa small bag;aaa orb;ride horse}
/al gm {wlk;d; /3 w;n;withdraw %0; /delay {3} {s; /3 e;u;nwlk}}
/al cm {wlk;d; /3 w;n;deposit %0; /delay {3} {s; /3 e;u;nwlk}}
/al bxl {buy %0 from xiang ling}
/al gxl {give %0 to xiang ling}
/al sxl {fyxl;sell %0;xlfy;i}
/al ssl {fyxl;sell %0;xlfy;i}
/al tbxl {fyxl;de1 {buy %0 from xiang ling};de2 {xlfy}}
/no al sxl {sell %0 to xiang ling}
/al tsxl {fyxl;de1 {sell %0};de2 {xlfy}}
/al tsell {fyxl;de1 {sell %0};de2 {xlfy}}
/al hbtell {
    tell superman EX%0;
    tell yeah EX%0;
    tell hard EX%0;
    tell soft EX%0;
    tell magic EX%0;
    tell power EX%0;
    tell fate EX%0;
    tell kitchen EX%0;
    tell sex EX%0;
    tell feeling EX%0;
    tell fairy EX%0
}
/nop 学习
/al tlearn {/ticker {learn}{/15 learn %1 from master with %2}{1.5}}
/al untlearn {/unticker {learn}}
/al tpra {
    /7 {practice %1;learn %2 from master with 1};
    /delay {0.5}{/7 practice %1;learn %2 from master with 1};
    /delay {1}{/7 practice %1;learn %2 from master with 1};
    /delay {1.5}{/7 practice %1;learn %2 from master with 1};
    /delay {2}{/7 practice %1;learn %2 from master with 1};
    /delay {2.5}{/7 practice %1;learn %2 from master with 1};
    /delay {3}{/7 practice %1;learn %2 from master with 1};
    /delay {4}{hp;eatall;dazuo}
}
/ac {死了。}{look corpse;de2 {get baoxiang;x baoxiang}}
/nop {^绿洲}{do get skin from small bag,fill skin,put skin in small bag}
/ac {^绿洲 -}{gb skin;fill skin;pp skin}
/nop ac {^大明湖}{do get skin from small bag,fill skin,put skin in small bag}
/ac {^酒肉和尚说道：“她此番逃将出去}{open door;s;pull 小柜}
/nop ac {你的玄灵玉盒中没有%0这个物品。}{qxl %0; /delay {3}{i}}
/nop ac {~[37m你现在的任务是: 到%0去%1』%2在%3内完成} {/var qname %1; /showme {%0 %1』 %3}{-1}} {2}
/ac {^好极了,听说『%1』在%2的%3一带为非作歹}{/var tongji_npc %1; /var tongji_quyu %2; /var tongji_didian %3}
/al qtj {/showme $tongji_npc 在 $tongji_quyu 的 $tongji_didian;team talk $myname 杀 $tongji_npc 在 $tongji_quyu 的 $tongji_didian}
/al tpull {/ticker {pull}{pull %0}{1}}
/al untpull {/unticker {pull}}
/al stdbook {/30 {study %0}}
/al buywuqi {fy2lw; /delay {4}{w;nw;buy %0 from tian long;se;e};/delay {5}{lw2fy}}

/nop table合并物品
/al hebing {/2 {remove %0;unwi %0;put %0 in table};combine;get all from table}
/al thb {/2 gb %0; /2 put %0 in table;combine;ga table; /delay {0.5}{l %0;pp %0}}
/al hball {
    thb sword;
    /delay {1}{thb staff};
    /delay {2}{thb spear};
    /delay {3}{thb whip};
    /delay {4}{thb axe};
    /delay {5}{thb finger};
    /delay {6}{thb ring};
    /delay {7}{thb mask};
    /delay {8}{thb hammer};
    /delay {9}{thb hat};
    /delay {10}{thb surcoat};
    /delay {11}{thb belt};
    /delay {12}{thb shield};
    /delay {13}{thb mask};
    /delay {14}{thb shoes};
    /delay {15}{thb necklace};
    /delay {16}{thb bracelet};
    /delay {17}{thb blade};
    /delay {18}{thb armor};
    /delay {19}{thb gloves};
    /delay {20}{thb cloth}
}

/al checkitem {
    finditem+;
    /delay {1}{gb sword;look sword};
    /delay {1}{gb staff;look staff};
    /delay {2}{gb spear;look spear};
    /delay {3}{gb whip;look whip};
    /delay {4}{gb axe;look axe};
    /delay {5}{gb finger;look finger};
    /delay {6}{gb ring;look ring};
    /delay {7}{gb mask;look mask};
    /delay {8}{gb hammer;look hammer};
    /delay {9}{gb hat;look hat};
    /delay {10}{gb surcoat;look surcoat};
    /delay {11}{gb belt;look belt};
    /delay {12}{gb shield;look shield};
    /delay {14}{gb shoes;look shoes};
    /delay {15}{gb necklace;look necklace};
    /delay {16}{gb bracelet;look bracelet};
    /delay {17}{gb blade;look blade};
    /delay {18}{gb armor;look armor};
    /delay {19}{gb gloves;look gloves};
    /delay {20}{gb cloth;look cloth};
    /delay {21}{finditem-}
}
/al finditem+ {
    /ac {^               ╭═◇%1(%2)◇═╮}{/var item_title %1;@lowerLetter{}; /var item_name $result;say sfd $item_name};
    /ac {^║ 永久物品　　　     　%1品质:    %2}{/delay {0.2}{/if {%2>2}{/showme 发现好东西 $item_name 品质: %2}{put $item_name in small bag}}}
}
/al finditem- {
    /unac {^               ╭═◇%1(%2)◇═╮};
    /unac {^║ 永久物品　　　     　%1品质:    %2}
}

/al askwang {ask wang about 恩人; /delay {1}{answer 张飞}; /delay {2}{answer 30}; /delay {3}{s;e;e; /5 s;w}; /delay {4}{/3 buy round jade from zhengjia}; /delay {5}{e; /5 n;w;w;n;}; /delay {6}{give round jade 1 to wang;give round jade 2 to wang;give round jade 3 to wang;combine}}
/al lc {l corpse %0}
/nop al ki {set target %0;kill %0; /var knpc %0}
/al xc {get all from corpse %0}
/al x {get %0 from corpse}
/al x2 {get %0 from corpse 2}
/al x3 {get %0 from corpse 3}
/al x4 {get %0 from corpse 4}
/al x5 {get %0 from corpse 5}
/al x6 {get %0 from corpse 6}
/nop al xb {get %0 from corpse;cun %0}
/al xb {get %0 from corpse;qput %0}
/al dj {get wineskin from small bag;drink wineskin}
/al gg {give %0 to tian ji;get %0 from small bag;give %0 to tian ji;qreturn}
/al ggg {get all}
/al pp {put %0 in small bag}
/al xg {get %0 from corpse;put %0 in small bag}
/al lb {look small bag}
/al gb {get %0 from small bag}
/al xp {put %0 in small bag;get %0 from corpse;qput %0}
/al buybag {d;w;w;n;buy small bag from xuer; /delay {3}{s;e;e;;u}}
/nop eatall {eat mantou;get beef meat from small bag;get wineskin from small bag;eat beef meat; /delay {3}{drink hulu;drink wineskin}; /delay {6}{put beef meat in small bag;put wineskin in small bag}}
/al eatall {
/if {$can_eat==1}{gb skin;drink skin;pp skin;/delay {2.8}{gb beef meat;eat beef meat;pp meat}}
}
/nop al eatall {get xigua from small bag;eat xigua;put xigua in small bag}
/nop 香灵
/al qxl {fyxl;bxl %0; /delay {2}{xlfy;gg %0}}

/nop 风云toMAX pumpkin jiudai
/nop al buyeat {d; /10 w; /delay {2}{/5 w;s;buy pumpkin from max;buy jiudai from max}; /delay {4}{put pumpkin in small bag;put jiudai in small bag;put jiudai in small bag;n;unwield all; /5 e}; /delay {6}{/10 e;u}}
/al buyeat {fy2qf; /delay {3}{e;e;buy beef meat from xiaofan;/2 buy wineskin from xiaofan;w;w}; /delay {4}{qf2fy}}

/nop fill jiudai
/al filljiudai {fykz;/delay {1}{/2 {gb wineskin}; /2 {fill wineskin;fill wineskin 2 ;pp wineskin}}; /delay {2}{kzfy}}
/al fjd {fykz;/delay {1}{
    get skin from small bag;get skin from small bag;fill skin;put skin in small bag;fill skin;put skin in small bag;drop skin 2;get skin;fill skin; 
    /delay {2}{kzfy}
    }
    }
/al ga {get all from %0}
/al gc {get %0 from corpse %1}


/al wi {wield %0}
/al unwi {unwield %0}
/al ddd {climb down}
/al uuu {climb up}

/al qr {d;w;w;n;
        ask shangguan xuer about 财产保险;
        de1 {ask shangguan xuer about treasurebox};
        /delay {2}{s;e;e;u;qreturn;}}
/al qs  {d;w;w;n;qsave; /delay {1}{s;e;e;u;}}

/al checkchat {/grep 【新手】; /grep 【闲聊】}
/al checknew {/grep 【新手】}
/nop ac {#PROMPT SIZE (%0) LONGER THAN ROW SIZE (80)}{/read status.sc; /cr}

/function {lowerLetter} {
    /nop var result %0;
    /replace {result} {A} {a};
    /replace {result} {B} {b};
    /replace {result} {C} {c};
    /replace {result} {D} {d};
    /replace {result} {E} {e};
    /replace {result} {F} {f};
    /replace {result} {G} {g};

    /replace {result} {H} {h};
    /replace {result} {I} {i};
    /replace {result} {J} {j};
    /replace {result} {K} {k};
    /replace {result} {L} {l};
    /replace {result} {M} {m};
    /replace {result} {N} {n};

    /replace {result} {O} {o};
    /replace {result} {P} {p};
    /replace {result} {Q} {q};
    /replace {result} {R} {r};
    /replace {result} {S} {s};
    /replace {result} {T} {t};
    /replace {result} {U} {u};

    /replace {result} {V} {v};
    /replace {result} {W} {w};
    /replace {result} {X} {x};
    /replace {result} {Y} {y};
    /replace {result} {Z} {z};
}

/nop tab 自动补全
/tab literate
/tab dumpling
/tab climb
/tab give
/tab black
/tab pumpkin
/tab unarmed
/tab deposit
/tab silver
/tab study
/tab cancel
/tab drop
/tab deposit
/tab scroll
/tab treasure
/tab crawl
/tab scorpion
/tab essencemagic
/tab wineskin
/tab traveler
/tab drop
/tab incarnation
/tab practice
/tab apprentice
/nop 自动杀
/ac {^  青龙杀手 %1(%2)}{say kill %2; /var result %2;@lowerLetter{};ttk $result;ki $result; /showme $result}
/ac {^毛野恨声道：拿命来}{tk mao ye;kill mao ye}
/ac {^汤野嘿嘿道：够胆量！}{tk tang ye;kill tang ye}
/ac {^木牢狱卒嘿嘿道：够胆量！}{tk guard;kill guard}
/ac {^金牢狱卒嘿嘿道：够胆量！}{tk guard;kill guard}
/ac {^火牢狱卒嘿嘿道：够胆量！}{tk guard;kill guard}
/nop {^看起来%0想杀死你！}{/var knpc_name %0;iskill}
/ac {^糟糕！你失手了！}{startk}
/ac {^这里无法使用特殊招式} {stopk}
/ac {^你用尽全身力量，将}{/unticker {pull}}
/ac {^你死了。}{wlk;cry;set revive 1}
/ac {^你不可以在这里吐纳练功}{wlk}
/ac {^你不可以在这里用内功}{stopk}
/nop ac {^不老寒泉}{/if {$is_kill==0}{gb matong;fill matong;gb skin;fill skin;wi jade;dip jade}}
/unac {^不老寒泉};
/ac {^战斗中不能打坐}{iskill}
/ac {^忽然，你似乎闻到了沙底下的一丝湿气，也许可以挖（digdown）下去看看}{digdown; /delay {2}{digdown}}
/ac {^慌乱而去。}{/showme 掉东西了;/3 team talk $myname 掉东西了!!!}
/ac {^你感觉身上一轻，似乎丢了什么东西}{/showme 掉东西了;team talk $myname 掉东西了!!!}
/nop stack 拿东西
/ac {^你将手中的牛肉干吃得干干净净}{gb meat;/showme buy meat !!!;team talk $myname no meat!!!}
/ac {^你从%0的尸体身上搜出一件布衣}{drop cloth}
/ac {^你从%0的尸体身上搜出一把长剑}{drop sword}
/ac {^你从%0的尸体身上搜出一把短斧}{drop axe}
/ac {^你从%0的尸体身上搜出一根木棍}{drop staff}
/ac {^你从%0的尸体身上搜出一根长矛}{drop spear}
/ac {^你从%0的尸体身上搜出一把单刀}{drop blade}
/ac {^你从%0的尸体身上搜出一把铁锤}{drop hammer}
/ac {^你从%0的尸体身上搜出一条皮鞭}{drop whip}
/ac {^一股强劲的罡气挡住了你}{play qin;keychain;e}
/al buyshuijin {
    sell green crystal;
    sell yellow crystal;
    /delay {4}{
    bxl blue crystal;
    bxl yellow crystal;
    bxl purple crystal;
    bxl green crystal
    }
}
/ac {^使用特殊招式至少需要50点的内力}{stopk}
/al tqst+ {
    /ticker {quest}{quest;qb}{20}
}
/al tqst- {
    /unticker {quest}
}
/ac {^你胃里一阵绞痛，脸上紫气郁结}{gb pill;de2 {cure malaria}}
/ac {^路行至此，紫蘑林飘荡着淡而幽香的雾障}{gb pill;de2 {cure malaria}}
/ac {^你中的瘴毒减轻了一些}{cure malaria}
/ac {^你体内所有的瘴毒都被清除了}{pp pill}
/al getshuijing {
    get blue crystal from corpse;
    get red crystal from corpse;
    get purple crystal from corpse;
    get yellow crystal from corpse;
    get green crystal from corpse;
}
/ac {^丁干死了。}{
    getshuijing;
    /nop delay {2}{getshuijing;xb water chestnut;xb dagger};
    /nop delay {6}{getshuijing;xb water chestnut;xb dagger};
    /nop delay {9}{getshuijing;xb water chestnut;xb dagger};
}{3}
/ac {^西门玉死了。}{
    getshuijing;
    /delay {2}{getshuijing};
    /delay {6}{getshuijing};
    /delay {8}{getshuijing};
}{3}
/ac {^毛战死了。}{
    getshuijing;
    /delay {2}{getshuijing};
    /delay {6}{getshuijing};
    /delay {8}{getshuijing};
}{3}
/ac {^小武死了。}{
    getshuijing;
    /delay {2}{getshuijing;x wind sword};
    /delay {6}{getshuijing;x wind sword};
    /delay {8}{getshuijing;x wind sword};
}{3}
/ac {^麻锋死了。}{
    getshuijing;
    /delay {2}{getshuijing; xb wind sword};
    /delay {6}{getshuijing; xb wind sword};
    /delay {8}{getshuijing; xb wind sword};
}{3}
/ac {^丁干嘿嘿道：够胆量}{buff;ki ding gan}
/ac {^毛战嘿嘿道：够胆量}{buff;ki mao zhan}
/ac {^麻锋嘿嘿道：够胆量}{buff;ki ma feng}
/ac {^一阵冷风吹散了你的阴魂}{dfout}
/al asksoup {ask mengpo about soup}
/ac {^你所受到的地域幽魂的效用消失了}{nw;s;dash mist}
/ac {^你上世的恩怨未尽，还是再等一阵儿吧}{/delay {5}{dash mist}}
/ac {^你身子虚弱到了极点，连站都站不稳了}{score;say 又死了。。。}
/nop 治病
/al zhibing {
/delay {1}{/5 cure caizhi};
/delay {2}{/5 cure liliang};
/delay {3}{/5 cure yunqi};
/delay {4}{/5 cure sudu};
/delay {5}{/5 cure tizhi};
/delay {6}{/5 cure dingli};
} 
/al sk {stopk;cks}
/al ddc {drop %1 coin}
/al getcoin {keychain -coin}
/ac {^战斗中不能打坐}{iskill}
/nop ac {^== 未完继续%s%1% == (ENTER 继续下一页}{/if {%1<40}{/cr;/cr;/cr;}{/cr;/cr;}}
/ac {^== 未完继续%s%1% == (ENTER 继续下一页}{/cr;}
/al wearmonkclothes {gb monk clothes;do remove cloth,remove surcoat,wear monk clothes,wear all}
/al rm {remove %0}
/al wmk {tbxl monk clothes;de4 wearmonkclothes}
/al smk {tsell monk clothes}
/al shouhuan+ {/ac {^│	%1 ：  豹牙手环          价值：三两}{redeem %1;/showme item_no%1}}
/al shouhuan- {/unac {^│	%1 ：  豹牙手环          价值：三两}}
/nop {^你赎回了豹牙手环}{shouhuan-}
/al getshouhuan {shouhuan+;fyxl;de1 {pawn};de4 {shouhuan-;wear shouhuan;xlfy}}
/al putshouhuan {fyxl;de1 {pawn shouhuan};de4 {xlfy}}
/ac {^  人间地狱 小僵尸(Zombie)}{ki zombie}
/ac {^坟堆里慢慢站起一个人形向你扑来!}{ki zombie}
/ac {^朱藻说道：你真不错！可破我的七仙女阵！}{wear all}
/al digstatue {/ticker {dig}{l 杨树;l 新土;dig;}{4};
/ac {^铛．．得一声}{new 挖到玉佛了，dodge;}
             }
/al notdig {/unticker {dig};/unac {^铛．．得一声}}
/ac {^三仙碑}{gb skin;fill skin;pp skin}
/var is_fight 0
/al fi {buff;/var is_fight 1;de2 {fight %0;set targe %0;/var npc %0}}
/ac {^看起来金衣卫首领想杀死你}{tk sentry}{3}
/nop full pet
/al fpet {
    gb skin;gb meat;
    pg skin;pg meat;
    order drink skin;
    /delay {4}{order eat meat};
    /delay {5}{
    pm skin;pm meat;
    }
}
/al jiangshaqi {
    do d,n,n,e;
    /4 salute;
    dazuo;
    /delay {12}{do w,s,s,u}
    }
/al buybx {do d,w,w,n,ask xuer about 铂金经验保险;de2 {do ask shangguan xuer about treasurebox,s,e,e,u}}
/unac {^水银在到处流转，舒适无比}{tuna}
/al tuna3 {walk 风云天骄门;/delay {1}{tuna};/delay {7}{tuna};/delay {13}{tuna}}
/al yangcw {withdraw 50000;de2 {withdraw 50000};de4 {yang monkey $HIY$ 小小真 xxz};de6 whistle}
/al yangcw2 {dismissp xxz;withdraw 50000;de2 {withdraw 50000};de4 {yang monkey $HIY$ 小小真 xxz};de6 whistle;de7 scorep}
/al yyyy {/ticker {yang}{dismissp xxz;de2 {yangcw}}{11}}
/ac {^  兵装谱}{/var is_kill 0;}
/al pickupall {
    pickup 1; pickup 2; pickup 3; pickup 4; pickup 5; pickup 6; pickup 7; pickup 8; pickup 9;
    de2 {pickup 10;pickup 11;pickup 12;pickup 13;pickup 14;pickup 15;pickup 16; pickup 17; pickup 18; pickup 19};
    de5 {pickup 20;pickup 22;pickup 22;pickup 23;pickup 24;pickup 25;pickup 26; pickup 27; pickup 28; pickup 29};
    de8 {pickup 30;pickup 33;pickup 33;pickup 33;pickup 34;pickup 35;pickup 36; pickup 37; pickup 38; pickup 39};
    de11 {pickup 40;pickup 44;pickup 44;pickup 44;pickup 44;pickup 45;pickup 46; pickup 47; pickup 48; pickup 49};
    de14 {pickup 50;pickup 55;pickup 55;pickup 55;pickup 55;pickup 55;pickup 56; pickup 57; pickup 58; pickup 59};
            }
/ac {^【闲聊】拍卖师(Auctioneer)：第%0号拍卖物%1无人认领}{pickup %0} 
/ac {^你中的七彩蝙蝠毒发作了}{gb bat drug;de2 {cure 7batpoison};}
/ac {^你服下解药，顿时感觉好多了。但是你中的七彩蝙蝠毒并没有完全}{qt bat drug;de1 {cure 7batpoison};}
/ac {^你服下解药，顿时感觉好多了。你终于清除了体内所有的七彩蝙蝠毒}{store bat drug}
/al ts tsell;
/al buypill {fy2wdz;de2 {wlk;s;w;/2 buy pill from xinghua};de4 {e;n;wdz2fy}}
/al buyall {gm 9000;de5 fy2qf;de6 {wlk;do e,e,buy beef meat from xiaofan;fyz};de7 {wlk;sb;do w,n,e,buy shui dai,w,s,s,e,s,buy sleepbag};de8 ffy;de9 {buybx;nwlk}}
/al buyall {gm 9000;de5 fy2qf;de6 {wlk;do e,e,buy beef meat from xiaofan;};de7 ffy;de8 qr;de9 {buybx;nwlk}}
/al buyall {gm 9000;de5 fy2qf;de6 {wlk;do e,e,buy beef meat from xiaofan;fyz};de7 {wlk;sb;do w,n,e,buy shui dai,w};de8 ffy;de9 {buybx;nwlk}}
/al buymeat {fy2qf;de3 {wlk;e;e;buy beef meat from xiaofan;};de4 {wlk;w;;w;qf2fy}}
/nop qiankundai 
/nop {^[24]  豹牙手环(shouhuan)                        1}
/nop qiankun bag
/al sb {summonnt qiankun}
/al llb {l qiankun}
/al qstore {sb;remove %0;unwield %0;store %0}
/var it_sn 0
/var it_num 0
/var it_n 0
/var it_code shouhuan1
/al qt {/var hasqt 0;/var it_code {%0};sb;llb;
    /showme ==want take $it_code;
}
/al qtg {/var hasqt 0;/var it_code %1;/var it_n %2;sb;llb;/showme ==qtg take %1 %2}
/al qt- {
/unac {^[%1]  %0(%3)%s%4};
/unac {^[%1]  %0(%5 %6)%s%4};
}
/ac {^[%1]  %0(%3)%s%4}{
    /var it_sn %1;
    /var it_num %4;
    /if {"$it_code"=="%3" && $hasqt==0}{
                    /if {$it_n>1}{take %1 $it_n}{
                    take $it_sn $it_num;
                    }
                            };
}
/ac {^[%1]  %0(%5 %6)%s%4}{
    /var it_sn %1;
    /var it_num %4;
    /if {"$it_code"=="%5 %6" && $hasqt==0}{
                    /if {"$it_code"=="zhufu hammer"||"$it_code"=="zhufu staff"||"$it_code"=="zhufu sword"}{
                    take $it_sn 1;
                    }{take $it_sn $it_num};
                    /var it_code none;
                    /var it_sn 101; 
                            };
}{4}
/al qt+ {
/showme ---- qt+ -----;
}
/var hasqt 0
/ac {^你从如意乾坤袋里}{/var hasqt 1;/var it_sn 101;/var it_code shouhuan1;/var it_num 0;/var it_n 0}{4}
/ac {^你存入%0到如意乾坤袋}{/var it_code none;/var it_num 0;}
/ac {^你撞了大运，得到额外奖励符文%1。}{store %1}
/nop al getbatdrug {pl {wlk;w;w;w;w;d;w;get all from woodcase;store bat drug;nwlk};pr}
/al getbatdrug {pl {wlk;w;w;w;w;d;w;get all from woodcase;pp bat drug;nwlk};pr}
/al st {remove %0;unwield %0;store %0}
/al gxy {give %0 to xiao yuer}
/ac {^祭武器将会使用十两黄金}{continue yes}
/ac {^你的身体状况无法强化练习}{sleep sleepbag}
/al gmg {/math ggold {%0*1000000};wlk;do d,w,w,w,n,withdraw $ggold;de4 {convert %0 tenthousand-cash to gold};de6 {do s,e,e,e,u;nwlk}} 
/ac {^古龙说，这点钱不够啊,恢复等级需要%0两黄金。}{give %0 gold to gulong}
/nop research skill
/var research 0
/var skill none
/al res {/var skill %1;
        /var research 1;
        skills -$skill;
        }
/al resto {
    /showme --skill-%1 -tolv %2;
    /var skill %1;
    /var tolv %2;
    /var research 1;
    skills -$skill;
}
/ac {^你的「%1」进步了！$}{
    /if {$research==1}{
    /showme {-ticker-resto-$skill-slv-$slv-tolv-$tolv-};
 };
}
/ac {^-ticker-resto-%1-slv-%2-tolv-%3-}{
    /var slv %2;
    /var tolv %3;
    /if {$slv>=$tolv}{
    /var research 0;
    /unticker res;
    /showme ==stop resto==;
    }{
    skills -$skill;
    }
    /if {$research == 0}{
    /unticker res;
    /showme ==stop resto==;
    };
}
/ac {^＊%1%s(%2)%s-%s%3%s%4/%s0}{
    /if {"$skill"=="%2"}{
    /var research 1;
    /showme ---research can =$research;
    }
}
/ac {^==%1==need=%2=}{
    /var spots %2;
    /if {$research==1}{
        /if {$spots>10000}{
        /math stimes {$spots/10000};
        /math lpots {$spots % 10000};
        /showme {--research times $stimes-};
        /showme {--research lpots $lpots-};
        /$stimes {/showme research 10000 $stimes};
        /$stimes {research %1 with 10000};
        conjure xiuxian;
        de1 {research %1 with $lpots};
        }{
        research %1 with %2; 
        }
        /showme {=ok=%1 %2};
    }
}
/ac {^==%1==need=%2=}{
    /var spots %2;
    /if {$research==1}{
        /if {$spots<100}{/var spots 100};
        research %1 with $spots; 
        /showme {=ok=%1 $spots};
        }
    }
/var rpots 1
/var lpots 1
/ac {^【升至第%1级所需潜能】%2%s【所需经验等级】}{
     /var lpots %2;
     /math rpots {10 * %2};
     /var slv %1;
    /showme ----learn pots-=$lpots=rpots-$rpots-cur slv=$slv;
    /if {$research==1}{
        conjure xiuxian;
        /delay {0.5}{
    /showme ==$skill==need=$rpots=;
        }
    };
}
/ac {^【学习至第%1级所需潜能】%2%s【所需经验等级】}{
     /var lpots %2;
     /math rpots {10 * %2};
     /var slv %1;
    /showme ----learn pots-=$lpots=rpots-$rpots-cur slv=$slv;
    /if {$research==1}{
        conjure xiuxian;
        /delay {0.5}{
    /showme ==$skill==need=$rpots=;
        }
    };

}
/ac {^你对%1作了一番彻底的研究！}{;}
/ac {^你所受到的地域幽魂的效用}{walk 奈河桥;de2 {dash mist}}
/nop ab2 绝招
/al jmj {unwield all;perform jiemaijue}
/ac {^%1突然将右手拇指食指相屈，眼神变得迷离而朦胧}{
/if {'%1'!='你’}{
/delay {1.5}{unwield all};
/showme ===npc dian wuqi====;
}
}
/al wzhanjia {do remove cloth,remove cloth 2,remove cloth 3,wear zhanjia}
/ac {^一片火光中，}{ga forge}
/ac {^%1突然将右手拇指食指相屈，眼神变得迷离而朦胧}{
/delay {1.5}{unwield all};
}
/al mmp {mazemap}
/al mh {maphere %0}
/al getr11 {/2 buy rune10 from xuer;combine1 rune10 & rune10 2}
/al getr12 {combine1 rune11 & rune11 2}
/al getr13 {combine1 rune12 & rune12 2}
/al getr14 {combine1 rune13 & rune13 2}
/al getr15 {combine1 rune14 & rune14 2}
/al getrune14 {
    getr11;
    /delay {3}{getr11};
    /delay {6}{getr11};
    /delay {9}{getr11};
    /delay {12}{getr11};
    /delay {15}{getr11};
    /delay {18}{getr11};
    /delay {21}{getr11};

    /delay {24}{getr12};
    /delay {27}{getr12};
    /delay {30}{getr12};
    /delay {33}{getr12};

    /delay {36}{getr13};
    /delay {39}{getr13};

    /delay {42}{getr14};
}
/al dz {dazuo}
/al um {uptime}
/al tickl {/ticker {learn}{dol}{8}}
/al tickl- {/unticker {learn};}
/nop 练梅花桩
/al lianzhuang {/ticker {lian}{lian zhuang;hp}{6}}
/al notlianzhuang {/unticker {lian}}
/nop get 仙人刺
/al getneedle {pl {wlk;d;s;w;u;e;dongfang101;pick needle;out;w;d;e;n;u;nwlk};pr}
/al learnm {learn %1 from master with %2}
