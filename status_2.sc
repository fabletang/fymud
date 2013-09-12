/split 0 2
/nop 精气神
/function {get_clor} {
/if {%1<70}{/var result <039>}{/var result <029>};
/if {%1<40}{/var result <019>}
}
/nop 内力灵力法力
/function {get_clor_2} {
/if {%1<100.0}{/var result <039>}{/var result <029>};
/if {%1<50}{/var result <019>}
}
/nop 食物水
/function {get_clor_3} {
/if {%1<30}{/var result <039>}{/var result <029>};
/if {%1<8}{/var result <019>}
}
/nop 敌对色彩
/var emy_clr <029>
/var emy_clr_2 <029>
/var jin_clr <029>
/var kee_clr <029>
/var sen_clr <029>
/var fce_clr <029>
/var eat_clr <029>
/var drk_clr <029>
/var atmana_clr <029>
/nop {^fystatus:kee:%1/%2/%3;gin:%4/%5/%6;sen:%7/%8/%9}{/var qi %1;/var jin %4;/var shen %7;refsta}
/nop al fcks {/showme fight check status}
/nop clean_var {/var emy_sen 100;/var emy_kee 100;/var emy_name_en none;nokill;nwlk}
/al clean_var {/var hasorder 0;/var emy_sen 100;/var emy_kee 100;/var emy_gin 100}
/al checkme {/showme Checkme}
/al ficheck {/showme Refesh}
/al fullme {nokill;nwlk;/showme Fullme}
/al refsta {
    /if {$is_kill==0}
    {clean_var;checkme}
    {ficheck}
}
/al full {
    /if {$is_kill==0 && $is_walk==0}{
    fullme;
    }{/showme ====is_kill =$is_kill \\ is_walk =$is_walk}
}
/nop al cks {hp;/delay {0.2}{/showme check status}}
/nop al cks {hp;/delay {0.5}{refsta}}
/al cks {full}
/al checkme {/showme Checkme}
/var kee_m_d 0
/var kee_s_d 0
/var kee_m_p 100
/var kee_s_p 100
/var gin_m_d 0
/var gin_s_d 0
/var gin_m_p 100
/var gin_s_p 100
/var sen_m_d 0
/var sen_s_d 0
/var sen_m_p 100
/var sen_s_p 100
/ac {^fystatus:kee:%1/%2/%3}
    {
    /var kee %1; /var kee_m %2; /var kee_s %3;
    /math kee_m_d {$kee_m - $kee};
    /math kee_s_d {$kee_s - $kee};
    /math kee_m_p {$kee_m_d/$kee_m*100.0};
    /math kee_s_p {$kee_s_d/$kee_s*100.0};
    refsta
    }
/ac {^fystatus:gin:%1/%2/%3}
    {
    /var gin %1; /var gin_m %2; /var gin_s %3;
    /math gin_m_d {$gin_m - $gin};
    /math gin_s_d {$gin_s - $gin};
    /math gin_m_p {100.0 * $gin_m_d / $gin_m};
    /math gin_s_p {$gin_s_d/$gin_s*100.0};
    refsta
    }
/ac {^fystatus:sen:%1/%2/%3}
    {
    /var sen %1; /var sen_m %2; /var sen_s %3;
    /math sen_m_d {$sen_m - $sen};
    /math sen_s_d {$sen_s - $sen};
    /math sen_m_p {$sen_m_d/$sen_m*100.0};
    /math sen_s_p {$sen_s_d/$sen_s*100.0};
    refsta
    }
/ac {^fystatus:kee:%1/%2/%3;gin:%4/%5/%6;sen:%7/%8/%9}
    {
    /var kee %1; /var gin %4; /var sen %7;
    /var kee_m %2; /var gin_m %5; /var sen_m %8;
    /var kee_s %3; /var gin_s %6; /var sen_s %9;
    /math kee_m_d {$kee_m - $kee};
    /math kee_s_d {$kee_s - $kee};
    /math kee_m_p {$kee_m_d/$kee_m*100.0};
    /math kee_s_p {$kee_s_d/$kee_s*100.0};
    /math gin_m_d {$gin_m - $gin};
    /math gin_s_d {$gin_s - $gin};
    /math gin_m_p {$gin_m_d/$gin_m*100.0};
    /math gin_s_p {$gin_s_d/$gin_s*100.0};
    /math sen_m_d {$sen_m - $sen};
    /math sen_s_d {$sen_s - $sen};
    /math sen_m_p {$sen_m_d/$sen_m*100.0};
    /math sen_s_p {$sen_s_d/$sen_s*100.0};
    checkme
    }{3}
/var emy_kee 100
/var emy_sen 100
/var emy_gin 100
/al temy {tt nemy:$npc|gin:$emy_gin|kee:$emy_kee|sen:$emy_sen|}
/al wemy {
    /if {"$team_header" == "$myname"}{}{
    whisper $team_header nemy:$npc|gin:$emy_gin|kee:$emy_kee|sen:$emy_sen|
    }
    }
/ac {^Enemy:sen:%1/100}{iskill;/var emy_sen %1;temy;refsta}
/ac {^Enemy:kee:%1/100}{iskill;/var emy_kee %1;temy;refsta}
/ac {^Enemy:gin:%1/100}{iskill;/var emy_gin %1;temy;refsta}
/ac {nemy:%1|gin:%2|kee:%3|sen:%4|}{
     /var npc %1;
     /var emy_gin %2;
     /var emy_kee %3;
     /var emy_sen %4;
     refsta
     }
/nop {你的耳边悄声说道：nemy:%1|gin:%2|kee:%3|sen:%4|}
/ac {^【四人帮】%+ emy:%1|gin:%2|kee:%3|sen:%4|}{
     /var npc %1;
     /var emy_gin %2;
     /var emy_kee %3;
     /var emy_sen %4;
     refsta
}
/var force 0
/var force_p 100
/ac {^fystatus:force:%1/%2;mana:%3/%4;atman:%5/%6}{
    /var force %1;
    /var force_s %2;
    /math force_p {$force/$force_s*100.0};
    /var mana %3;
    /var mana_s %4;
    /math mana_p {$mana/$mana_s*100.0};
    /var atman %5;
    /var atman_s %6;
    /math atman_p {$atman/$atman_s*100.0};
    checkme
}{3}
/ac {^fystatus:force:%1/%2}
    {
    /var force %1;
    /var force_s %2;
    /math force_p {$force/$force_s*100.0};
    refsta
    }
/nop 法力
/var mana 0
/var mana_p 100
/ac {^fystatus:mana:%1/%2}
    {
    /var mana %1;
    /var mana_s %2;
    /math mana_p {$mana/$mana_s*100.0};
    refsta
    }
/nop 灵力
/var atman 0
/var atman_p 100
/ac {^fystatus:atman:%1/%2}
    {
    /var atman %1;
    /var atman_s %2;
    /math atman_p {$atman/$atman_s*100.0};
    refsta
    }
/var err none
/prompt {^Refesh}{<039>※$myname※<099>精:$gin (-$gin_s_p%)气:$kee(-$kee_s_p%)神:$sen(-$sen_s_p%) 灵:$atman 内:$force |$npc|血:$emy_kee 神:$emy_sen}
/prompt {^Checkme}{<039>※$myname※<099>精:$gin (-$gin_s_p%)气:$kee(-$kee_s_p%)神:$sen(-$sen_s_p%)杀气:$shaqi|err:$err|drk:$f_drk eat:$f_eat}
/var f_eat 0
/var f_drk 0
/ac {^ 【精力】 %1/ %2 (%3%)    【食物】%4%}{
    /var gin %1;
    /var gin_m %2;
    /var gin_l_p %3;
    /math gin_s_p {100 - $gin_l_p};
    /math gin_m_p {100 - $gin/$gin_m * 100.0};
    /math gin_h {$gin/2};
    /var f_eat %4
}
/ac {^ 【气血】 %1/ %2 (%3%)    【饮水】%4%}{
    /var kee %1;
    /var kee_m %2;
    /var kee_l_p %3;
    /math kee_s_p {100 - $kee_l_p};
    /math kee_m_p {100-$kee/$kee_m*100.0};
    /math kee_h {$kee/2};
    /var f_drk %4
}
/ac {^ 【心神】 %1/ %2 (%3%)    【评价}{
    /var sen %1;
    /var sen_m %2;
    /var sen_l_p %3;
    /math sen_s_p {100 - $sen_l_p};
    /math sen_m_p {100-$sen/$sen_m*100.0};
    /math sen_h {$sen/2};
}
/nop ---todo
/ac {^ 【灵力】 %1/ %2 (%3)    【杀气】%4}{
    /var atman %1;
    /var atman_s %2;
    /math atman_p {$atman/$atman_s*100.0};
    /var shaqi %4
}
/ac {^ 【内力】 %1/ %2 (%3) }{
    /var force %1;
    /var force_s %2;
    /math force_p {$force/$force_s*100.0}
}
/ac {^ 【法力】 %1/ %2 (%3) }{
    /var mana %1;
    /var mana_s %2;
    /math mana_p {$mana/$mana_s*100.0};
    refsta
}
/al he {do get skin from bag,drink skin,put skin in bag}
/al chi {do get meat from bag,eat meat,put meat in bag}
/ac {^你拿起%1喝了几口}{/var he_ok 1;/delay {4}{full}}
/ac {^你拿起%1咬了几口}{/var chi_ok 1;/delay {4}{full}}
/ac {^你已经将%1喝得一滴也不剩}{/var err "not drink"}

/ac {^你的食物或饮水为零} {
    /var he_ok 0;
    /var chi_ok 0;
    hp; 
    /show {f_drk= $f_drk | f_eat= $f_eat};
    /if {$f_drk<2}{
        he;
        /if {$he_ok==1}{de4 {dazuo}}{/var err "no drink"}
        }{/var he_ok 1};
    /if {$f_eat<2}{
        chi;
        /if {$chi_ok==1}{de4 {dazuo}}{/var err "no eat"}
        }{/var chi_ok 1};
    checkme
    }
/ac {^你盘腿跌坐在地上，闭上眼}{nokill;nwlk;/showme ----dazuo}
/ac {^你从忘我的境界中回神敛气}{full;/showme ----dazuo finish}
/ac {^你不可以在这里打坐}{wlk;/showme ----cannot dazuo}
/nop hl
/nop {^你觉得一阵天旋地转，头涨得像要裂开}{/delay {2}{full}}
/ac {^你盘膝而坐，闭上眼睛开始凝聚思绪}{/delay {2}{full}}
/nop hs 
/ac {^你盘膝而坐，静坐冥思}{/delay {2}{full}}
/nop hn
/ac {^你坐下来运气用功，一股内息}{/delay {2}{full}}
/ac {^你现在身体状况太差了，无法吐纳练功}{/showme --todo}
/ac {^疗伤时至少需要有最大内力值护体}{de2 {hn;dazuo}}
/ac {^你呼吸由低而响，愈来愈是粗重}{/delay {1}{full}}
/ac {^战斗中不能打坐}{iskill}
/ac {^战斗中不能吐纳练功}{iskill}

/al hl {exercise jing $gin_h}
/al hn {exercise qi $kee_h}
/al hf {exercise shen $sen_h}
/ac {^Fullme}{
    hp;
    /delay {0.5}{
    /if {$f_drk<2}{he};
    /if {$f_eat<2}{chi};
   /nop showme  {gin_m_p=$gin_m_p kee_m_p=$kee_m_p sen_m_p=$sen_m_p};
    /if {$kee_s_p>9}{
        /showme {===yaoheal};
        yaoheal; 
        hh;
        /delay {4}{full}
        };
    /if {$kee_m_p>10}{dazuo};
    /if {$gin_m_p>10}{dazuo};
    /if {$sen_m_p>10}{dazuo};
   /nop showme  {force_p=$force_p atman_p=$atman_p};
    /if {$atman_p<110}{hl}; 
    /if {$force_p<120}{hn} 
    }
}
