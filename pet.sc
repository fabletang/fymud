/nop haspet 0
/nop petname 英文名字 
/var haspet 0
/ac {^一只小小小小宠物}{/var haspet 1}
/ac {^你对着小小}{/var haspet 1;/showme --pet has 1----}{2}
/al lp {look $petname}
/al aa {do whistle,order wear all,wield all,xixi $petname;}
/al wh {/var haspet 0;
            xixi $petname; 
            /delay {2.2}{
                /if {$haspet==0}{aa}}
                }
/al scorep {score $petname}
/al skillsp {skills $petname}
/al hpp {wlk;expp;hp $petname;nwlk}
/nop gp  give pet
/al gp {give %0 to $petname}
/nop rp  order pet return to you
/al rp {order give %0 to $myname}
/nop bat pet
/nop 『十万神魔』〔shiwanshenmo〕：一招五式
/nop §幻梦步法§ 『幻影千重』〔huanyinqianchong〕
/al batk {performp shiwanshenmo}
/al batj {performp hyqc}
