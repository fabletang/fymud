/nop {^  ������ �����Գ��� ȭ��ɽ ���ϻ�(Bandit leader)<������>	** ս���� **(LV154)}
/al rekicker {/if {$kticker==0}{set target %0;startk}}
/ac {(Bandit leader)%1	** ս���� **(LV}{/if {$is_kill==0}{ki bandit leader}{rekicker bandit leader;}}{4}
/ac {(Bandit)%0	** ս���� **(LV}{/if {$is_kill==0}{ki bandit}{rekicker bandit}}
/ac {^ �ᱦǿ�� %0(Thief)	** ս���� **(LV}{/if {$is_kill==0}{ki bandit}{rekicker thief}}
/ac {^ (����) %1 ���Ҿ������ұ���������(Huwei)	** ս���� **(LV}{/if {$is_kill==0}{ki huwei}{rekicker huwei}}
