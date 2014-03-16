/var haspet 0
/ac {^一只小小小小宠物}{/var haspet 1}
/ac {^你对着小小}{/var haspet 1;/showme --pet has 1----}
/al lp {look $petname}
/al aa {do whistle,order wear all,wield all,xixi $petname;}
/al wh {/var haspet 0;
            xixi $petname; 
            /delay {0.9}{
                /if {$haspet==0}{aa}}
                }
/al scorep {score $petname}
/al skillsp {skills $petname}
/al hpp {wlk;expp;hp $petname;nwlk}
/nop gp  give pet
/al gp {give %0 to $petname}
/nop rp  order pet return to you
/al rp {do order remove %0,order unwield %0,order give %0 to $myname}
/nop bat pet
/nop §幻梦步法§ 『幻影千重』〔huanyinqianchong〕
/al batk {performp shiwanshenmo}
/al batj {performp hyqc}
/ac {^你现在不可以吹口哨。}{/if {$is_kill==1||$is_walk==0}{/delay {pet}{wh}{2.1}}}
