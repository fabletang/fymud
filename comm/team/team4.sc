/var team_header curer;
/var teamer_1 tank;
/var teamer_3 sinker;
/var teamer_2 gun;
/var helper miii;
/var healer_1 curer;
/var is_together 0;
/al setheader {/var team_header %0}
/var serial 1;

/nop  {你的耳边悄声说道：team_at?}{whisper $team_header yes.$team_header}{1}
/nop  {你的耳边悄声说道：team_at?}{ok $team_header}{1}
/nop  {你的耳边悄声说道：yes.}{/math is_together {$is_together + 1}}{1}
/nop  {爽快地对你说道：“好吧}{/math is_together {$is_together + 1}}{1}
/ac {^你在%1的耳边悄声说道：team_at?}{
/var teamer_cn %1;
    /if {"$teamer_cn"=="$teamer_3_cn"||"$teamer_cn"=="$teamer_2_cn"||"$teamer_cn"=="$teamer_1_cn"}{
        /math is_together {$is_together + 1};
    }
}
/ac {在你的耳边悄声说道：team_at?}{buff}
/al ttk {
    whisper $teamer_1 KKK%0;
    /delay {0.5}{whisper $teamer_2 KKK%0};
    /delay {1}{whisper $teamer_3 KKK%0;};
    /delay {1.5}{ki %0}
}
/ac {你的耳边悄声说道：EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {告诉你：EX%0} {/var EX %0; /replace {EX}{,}{;};$EX}
/ac {你的耳边悄声说道：KKK%0}{ki %0}

/al tth {tell $team_header EX%0}
/al tta {tell $teamer_1 EX%0}
/al ttb {tell $teamer_2 EX%0}
/al ttc {tell $teamer_3 EX%0}
/al ttd {tell $teamer_4 EX%0}
/al tte {tell $teamer_5 EX%0}
/al wwh {whisper $team_header EX%0}
/al wwa {whisper $teamer_1 EX%0}
/al wwb {whisper $teamer_2 EX%0}
/al wwc {whisper $teamer_3 EX%0}

/al t {
    /if {"$team_header" == "$myname"}{
    /var EX look;
    /var EX %0;
    /nop if {"$EX"==""}{/showme t需要参数;/var EX l};
    pl {
    /replace {EX}{,}{;};
    whisper $teamer_1 EX%0;
    whisper $teamer_2 EX%0;
    /if {"$teamer_3"=="none"}{}{whisper $teamer_3 EX%0};
    $EX;
    };pr;
    }{/showme ===you not leader}
    }
/ac {^如果你愿意加入，请用 %0。}{%0}
/ac {^队友 %0 的任务被你完成}{tt quest}
/al tq {
    wwa quest;wwb quest;
    /if {"$teamer_3"=="none"}{}{wwc quest};
    quest;
    }

/al ggh {give %0 to $team_header}
/al gga {give %0 to $teamer_1}
/al ggb {give %0 to $teamer_2}
/al ggc {give %0 to $teamer_3}

/al th {tell $helper EX%0}
/al tg {give %0 to $helper}
/al tget {whisper $helper EXget %0 from bag,give %0 to $myname}
/al tget {tell $helper EXget %0 from bag,give %0 to $myname}
/al qgc {give %2 to %1;whisper %1 EXcun %2}
/ac {^你又在流沙中陷深了一些！！你几乎在绝望中哭了出来}{tell $team_header 掉流沙里了}
/al csoulto {conjure soul_sense on %0;conjure soul_sense on $myname}
/al csoulto {conjure soul_sense on %0}
/ac {^%0告诉你：teamsoul}{csoulto $teamer_2; /delay {2}{csoulto kisskill}; /delay {4}{csoul}}
/al tsoul {csoulto $teamer_2; /delay {2}{csoulto $teamer_1}; /delay {4}{csoulto $teamer_3};/delay {6}{csoulto $myname}}
/al tfull {
   tcks;
   de2 {tta hn;ttb hn;ttc hn}
}
/ac {在你的耳边悄声说道：Report status:%0}{
    /if {$qi_per<94 || $qi_per_delta <80}{whisper %0 heal:$myname}{
            /showme qi_per:$qi_per qi_per_delta:$qi_per_delta;
            hn;
            }
    }

/ac {在你的耳边悄声说道：heal:%1}{
    /if {$myname == $healer_1}{
     /if {$is_walk==0}{hh %1}{/showme walking....};
        }   
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
}
/ac {^少林匪            %1 }{
    tell $team_header status-err:$myname=少林匪;
    tt $myname : 少林匪 %1;  
}

/al tat {
  pl {
    /var is_together 0;
    whisper $teamer_1 team_at?;
    whisper $teamer_2 team_at?;
    /if {"$teamer_3"=="none"}{}{whisper $teamer_3 team_at?};
    /showme ---check team;
    };pr;
}
/var npc none;
/ac {^---check team}{
/math serial {$serial+1};
/showme {===队员数量: $is_together};
    /if {$is_together > 0}{
    pl {
    whisper $teamer_1 KKK$npc;
    whisper $teamer_2 KKK$npc;
    /if {"$teamer_3"=="none"}{}{whisper $teamer_3 KKK$npc};
    ki $npc;/var is_together 0;
    };pr;
    }{/showme {===队员数量: $is_together};team talk 队员 $teamer_1 丢失:$serial};
    }
/al tk {
/var npc %0;
buff;
tat;
}
/al tcks {
    tta stat;ttb stat;stat;
    tta cks;ttb cks;cks;
    /if {"$teamer_3"=="none"}{}{ttc stat;ttc cks;};
    de1 {
        whisper $teamer_1 Report status:$healer_1;
        whisper $teamer_2 Report status:$healer_1;
        /if {"$teamer_3"=="none"}{}{whisper $teamer_3 Report status:$healer_1};
        teamhp;
    }
}
/al tcks {
    tta stat;ttb stat;stat;
    tta cks;ttb cks;cks;
    /if {"$teamer_3"=="none"}{}{ttc stat;ttc cks;};
    de1 {
        wwa /showme --checkall;
        wwb /showme --checkall;
        /if {"$teamer_3"=="none"}{}{wwc /showme --checkall};
        teamhp;
        /showme --checkall;
    }
}
/al tfull {
   tcks;
   de2 {tta hn;ttb hn;
    /if {"$teamer_3"=="none"}{}{ttc hn};
   }
}
/al tw {
whisper $teamer_1 EX%0;
whisper $teamer_2 EX%0;
/nop whisper $team_header EX%0;
/if {"$teamer_3"=="none"}{}{whisper $teamer_3 EX%0;};
}
/al tf {
  /if {"$team_header" == "$myname"}{
  tw follow $team_header;
  }{/showme ===you not leader};
}
/al wf tf;
/al wc tc;
/al wq tq;
/al a t;
/al ak tk;
/al tc {tta follow none;ttb follow none;
        /if {"$teamer_3"=="none"}{}{ttc follow none;};
        }
