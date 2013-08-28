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
