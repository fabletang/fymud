/ac {^û���κ��쳣״̬�����С�}{/all {/showme ===debuff none:$myname==;}}
/ac {^������ƽ���������ӿ	%s%1%s sec}{/all {/showme ===debuff noweapon ��������=====}}
/ac {^���ꡤ��������%s%1%ssec}{/showme ===debuff dead %1;}
/ac {^����Ѫ���������������ͣ�һʱ��Ȼ�˲����⹦����}{stat}
/ac {^��粽��������է��%s%1%ssec}{/showme ===debuff nopfm %1;}
/ac {^��ֻ���û���һ�ȣ����е�}{stat;get blade;get piece;/all {/showme ===debuff noweapon ��������=====};}
/ac {^ӥצ��������%s%1%ssec}{/showme ===debuff nopfm %1;}
/ac {^һ����������������%s%1%ssec}{/delay {%1} {wim;stat;i}}
/ac {^���ֱ����飬һʱ�޷��������������}{i}
/ac {ͻȻ������Ĵָʳָ���������������������}{
        /all {/showme ===npc Ҫ���������ˣ���=====};
        unwield all;
        /delay {0.5}{unwield all};
        /delay {1}{unwield all};
        /delay {1.5}{unwield all};
        /delay {1.9}{unwield all};
}{4}
/ac {�����е�%0����֪��ô�������˵��£�$}{get piece;get sword;get blade;get staff;get hammer;get needle;wim}
/ac {^�����Ŀ����벻����}{/if {$runok==1}{run $target}}
/var runok 1
/ac {^���ÿ30��(����ѩ2����)�����һ�Σ�%1��}{/var runok 0;/var runt %1;/math runt {120-$runt};/delay {%1}{/var runok 1}}
