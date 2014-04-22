/nop fy2005 上海站 HC 模式
/nop s_status status 字符串string
/nop hx 自己回血 thh hh 要队友治疗
/nop eat food 食物
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
/ac {^ 【精力】%s%1/%s%2 (%s%3%)%s【食物】%s%4%}{
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
/ac {^ 【气血】%s%1/%s%2 (%s%3%)%s【饮水】%s%4%}{
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
/ac {^ 【心神】%s%1/%s%2 (%s%3%)%s【评价}{
    /var shen_ok 0;
    /var shen %1;
    /var shen_init %2;
    /var shen_per %3;
    /var shen_delta 0;
    /math shen_delta {$shen_init - $shen};
}
/ac {^ 【灵力】%s%1/%s%2 (%s%3)%s【杀气】%s%4}{
    /var lingli %1;
    /var lingli_init %2;
    /var shaqi %4;
}
/ac {^ 【内力】%s%1/%s%2 (%s%3) }{
    /var neili %1;
    /var neili_init %2;
    /var max_neili 0;
    /math max_neili {2*$neili_init};
}
/ac {^ 【法力】%s%1/%s%2 (%s%3) }{
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
/ac {^你已经吃太饱了}{/showme eat:$food_eat drink:$food_drink}
/al hl {exercise jing $jin_half}
/al hn {exercise qi $hn_qi }
/al hf {exercise shen $max_fali}
/nop 你现在的心神太少
/nop 你已经喝太多了
/nop 你上一个动作还没有完成，不能吐纳
/ac {^你从忘我的境界中回神敛气}{l;hp}
/ac {^你盘膝而坐，静坐冥思}{/delay {2.1}{hp}}
/ac {^你盘膝而坐，闭上眼睛}{/delay {2.1}{hp}}
/ac {^你坐下来运气用功}{/delay {2.1}{hp}}
/ac {^你拿起牛肉干咬了几口}{/delay {2.1}{hp}}
/ac {^你一觉醒来，只觉精力充沛}{cks;l}
/ac {^你的气血治愈了}{hp}
/ac {^你的心神治愈了100点。$}{de2 cks}
/ac {^你展开一个睡袋}{sk}
/ac {^你不可以在这里吐纳练功}{wlk}
/ac {^你坐下来运功疗伤}{/delay {2.1}{hp}}
