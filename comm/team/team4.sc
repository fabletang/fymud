/var team_header curer;
/var teamer_1 tank;
/var teamer_3 sinker;
/var teamer_2 gun;
/var helper miii;
/var healer_1 curer;
/var is_together 0;
/al setheader {/var team_header %0}

/al tat {
    /var is_together 0;
    whisper $teamer_1 team_at?;
    whisper $teamer_2 team_at?;
    whisper $teamer_3 team_at?
}
/ac {��Ķ�������˵����team_at?}{whisper $team_header yes.$team_header}{1}
/ac {��Ķ�������˵����yes.}{/math is_together {$is_together + 1}}{1}
/al tk {
tat;
/delay {1.5}{/if {$is_together > 1}{
    /delay {2.0}{whisper $teamer_1 KKK%0;whisper $teamer_2 KKK%0;};
    /delay {2.5}{whisper $teamer_3 KKK%0};
    /delay {3.0}{ki %0}
    }{/showme ��Ա ���� $is_together;team talk ��Ա $teamer_1 ��ʧ}};
/delay {3}{/var is_together 0}
}
/al ttk {
    whisper $teamer_1 KKK%0;
    /delay {0.5}{whisper $teamer_2 KKK%0};
    /delay {1}{whisper $teamer_3 KKK%0;};
    /delay {1.5}{ki %0}
}
/ac {��Ķ�������˵����EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {�����㣺EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {��Ķ�������˵����KKK%0}{ki %0}

/al tth {tell $team_header EX%0}
/al tta {tell $teamer_1 EX%0}
/al ttb {tell $teamer_2 EX%0}
/al ttc {tell $teamer_3 EX%0}
/al ttd {tell $teamer_4 EX%0}
/al tte {tell $teamer_5 EX%0}

/al t {
    /if {"$team_header" == "$myname"}{
    whisper $teamer_1 EX%0;
    /var EX %0;
    /replace {EX}{,}{;};
    /delay {0.3}{whisper $teamer_2 EX%0};
    /delay {0.9}{whisper $teamer_3 EX%0};
    /delay {1.5}{$EX}
    }{/showme you not leader}}
/ac {^�����Ը����룬���� %0��}{%0}
/ac {^���� %0 �����������}{tt quest}
/nop al tc {tell $teamer_1 EXfollow none;tell $teamer_2 EXfollow none;follow none}
/al tc {tta follow none;ttb follow none;ttc follow none;}
/al tf {
whisper $teamer_1 EXfollow $team_header;
whisper $teamer_2 EXfollow $team_header;
whisper $teamer_3 EXfollow $team_header
}
/al tq {tta quest;ttb quest;ttc quest;quest}

/al ggh {give %0 to $team_header}
/al gga {give %0 to $teamer_1}
/al ggb {give %0 to $teamer_2}
/al ggc {give %0 to $teamer_3}

/al th {tell $helper EX%0}
/al tg {give %0 to $helper}
/al tget {whisper $helper EXget %0 from bag,give %0 to $myname}
/al tget {tell $helper EXget %0 from bag,give %0 to $myname}
/al qgc {give %2 to %1;whisper %1 EXcun %2}
/ac {^��������ɳ��������һЩ�����㼸���ھ����п��˳���}{tell $team_header ����ɳ����}
/al csoulto {conjure soul_sense on %0;conjure soul_sense on $myname}
/al csoulto {conjure soul_sense on %0}
/ac {^%0�����㣺teamsoul}{csoulto $teamer_2; /delay {2}{csoulto kisskill}; /delay {4}{csoul}}
/al tsoul {csoulto $teamer_2; /delay {2}{csoulto $teamer_1}; /delay {4}{csoulto $teamer_3};/delay {6}{csoulto $myname}}
/al tcks {
    tta stat;ttb stat;ttc stat;stat;
    tta cks;ttb cks;ttc cks;cks;
    de1 {
        whisper $teamer_1 Report status:$healer_1;
        whisper $teamer_2 Report status:$healer_1;
        whisper $teamer_3 Report status:$healer_1;
    }
}
/al tfull {
   tcks;
   de2 {tta hn;ttb hn;ttc hn}
}
/ac {����Ķ�������˵����Report status:%0}{
    /if {$qi_per<94 || $qi_per_delta <80}{whisper %0 heal:$myname}{
            /showme qi_per:$qi_per qi_per_delta:$qi_per_delta;
            hn;
            }
    }

/ac {����Ķ�������˵����heal:%1}{
    /if {$myname == $healer_1}{
     /if {$is_walk==0}{hh %1}{/showme walking....};
        }   
}
/al thh1 {tell $healer_1 EXhh $myname}
/al thh2 {tell $healer_2 EXhh $myname}
/al thh {tell $healer_1 EXhhh $myname;tell $healer_2 EXhh $myname}
/al tjg {whisper %1 EXd,s; /delay {1.5}{d;s;give %2 to %1};}
/al tjgg {whisper %1 OKok $myname;whisper %1 EXd,s; /delay {1.5}{d;s;whisper %1 EXgb %2,give %2 to $whisper_name,n,u}; /delay {2}{n;u}}
/ac {����Ķ�������˵����OKok %0}{/var whisper_name %0;ok %0}
/al tteam {
    team with $teamer_1;
   /delay {2} {team with $teamer_2};
   /delay {4} {team with $teamer_3};
}
/ac {^���ַ�            %1 }{
    tell $team_header status-err:$myname=���ַ�;
    tt $myname : ���ַ� %1;  
}
