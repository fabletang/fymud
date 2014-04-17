/nop ==============juezhao======
/var jz_1 0
/var jz_2 0
/var jz_3 180
/al cjz {/var jz_1 0;/var jz_2 0;/var jz_3 180;ab2}
/al juezhao {
    /if {$tdrmok==0 && $jclhok==0}{qie};
    /if {$tdrmok==1}{tdrm};
    /if {$jclhok==1}{jclh};
        }
/ac {^你还要需要等待%1秒才能使用叱咤风云之特技。}{ability2;juezhao}
/nop CDT300秒 又名『神机八刀』，谢掌柜所创 
/var jclhok 1
/al jclh {/if {$jclhok==1}{set secon_perform jichulianhuanjue}}
/ac {^你挥出神机刀法中的绝天灭地的一式－－－计－出－连－环}{/var jclhok 0;/delay {300}{/var jclhok 1};ability2;de1 juezhao}
/nop CDT300秒  全名『天地人魔连环八刀』 
/var tdrmok 1
/al tdrm {/if {$tdrmok==1}{set secon_perform tiandirenmojue}}
/ac {^你神气贯通，将天地人魔连环八式一气呵成！}{/var tdrmok 0;
    /delay {300}{/var tdrmok 1};ability2;de1 juezhao}
/nop 1	天地人魔     tiandirenmojue      8	（2/3）	  0	
/nop 2	计出连环     jichulianhuanjue    10	（0/3）	219	
/ac {^1	天地人魔     tiandirenmojue%s%1%s（%2/3）%s%3}{
    /var jz_1 %1;
    /var jz_2 %2;
    /var jz_3 %3;
    /if {$jz_1==100}{
        /if {$jz_3==0}{/var tdrmok 1}{
            /var tdrmok 0;/delay {$jz_3}{/var tdrmok 1};
            };
        };
    /if {$jz_1!=100}{
        /if {$jz_2==0}{/var tdrmok 0}{
            /if {$jz_3==0}{/var tdrmok 1}{
        /var tdrmok 0;/delay {$jz_3}{/var tdrmok 1};
                                          };
                                    };
                    };
    /showme ---tdrmok=$tdrmok  -$jz_1-$jz_2-$jz_3=--;
    }
/ac {^2	计出连环     jichulianhuanjue%s%1%s（%2/3）%s%3}{
    /var jz_1 %1;
    /var jz_2 %2;
    /var jz_3 %3;
    /if {$jz_1==100}{
        /if {$jz_3==0}{/var jclhok 1}{
            /var jclhok 0;/delay {$jz_3}{/var jclhok 1};
            };
        };
    /if {$jz_1!=100}{
        /if {$jz_2==0}{/var jclhok 0}{
            /if {$jz_3==0}{/var jclhok 1}{
        /var jclhok 0;/delay {$jz_3}{/var jclhok 1};
                                          };
                                    };
                    };
    /showme ---jclhok=$jclhok  -$jz_1-$jz_2-$jz_3=--;
    }
