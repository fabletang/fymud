/nop config convert on
/al bf1 {exert bingpojingbi}
/ac {^����ת�ľ�����㺮��}{/var buff1 1}
/ac {^����߱������ܽ�}{/var buff1 0}
/al bf2 {perform dodge.shuangtianxuewu}
/ac {~\e[37m��\e[2;37;0m\e[37m��̤���}{/var buff2 1}
/ac {~^\e[33m�����ܵ���\e[37m�������%1˪��ѩ��\e[33m��Ч����ʧ}{/var buff2 0;checkbuff}
/al bf3 {perform binglunyinjing}
/ac {^�������³�%1}{/var buff3 1}
/ac {~^\e[33m�����ܵ���\e[37m�����߾�%1����ӯ��\e[33m��Ч����ʧ}{/var buff3 0;checkbuff}
/al bf4 {perform kunlun}
/ac {^�����еĵ�ͻȻ���ˣ����ü�������}{/var buff4 1}
/ac {~^\e[33m�����ܵ���\e[37m�����߾�%1����Ʒѩ\e[33m��Ч����ʧ}{/var buff4 0;checkbuff}
/al bf5 {perform liuguang}
/ac {^�㳤���ٷ磬��ɫ����}{/var buff5 1}
/ac {~^\e[33m�����ܵ���\e[37m�����߾�%1������\e[33m��Ч����ʧ}{/var buff5 0;checkbuff}
/al bf6 {perform dodge.hanxueliulan}
/ac {^����է�䣬������˪}{/var buff6 1}
/ac {~^\e[33m�����ܵ���\e[37m�������%1��ѩ���\e[33m��Ч����ʧ}{/var buff6 0;checkbuff}
/al bf7 {exert jingyingchangkong}
/ac {^�������˺�Ȼ����}{/var buff7 1}
/ac {^�����Ѿ��ܵ���Ӱ���յ�Ӱ��}{/var buff7 1}
/ac {~^\e[33m�����ܵ���\e[37m��ѩ�ľ�%1��Ӱ����\e[33m��Ч����ʧ}{/var buff7 0;checkbuff}
/al checkbuff{
    /if {$iskill==1 && $iswalk==0}{
        /if {$buff2==0}{bf2;bf4;bf8};
        /if {$buff4==0}{bf2;bf4};
        /if {$buff1==0}{bf1};
        /if {$buff6==0}{bf6};
    };
    /if {$iskill==0 && iswalk==0}{
        /if {$buff3==0}{bf3;bf5};
        /if {$buff7==0}{bf7};
    }
}

/al bf8 {cast wufangbianhuan}
/var wkxl_ok 1
/var flfy_ok 1
/al wim {;}
/al xx {perform qixingbanyue;perform liantianshuaicao;}
/al ps {perform liantianshuaicao;perform qixingbanyue;}
/al zd {perform hongouxiangcan;perform qixingbanyue;}
/al flfy1 { wi needle;wi piece;perform fengloufeiyan;perform hongouxiangcan;}
/al flfy {/if {$flfy_ok==1}{flfy1;/delay {1}{flfy1}}{/showme not ��©���� }}
/al wkxl {/if {$wkxl_ok==1}{perform wukongxuanliu;}{/showme not �޿����� }}
/nop  {������ת������Ʈ���鶯}{/if {$is_kill==1}{flfy;wkxl}}
/nop ac {^�����ư����У�%1������Щ��������}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^��΢Ų��ߣ�%1��������������������}{/if {$is_kill==1}{flfy}}
/nop ac {^��΢Ų��ߣ�%1��������������������}{/showme ---todo---}
/nop ac {^���%1���ŵ��ۻ����ң�Ӧ�Ӳ�Ͼ}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^��â������%1��࣬˿˿���}{ /ac {^%1һ�����ģ��������һ����Ѫ}{ /if {%1=='��'}{ /var wkxl_ok 0;/delay {5}{flfy};/delay {12}{/var wkxl_ok 1}; }{/delay {8}{flfy}} };   	}
/nop ac {^�����Ѿ��ڼ���æ������}{/var flfy_ok 0;/delay {6}{/var flfy_ok 1;wkxl}}
/nop ac {^��������δ�ͣ����ԡ��޿���������}{/if {$is_kill==1}{flfy;jk}}
/nop ac {^�㻹��ȴ�%1���Ӳ����ٴ�ʩ�����޿�������}{/var wkxl_ok 0;/delay {%1}{/var wkxl_ok 1}}
/nop ac {^ֻ����һ����ȣ����������}{/var flfy_ok 0;/var wkxl_ok 0;/delay {6}{/var wkxl_ok 1};/delay {20}{/var flfy_ok 1}}
/nop ac {^%1ֻ���ؿ�����Ѩһ�飬��ʱ�������á�}{/var wkxl_ok 0;/delay {3}{/var wkxl_ok 1;wkxl}}
/nop ac {^�㻹��ȴ�%1���Ӳ����ٴ�ʩ������©���̡�}{/var flfy_ok 0;/delay {%1}{/var flfy_ok 1}}
