/var team_header chan;
/var teamer_1 lykos
/var teamer_2 gypsy
/var teamer_3 gun
/var helper nurse;
/var is_together 0;
/al setheader {/var team_header %0}
/var hasorder 0
/al tat {
    /var hasorder 0;
    /var is_together 0;
    whisper $teamer_1 team_at?;
    whisper $teamer_2 team_at?
}
/ac {��Ķ�������˵����team_at?}{/var hasorder 0;whisper $team_header yes.$team_header}{1}
/ac {��Ķ�������˵����yes.}{/math is_together {$is_together + 1}}{1}
/al tk {
tat;
/delay {1.5}{/if {$is_together > 0}{
    whisper $teamer_1 KKK%0;
    whisper $teamer_2 KKK%0;
    ki %0;
    }{/showme ��Ա ���� $is_together;team talk ��Ա ��ʧ}};
/delay {3}{/var is_together 0}
}
/al ttk {
    whisper $teamer_1 KKK%0;
    whisper $teamer_2 KKK%0;
    ki %0
}
/ac {��Ķ�������˵����EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {�����㣺EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {��Ķ�������˵����KKK%0}{/var hasorder 1; ki %0}

/al tta {tell $teamer_1 EX%0}
/al ttb {tell $teamer_2 EX%0}
/al ttc {tell $teamer_3 EX%0}
/al ttd {tell $teamer_4 EX%0}
/al tte {tell $teamer_5 EX%0}

/al t {
    /if {"$team_header" == "$myname"}{
    whisper $teamer_1 EX%0;
    /delay {0.8}{whisper $teamer_2 EX%0};
    /var EX %0;
    /replace {EX}{,}{;};
    /delay {1.6}{$EX}
    }{/showme you not leader}}
/al ttt {
    tta %0;
    ttb %0;
    /var EX %0;
    /replace {EX}{,}{;};
    /delay {1.4}{$EX}
}
/ac {^�����Ը����룬���� %0��}{%0}
/ac {^���� %0 �����������}{tt quest}
/al tc {tta follow none;ttb follow none;ttc follow none}
/al tf {
whisper $teamer_1 EXfollow $team_header;
whisper $teamer_2 EXfollow $team_header
}
/al tq {
    tta qq;
    ttb qq;
    /delay {0.5} {qq}}

/al tth {tell $team_header EX%0}
/al th {tell $helper EX%0}
/al tg {give %0 to $helper}
/al tget {whisper $helper EXget %0 from bag,give %0 to $myname}
/al qgc {give %2 to %1;whisper %1 EXcun %2}
/ac {^��������ɳ��������һЩ�����㼸���ھ����п��˳���}{tell $team_header ����ɳ����}
/al csoulto {conjure soul_sense on %0;conjure soul_sense on $myname}
/ac {^%0�����㣺teamsoul}{csoulto $teamer_2; /delay {2}{csoulto kisskill}; /delay {4}{csoul}}
/al tsoul {csoulto $teamer_2; /delay {2}{csoulto $teamer_1}; /delay {4}{csoulto $teamer_3};/delay {6}{csoul}}
/al tcks {
    tta stat;ttb stat;stat;
    tta cks;ttb cks;cks
}
/al thh1 {tell $healer_1 EXhh $myname}
/al thh2 {tell $healer_2 EXhh $myname}
/al thh {tell $healer_1 EXhhh $myname;tell $healer_2 EXhh $myname}
/al tjg {whisper %1 EXd,s; /delay {1.5}{d;s;give %2 to %1};}
/al tjgg {whisper %1 OKok $myname;whisper %1 EXd,s; /delay {1.5}{d;s;whisper %1 EXgb %2,give %2 to $whisper_name,n,u}; /delay {2}{n;u}}
/ac {����Ķ�������˵����OKok %0}{/var whisper_name %0;ok %0}
/al tteam {
    team with $teamer_1;
    de1 {team with $teamer_2};
   de3 {team with $teamer_3};
   de4 {team name ���˰�}
}
/ac {^%0����Ķ�������˵����heal |%1|}{/al healto {hh %1}; healto}
/al yaoheal {/if {"$team_header" == "$myname"}{}{whisper $team_header heal |$myname|}}
/al askkill {whisper $team_header killwho |$myname|}
/ac {^%0����Ķ�������˵����killwho |%1|}{whisper %1 KKK$npc;/showme kill $npc;}
/unac {^��ʹ����ǧҶ�Ʒ�}{/if {$hasorder==0}{askkill;iskill}}
/unac {^��˫�ֺ�ʮ����ü����}{/if {$hasorder==0}{askkill;iskill}}
