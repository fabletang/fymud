/var team_header tank;
/var teamer_1 nurse;
/var teamer_2 lily;
/var helper nurse;
/var healer_1 nurse;
/var is_together 0;
/al setheader {/var team_header %0}

/al tat {/var is_together 0;whisper $teamer_1 team_at?}
/ac {你的耳边悄声说道：team_at?}{whisper $team_header yes.$team_header}{1}
/ac {你的耳边悄声说道：yes.}{/var is_together 1}{1}
/nop al tk {
stat;
/delay {1}{/if {$is_together == 1}{whisper $teamer_1 KKK%0;whisper $teamer_2 KKK%0;/delay {0.5}{ki %0}}{/showme 队员 $teamer_1 丢失;team talk 队员 $teamer_1 丢失}}
}

/al tk {
tat;
/delay {1.5}{/if {$is_together == 1}{whisper $teamer_1 KKK%0;/delay {1}{ki %0};}{/showme 队员 $teamer_1 丢失;team talk 队员 $teamer_1 丢失}};/delay {3}{/var is_together 0}
}
/ac {你的耳边悄声说道：EX%0} {/var EX %0;/replace {EX}{,}{;};$EX}
/ac {告诉你：EX%0} {/var EX %0;/replace {EX}{,}{;};$EX}
/nop ac {告诉你：KKK%0} {ki %0;oath}
/ac {你的耳边悄声说道：KKK%0}{/delay {0.5}{ki %0}}

/al tta {tell $teamer_1 EX%0}
/al ttb {tell $teamer_2 EX%0}
/al tt {/if {"$team_header" == "$myname"}{whisper $teamer_1 EX%0;/var EX %0;/replace {EX}{,}{;};/delay {1.7}{$EX}}{/showme you not leader}}
/ac {^如果你愿意加入，请用 %0。}{%0}
/ac {^队友 %0 的任务被你完成}{tt quest}
/al tc {tell $teamer_1 EXfollow none;tell $teamer_2 EXfollow none;follow none}
/al tf {whisper $teamer_1 EXfollow $team_header;}
/al tq {tell $teamer_1 EXquest;quest}

/al tth {tell $team_header EX%0}
/al th {tell $helper EX%0}
/al tg {give %0 to $helper}
/al tget {whisper $helper EXget %0 from bag,give %0 to $myname}
/al qgc {give %2 to %1;whisper %1 EXcun %2}
/ac {^你又在流沙中陷深了一些！！你几乎在绝望中哭了出来}{tell $team_header 掉流沙里了}
/al csoulto {conjure soul_sense on %0;conjure soul_sense on $myname}
/ac {^%0告诉你：teamsoul}{csoulto $teamer_2;/delay {2}{csoulto kisskill};/delay {4}{csoul}}
/al tsoul {csoulto $teamer_2;/delay {2}{csoulto $teamer_1};/delay {4}{csoul}}
/al thh {tell $healer_1 EXhh $myname}
/al tcks {whisper $teamer_1 EXcks;cks}
