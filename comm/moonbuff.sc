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
/al bf8 {cast wufangbianhuan}
/var wkxl_ok 1
/var flfy_ok 1
/al wim {;}
/al xx {unwi blade;wi needle;wi piece;perform qixingbanyue;perform liantianshuaicao; wim}
/al ps {unwi blade;wi needle;wi piece;perform liantianshuaicao;perform qixingbanyue; wim}
/al zd {unwi blade;wi needle;wi piece;perform hongouxiangcan;perform qixingbanyue; wim}
/al flfy1 { wi needle;wi piece;perform fengloufeiyan;perform hongouxiangcan; wim}
/al flfy {/if {$flfy_ok==1}{flfy1;/delay {1}{flfy1}}{/showme not ��©���� }}
/al wkxl {/if {$wkxl_ok==1}{ wi needle;wi piece;perform wukongxuanliu; wim}{/showme not �޿����� }}
/ac {������ת������Ʈ���鶯}{/if {$is_kill==1}{flfy;wkxl}}
/ac {^��ǹ���������л�ϲ���ת���}{/if {$is_kill==1}{/delay {5}{flfy;wkxl}}}
/ac {̹��(Tank)��busy fails}{/if {$is_kill==1}{flfy}}
/ac {^�����ư����У�%1������Щ��������}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/ac {^����˫��Ĵָʳָ������}{/if {$is_kill==1}{/delay {5}{wkx}}}
/ac {^���˫��Ĵָʳָ������}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/ac {^���%1��Ӳ���˸���æ����}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^��΢Ų��ߣ�%1��������������������}{/if {$is_kill==1}{flfy}}
/ac {^��΢Ų��ߣ�%1��������������������}{/showme ---todo---}
/ac {^���%1���ŵ��ۻ����ң�Ӧ�Ӳ�Ͼ}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/ac {^��â������%1��࣬˿˿���}{
	/ac {^%1һ�����ģ��������һ����Ѫ}{
	/if {%1=='��'}{
		/var wkxl_ok 0;/delay {5}{flfy};/delay {12}{/var wkxl_ok 1};
		}{/delay {8}{flfy}}
 	};   	
     }
/ac {^�����Ѿ��ڼ���æ������}{/var flfy_ok 0;/delay {6}{/var flfy_ok 1;wkxl}}
/ac {^��������δ�ͣ����ԡ��޿���������}{/if {$is_kill==1}{flfy;jk}}
/ac {^�㻹��ȴ�%1���Ӳ����ٴ�ʩ�����޿�������}{/var wkxl_ok 0;/delay {%1}{/var wkxl_ok 1}}
/ac {^ֻ����һ����ȣ����������}{/var flfy_ok 0;/var wkxl_ok 0;/delay {6}{/var wkxl_ok 1};/delay {20}{/var flfy_ok 1}}
/ac {^%1ֻ���ؿ�����Ѩһ�飬��ʱ�������á�}{/var wkxl_ok 0;/delay {3}{/var wkxl_ok 1;wkxl}}
/ac {^�㻹��ȴ�%1���Ӳ����ٴ�ʩ������©���̡�}{/var flfy_ok 0;/delay {%1}{/var flfy_ok 1}}
/ac {^�������%1˪��ѩ��	%2 sec}{/var buff2 1;/showme bf2===;
                                        /delay {%2}{/if {$is_kill ==1}{bf2}};
                                        }
/ac {^�����ܵ����������%1˪��ѩ���Ч����ʧ�ˡ�}{ /if {$is_kill ==1}{bf2};}
