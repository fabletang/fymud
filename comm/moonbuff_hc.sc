/nop config convert on
/al bf1 {exert bingpojingbi}
/ac {^你运转心诀，层层寒雾}{/var buff1 1}
/ac {^你身边冰壁逐渐溶解}{/var buff1 0}
/al bf2 {perform dodge.shuangtianxuewu}
/ac {~\e[37m你\e[2;37;0m\e[37m脚踏虚幻}{/var buff2 1}
/ac {~^\e[33m你所受到的\e[37m天岚凝舞%1霜天雪舞\e[33m的效用消失}{/var buff2 0;checkbuff}
/al bf3 {perform binglunyinjing}
/ac {^你在月下持%1}{/var buff3 1}
/ac {~^\e[33m你所受到的\e[37m冰镜七诀%1冰轮盈镜\e[33m的效用消失}{/var buff3 0;checkbuff}
/al bf4 {perform kunlun}
/ac {^你手中的刀突然慢了，慢得几近凝滞}{/var buff4 1}
/ac {~^\e[33m你所受到的\e[37m冰镜七诀%1昆仑品雪\e[33m的效用消失}{/var buff4 0;checkbuff}
/al bf5 {perform liuguang}
/ac {^你长袖临风，刀色淡淡}{/var buff5 1}
/ac {~^\e[33m你所受到的\e[37m冰镜七诀%1流光皎洁\e[33m的效用消失}{/var buff5 0;checkbuff}
/al bf6 {perform dodge.hanxueliulan}
/ac {^你身法乍变，脸若冰霜}{/var buff6 1}
/ac {~^\e[33m你所受到的\e[37m天岚凝舞%1寒雪流岚\e[33m的效用消失}{/var buff6 0;checkbuff}
/al bf7 {exert jingyingchangkong}
/ac {^你整个人忽然静了}{/var buff7 1}
/ac {^此人已经受到静影长空的影响}{/var buff7 1}
/ac {~^\e[33m你所受到的\e[37m冷雪心经%1静影长空\e[33m的效用消失}{/var buff7 0;checkbuff}
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
/al flfy {/if {$flfy_ok==1}{flfy1;/delay {1}{flfy1}}{/showme not 风漏飞烟 }}
/al wkxl {/if {$wkxl_ok==1}{perform wukongxuanliu;}{/showme not 无空漩流 }}
/nop  {真气流转，身形飘忽灵动}{/if {$is_kill==1}{flfy;wkxl}}
/nop ac {^在缕缕暗香中，%1不禁有些痴迷起来}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^你微挪半尺，%1力道尽数落在你身侧冰壁}{/if {$is_kill==1}{flfy}}
/nop ac {^你微挪半尺，%1力道尽数落在你身侧冰壁}{/showme ---todo---}
/nop ac {^结果%1被扰得眼花潦乱，应接不暇}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^星芒流绕在%1身侧，丝丝入扣}{ /ac {^%1一个踉跄，张嘴喷出一口鲜血}{ /if {%1=='你'}{ /var wkxl_ok 0;/delay {5}{flfy};/delay {12}{/var wkxl_ok 1}; }{/delay {8}{flfy}} };   	}
/nop ac {^此人已经在极度忙乱中了}{/var flfy_ok 0;/delay {6}{/var flfy_ok 1;wkxl}}
/nop ac {^此人身形未滞，想以『无空漩流』困}{/if {$is_kill==1}{flfy;jk}}
/nop ac {^你还需等待%1秒钟才能再次施出『无空漩流』}{/var wkxl_ok 0;/delay {%1}{/var wkxl_ok 1}}
/nop ac {^只听你一声清喝，向后疾退三尺}{/var flfy_ok 0;/var wkxl_ok 0;/delay {6}{/var wkxl_ok 1};/delay {20}{/var flfy_ok 1}}
/nop ac {^%1只觉胸口膻中穴一麻，登时动弹不得。}{/var wkxl_ok 0;/delay {3}{/var wkxl_ok 1;wkxl}}
/nop ac {^你还需等待%1秒钟才能再次施出『风漏飞烟』}{/var flfy_ok 0;/delay {%1}{/var flfy_ok 1}}
