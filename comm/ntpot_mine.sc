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
/al gofull2 {do w,d,recall back;de1 {do w,s,e,s,buy sleepbag};de5 {sleep sleepbag}} 
/al gofull {do w,d,sleep sleepbag} 
/var jingqi 100
/ac {^�� �� �� ��%s%1/%s%2%s(%3%)%s�� �� �� ��}{/var jingqi %1;
    /if {%1<90}{sleep sleepbag;sleep}}
/al checkjingqi {/showme checkjingqi--}
/ac {^��һ��������ֻ����������}{look;hpnt;de1 checkjingqi}
/ac {^��һ��������ֻ����������}{look;stat;fyz;de1 {do w,n,w,ask nan xian about ״̬�ָ�};de3 hpnt}
/ac {^�����鱦��}{hpnt}
/ac {^checkjingqi--}{/if {$jingqi>100}{gowork}}
/ac {^�������ۡ������Ƿ�������ɵ��ڵ�����}{gofull2}
/ac {^  �̸�(Priest)}{/var godie 0;de4 gofull;/delay {gowork}{hpnt}{8}}
/ac {^�������������˼��㣬��վ��վ������}{/var godie 0;wtick;/var peiyao 0;/var caxie 0;/var copy 0}
/al dfout {do su,sd,s,s,d,d,d,d,d,d,d,d;de1 {do d,d,d,d,d,d,d,d,d,d,d,ne}}
/ac {^һ����紵ɢ���������}{/var godie 1;dfout;wtick}
/al asksoup {ask mengpo about soup}
/ac {^  �������ȥ�� ����(Mengpo)}{/var godie 1;asksoup}
/ac {^�����ܵ��ĵ����Ļ��Ч����ʧ�ˡ�}{walk �κ���;dash mist}
/ac {^����̨}{do nw,s,dash mist}
/nop ac {^ƽ����}{s}
/ac {^  (����) �������ֻء� ����(Yurui)}{dash mist}
/ac {^����˺��ģ�һͷ����������֮��}{wtick}
/al gowork {d;fyz;walk ������;wtick}
/al gowork {wtick;do w,recall back;/delay {1}{do w,s,e,e,s}}
/ac {^������}{gowork}
/al wtick {/ticker {work}{look}{8}}
/al wtick- {/unticker {work}}
/al askwork {ask tie jiang about job;}
/ac {^����˵����%0(%1)}{cxt-;%1;}
/ac {^  �������ϰ� ����(Tie jiang)}{askwork}
/ac {^��������������Ǹ���Ĺ�Ǯ��}{hpnt;de2 {/if {$peiyao==0}{askwork}{do n,n}}}
/ac {^����˵���������ϸ����δ�������˰ɣ�}{do n,n;hp;save}
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
/var mine 0
/var godie 0
/ac {^�� ƽ �� ��%1�� �� �� ��%s%2}{
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
/ac {^����˵�����㻹��Ъ�����}{gofull}
/ac {^ƽһָ˵�����������Ҳ̫�������˰ɡ�}{walk ��Ժ}
/al askcopy {ask zhu xi about job}
/ac {^  ����(Zhu xi)}{askcopy}
/ac {^����˵�����ã���Ͱ��ҳ���(%1)}{%1}
/ac {^����˵�������㳭�����㳭���ˣ�}{copy}
/ac {^����˵������Ȼ������ֻ�ǳ�����}{gowork}
/ac {^ͨ����ζ�����������}{;}
/ac {^���俴���㳭д����}{hpnt;de1 askcopy}
/ac {^����˵����������Ҳ�����飿}{s;gomine}
/ac {^����������(draw)�����ˣ��װ׵�����һ�����}{fish}
/ac {^��ˮ�ϰ�}{fish}
/ac {^��ĸ�����Ȼ����һ��}{draw diao gan}
/ac {^��ĸ��Ӻ������ҡ�ڸ���ͣ��}{draw diao gan}
/ac {^�������һ������}{drop jiyu}
/ac {^������û������ˡ�}{s;buyyuer}
/al buyyuer {fyz;w;s;e;s;buy 5000 yu er;de2 {do n,w,n,n,n,n,n,n,n,n;fish}}
/ac {^���￴������������ӡ�}{buyyuer}
/ac {^��˳��һ����}{de1 fish}
/al fhz {do w,recall back,e,goto hangzhou}
/al askmine {ask jian gong about mine}
/al gomine {wtick;fhz;/delay {5}{walk ͭ��ɽ};/delay {6} {askmine}}
/ac {^ͭ��ɽ}{askmine}
/ac {^�๤˵�����ã����¾�ȥ��(%1)}{/if {$godie==0}{%1}{w;}}
/ac {^�๤������������Ŀ�ʯ}{askmine}
/ac {^��ȥ���µ������쵽�˹�Ǯ}{hpnt;}
