/var team_header chan;
/var teamer_1 lykos;
/var teamer_2 nurse;
/var teamer_3 gun;
/var helper nurse;
/var healer_1 nurse;
/var healer_2 hard;
/var is_together 0;
/al setheader {/var team_header %0}
/al tat {
    /var is_together 0;
    whisper $teamer_1 team_at?;
}
/ac {��Ķ�������˵����team_at?}{whisper $team_header yes.$team_header}{1}
/ac {��Ķ�������˵����yes.}{/math is_together {$is_together + 1}}{1}
/al tk {
tat;
/delay {1.8}{/if {$is_together > 0}{
    whisper $teamer_5 KKK%0;
    /delay {1.5}{ki %0}
    }{/showme ��Ա ���� $is_together;team talk ��Ա $teamer_1 ��ʧ}};
/delay {3}{/var is_together 0}
}
/al ttk {
    whisper $teamer_1 KKK%0;
    /delay {1}{ki %0}
}
/ac {��Ķ�������˵����EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {�����㣺EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {��Ķ�������˵����KKK%0}{ki %0}

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
    /delay {2.4}{$EX}
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
/al tc {tta follow none;ttb follow none;ttc follow none;ttd follow none;tte follow none;}
/al tf {
whisper $teamer_1 EXfollow $team_header;
}
/al tq {
    tta quest;
    ttb quest;
    quest}

/al tth {tell $team_header EX%0}
/al th {tell $helper EX%0}
/al tg {give %0 to $helper}
/al tget {whisper $helper EXget %0 from bag,give %0 to $myname}
/al qgc {give %2 to %1;whisper %1 EXcun %2}
/ac {^��������ɳ��������һЩ�����㼸���ھ����п��˳���}{tell $team_header ����ɳ����}
/al csoulto {conjure soul_sense on %0;conjure soul_sense on $myname}
/ac {^%0�����㣺teamsoul}{csoulto $teamer_2; /delay {2}{csoulto kisskill}; /delay {4}{csoul}}
/al tsoul {csoulto $teamer_2; /delay {2}{csoulto $teamer_1}; /delay {4}{csoulto $teamer_3}; /delay {6}{csoulto $teamer_4}; /delay {8}{csoulto $teamer_5}; /delay {10}{csoul}}
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
   /delay {2} {team with $teamer_2};
   /delay {9} {team name ���˰�}
}
