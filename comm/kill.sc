/nop dxc
/format petn {%n}{$petname}
/ac {^  %1(%2 %3)	** 战斗中 **(LV}{
    /format npc {%l %s}{%2}{%3};
   /showme ----npc=$npc; 
   getnpc;
}
/ac {^  %1(%2)	** 战斗中 **(LV}{
    /var petiskill 0
    /if {"%2"=="$petn"}{/var petiskill 1}{
        /format npc {%l}{%2};
        /showme ----npc=$npc; 
   getnpc;
   }
}
/ac {^设定环境变数：target = "YES"}{l;/delay {0.5}{kill $npc}}
