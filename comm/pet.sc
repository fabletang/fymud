/var haspet 0
/ac {^һֻСССС����}{/var haspet 1}
/ac {^�����С}{/var haspet 1;/showme --pet has 1----}
/al lp {look $petname}
/al aa {do whistle,order wear all,wield all,xixi $petname;}
/al wh {/var haspet 0;
            xixi $petname; 
            /delay {0.9}{
                /if {$haspet==0}{aa}}
                }
/al scorep {score $petname}
/al skillsp {skills $petname}
/al hpp {wlk;expp;hp $petname;wpet;nwlk}
/nop gp  give pet
/al gp {give %0 to $petname}
/nop rp  order pet return to you
/al rp {do order remove %0,order unwield %0,order give %0 to $myname}
/nop bat pet
/nop ����β����� ����Ӱǧ�ء���huanyinqianchong��
/al batk {performp shiwanshenmo}
/al batj {performp hyqc}
/nop {^�����ڲ����Դ����ڡ�}{/if {$is_kill==1||$is_walk==0}{/delay {pet}{wh}{2.1}}}
/al wpet {do order wear all,order wield all}
/al wwh {whistle}
