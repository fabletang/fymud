/var team_header light;
/var teamer_1 shine;
/nop var teamer_1 tank;
/nop var teamer_4 light;
/nop var teamer_5 shine;
/nop var teamer_3 gun;
/nop var teamer_2 nurse;
/var healer_1 nurse;
/var healer_2 hard;
/var is_together 0;
/al setheader {/var team_header %0}

/al tat {
    /var is_together 0;
    whisper $teamer_1 team_at?
}
/ac {你的耳边悄声说道：team_at?}{whisper $team_header yes.$team_header}{1}
/ac {你的耳边悄声说道：yes.}{/math is_together {$is_together + 1}}{1}
/al tk {
tat;
/delay {1.5}{/if {$is_together > 0}{
   /delay {0.2} whisper $teamer_1 KKK%0;
   /delay {0.5}{ki %0}
    }{/showme 队员 数量 $is_together;team talk 队员 $teamer_1 丢失}};
/delay {3}{/var is_together 0}
}
/al ttk {
    whisper $teamer_1 KKK%0;
    /delay {0.5}{ki %0}
}
/ac {你的耳边悄声说道：EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {告诉你：EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {你的耳边悄声说道：KKK%0}{ki %0}

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
    /delay {1}{$EX}
    }{/showme you not leader}}
/ac {^如果你愿意加入，请用 %0。}{%0}
/ac {^队友 %0 的任务被你完成}{t quest}
/nop al tc {tell $teamer_1 EXfollow none;tell $teamer_2 EXfollow none;follow none}
/al tc {tta follow none;ttb follow none;ttc follow none;ttd follow none;tte follow none;}
/al tf {
whisper $teamer_1 EXfollow $team_header;
}
/al tq {
    tta quest;
    quest}

/al tth {tell $team_header EX%0}
/al th {tell $helper EX%0}
/al tg {give %0 to $helper}
/al tget {whisper $helper EXget %0 from bag,give %0 to $myname}
/al qgc {give %2 to %1;whisper %1 EXcun %2}
/ac {^你又在流沙中陷深了一些！！你几乎在绝望中哭了出来}{tell $team_header 掉流沙里了}
/al csoulto {conjure soul_sense on %0;conjure soul_sense on $myname}
/ac {^%0告诉你：teamsoul}{csoulto $teamer_2; /delay {2}{csoulto kisskill}; /delay {4}{csoul}}
/al tsoul {csoulto $teamer_2; /delay {2}{csoulto $teamer_1}; /delay {4}{csoulto $teamer_3}; /delay {6}{csoulto $teamer_4}; /delay {8}{csoulto $teamer_5}; /delay {10}{csoul}}
/al tcks {
    tta cks;cks;
    tta stat;stat
}
/al thh1 {tell $healer_1 EXhh $myname}
/al thh2 {tell $healer_2 EXhh $myname}
/al thh {tell $healer_1 EXhhh $myname;tell $healer_2 EXhh $myname}
/al tjg {whisper %1 EXd,s; /delay {1.5}{d;s;give %2 to %1};}
/al tjgg {whisper %1 OKok $myname;whisper %1 EXd,s; /delay {1.5}{d;s;whisper %1 EXgb %2,give %2 to $whisper_name,n,u}; /delay {2}{n;u}}
/ac {在你的耳边悄声说道：OKok %0}{/var whisper_name %0;ok %0}
/al tteam {
    team with $teamer_1;
   /delay {2} {team with $teamer_2};
   /delay {4} {team with $teamer_3};
   /delay {6} {team with $teamer_4};
   /delay {8} {team with $teamer_5}
}
