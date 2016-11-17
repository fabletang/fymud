/split 0 2
/nop ¾«ÆøÉñ
/function {get_clor} {
/if {%1<70}{/var result <039>}{/var result <029>};
/if {%1<40}{/var result <019>}
}
/nop ÄÚÁ¦ÁéÁ¦·¨Á¦
/function {get_clor_2} {
/if {%1<100}{/var result <039>}{/var result <029>};
/if {%1<50}{/var result <019>}
}
/nop Ê³ÎïË®
/function {get_clor_3} {
/if {%1<30}{/var result <039>}{/var result <029>};
/if {%1<8}{/var result <019>}
}
/nop µÐ¶ÔÉ«²Ê
/var emy_clr <029>
/var emy_clr_2 <029>
/var jin_clr <029>
/var kee_clr <029>
/var sen_clr <029>
/var fce_clr <029>
/var eat_clr <029>
/var drk_clr <029>
/var atmana_clr <029>
/nop var jin_per 100
/var kee_per 100
/var sen_per 100
/var fce_per 100
/var atmana_per 100
/var emy_kee 100
/var emy_sen 100
/var npc none 
/var fce 1000
/var fce_m 1000
/nop {~[1;33m¡ô¾­Ñé¡ô[2;37;0m[37m %0 [1;36m¡óÉý¼¶ËùÐè¡ó[2;37;0m[37m %1 [37m}{/var exp %0;say exp $exp}{say none}
/nop prompt {^check status}{<039>¡ù$myname¡ù<099> ¾«: $jin1 ($jin_per%) Æø: $qi1 ($qi_per%) Éñ: $shen1 ($shen_per%)}
/prompt {^check status}{<039>¡ù$myname¡ù<099> ¾«: $jin ($jin_per%) Æø: $qi ($qi_per%) Éñ: $shen ($shen_per%) É±Æø:$shaqi}
/al fcks {/showme fight check status}
/var cks_l 0
/al cks_al {hp;/delay {0.2}{/showme check status}}
/al cks_rd {/al cks_al {hp;/delay {0.2}{/showme check status}}}
/al cks {cks_al;/al cks_al {/showme ---has check---};/delay {0.1}{cks_rd}}
/al cks {hp;/delay {0.2}{/showme check status}}
/al clean_var {/var emy_sen 100;/var emy_kee 100;/var emy_name_en none;nokill;nwlk}
/ac {^Enemy:sen:%1/100}{/var emy_sen %1;/showme Getnpc}
/ac {^Enemy:kee:%1/100}{/var emy_kee %1;/showme Getnpc}
/al getnpc {/showme Getnpc}
/prompt {^Getnpc}{<039>¡ù$myname¡ù<099>¾«:$jin Æø:$qi Éñ:$shen ÄÚÁ¦:$fce |$npc=Ñª:$emy_kee Éñ:$emy_sen}
/ac {^fystatus:kee:%1/%2/%3}{/var qi %1;/showme Getnpc}
/ac {^fystatus:sen:%1/%2/%3}{/var shen %1;/showme Getnpc}
/ac {^fystatus:gin:%1/%2/%3}{/var jin %1;/showme Getnpc}
/nop ac {^fystatus:kee:%1/%2/%3;gin:%4/%5/%6;sen:%7/%8/%9}{/var qi %1;/var jin %4;/var shen %7;/showme Getnpc}
/ac {^fystatus:force:%1/%2}{/var fce %1;/var fce_m %2;/showme Getnpc}
/nop {^  ½÷É÷µÄ  ¹¬ÄÏÑà(Gong nanyan)	** Õ½¶·ÖÐ **(LV89)}
/nop {fystatus:kee:2523/2523/2523;gin:1236/1236/1236;sen:1236/1236/1236}
/nop {fystatus:force:777/777;mana:450/225;atman:450/225}
