/ac {^û���κ��쳣״̬�����С�}{/showme ===buff none==;}
/ac {^������ƽ���������ӿ	49 sec}{}
/ac {^���ꡤ��������%s%1%ssec}{/showme ===debuff dead %1;}
/ac {^����Ѫ���������������ͣ�һʱ��Ȼ�˲����⹦����}{stat}
/ac {^��粽��������է��%s%1%ssec}{/showme ===debuff nopfm %1;}
/ac {^��ֻ���û���һ�ȣ����е�}{stat;/showme ===debuff noweapon ��������=====;}
/ac {^ӥצ��������%s%1%ssec}{/showme ===debuff nopfm %1;}
/ac {^һ����������������%s%1%ssec}{/delay {%1} {do wield sword,stat,i}}
/ac {^���ֱ����飬һʱ�޷��������������}{i}
/ac {ͻȻ������Ĵָʳָ���������������������}{
        /delay {0.5}{unwield all};
        /delay {1}{unwield all};
        /delay {1.5}{unwield all};
}{4}
/ac {�����е�%0����֪��ô�������˵��£�$}{get sword;get blade;get hammer;get needle;wi all}
/ac {^�����Ŀ����벻����}{/if {$runok==1}{run $target}}
/var runok 1
/ac {^���ÿ30��(����ѩ2����)�����һ�Σ�%1��}{/var runok 0;/var runt %1;/math runt {120-$runt};/delay {$runt}{/var runok 1}}
