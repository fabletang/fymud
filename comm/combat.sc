/al rekicker {/if {$kticker==0}{/delay {0.1}{
                                set target %0;/var target %0;kill %0;startk
                                }{kill}
                                }}
/ac {(Bandit leader)	** ս���� **(LV}{/if {$is_kill==0}{ki bandit leader}{rekicker bandit leader;}}{4}
/ac {(Bandit)	** ս���� **(LV}{/if {$is_kill==0}{ki bandit}{rekicker bandit}}
/ac {(Thief)	** ս���� **(LV}{/if {$is_kill==0}{ki thief}{rekicker thief}}
/ac {�����ұ���������(Huwei)	** ս���� **(LV}{/if {$is_kill==0}{ki huwei}{rekicker huwei}}{4}
/ac {(Jap badguy)	** ս���� **(LV}{/if {$is_kill==0}{ki jap badguy}{rekicker jap badguy}}
/al ch {fightcheck -hate %0}
/ac {(Killer)	** ս���� **(LV}{/if {$is_kill==0}{ki killer}{rekicker killer}}
/ac {(Loster)	** ս���� **(LV}{/if {$is_kill==0}{ki loster}{rekicker loster}}
/ac {ɳĮ����(Shamo zeidao)	** ս���� **(LV}{/if {$is_kill==0}{ki zeidao}{rekicker zeidao}}{4}
/ac {^���Ѿ���ս�����ˣ�����͵Ϯ��}{iskill}
