/var npc ������
/var npc_name
/var en_qb 0
/nop {$npc(%1)}{say %1;@lowerLetter{};/var npc_name $result;say e $npc_name;say %1;say $result}
/ac {^���������}{q_item_buy-;quest}
/ac {^�������˵�������һء�%0��}{/var en_qb 1; /var is_buy 1;/var q_item %0;/var q_item_name 0;}
/unac {^�����ڵ�������ɱ��%0����}{/line log quest-fy4.log}
/ac {^�����ڵ�������%0Ѱ��%1��}{/var en_qb 1; /var q_item %1}
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

/ac {^��%1����%2��(%3) }{/if {"$q_item"=="%2"}{/var q_item_name %3}}
/al buyitem {/grep $q_item;/echo $q_item;/echo $q_item_name;bxl $q_item; qput $q_item_name;qput $q_item}
/al askshuizhi {ask lu yu about ˮ��}
/ac {^�� %0 ��%1��(%2)}{/if {"$q_item"=="%1"}{buy $q_item from xiangling;/var q_item_name %2;buy $q_item_name from xiangling;cun $q_item_name}}
/nop ��ҩ������
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
/al wdnt {fy2wdz; /delay {2}{/4 s;e;ask farmer about ����}}
/al bycs {wlk;do d,n,n,e,n,ask youngman about ����,s,w,s,s,u,quest;nwlk}
/ac {^�����ڵ�������: ȥ�䵱��ũ���������}{}
/ac {^������ũ�����йء����⡻}{
    gototh;
}
/al gototh {w;/4 n;/3 e;}
/al jqnt {wlk;d;/5 s;e;ask zhong liuxiu about ����;/delay {1}{w;/5 n;u;nwlk}}
/ac {^����������һ������}{ki sentry}
/ac {^ ��ʬ}{ki prisoner}
/al anzhenzhu {answer �л�����ֱ���ۣ�Ī���޻�����֦}
/nop riddle
/al askhongxue {ask hongxue about cuinong}
/al askcuinong {ask cuinong about ����ѩ}
/al anhongxue {answer �������Ҷ����ˣ���Ҳ�������ȥ��}
/al ancuinong {answer ����ȥ���������ǣ�}
/nop ������
/al askhahaer {
    ask haha er about ��æ;
    answer a;gb bird tongue;e;give bird tongue to chef;w;give entry to haha er;
    /delay {1}{
        ask haha er about ��æ;
    answer b;gb pork;e;give pork to chef;w;give entry to haha er;
    };
    /delay {2}{
        ask haha er about ��æ;
    answer a;gb bear palm;e;give bear palm to chef;w;give entry to haha er;
    }
}
/al askmenghuan {
    ask meng huan about ���鱻��;
    ask meng huan about ������;
    ask meng huan about �ؾ�¥;
    learn literate from meng huan with 1
}
/al askmasteryuan {
    ask master yuan about ������;
    answer ��Ҫ��;
    answer ���鱻��
}
/al askmasterhu {
    ask master about ���鱻��;
    /delay {2}{ask master about �ؾ�¥};
    /delay {4}{answer ����}
}
/al buyscroll {d;/2 n;/2 w;u;buy scroll from xu;give xu scroll;/delay {0.5}{d;/2 e;/2 s;u;l scroll}}
/al returnscroll {d;/2 n;/2 w;u;give xu scroll;/delay {0.5}{d;/2 e;/2 s;u;l scroll}}
/nop get leaf for dqg
/al askmonk {fy2qf;/delay {4}{/2 e;/2 eu;nu;w;ask monk about meat};}
/al askshuilingguang {s;push jade;e;ask shui lingguang about ������;push jade;w;n}
/ac {^�������˵���ţ����û��ʲô�¸��㣬������}{/delay {180}{asktianji}}
/al asktianji {ask tian ji about �㱨;quest}
/al bossjinchuan+ {
    /ac {^��ֻ����ǰ��ʰ��}{e;e;/ticker {east}{e;/delay {0.2}{e}}{0.5}};
    /ac {^����ֻ����ǰ��ʰ��}{stopk;e;e;/ticker {east}{e;/delay {0.2}{e}}{0.5}};
    /ac {^���}{/2 w;cks;bossjinchuan-}
}
/al bossjinchuan- {
    /unticker {east};
    /unac {^��ֻ����ǰ��ʰ��};
    /unac {^����ֻ����ǰ��ʰ��};
    /unac {^���}
}
/ac {^  ��ƭ�����������}{bossjinchuan+}
/ac {���ĵ�����ʱ��ʱ��}{
    listen;
    /delay {0.5}{maonv2hua};
    /delay {1.5}{ask qing qing about �䵶}
    }
/ac {һ�����Ƶ�������֪�Ӻδ�����}{listen}
/ac {�����Ȼ��ֹ}{/delay {1}{apprentice hua zhenzhen}}
/ac {^���˸�ʽ����������}{unwi all; wi jade; chop vine; make tengluo}
/ac {^���ͳ�һ��������}{climb down;
    /delay {6}{get all from ����; climb up};
    /delay {12}{give jian zi to girl}
    }
/ac {^���ס�����·��һ��ʯ�����๸����Լ���Կ�������д�š���Ȫ}{get wineskin from bag;fill wineskin; drink wineskin}
/ac {^�ϹϾ�ҡҡ�λεع���}{kill pumpkin gnome}
/ac {�ϹϾ�(Pumpkin gnome)}{kill pumpkin gnome}
/ac {^�����ڿ����������ر����(end)}{ask guo dama about end}
/al qst+ {/ticker {quest}{quest;qb}{60}}
/al qst- {/unticker {quest}}
/ac {^һ�����׶���ը�죬�t��̨��}{kill soldier 3;kill soldier 2;kill soldier}
/ac {^��Ȼ������һȺ�ٷ�}{kill gangster 3;kill gangster 2;kill gangster;kill shanxi laoda}
/ac {^�������ı��ʹ��˸�����}{kill drunk guest}
/ac {^���۹������������û�뵽}{kill oldguy}
/ac {^�������������촽��Ц������}{kill drunk monk}
/ac {^��֪С����ǰ�ƺ�ӵ�س��˹���}{kill kid; kill kid 2;kill kid 3; kill kid 4;kill kid 5;kill kid 6;kill kid 7}
/ac {^һ�����������ĸ�����Զ����������������ƽ�ߵ�Լ��}{ask ping qi about �������}
/unac {^�������˵�����������������֯Ƶ������㲻��ȥ�ҳ�����ĺ���}{wlk;d;e;s;ask chuili seng about ������֯;n;w;u;nwlk}
/al maze {wlk;d;e;s;ask chuili seng about ������֯;n;w;u;nwlk}
/ac {^����������ĵض���˵��ɽˮ����������ڡ����ˡ�}{jqnt}
/ac {^��ϲ���㿪ʼ��һ�������⣺�ع�����}{eu;/delay {2}{ed}; /delay {4}{su}}
/ac {^һ����Ӱͻ��}{qie}
/nop ac {^�������Ľ�ɮ��ɱ����}{qie;bs;/delay {4}{qie;bs}}
/nop al qie {stopk;unwi whip;perform panguaxe;wi whip}
/al bk {stopk;wi whip;perform firestorm}
/al bs {stopk;wi whip;perform thousandfeather}
/al ale {conjure summon4;conjure summon3;conjure summon2;conjure summon1;}
/ac {^�Һ�ɫ��������Ȼ������ǰ����}{ale}
/al qdm {exert powerup;exert damageup}
/ac {^������֪��ͻȻ�Ƶ������}{hp}
/ac {^������֪��ͻȻ�Ƶ����ʻ������}{hp}
/ac {^���ֻ�������项��һ�����죬����һ������}{exert qi 2000;de2 {exert qi 2000};de3 {exert qi 2000}}
/ac {^������һ������ͷ}{/unticker {kill};de4 {nd;ed;eu;ed;eu;ed;eu;open door;nu};de10 {1;use demon drug};de12 {qeatall}}
/al qeatall {eat mantou;/delay {4}{drink flask}; /delay {8}{use demon drug;hp}}
/al xq {exert qi %0}
/nop ac {���Ѿ���������״̬}{eat pill;hp}{3}
/nop ac {�㿴�����Ѿ����������ˣ��������˲���}{exert qi 1000;hp}{3}
/nop ac {���ƺ�ʮ��ƣ��}{exert qi 800;hp}{3}
/ac {^�ڵ������㹪��һ������ɢ��ȥ}{qpowerup}{3}
/al qpowerup {exert powerup;/delay {4}{exert damageup}}
/nop al q {exert qi 1000}
/al ii {eat pill;exert qi 2000;hp}
/ac {^������÷������ɱ����}{ki meihuadao}
/al giveqiuyin {
qiuyin+;
/6 push stone;
/delay {3}{get all};
/delay {4}{ww 5};
/delay {5}{ww 3;/3 sw;};
/delay {6}{l southeast;/delay {1}{se;l east};/delay {2}{e;l northeast};/delay {3}{ne;};/delay {5}{north}};;
}
/al qiuyin+ {
/ac {^����µĺ�Ҷ΢΢һ��}{u;l southeast;/delay {1}{se;l east};/delay {2}{e;l northeast};/delay {3}{ne};/delay {5}{north}};
/ac {^  ���µ�һ��͵}{
n;
/delay {1}{/4 {give qiu yin to sikong}};
/delay {3}{/4 {give qiu yin to sikong}};
/delay {5}{/4 {give qiu yin to sikong}};
/ac {^����µĺ�Ҷ΢΢һ��}{u};
/ac {^������}{fill skin;qiuyin-;/3 ne;/delay {1}{ee 4};/delay {2}{ee 4;cks;}};
/delay {7}{s;sw;w;nw};
}
}
/al qiuyin- {
/unac {^����µĺ�Ҷ΢΢һ��};
/unac {^  ���µ�һ��͵};
/unac {^������}
}
/al tqiuyin {
/ac {^˾��ժ�����������ͷ������Ц����������}{unwi all;learn monkey-claw from sikong with 1;/unticker {qiuyin};/unac {^˾��ժ�����������ͷ������Ц����������}};
/ticker {qiuyin}{giveqiuyin}{120}}
/ac {^����ľ˵������������}{give 1 baiyao to kaka mu;de3 {fi kaka mu}}
/al askwurong {ask wurong about ��ɫ����;answer ����}
/ac {^������˵�����������ˣ������򲻹�ƽ��}{give 1 baiyao to nanren;de3 {fi nanren}}
/ac {^����ʹ�߶���˵�����������һ�أ�}{accept test;tell ghost no face}
/al xintask {cancel;de1 {newtask}}
/al askxiaoyuer {ask xiao yuer about cancel;de2 {ask xiao yuer about help}}
/nop С���˵�����������locate faked meijian����λ
/ac {^С���˵�����������locate %0��}{/al ll locate %0;/al fll {follow %0};/al kll {ki %0}}
/ac {^����ľ˵�����ϻ���˵}{startk}
/ac {^������˵�������ҿ����㵽���м���}{startk}
/al askqingbo {ask qingbo about ����;de4 {ask qingbo about Ԭ��;kill assassin;ki assassin;};de5 {ki assassin}}
/ac {^��ˮ��Ȼһ�������ವ���������Ӱ}{kill assassin;ki assassin;/showme todo}
/al askzhang {
    ask zhang about �ɸ봫��;
    de2 {ask zhang about �岨����};
    de4 {ask zhang about �ɸ봫��};
    de6 {ask zhang about �ɸ봫��};
    de8 {ask dai yin about ����};
    }
/al askmedman {
    ask medman about ���ɢ;
    de2 {answer ����};
}
/al givemedman {
    give snake pearl to medman;
    give lawan to medman;
    give hair to medman;
}
/al asklang {
  remove all;
  wear botao;
  ask tianpeng lang about ����; 
  de2 {ask tianpeng lang about ����}; 
  de4 {ask tianpeng lang about ����}; 
  de6 {ask tianpeng lang about ����}; 
  de8 {ask tianpeng lang about ����}; 
  de10 {ask tianpeng lang about ����}; 
  de12 {ask tianpeng lang about ����}; 
  de14 {ask tianpeng lang about ����}; 
}
/ac {^������ת����ȥ}{get lawan}
/ac {^�����ɺ��е��������ӷ�������λʩ���Ǻ��ɸ���}{answer ��ƽ;de2 {qeatall}}
/ac {^������÷����ɱ����}{de1 stopk;ale;de6 {bs}}
/al re {repair}
/al whlaopi {whisper laopi С��;whisper laopi ����;de1 {do kill sun legate,out}}
/ac {^��������Ƥ�����ˮǰ˵��������仰}{charge center;get grass;give grass to xiao lin}
/al askxiaonv {
ask xiaonu about here;
de2 {ask xiaonu about xiao};
de4 {ask xiaonu about ТŮ��};
de6 {ask xiaonu about ���ֻ�};
de8 {ask xiaonu about ��ʯ}
}
/al buystone {
list;
de1 {buy ikebana stone from fang;arrange;ki fang}
}
/al askqiandao {recall back;w;n;w; ask qiandao npc about ǩ��;de1 {e;e;e;e;n;hp;save}}
/al qf {quest fail}
/ac {^�������˵�����뵽���������������ɱ��}{stat}
/ac {^�����ڵ�������: ��������ȥɱ}{stat}
/al askxy askxiaoyuer
/al kb {ki bandit}
