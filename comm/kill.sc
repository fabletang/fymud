/nop dxc
/format petn {%n}{$petname}
/ac {^  %1(%2 %3)	** ս���� **(LV}{
    /format npc {%l %s}{%2}{%3};
   /showme ----npc=$npc; 
   getnpc;
}
/ac {^  %1(%2)	** ս���� **(LV}{
    /var petiskill 0
    /if {"%2"=="$petn"}{/var petiskill 1}{
        /format npc {%l}{%2};
        /showme ----npc=$npc; 
   getnpc;
   }
}
/ac {^�趨����������target = "YES"}{l;/delay {0.5}{kill $npc}}
