/ac {^没有任何异常状态作用中。}{/showme ===buff none==;}
/ac {^大旗风云剑·风起云涌	49 sec}{}
/ac {^还魂·虚弱不堪%s%1%ssec}{/showme ===debuff dead %1;}
/ac {^（你血脉不畅，真气受滞，一时竟然运不起外功。）}{stat}
/ac {^金虹步法·苍龙乍现%s%1%ssec}{/showme ===debuff nopfm %1;}
/ac {^你只觉得虎口一热，手中的}{stat;/showme ===debuff noweapon 武器掉了=====;}
/ac {^鹰爪功·锁脉%s%1%ssec}{/showme ===debuff nopfm %1;}
/ac {^一刀流剑术·棋盘切%s%1%ssec}{/delay {%1} {do wield sword,stat,i}}
/ac {^你手臂酸麻，一时无法拿起这件武器。}{i}
/ac {突然将右手拇指食指相屈，眼神变得迷离而朦胧}{
        /delay {0.5}{unwield all};
        /delay {1}{unwield all};
        /delay {1.5}{unwield all};
}{4}
/ac {你手中的%0，不知怎么就落在了地下！$}{get sword;get blade;get hammer;get needle;wi all}
/ac {^你距离目标距离不够。}{/if {$runok==1}{run $target}}
/var runok 1
/ac {^冲锋每30秒(非铁雪2分钟)最多用一次（%1）}{/var runok 0;/var runt %1;/math runt {120-$runt};/delay {$runt}{/var runok 1}}
