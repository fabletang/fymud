/config speedwalk off
/nop �趨�س�ֻ�������ϴε����
/config {MCCP}     {off}
/config {repeat enter} on
/config {ECHO COMMAND} on
/config {SCROLL LOCK} on
/config {CONNECT RETRY} 30
/config {DEBUG TELNET} off
/config {CONVERT META} off
/split 0 1
/ac {^�����ġ��������(Tian ji)��������ӿ}{save;look;de2 hpnt}
/ac {^�����}{d}
/al ffy {recall back;do w,n,e,e,e,n}
/al fyz {recall back}
/al fys {walk �����ϳ���}
/al fyn {walk ���Ʊ�����}
/al fye {walk ���ƶ�����}
/al fyw {walk ����������}
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
/al gofull {do w,d,sleep sleepbag} 
/var jingqi 100
/ac {^�� �� �� ��%s%1/%s%2%s(%3%)%s�� �� �� ��}{/var jingqi %1;/showme --jingqi=$jingqi;
    /if {%1<90}{sleep sleepbag;sleep}}
/al checkjingqi {/showme checkjingqi--}
/ac {^��һ��������ֻ����������}{look;hpnt;de1 checkjingqi}
/ac {^�����鱦��}{hpnt}
/ac {^checkjingqi--}{/if {$jingqi>100}{gowork}}
/ac {^�������ۡ������Ƿ�������ɵ��ڵ�����}{gofull2}
/ac {^  �̸�(Priest)}{de4 {gofull};/delay {gowork}{hpnt}{8}}
/ac {^�������������˼��㣬��վ��վ������}{wtick;/var peiyao 0;/var caxie 0;/var copy 0}
/al dfout {do su,sd,s,s,d,d,d,d,d,d,d,d;de1 {do d,d,d,d,d,d,d,d,d,d,d,ne}}
/ac {^һ����紵ɢ���������}{dfout;wtick}
/al asksoup {ask mengpo about soup}
/ac {^  �������ȥ�� ����(Mengpo)}{asksoup}
/ac {^�����ܵ��ĵ����Ļ��Ч����ʧ�ˡ�}{walk �κ���;dash mist}
/ac {^����̨}{do nw,s,dash mist}
/nop ac {^ƽ����}{s}
/ac {^  (����) �������ֻء� ����(Yurui)}{dash mist}
/ac {^����˺��ģ�һͷ����������֮��}{wtick}
/al gowork {d;fyz;walk ������;wtick}
/al gowork {wtick;do w,recall back;/delay {1}{do w,s,e,e,s}}
/al wtick {/ticker {work}{look}{8}}
/al wtick- {/unticker {work}}
/al askwork {ask tie jiang about job;}
/ac {^����˵����%0(%1)}{cxt-;%1;}
/ac {^  �������ϰ� ����(Tie jiang)}{askwork}
/ac {^��������������Ǹ���Ĺ�Ǯ��}{hpnt;de2 {/if {$peiyao==0}{askwork}{do n,n}}}
/ac {^����˵���������ϸ����δ�������˰ɣ�}{do n,n;save}
/ac {^ƽһָ˵��������㾭�飬��һ���嶼û��}{do s,s}
/al askpeiyao {ask ping about job}
/ac {^  ��ҩʦЭ��᳤��ɱ����ҽ��ƽһָ(Ping yizhi)}{askpeiyao}
/ac {^ƽһָ˵����%0(%1)}{%1}
/ac {^ƽһָ˵��������ɵĻ��������ô��}{peiyao}
/ac {^ƽһָ���������ҩ}{hpnt;de1 {askpeiyao}}
/var fish 0
/var peiyao 0
/var copy 0
/var caxie 0
/ac {^�� ƽ �� ��%1�� �� �� ��%s%2}{
    /var ntexp %2;
    /showme ntexp=$ntexp;
    /if {$ntexp>10000}{/var peiyao 1};
    /if {$ntexp>100000}{/var caxie 1};
    /if {$ntexp>500000 && $fish==0}{
        /unticker {cx};
       wtick;
        /delay {6} {gotodie};
       /delay {12}{hpnt};
       cxt-;
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
/ac {^����˵�����㻹��Ъ�����}{gofull}
/ac {^ƽһָ˵�����������Ҳ̫�������˰ɡ�}{walk ��Ժ}
/al askcopy {ask zhu xi about job}
/ac {^  ����(Zhu xi)}{askcopy}
/ac {^����˵�����ã���Ͱ��ҳ���(%1)}{%1}
/ac {^����˵�������㳭�����㳭���ˣ�}{copy}
/ac {^����˵������Ȼ������ֻ�ǳ�����}{gowork}
/ac {^ͨ����ζ�����������}{;}
/ac {^���俴���㳭д����}{hpnt;de1 askcopy}
/ac {^����˵����������Ҳ�����飿}{/unticker work;walk �ӻ���;de1 {buy brush};de2 {cxt}}
/nop ac {^����˵����������Ҳ�����飿}{s;gotodie}
/var shoeshines 0
/var cani 1
/ac {^�����ϴ���������Щ����(���� %1%, Я���� %2/%3 )��}{/math cani {%3-%2}}
/al buyxieyou {fyz;do w,s,e,s,buy 8 shoeshine,drop shoeshine 7;de2 {do buy brush,drop brush 2}}
/ac {^�������������������һ֧Ь�͡�}{}
/al yzn {fyz;walk ����}
/al yzs {fyz;walk ����}
/al yze {fyz;walk ����}
/al yzw {fyz;walk ����}
/al cxyzn {
    caxie wu;
    de4 {caxie bing 1};
    de8 {caxie bing 2};
    /delay {12}{do s,caxie meipo};
    /delay {16}{do s,caxie ouyang};
    /delay {20}{do s,caxie li apo};
    /delay {24}{do n,n,w,caxie nan xian};
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
    /delay {1}{walk �����֬��};
    /delay {2}{caxie man 1};
    /delay {5}{caxie man 2};
    /delay {8}{caxie girl 1};
    /delay {11}{caxie girl 2};
    /delay {14}{caxie fang er};
    /delay {17}{/showme cxfy4sw--finish};
}
/al cxfy2nwn {
    /delay {1}{walk ��Ժ;};
    /delay {2}{caxie kaoguan};
    /delay {5}{caxie student 1};
    /delay {8}{caxie student 2};
    /delay {11}{caxie student 3};
    /delay {14}{/showme cxfy2nwn--finish};
}
/al cxfyw {
    walk ��������;
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
    /delay {1}{walk ��ʨ�ھִ���};
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
    /delay {73}{drop coin;ffy};
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
    /delay {119}{dd coin;/showme cxyzall--finish}
}
/al cx+ {
/showme --cx+;
   /ac {^%1%s= %2 %3,bing}{/showme ====%3====;caxie %3;};
   /ac {^%1%s= %2 %3,%4,%5}{/showme ----sdfdsfsdf}
}
/al cx- {
/unac {^  �佫(Wu jiang)(LV7)};
}
/nop 115 168
/al cx {buyxieyou;de5 {cxyzall};/delay {124}{cxfyall}}
/al cxt {cx;/ticker {cx}{cx}{311}}
/al cxt- {/unticker {cx}}
/ac {^����������(draw)�����ˣ��װ׵�����һ�����}{fish}
/ac {^��ˮ�ϰ�}{fish}
/ac {^��ĸ�����Ȼ����һ��}{draw diao gan}
/ac {^��ĸ��Ӻ������ҡ�ڸ���ͣ��}{draw diao gan}
/ac {^�������һ������}{drop jiyu}
/ac {^������û������ˡ�}{s;buyyuer}
/al buyyuer {fyz;w;s;e;s;buy 5000 yu er;do n,w,n,n,n,n,n,n,n,n;fish}
/ac {^���￴������������ӡ�}{buyyuer}
/ac {^��˳��һ����}{de1 fish}
/al fzz {do w,recall back,e,goto zhongzhou}
/al zzbuyxieyou {fzz;de4 {walk �ӻ���};de5 {do buy brush,drop brush 2};de8 {do buy 7 shoeshine,drop shoeshine 7,drop coin};}
/al cxzz {zzbuyxieyou;/delay {12}{cxzzall}}
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
    walk ��������;
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
    walk ����¥;
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
    walk ���ݱ���;
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
    walk ϷԺ;
    /delay {1}{caxie zhong 1};
    /delay {5}{caxie zhong 2};
    /delay {9}{caxie zhong 3};
    /delay {13}{do n,caxie kid};
    /delay {18}{caxie kid 2};
    /delay {22}{do s,s,caxie dan};
    /delay {27}{caxie xi zi};
    /delay {32}{walk ��ױ��};
    /delay {33}{caxie dan 1};
    /delay {37}{caxie dan 2};
    /delay {41}{caxie dan 3};
    /delay {45}{do e,caxie zhong 1};
    /delay {50}{caxie zhong 2};
    /delay {54}{/showme --cxzzxy ok};
}
/al cxzze {
    walk ����;
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
    walk ����;
    /delay {1}{caxie yi};
    /delay {5}{caxie zhou};
    /delay {10}{do n,w,caxie fu shang};
    /delay {15}{caxie han};
    /delay {20}{walk �ڳǶ���};
    /delay {21}{caxie du cha};
    /delay {25}{caxie bing 1};
    /delay {29}{caxie bing 2};
    /delay {33}{caxie bing 3};
    /delay {37}{caxie bing 4};
    /delay {41}{/showme --cxzdp ok}
}