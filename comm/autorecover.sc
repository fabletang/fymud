/nop fy2005 �Ϻ�վ
/nop s_status status �ַ���string
/nop hx �Լ���Ѫ thh hh Ҫ��������
/nop eat food ʳ��
/var is_eat 0
/var no_food 0
/var at_eat 0
/var food_drink 0
/var food_eat 0
/var jqs_lost_limit 0.3
/var jin_lost 0
/var qi_lost 0
/var shen_lost 0
/var auto_en_eat 1
/var auto_en_jin 1
/var auto_en_qi 1
/var auto_en_shen 1
/var auto_en_ll 1
/var auto_en_nl 1
/var auto_en_fl 1
/var lingli_ok 0
/var neili_ok 0
/var fali_ok 0
/var jin 0
/var jin_init 0
/var jin_delta 0
/var qi 0
/var qi_init 0
/var qi_delta 0
/var shen 0
/var shen_init 0
/var shen_delta 0
/var hn_qi 0

/al dhp {/delay {4.1}{hp}}
/ac {^ �������� %1/ %2 (%3%)    ��ʳ�%4%}{
    /var food_ok 0;
    /var jin_ok 0;
/var jin %1;
/var jin_init %2;
/var jin_per %3;
/var food_eat %4;
/var jin_delta 0;
/math jin_delta {$jin_init - $jin};
/math jin_half {$jin * 0.5};
}
/ac {^ ����Ѫ�� %1/ %2 (%3%)    ����ˮ��%4%}{
    /var qi_ok 0;
/var qi %1;
/var qi_init %2;
/nop math qi {$qi+ 1};
/var qi_per %3;
/var food_drink %4;
/var qi_delta 0;
/math qi_delta {$qi_init - $qi};
/var qi_per_delta 0.1;
/math qi_per_delta {$qi*100};
/math qi_per_delta {$qi_per_delta/$qi_init};
/var hn_qi 0;
/math hn_qi {$qi/2};
}
/ac {^ ������ %1/ %2 (%3%)    ������}{
    /var shen_ok 0;
/var shen %1;
/var shen_init %2;
/var shen_per %3;
/var shen_delta 0;
/math shen_delta {$shen_init - $shen};
}
/ac {^ �������� %1/ %2 (  %3)    ��ɱ����%4}{
    /var lingli %1;
    /var lingli_init %2;
    /var shaqi %4;
}
/ac {^ �������� %1/ %2 (%3) }{
    /var neili %1;
    /var neili_init %2;
    /var max_neili 0;
    /math max_neili {2*$neili_init};
}
/ac {^ �������� %1/ %2 (%3) }{
    /var fali %1;
    /var fali_init %2;
    /var max_fali 0;
    /math max_fali {2*$fali_init};

    /math jin_lost {$jqs_lost_limit*$jin_init};
    /math qi_lost {$jqs_lost_limit*$qi_init};
    /math shen_lost {$jqs_lost_limit*$shen_init};
    /var food_ok 0;
    /var jin_ok 0;
    /var qi_ok 0;
    /var shen_ok 0;
    /if {$is_walk==0 && $is_kill==0}{
    /if {$auto_en_eat==1}{
        /if {$food_drink<4}{get wineskin from bag; drink wineskin; put wineskin in bag;dhp}{
           /if {$food_eat<3}{get meat from bag;eat meat; put meat in bag;}{/var food_ok 1}
        }}{/var food_ok 1};
    /if {$food_ok==1 && $auto_en_jin==1}{
        /if {$jin_per < 96 && $is_walk==0}{hj;tt ���� $jin_per%;/var jin_ok 1;dhp}{
            /if {$jin_delta > $jin_lost}{dazuo; dhp}{/var jin_ok 1};
            }
       };
/nop if hx tth hh $myname tt ��Ѫ $qi_per% dhp
    /if {$food_ok==1 && $jin_ok==1 && $auto_en_qi==1}{
        /if {$qi_per < 97 && $is_walk==0}{hx;dhp}{
            /if {$qi_delta > $qi_lost}{ dazuo; dhp}{/var qi_ok 1};
            }
       };
    /if {$food_ok==1 && $jin_ok==1 && $qi_ok==1 && $auto_en_shen==1}{
        /if {$shen_per < 96 && $is_walk==0}{hs;tt �� $shen_per%;}{
            /if {$shen_delta > $shen_lost}{hs; dazuo; dhp}{/var shen_ok 1};
            }
       };
       };
    /if {$food_ok==1 && $jin_ok==1 && $qi_ok==1 && $shen_ok==1}{
    /var max_lingli 0;
    /math max_lingli {2*$lingli_init};
    /var max_neili 0;
    /math max_neili {2*$neili_init};
    /var max_fali 0;
    /math max_fali {2*$fali_init};
    /if {$is_walk==0 && $is_kill==0}{
        /if {$auto_en_ll==1}{
           /if {$lingli < $lingli_init}{hl;tt $myname ������; }{/var lingli_ok 1}
        }{/var lingli_ok 1};
        /if {$lingli_ok==1 && $auto_en_nl==1}{
           /if {$neili < $neili_init}{hn;tt $myname ������; }{/var neili_ok 1}
        }{/var neili_ok 1};
        /if {$lingli_ok==1 && $neili_ok==1 && $auto_en_fl==1}{
           /if {$fali < $fali_init}{hf;tt $myname �ط���; }{/var fali_ok 1}
        }{/var fali_ok 1; dhp};
        /var food_ok 0;
        /var jin_ok 0;
        /var qi_ok 0;
        /var shen_ok 0;
   }
}
}

/ac {^���Ѿ���̫����}{/showme eat:$food_eat drink:$food_drink}
/nop al hl {exercise jing $max_lingli}
/al hl {exercise jing $jin_half}
/nop al hn {exercise qi $max_neili}
/al hn {
exercise qi $hn_qi
}
/al hf {exercise shen $max_fali}
/nop �����ڵ�����̫��
/nop ���Ѿ���̫����
/nop ����һ��������û����ɣ���������
/ac {^������ҵľ����л�������}{l;hp}
/ac {^����ϥ����������ڤ˼}{/delay {2.1}{hp}}
/ac {^����ϥ�����������۾�}{/delay {2.1}{hp}}
/ac {^�������������ù�}{/delay {2.1}{hp};de3 {/showme --checkqi}}
/ac {^����С��Ͱ�Ѿ����ȵ�һ��Ҳ��ʣ}{/var auto_en_qi 0}
/ac {^��Ӿ��н�����С��Ͱװ�����Ϻ�Ȫ}{/var auto_en_qi 1}
/ac {^������ţ���ҧ�˼���}{/delay {2.1}{hp}}
/ac {^���Ѿ���̫����}{/var food_drink 100}
/ac {^���ʳ�����ˮΪ�㣬����}{eatall;de6 {dazuo}}
/ac {^���ַ���ֻ�ܶ�ս��}{sk}
/nop ѧϰ
/ac {^�������״���޷�ǿ����ϰ}{hn}
/ac {^��ġ�%1��������}{hp;de1 {/showme --checkqi}}
/ac {^--checkqi}{/if {$qi_per_delta<60}{dz;/showme ��:$qi_per_delta;}{/showme ��==$qi_per_delta}}
/ac {^�����}{hp;de1 {/showme ----check food}}
/ac {^----check food}{ /if {$food_drink<20 || $food_eat<20}{eatall} }
