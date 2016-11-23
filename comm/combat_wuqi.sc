/var wq_anqi 0
/var wq_blade 0
/ac {^你将仙人刺握在}{/var wq_anqi 1;/var wq_blade 0}
/ac {^你放下手中的仙人刺}{/var wq_anqi 0;/var wq_blade 0}
/ac {^你抽出一把明晃晃的}{/var wq_blade 1;/var wq_anqi 0}
/ac {^你放下手中的星辉}{/var wq_blade 0;/var wq_anqi 0}
/ac {^你放下手中的红月}{/var wq_blade 0;/var wq_anqi 0}
/ac {^  √星辉(Jade)}{/var wq_blade 1;/var wq_anqi 0}
/ac {^  √红月(Jade)}{/var wq_blade 1;/var wq_anqi 0}
/ac {^  √%1仙人刺}{/var wq_blade 0;/var wq_sword 0;/var wq_anqi 1}
/al wianqi {/if {$wq_anqi==0}{/if {$wq_blade==1||$wq_sword==1}{unwi jade};enable parry tanzhi-shentong;enable parry starrain;wi needle} }
/al wiblade {/if {$wq_blade==0}{ /if {$wq_anqi==1}{unwi needle};enable parry chillblade;wi jade} }
/var wq_sword 0
/ac {^你「唰」地一声抽出一把}{/var wq_sword 1;/var wq_anqi 0;/var wq_blade 0}
/ac {^  √清风剑(Jade)}{/var wq_sword 1;/var wq_anqi 0;/var wq_blade 0}
/ac {^你将手中的%1插入腰间的剑鞘}{/var wq_sword 0;/var wq_anqi 0;/var wq_blade 0}
/al wisword {/if {$wq_sword==0}{/if {$wq_anqi==1}{unwi needle};enable parry qingfeng-sword;wi jade}}
