/nop config convert on
/var busy_self 0
/al bf1 {exert bingpojingbi}
/ac {^����ת�ľ�����㺮��}{/var buff1 1;/var busy_self 1;de4 {/var busy_self 0}}
/ac {^����߱������ܽ�}{/var buff1 0}
/al bf2 {perform dodge.shuangtianxuewu}
/ac {~\e[37m��\e[2;37;0m\e[37m��̤���}{/var buff2 1}
/ac {~^\e[33m�����ܵ���\e[37m�������%1˪��ѩ��\e[33m��Ч����ʧ}{/var buff2 0;checkbuff}
/al bf3 {/if {$busy_self==0}{wiblade;perform binglunyinjing}}
/ac {^�������³�%1}{/var buff3 1;/var busy_self 1;de2 {/var busy_self 0}}
/ac {~^\e[33m�����ܵ���\e[37m�����߾�%1����ӯ��\e[33m��Ч����ʧ}{/var buff3 0;checkbuff}
/al bf4 {/if {$busy_self==0}{wiblade;perform kunlun}}
/ac {^�����еĵ�ͻȻ���ˣ����ü�������}{/var buff4 1}
/ac {~^\e[33m�����ܵ���\e[37m�����߾�%1����Ʒѩ\e[33m��Ч����ʧ}{/var buff4 0;checkbuff}
/al bf5 {/if {$busy_self==0}{wiblade;perform liuguang}}
/ac {^�㳤���ٷ磬��ɫ����}{/var buff5 1;/var busy_self 1;de2 {/var busy_self 0}}
/ac {~^\e[33m�����ܵ���\e[37m�����߾�%1������\e[33m��Ч����ʧ}{/var buff5 0;checkbuff}
/al bf6 {perform dodge.hanxueliulan}
/ac {^����է�䣬������˪}{/var buff6 1}
/ac {~^\e[33m�����ܵ���\e[37m�������%1��ѩ���\e[33m��Ч����ʧ}{/var buff6 0;checkbuff}
/nop al bf7 {exert jingyingchangkong}
/al bf7 {;}
/ac {^�������˺�Ȼ����}{/var buff7 1}
/ac {^�����Ѿ��ܵ���Ӱ���յ�Ӱ��}{/var buff7 1}
/ac {~^\e[33m�����ܵ���\e[37m��ѩ�ľ�%1��Ӱ����\e[33m��Ч����ʧ}{/var buff7 0;checkbuff}
/al checkbuff {
    /if {$is_kill==1 && $is_walk==0}{
        /if {$buff2==0}{bf2;bf4;bf8};
        /if {$buff4==0}{bf2;bf4};
        /if {$buff1==0}{bf1};
        /if {$buff6==0}{bf6};
    };
    /if {$is_kill==0 && is_walk==0}{
        /if {$buff3==0}{bf3;bf5};
        /if {$buff7==0}{bf7};
    }
}
/var wfbh_ok 1
/al bf8 {/if {$wfbh_ok==1}{cast wufangbianhuan}}
/ac {^�㻹��ȴ�%1�������Ҳ����ٴ�ʩ�����޷���á�}{/var wfbh_ok 0;/delay {%1}{/var wfbh_ok 1}}
/var wkxl_ok 1
/var flfy_ok 1
/al initk {
/var wkxl_ok 1;
/var flfy_ok 1;
/var ok_df3 1;
}
/al wim {unwi all;wi needle;wi short sword;}
/al xx {unwi jade;wi needle;perform qixingbanyue;perform liantianshuaicao;unwi needle;wi jade}
/al ps {unwi jade;wi needle;perform liantianshuaicao;perform qixingbanyue;unwi needle;wi jade}
/al zd {unwi jade;wi needle;perform hongouxiangcan;perform qixingbanyue;unwi needle;wi jade}
/al flfy1 {wianqi;perform fengloufeiyan}
/al qxby {/if {$df_qxby==0 && $busy_self==0 && $ok_df3==1}{wianqi;perform qixingbanyue}}
/al flfy {/if {$flfy_ok==1 && $busy_self==0}{flfy1}{/showme ==not ��©����}}
/al wkxl {/if {$wkxl_ok==1 && $busy_self==0}{wianqi;perform wukongxuanliu}{/showme ==not �޿����� }}
/al sha_shen {
    /al wim {unwi all;wi jade;wi short sword;};
    /al flfy {/showme ===ɱ�� ֹͣ���� flfy};
    /al wkxl {/showme ===ɱ��};
    /al qxby {/if {$df_qxby==0 && $busy_self==0 && $ok_df3==1}{wianqi;perform qixingbanyue;unwi needle;wi jade}};
}
/al sha_xue {
    /al wim {unwi all;wi needle;wi short sword;};
    /al qxby {/if {$df_qxby==0 && $busy_self==0 && $ok_df3==1}{wianqi;perform qixingbanyue}}
    /al flfy {/if {$flfy_ok==1 && $busy_self==0}{flfy1}{/showme ==not ��©����}}
    /al wkxl {/if {$wkxl_ok==1 && $busy_self==0}{wianqi;perform wukongxuanliu}{/showme ==not �޿����� }}
}
/nop  {������ת������Ʈ���鶯}{/if {$is_kill==1}{flfy;wkxl}}
/var ok_df3 1;
/ac {^����ź��С��������ǰ��¡��͡�����˥�ݡ�ÿ��������ֻ��ʹ��һ�Σ�����ȴ�%1�룩}{
    /var ok_df3 0;/delay {%1}{/var ok_df3 1};
}
/ac {^һϮ�̹��}{/var ok_df3 0;/delay {20}{/var ok_df3 1};}
/ac {^��ǹ���������л�ϲ���ת���}{/if {$is_kill==1}{/delay {5}{flfy;wkxl}}}
/nop  {̹��(Tank)��busy fails}{/if {$is_kill==1}{flfy}}
/nop {^�����ư����У�%1������Щ��������}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^����˫��Ĵָʳָ������}{/if {$is_kill==1}{/delay {5}{wkx}}}
/nop ac {^���˫��Ĵָʳָ������}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^���%1��Ӳ���˸���æ����}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^��΢Ų��ߣ�%1��������������������}{/if {$is_kill==1}{flfy}}
/ac {^��΢Ų��ߣ�%1��������������������}{/showme ---todo---}
/nop ac {^���%1���ŵ��ۻ����ң�Ӧ�Ӳ�Ͼ}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/ac {^��΢΢һЦ��ͻȻ��ת����}{/var wkxl_ok 0;de12 {/var wkxl_ok 1}}
/var df_wkxl 0;
/nop ���ǰ���
/var df_qxby 0;
/ac {^���а���ǣ�������˴����ǹ���}{/var df_qxby 1;de10 {/var df_qxby 0}}
/var ok_qxby 1;
/ac {^��һ���֣�������ǵ��}{/var ok_df3 0;de20 {/var ok_df3 1}}
/ac {^===avoid_busy:}{flfy}
/ac {˵����===avoid_busy:}{flfy}
/ac {^�㻹��ȴ�%1���Ӳ����ٴ�ʩ�����޿�������}{/var wkxl_ok 0;/delay {%1}{/var wkxl_ok 1}}
/ac {^ֻ����һ����ȣ����������}{/var flfy_ok 0;/delay {20}{/var flfy_ok 1};
                                    /var busy_self 1;/delay {4}{/var busy_self 0};
                                    /ticker {kill} {kkk} {4.2}
                                    }
/ac {^�㻹��ȴ�%1���Ӳ����ٴ�ʩ������©���̡�}{/var flfy_ok 0;/delay {%1}{/var flfy_ok 1}}
/ac {^�������%1˪��ѩ��	%2 sec}{/var buff2 1;/showme bf2===;
                                        /delay {%2}{/if {$is_kill ==1}{bf2}};
                                        }
/ac {^�����ܵ����������%1˪��ѩ���Ч����ʧ�ˡ�}{ /if {$is_kill ==1}{bf2};}
/ac {^������%1�����ػӳ�}{/var busy_self 1;/showme ==busy_self:$busy_self;de4 {/var busy_self 0};/ticker {kill} {kkk} {4.2}}
/ac {^�����е�%1ͻȻ����}{/var busy_self 1;/showme ==busy_self:$busy_self;de4 {/var busy_self 0};/ticker {kill} {kkk} {4.2}}
/ac {^����������}{/var busy_self 1;/showme ==busy_self:$busy_self;de4 {/var busy_self 0}}
/ac {˵����---find_busy:%1:}{/var npc_busy 1;de4 {/var npc_busy 0};qxby}
