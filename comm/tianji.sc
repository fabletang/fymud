/var at_tj 0;
/ac {^风云天下}{/var at_tj 0}
/ac {^天机老人掂了掂手里的%1百两银子乐呵呵地说：既然不想做这个就换一个吧。}{quest}
/nop ac {^天机阁}{hp;de02 l}
/ac {^天机阁}{nokill;stopk;cks;
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
