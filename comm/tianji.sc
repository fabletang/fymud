/var at_tj 0;
/ac {^��������}{/var at_tj 0}
/ac {^������˵��˵������%1���������ֺǺǵ�˵����Ȼ����������ͻ�һ���ɡ�}{quest}
/nop ac {^�����}{hp;de02 l}
/ac {^�����}{nokill;stopk;cks;
    /var at_tj 1;
    de02 {/showme ----tj check----};
    }{4}
/ac {^----tj check----}{
    /if {$jin_per<91||$shen_per<91||$qi_per<60}{
        /all {/showme ====ill-health:$myname:jin_per=$jin_per:qi_per=$qi_per:shen_per=$shen_per};
        }{
            /if {$food_drink<20 || $food_eat<20}{chi;/showme ----need food----;}{
                /if {$shaqi>900}{/showme ----jiang shaqi----}{
                    /all {/showme ====all right:$myname===};
                    }
            }
        }
    }
/ac {^====ill-health:%1:}{/if {"%1"=="$myname"}{/if {"$myname"=="$team_header"}{tc};fy2zt}}}
/ac {^----need food----}{eatall;de5 l;}
/ac {^----jiang shaqi----}{tc;pl {d;n;n;e;/2 salute;w;s;s;u};pr}
