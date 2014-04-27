/al rekicker {/if {$kticker==0}{/delay {0.1}{
                                set target %0;/var target %0;kill %0;startk
                                }{kill}
                                }}
/ac {(Bandit leader)	** 战斗中 **(LV}{/if {$is_kill==0}{ki bandit leader}{rekicker bandit leader;}}{4}
/ac {(Bandit)	** 战斗中 **(LV}{/if {$is_kill==0}{ki bandit}{rekicker bandit}}
/ac {(Thief)	** 战斗中 **(LV}{/if {$is_kill==0}{ki thief}{rekicker thief}}
/ac {「精忠报国」岳云(Huwei)	** 战斗中 **(LV}{/if {$is_kill==0}{ki huwei}{rekicker huwei}}{4}
/ac {(Jap badguy)	** 战斗中 **(LV}{/if {$is_kill==0}{ki jap badguy}{rekicker jap badguy}}
/al ch {fightcheck -hate %0}
/ac {(Killer)	** 战斗中 **(LV}{/if {$is_kill==0}{ki killer}{rekicker killer}}
/ac {(Loster)	** 战斗中 **(LV}{/if {$is_kill==0}{ki loster}{rekicker loster}}
/ac {沙漠贼盗(Shamo zeidao)	** 战斗中 **(LV}{/if {$is_kill==0}{ki zeidao}{rekicker zeidao}}{4}
/ac {^你已经在战斗中了，还想偷袭？}{iskill}
