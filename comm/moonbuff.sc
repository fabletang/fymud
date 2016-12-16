/nop config convert on
/var busy_self 0
/al bf1 {exert bingpojingbi}
/ac {^你运转心诀，层层寒雾}{/var buff1 1;/var busy_self 1;de4 {/var busy_self 0}}
/ac {^你身边冰壁逐渐溶解}{/var buff1 0}
/al bf2 {perform dodge.shuangtianxuewu}
/ac {~\e[37m你\e[2;37;0m\e[37m脚踏虚幻}{/var buff2 1}
/ac {~^\e[33m你所受到的\e[37m天岚凝舞%1霜天雪舞\e[33m的效用消失}{/var buff2 0;checkbuff}
/al bf3 {/if {$busy_self==0}{wiblade;perform binglunyinjing}}
/ac {^你在月下持%1}{/var buff3 1;/var busy_self 1;de2 {/var busy_self 0}}
/ac {~^\e[33m你所受到的\e[37m冰镜七诀%1冰轮盈镜\e[33m的效用消失}{/var buff3 0;checkbuff}
/al bf4 {/if {$busy_self==0}{wiblade;perform kunlun}}
/ac {^你手中的刀突然慢了，慢得几近凝滞}{/var buff4 1}
/ac {~^\e[33m你所受到的\e[37m冰镜七诀%1昆仑品雪\e[33m的效用消失}{/var buff4 0;checkbuff}
/al bf5 {/if {$busy_self==0}{wiblade;perform liuguang}}
/ac {^你长袖临风，刀色淡淡}{/var buff5 1;/var busy_self 1;de2 {/var busy_self 0}}
/ac {~^\e[33m你所受到的\e[37m冰镜七诀%1流光皎洁\e[33m的效用消失}{/var buff5 0;checkbuff}
/al bf6 {perform dodge.hanxueliulan}
/ac {^你身法乍变，脸若冰霜}{/var buff6 1}
/ac {~^\e[33m你所受到的\e[37m天岚凝舞%1寒雪流岚\e[33m的效用消失}{/var buff6 0;checkbuff}
/nop al bf7 {exert jingyingchangkong}
/al bf7 {;}
/ac {^你整个人忽然静了}{/var buff7 1}
/ac {^此人已经受到静影长空的影响}{/var buff7 1}
/ac {~^\e[33m你所受到的\e[37m冷雪心经%1静影长空\e[33m的效用消失}{/var buff7 0;checkbuff}
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
/ac {^你还需等待%1秒钟左右才能再次施出『无方变幻』}{/var wfbh_ok 0;/delay {%1}{/var wfbh_ok 1}}
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
/al flfy {/if {$flfy_ok==1 && $busy_self==0}{flfy1}{/showme ==not 风漏飞烟}}
/al wkxl {/if {$wkxl_ok==1 && $busy_self==0}{wianqi;perform wukongxuanliu}{/showme ==not 无空漩流 }}
/al sha_shen {
    /al wim {unwi all;wi jade;wi short sword;};
    /al flfy {/showme ===杀神 停止暗器 flfy};
    /al wkxl {/showme ===杀神};
    /al qxby {/if {$df_qxby==0 && $busy_self==0 && $ok_df3==1}{wianqi;perform qixingbanyue;unwi needle;wi jade}};
}
/al sha_xue {
    /al wim {unwi all;wi needle;wi short sword;};
    /al qxby {/if {$df_qxby==0 && $busy_self==0 && $ok_df3==1}{wianqi;perform qixingbanyue}}
    /al flfy {/if {$flfy_ok==1 && $busy_self==0}{flfy1}{/showme ==not 风漏飞烟}}
    /al wkxl {/if {$wkxl_ok==1 && $busy_self==0}{wianqi;perform wukongxuanliu}{/showme ==not 无空漩流 }}
}
/nop  {真气流转，身形飘忽灵动}{/if {$is_kill==1}{flfy;wkxl}}
/var ok_df3 1;
/ac {^『红藕香残』、『七星伴月』和『连天衰草』每２０秒钟只能使用一次（还需等待%1秒）}{
    /var ok_df3 0;/delay {%1}{/var ok_df3 1};
}
/ac {^一袭绿光从}{/var ok_df3 0;/delay {20}{/var ok_df3 1};}
/ac {^金枪不倒以手中欢喜金刚转点地}{/if {$is_kill==1}{/delay {5}{flfy;wkxl}}}
/nop  {坦克(Tank)：busy fails}{/if {$is_kill==1}{flfy}}
/nop {^在缕缕暗香中，%1不禁有些痴迷起来}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^明月双手拇指食指相对虚合}{/if {$is_kill==1}{/delay {5}{wkx}}}
/nop ac {^清辉双手拇指食指相对虚合}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^结果%1被硬攻了个手忙脚乱}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/nop ac {^你微挪半尺，%1力道尽数落在你身侧冰壁}{/if {$is_kill==1}{flfy}}
/ac {^你微挪半尺，%1力道尽数落在你身侧冰壁}{/showme ---todo---}
/nop ac {^结果%1被扰得眼花潦乱，应接不暇}{/if {$is_kill==1}{/delay {5}{wkxl}}}
/ac {^你微微一笑，突然翻转大袖}{/var wkxl_ok 0;de12 {/var wkxl_ok 1}}
/var df_wkxl 0;
/nop 七星伴月
/var df_qxby 0;
/ac {^似有暗力牵引，仙人刺众星拱月}{/var df_qxby 1;de10 {/var df_qxby 0}}
/var ok_qxby 1;
/ac {^你一扬手，打出星星点点}{/var ok_df3 0;de20 {/var ok_df3 1}}
/ac {^===avoid_busy:}{flfy}
/ac {说道：===avoid_busy:}{flfy}
/ac {^你还需等待%1秒钟才能再次施出『无空漩流』}{/var wkxl_ok 0;/delay {%1}{/var wkxl_ok 1}}
/ac {^只听你一声清喝，向后疾退三尺}{/var flfy_ok 0;/delay {20}{/var flfy_ok 1};
                                    /var busy_self 1;/delay {4}{/var busy_self 0};
                                    /ticker {kill} {kkk} {4.2}
                                    }
/ac {^你还需等待%1秒钟才能再次施出『风漏飞烟』}{/var flfy_ok 0;/delay {%1}{/var flfy_ok 1}}
/ac {^天岚凝舞%1霜天雪舞	%2 sec}{/var buff2 1;/showme bf2===;
                                        /delay {%2}{/if {$is_kill ==1}{bf2}};
                                        }
/ac {^你所受到的天岚凝舞%1霜天雪舞的效用消失了。}{ /if {$is_kill ==1}{bf2};}
/ac {^你手中%1慢慢地挥出}{/var busy_self 1;/showme ==busy_self:$busy_self;de4 {/var busy_self 0};/ticker {kill} {kkk} {4.2}}
/ac {^你手中的%1突然泛起}{/var busy_self 1;/showme ==busy_self:$busy_self;de4 {/var busy_self 0};/ticker {kill} {kkk} {4.2}}
/ac {^你运力不慎}{/var busy_self 1;/showme ==busy_self:$busy_self;de4 {/var busy_self 0}}
/ac {说道：---find_busy:%1:}{/var npc_busy 1;de4 {/var npc_busy 0};qxby}
