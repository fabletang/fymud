/split 0 2
/nop 精气神 
/function {get_clor} {
/if {%1<70}{/var result <039>}{/var result <029>};
/if {%1<40}{/var result <019>}
}
/nop 内力灵力法力
/function {get_clor_2} {
/if {%1<100}{/var result <039>}{/var result <029>};
/if {%1<50}{/var result <019>}
}
/nop 食物水
/function {get_clor_3} {
/if {%1<30}{/var result <039>}{/var result <029>};
/if {%1<8}{/var result <019>}
}

/nop 敌对色彩
/var emy_clr <029>
/var emy_clr_2 <029>
/var jin_clr <029>
/var kee_clr <029>
/var sen_clr <029>
/var fce_clr <029>
/var eat_clr <029>
/var drk_clr <029>
/var atmana_clr <029>
/var jin_per 100
/var kee_per 100
/var sen_per 100
/var fce_per 100
/var atmana_per 100
/ac {~[1;33m◆经验◆[2;37;0m[37m %0 [1;36m◇升级所需◇[2;37;0m[37m %1 [37m}{/var exp %0;say exp $exp}{say none}
/prompt {^check status}{<039>※$myname※<099> 精: $jin1 ($jin_per%) 气: $qi1 ($qi_per%) 神: $shen1 ($shen_per%)}
/al fcks {/showme fight check status}
/al cks {hp;/delay {0.2}{/showme check status}}
/al clean_var {/var emy_sen 100;/var emy_kee 100;/var emy_name_en none;nokill;nwlk}
