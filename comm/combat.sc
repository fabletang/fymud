/nop {^  咆哮的 豹虎冈长盟 拳破山 雷老虎(Bandit leader)<冻僵中>	** 战斗中 **(LV154)}
/al rekicker {/if {$kticker==0}{set target %0;kill %0;startk}}
/ac {(Bandit leader)%1	** 战斗中 **(LV}{/if {$is_kill==0}{ki bandit leader}{rekicker bandit leader;}}{4}
/ac {(Bandit)%0	** 战斗中 **(LV}{/if {$is_kill==0}{ki bandit}{rekicker bandit}}
/ac {^%0(Thief)	** 战斗中 **(LV}{/if {$is_kill==0}{ki thief}{rekicker thief}}
/ac {^ (鬼气) %0「精忠报国」岳云(Huwei)	** 战斗中 **(LV}{/if {$is_kill==0}{ki huwei}{rekicker huwei}}
/ac {(Jap badguy)	** 战斗中 **(LV}{/if {$is_kill==0}{ki jap badguy}{rekicker jap badguy}}
/al ch {fightcheck -hate %0}
