/config speedwalk off
/nop �趨�س�ֻ�������ϴε����
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
/al de05 {/delay {0.5}%1}
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
/ac {^�㲻����һ�����ͳ���ô������Ϣ}{
    /var can_eat 0;
    /delay {10}{/var can_eat 1}
}
/al iskill {/var is_kill 1}
/al nokill {/var is_kill 0;/var is_fight 0}
/variable is_walk 0
/al wlk {/var is_walk 1; /var at_tj 0;follow none}
/al nwlk {/delay {2}{/var is_walk 0}}
/nop ����
/al zuoqi {whistle;ride %0}
/ac {^������˹�����} {play qin; /delay {2}{pawn qin}}
/ac {^��ʿ����}{get hat from corpse;wear hat}
/ac {^  �������� �����ʹ(Giftman)}{ask giftman about weapon}
/al wearshouhuan {remove finger;remove finger 2;remove finger 3;wear shouhuan}
/al dropshouhuan {dd shouhuan}
/al removeshouhuan {remove shouhuan;wear finger 3;wear finger 2;wear finger 1}
/al dd {remove %0;drop %0}
/ac {^�����޷�ʹ������}{stopk}
/ac {^�����޷�ʹ���⹦��}{stopk}
/ac {^��ž����һ��һ}{get dan;get wan;get xiandan;cun dan;get gold;get silver}{1}
/ac {^��ž����һ��һЩ�ƽ�}{get gold}
/ac {^��ž����һ��һЩ����}{get silver}
/ac {^�����é��(grass)���ܣ������ƺ����Բ���(pushaside)���ǡ�}{pushaside grass}
/ac {é��(grass)�ƺ����ܸ���}{look grass}
/ac {^�����ġ��������(Tian ji)��������ӿ}{/if {$is_walk ==0 }{uptime_do;uptimedo l}}
/al uptimedo {/al uptime_do %0}
/nop �ָ�������Ҫ orb
/nop al hn {recover force}
/al hx {exert heal}
/al aaa {ask giftman about %0}
/al aaal {aaa horse;aaa small bag;aaa orb;ride horse}

/al gm {wlk;d; /3 w;n;withdraw %0; /delay {3} {s; /3 e;u;nwlk}}
/al cm {wlk;d; /3 w;n;deposit %0; /delay {3} {s; /3 e;u;nwlk}}
/al bxl {buy %0 from xiang ling}
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
/nop ѧϰ
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
/ac {���ˡ�}{look corpse}
/nop {^����}{do get skin from small bag,fill skin,put skin in small bag}
/ac {^���� -}{gb skin;fill skin;pp skin}
/nop ac {^������}{do get skin from small bag,fill skin,put skin in small bag}
/ac {^�������˵���������˷��ӽ���ȥ}{open door;s;pull С��}
/nop ac {������������û��%0�����Ʒ��}{qxl %0; /delay {3}{i}}
/nop ac {~[37m�����ڵ�������: ��%0ȥ%1��%2��%3�����} {/var qname %1; /showme {%0 %1�� %3}{-1}} {2}
/ac {^�ü���,��˵��%1����%2��%3һ��Ϊ������}{/var tongji_npc %1; /var tongji_quyu %2; /var tongji_didian %3}
/al qtj {/showme $tongji_npc �� $tongji_quyu �� $tongji_didian;team talk $myname ɱ $tongji_npc �� $tongji_quyu �� $tongji_didian}
/al tpull {/ticker {pull}{pull %0}{1}}
/al untpull {/unticker {pull}}
/al stdbook {/30 {study %0}}
/al buywuqi {fy2lw; /delay {4}{w;nw;buy %0 from tian long;se;e};/delay {5}{lw2fy}}

/nop table�ϲ���Ʒ
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
    /ac {^               �q�T��%1(%2)��T�r}{/var item_title %1;@lowerLetter{}; /var item_name $result;say sfd $item_name};
    /ac {^�U ������Ʒ������     ��%1Ʒ��:    %2}{/delay {0.2}{/if {%2>2}{/showme ���ֺö��� $item_name Ʒ��: %2}{put $item_name in small bag}}}
}
/al finditem- {
    /unac {^               �q�T��%1(%2)��T�r};
    /unac {^�U ������Ʒ������     ��%1Ʒ��:    %2}
}

/al askwang {ask wang about ����; /delay {1}{answer �ŷ�}; /delay {2}{answer 30}; /delay {3}{s;e;e; /5 s;w}; /delay {4}{/3 buy round jade from zhengjia}; /delay {5}{e; /5 n;w;w;n;}; /delay {6}{give round jade 1 to wang;give round jade 2 to wang;give round jade 3 to wang;combine}}
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
/al xp {do put %0 in small bag,get %0 from corpse,qput %0}
/al buybag {d;w;w;n;buy small bag from xuer; /delay {3}{s;e;e;;u}}
/nop al eatall {eat mantou;get beef meat from small bag;get wineskin from small bag;eat beef meat; /delay {3}{drink hulu;drink wineskin}; /delay {6}{put beef meat in small bag;put wineskin in small bag}}
/al eatall {
/if {$can_eat==1}{gb meat;gb skin;eat meat; /delay {3}{drink wineskin;pp meat;pp wineskin}}
}
/nop al eatall {get xigua from small bag;eat xigua;put xigua in small bag}
/nop ����
/al qxl {fyxl;bxl %0; /delay {2}{xlfy;gg %0}}

/nop ����toMAX pumpkin jiudai
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
        ask shangguan xuer about �Ʋ�����;
        de1 {ask shangguan xuer about treasurebox};
        /delay {2}{s;e;e;u;qreturn;}}
/al qs  {d;w;w;n;qsave; /delay {1}{s;e;e;u;}}

/al checkchat {/grep �����֡�; /grep �����ġ�}
/al checknew {/grep �����֡�}
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

/nop tab �Զ���ȫ
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
/nop �Զ�ɱ
/ac {^  ����ɱ�� %1(%2)}{say kill %2; /var result %2;@lowerLetter{};ttk $result;ki $result; /showme $result}
/ac {^ëҰ��������������}{tk mao ye;kill mao ye}
/ac {^��Ұ�ٺٵ�����������}{tk tang ye;kill tang ye}
/ac {^ľ������ٺٵ�����������}{tk guard;kill guard}
/ac {^��������ٺٵ�����������}{tk guard;kill guard}
/ac {^��������ٺٵ�����������}{tk guard;kill guard}
/nop {^������%0��ɱ���㣡}{/var knpc_name %0;iskill}
/ac {^��⣡��ʧ���ˣ�}{startk}
/ac {^�����޷�ʹ��������ʽ} {stopk}
/ac {^���þ�ȫ����������}{/unticker {pull}}
/ac {^�����ˡ�}{wlk;cry;set revive 1}
/ac {^�㲻������������������}{wlk}
/ac {^�㲻�������������ڹ�}{stopk}
/ac {^���Ϻ�Ȫ}{/if {$is_kill==0}{gb matong;fill matong;gb skin;fill skin;wi jade;dip jade}}
/ac {^ս���в��ܴ���}{iskill}
/ac {^��Ȼ�����ƺ��ŵ���ɳ���µ�һ˿ʪ����Ҳ������ڣ�digdown����ȥ����}{digdown; /delay {2}{digdown}}
/ac {^���Ҷ�ȥ��}{/showme ��������;/3 team talk $myname ��������!!!}
/ac {^��о�����һ�ᣬ�ƺ�����ʲô����}{/showme ��������;team talk $myname ��������!!!}
/nop stack �ö���
/ac {^�㽫���е�ţ��ɳԵøɸɾ���}{gb meat;/showme buy meat !!!;team talk $myname no meat!!!}
/ac {^���%0��ʬ�������ѳ�һ������}{drop cloth}
/ac {^���%0��ʬ�������ѳ�һ�ѳ���}{drop sword}
/ac {^���%0��ʬ�������ѳ�һ�Ѷ̸�}{drop axe}
/ac {^���%0��ʬ�������ѳ�һ��ľ��}{drop staff}
/ac {^���%0��ʬ�������ѳ�һ����ì}{drop spear}
/ac {^���%0��ʬ�������ѳ�һ�ѵ���}{drop blade}
/ac {^���%0��ʬ�������ѳ�һ������}{drop hammer}
/ac {^���%0��ʬ�������ѳ�һ��Ƥ��}{drop whip}
/ac {^һ��ǿ���������ס����}{play qin;keychain;e}
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
/ac {^ʹ��������ʽ������Ҫ50�������}{stopk}
/al tqst+ {
    /ticker {quest}{quest;qb}{20}
}
/al tqst- {
    /unticker {quest}
}
/ac {^��θ��һ���ʹ��������������}{qt pill;de2 {cure malaria}}
/ac {^·�����ˣ���Ģ��Ʈ���ŵ������������}{qt pill;de2 {cure malaria}}
/ac {^���е��ζ�������һЩ}{cure malaria}
/ac {^���������е��ζ����������}{store pill}
/al getshuijing {
    get blue crystal from corpse;
    get red crystal from corpse;
    get purple crystal from corpse;
    get yellow crystal from corpse;
    get green crystal from corpse;
}
/ac {^�������ˡ�}{
    getshuijing;
    /delay {2}{getshuijing;xb water chestnut;xb dagger};
    /delay {6}{getshuijing;xb water chestnut;xb dagger};
    /delay {9}{getshuijing;xb water chestnut;xb dagger};
}{3}
/ac {^���������ˡ�}{
    getshuijing;
    /delay {2}{getshuijing};
    /delay {6}{getshuijing};
    /delay {8}{getshuijing};
}{3}
/ac {^ëս���ˡ�}{
    getshuijing;
    /delay {2}{getshuijing};
    /delay {6}{getshuijing};
    /delay {8}{getshuijing};
}{3}
/ac {^С�����ˡ�}{
    getshuijing;
    /delay {2}{getshuijing; xb wind sword};
    /delay {6}{getshuijing; xb wind sword};
    /delay {8}{getshuijing; xb wind sword};
}{3}
/ac {^������ˡ�}{
    getshuijing;
    /delay {2}{getshuijing; xb wind sword};
    /delay {6}{getshuijing; xb wind sword};
    /delay {8}{getshuijing; xb wind sword};
}{3}
/ac {^���ɺٺٵ���������}{buff;ki ding gan}
/ac {^ëս�ٺٵ���������}{buff;ki mao zhan}
/ac {^���ٺٵ���������}{buff;ki ma feng}
/ac {^һ����紵ɢ���������}{dfout}
/al asksoup {ask mengpo about soup}
/ac {^�����ܵ��ĵ����Ļ��Ч����ʧ��}{nw;s;dash mist}
/ac {^�������Ķ�Թδ���������ٵ�һ�����}{/delay {5}{dash mist}}
/ac {^�������������˼��㣬��վ��վ������}{score;say �����ˡ�����}
/nop �β�
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
/ac {^ս���в��ܴ���}{iskill}
/ac {^== δ�����%s%1% == (ENTER ������һҳ}{/if {%1<40}{/cr;/cr;/cr;}{/cr;/cr;}}
/al wearmonkclothes {gb monk clothes;do remove cloth,remove surcoat,wear monk clothes,wear all}
/al wmk {tbxl monk clothes;de4 wearmonkclothes}
/al smk {tsell monk clothes}
/al shouhuan+ {/ac {^��	%1 ��  �����ֻ�          ��ֵ������}{redeem %1;/showme item_no%1}}
/al shouhuan- {/unac {^��	%1 ��  �����ֻ�          ��ֵ������}}
/nop {^������˱����ֻ�}{shouhuan-}
/al getshouhuan {shouhuan+;fyxl;de1 {pawn};de4 {shouhuan-;wear shouhuan;xlfy}}
/al putshouhuan {fyxl;de1 {pawn shouhuan};de4 {xlfy}}
/ac {^  �˼���� С��ʬ(Zombie)}{ki zombie}
/ac {^�ض�������վ��һ��������������!}{ki zombie}
/ac {^����˵�������治�������ҵ�����Ů��}{wear all}
/al digstatue {/ticker {dig}{l ����;l ����;dig;get box}{4}}
/al notdig {/unticker {dig}}
/ac {^���ɱ�}{do get skin from small bag,fill skin}
/var is_fight 0
/al fi {buff;/var is_fight 1;de2 {fight %0;set targe %0;/var npc %0}}
/ac {^������������������ɱ����}{tk sentry}{3}
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
/al buybx {do d,w,w,n,ask xuer about �����鱣��;de2 {do ask shangguan xuer about treasurebox,s,e,e,u}}
/unac {^ˮ���ڵ�����ת�������ޱ�}{tuna}
/al tuna3 {walk �����콾��;/delay {1}{tuna};/delay {7}{tuna};/delay {13}{tuna}}
/al yangcw {withdraw 50000;de2 {withdraw 50000};de4 {yang monkey $HIY$ СС�� xxz};de6 whistle}
/al yangcw2 {dismissp xxz;withdraw 50000;de2 {withdraw 50000};de4 {yang monkey $HIY$ СС�� xxz};de6 whistle;de7 scorep}
/al yyyy {/ticker {yang}{dismissp xxz;de2 {yangcw}}{11}}
/ac {^  ��װ��}{/var is_kill 0;}
/al pickupall {
    pickup 1; pickup 2; pickup 3; pickup 4; pickup 5; pickup 6; pickup 7; pickup 8; pickup 9;
    de2 {pickup 10;pickup 11;pickup 12;pickup 13;pickup 14;pickup 15;pickup 16; pickup 17; pickup 18; pickup 19};
    de5 {pickup 20;pickup 22;pickup 22;pickup 23;pickup 24;pickup 25;pickup 26; pickup 27; pickup 28; pickup 29};
    de8 {pickup 30;pickup 33;pickup 33;pickup 33;pickup 34;pickup 35;pickup 36; pickup 37; pickup 38; pickup 39};
    de11 {pickup 40;pickup 44;pickup 44;pickup 44;pickup 44;pickup 45;pickup 46; pickup 47; pickup 48; pickup 49};
    de14 {pickup 50;pickup 55;pickup 55;pickup 55;pickup 55;pickup 55;pickup 56; pickup 57; pickup 58; pickup 59};
            }
/ac {^�����ġ�����ʦ(Auctioneer)����%0��������%1��������}{pickup %0} 
/ac {^���е��߲����𶾷�����}{qt bat drug;de2 {cure 7batpoison};}
/ac {^����½�ҩ����ʱ�о��ö��ˡ��������е��߲����𶾲�û����ȫ}{qt bat drug;de1 {cure 7batpoison};}
/ac {^����½�ҩ����ʱ�о��ö��ˡ�������������������е��߲�����}{store bat drug}
/al ts tsell;
/al buypill {fy2wdz;de2 {wlk;s;w;/2 buy pill from xinghua};de4 {e;n;wdz2fy}}
/al buyall {gm 9000;de5 fy2qf;de6 {wlk;do e,e,buy beef meat from xiaofan;fyz};de7 {wlk;sb;do w,n,e,buy shui dai,w,s,s,e,s,buy sleepbag};de8 ffy;de9 {buybx;nwlk}}
/al buyall {gm 9000;de5 fy2qf;de6 {wlk;do e,e,buy beef meat from xiaofan;};de7 ffy;de8 qr;de9 {buybx;nwlk}}
/al buyall {gm 9000;de5 fy2qf;de6 {wlk;do e,e,buy beef meat from xiaofan;fyz};de7 {wlk;sb;do w,n,e,buy shui dai,w};de8 ffy;de9 {buybx;nwlk}}
/al buymeat {fy2qf;de3 {wlk;do e,e,buy beef meat from xiaofan;};de4 {wlk;w;;w;qf2fy}}
/nop qiankundai 
/nop {^[24]  �����ֻ�(shouhuan)                        1}
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
/ac {^�������Ǭ������}{/var hasqt 1;/var it_sn 101;/var it_code shouhuan1;/var it_num 0;/var it_n 0}{4}
/ac {^�����%0������Ǭ����}{/var it_code none;/var it_num 0;}
/ac {^��ײ�˴��ˣ��õ����⽱������%1��}{store %1}
/al getbatdrug {wlk;do w,w,w,w,d,w,get all from woodcase,store bat drug;nwlk}
/al st {remove %0;unwield %0;store %0}
/al gxy {give %0 to xiao yuer}
/ac {^����������ʹ��ʮ���ƽ�}{continue yes}
/ac {^�������״���޷�ǿ����ϰ}{sleep sleepbag}
/al gmg {/math ggold {%0*1000000};wlk;do d,w,w,w,n,withdraw $ggold;de4 {convert %0 tenthousand-cash to gold};de6 {do s,e,e,e,u;nwlk}} 
/ac {^����˵�����Ǯ������,�ָ��ȼ���Ҫ%0���ƽ�}{give %0 gold to gulong}
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
/ac {^��ġ�%1�������ˣ�$}{
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
/ac {^��%1%s(%2)%s-%s%3%s%4/%s0}{
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
/ac {^��������%1������Ǳ�ܡ�%2%s�����辭��ȼ���}{
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
/ac {^��ѧϰ����%1������Ǳ�ܡ�%2%s�����辭��ȼ���}{
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
/ac {^���%1����һ�����׵��о���}{;}
/ac {^�����ܵ��ĵ����Ļ��Ч��}{walk �κ���;de2 {dash mist}}
/nop ab2 ����
/al jmj {unwield all;perform jiemaijue}
/ac {^%1ͻȻ������Ĵָʳָ���������������������}{
/if {'%1'!='�㡯}{
/delay {1.5}{unwield all};
/showme ===npc dian wuqi====;
}
}
/al wzhanjia {do remove cloth,remove cloth 2,remove cloth 3,wear zhanjia}
/ac {^һƬ����У�}{ga forge}
/ac {^%1ͻȻ������Ĵָʳָ���������������������}{
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
/al tickl {/ticker {learn}{dol}{8}}
/al tickl- {/unticker {learn};}
