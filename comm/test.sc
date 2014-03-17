/nop coinfindpath
/al ddcoin {
keychain -coin;
ddcoin+;
dd $c_num coin
}
/var c_num 1
/al ddcoin- {
/var c_num 1;
/unac {文钱(Coin)}
}
/al ddcoin+ {
var has_coin 0;
/ac {文钱(Coin)}{/var has_coin 1};
/delay {0.5}{
l west ;
/if {$has_coin == 1}{}{/var has_coin_1 0;/math c_num {$c_num + 1}; w; dd $c_num coin;};
/if {$c_num > 7}{keychain -coin}
}
/delay {1.0}{
l east;
/if {$has_coin == 1}{}{/var has_coin_1 0;/math c_num {$c_num + 1}; e; dd $c_num coin;};
/if {$c_num > 7}{keychain -coin}
}
/delay {1.5}{
l north ;
/if {$has_coin == 1}{}{/var has_coin_1 0;/math c_num {$c_num + 1}; n; dd $c_num coin;};
/if {$c_num > 7}{keychain -coin}
}
/delay {2.0}{
l south ;
/if {$has_coin == 1}{}{/var has_coin_1 0;/math c_num {$c_num + 1}; s; dd $c_num coin;};
/if {$c_num > 7}{keychain -coin}
}}
/nop ================================================
/var npc none
/list npcs {}
/al getnpcs {
    /list npcs clear;
    id here;
    }
/ac {^%1%s =%2,%3$}{/list npcs add %3;}
/ac {^%1%s = %2,%3,%4$}{/list npcs add %3;}{4}
/var nums 0
/ac {^你连忙点头哈腰，笑眯眯的接了过来。}{
    /if {$nums>1}{/math nums {$nums - 1}};
    /if {$nums<=1}{
    /showme cxok==;
    }{
    /delay {4}{
    /showme --=-nums=$nums;
    /list npcs {get}{$nums}{npc};
    caxie $npc;
    }
    }
}
/ac {^%1一脚踢开了你，道：今天我已经擦过}{
    /if {$nums > 1}{/showme --nums--$nums;/math nums {$nums-1}};
    /showme --+-nums=$nums;
    /delay {4}{
        /if {$nums<=1}{
        /showme cxok--; 
        }{
        /list npcs {get}{$nums}{npc};
        /showme --+-npc=$npc;
        caxie $npc;
        }
        }
}
/al cxtest {
    getnpcs;
    /delay {1.2}{
    /showme npcs==$npcs;
        /list npcs {size}{nums};
        /list npcs {get}{$nums}{npc};
        /showme cxtest-nums=$nums;
    /delay {2}{caxie $npc};
   }
   }
