/nop fy2005 �Ϻ�վ HC ģʽ
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
/ac {^ ��������%s%1/%s%2 (%s%3%)%s��ʳ�%s%4%}{
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
/ac {^ ����Ѫ��%s%1/%s%2 (%s%3%)%s����ˮ��%s%4%}{
    /var qi_ok 0;
    /var qi %1;
    /var qi_init %2;
    /var qi_per %3;
    /var food_drink %4;
    /var qi_delta 0;
    /math qi_delta {$qi_init - $qi};
    /var hn_qi 0;
    /math hn_qi {$qi/2};
}
/ac {^ ������%s%1/%s%2 (%s%3%)%s������}{
    /var shen_ok 0;
    /var shen %1;
    /var shen_init %2;
    /var shen_per %3;
    /var shen_delta 0;
    /math shen_delta {$shen_init - $shen};
}
/ac {^ ��������%s%1/%s%2 (%s%3)%s��ɱ����%s%4}{
    /var lingli %1;
    /var lingli_init %2;
    /var shaqi %4;
}
/ac {^ ��������%s%1/%s%2 (%s%3) }{
    /var neili %1;
    /var neili_init %2;
    /var max_neili 0;
    /math max_neili {2*$neili_init};
}
/ac {^ ��������%s%1/%s%2 (%s%3) }{
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
        /if {$food_drink<4}{drink dai;dhp}{
           /if {$food_eat<3}{eat meat}{/var food_ok 1}
        }}{/var food_ok 1};
    /if {$food_ok==1 && $auto_en_jin==1}{
        /if {$jin_per < 96 && $is_walk==0}{hj;use hugu;}{
            /if {$jin_delta > $jin_lost}{sleep sleepbag;dazuo;dhp}{/var jin_ok 1};
            }
       };
    /if {$food_ok==1 && $jin_ok==1 && $auto_en_qi==1}{
        /if {$qi_per < 98 && $is_walk==0}{hx;}{
            /if {$qi_delta > $qi_lost}{sleep sleepbag; dazuo;dhp}{/var qi_ok 1};
            }
       };
    /if {$food_ok==1 && $jin_ok==1 && $qi_ok==1 && $auto_en_shen==1}{
        /if {$shen_per < 96 && $is_walk==0}{use dafeng}{
            /if {$shen_delta > $shen_lost}{dazuo; dhp}{/var shen_ok 1};
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
           /if {$lingli < $lingli_init}{hl; }{/var lingli_ok 1}
        }{/var lingli_ok 1};
        /if {$lingli_ok==1 && $auto_en_nl==1}{
           /if {$neili < $neili_init}{hn;}{/var neili_ok 1}
        }{/var neili_ok 1};
        /if {$lingli_ok==1 && $neili_ok==1 && $auto_en_fl==1}{
           /if {$fali < $fali_init}{hf;}{/var fali_ok 1}
        }{/var fali_ok 1; dhp};
        /var food_ok 0;
        /var jin_ok 0;
        /var qi_ok 0;
        /var shen_ok 0;
   }
}
}
/ac {^���Ѿ���̫����}{/showme eat:$food_eat drink:$food_drink}
/al hl {exercise jing $jin_half}
/al hn {exercise qi $hn_qi }
/al hf {exercise shen $max_fali}
/nop �����ڵ�����̫��
/nop ���Ѿ���̫����
/nop ����һ��������û����ɣ���������
/ac {^������ҵľ����л�������}{l;hp}
/ac {^����ϥ����������ڤ˼}{/delay {2.1}{hp}}
/ac {^����ϥ�����������۾�}{/delay {2.1}{hp}}
/ac {^�������������ù�}{/delay {2.1}{hp}}
/ac {^������ţ���ҧ�˼���}{/delay {2.1}{hp}}
/ac {^��һ��������ֻ����������}{cks;l}
/ac {^�����Ѫ������}{hp}
/ac {^�������������100�㡣$}{de2 cks}
/ac {^��չ��һ��˯��}{sk}
/ac {^�㲻������������������}{wlk}
/ac {^���������˹�����}{/delay {2.1}{hp}}
