/nop ==============juezhao======
/var jz_1 0
/var jz_2 0
/var jz_3 180
/al cjz {/var jz_1 0;/var jz_2 0;/var jz_3 180;ab2}
/var lrok 0
/var htok 0
/var tdrmok 1
/var twfxok 1
/var jclhok 1
/al jzno {/var lrok 0;/var htok 0;/var tdrmok 0;/var twfxok 0;/var jclhok 0}
/var zhok 1
/al zh {/if {$zhok==1}{do unwield all,cast mengyanjue;widef}}
/ac {^���૵����˼������˫��һ��}{ability2}
/al pjuezhao {
            zh;
            /if {$twfxok==1}{perform tianwaifeixianjue;};
            /if {$jclhok==1}{perform jichulianhuanjue;};
            /if {$tdrmok==1}{perform tiandirenmojue;};
            de1 {
            /if {$lrok==1}{do unwield all,perform luorijue;widef};
            /if {$htok==1}{do unwield all,perform hantianjue;widef};
            };
         }
/al pjuezhao2 {
            /if {$htok==1}{do unwield all,perform hantianjue;widef};
            /if {$lrok==1}{do unwield all,perform luorijue;widef};
            /if {$twfxok==1}{perform tianwaifeixianjue;};
            /if {$jclhok==1}{perform jichulianhuanjue;};
            /if {$tdrmok==1}{perform tiandirenmojue;};
         }
/al juezhao {
    ability2;
    /delay {0.5}{
    /if {$tdrmok==0 && $twfxok==0 && $jclhok==0}{qie};
    /if {$jclhok==1}{jclh};
    /if {$tdrmok==1}{tdrm};
    /if {$twfxok==1}{twfx};
        }
        }
/ac {^�㻹Ҫ��Ҫ�ȴ�%1�����ʹ��߳�����֮�ؼ���}{ability2}
/ac {^ʹ�ô��ľ��������������}{widef}
/ac {^�����췢��һ����Ц��ʹ��������ȭ}{
    /var lrok 0;
    jzno;
    /delay {0.2}{ability2};
   }
/ac {^��ʹ���۾��غ����ƣ�}{
    /var htok 0;
    jzno;
    /delay {0.2}{ability2};
   }
/nop CDT300�� ����������˵�����л�ƹ����� 
/al jclh {/if {$jclhok==1}{set secon_perform jichulianhuanjue}}
/ac {^��ӳ���������еľ�����ص�һʽ}{
    /var jclhok 0;
    jzno;
    /nop delay {300}{/var jclhok 1};
    juezhao;
    /delay {0.2}{ability2};
   }
/nop CDT300��  ȫ���������ħ�����˵��� 
/al tdrm {/if {$tdrmok==1}{set secon_perform tiandirenmojue}}
/ac {^��������ͨ���������ħ������ʽһ��}{/var tdrmok 0;
    /nop delay {300}{/var tdrmok 1};
    jzno;
    juezhao;
    /delay {0.2}{ability2};
    }
/al twfx {/if {$twfxok==1}{set secon_perform tianwaifeixianjue}}
/ac {^�㽣�ƶ��䣬ʹ�����ɽ����еľ���}{/var twfxok 0;
    /nop delay {300}{/var twfxok 1};
    jzno;
    juezhao;
    /delay {0.2}{ability2};
    }
/nop 1	�����ħ     tiandirenmojue      8	��2/3��	  0	
/nop 2	�Ƴ�����     jichulianhuanjue    10	��0/3��	219	
/ac {^1	�����ħ     tiandirenmojue%s%1%s��%2/3��%s%3}{
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
/ac {^2	�Ƴ�����     jichulianhuanjue%s%1%s��%2/3��%s%3}{
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
/ac {^3	�������     tianwaifeixianjue%s%1%s��%2/3��%s%3}{
    /var jz_1 %1;
    /var jz_2 %2;
    /var jz_3 %3;
    /if {$jz_1==100}{
        /if {$jz_3==0}{/var twfxok 1}{
            /var twfxok 0;/delay {$jz_3}{/var twfxok 1};
            };
        };
    /if {$jz_1!=100}{
        /if {$jz_2==0}{/var twfxok 0}{
            /if {$jz_3==0}{/var twfxok 1}{
        /var twfxok 0;/delay {$jz_3}{/var twfxok 1};
                                          };
                                    };
                    };
    /showme ---twfxok=$twfxok  -$jz_1-$jz_2-$jz_3=--;
    }
/ac {^4	��������     luorijue%s%1%s��%2/3��%s%3}{
    /var jz_1 %1;
    /var jz_2 %2;
    /var jz_3 %3;
    /if {$jz_1==100}{
        /if {$jz_3==0}{/var lrok 1}{
            /var lrok 0;/delay {$jz_3}{/var lrok 1};
            };
        };
    /if {$jz_1!=100}{
        /if {$jz_2==0}{/var lrok 0}{
            /if {$jz_3==0}{/var lrok 1}{
        /var lrok 0;/delay {$jz_3}{/var lrok 1};
                                          };
                                    };
                    };
    /showme ---lrok=$lrok  -$jz_1-$jz_2-$jz_3=--;
    }
/ac {^5	��������     hantianjue%s%1%s��%2/3��%s%3}{
    /var jz_1 %1;
    /var jz_2 %2;
    /var jz_3 %3;
    /if {$jz_1==100}{
        /if {$jz_3==0}{/var htok 1}{
            /var htok 0;/delay {$jz_3}{/var htok 1};
            };
        };
    /if {$jz_1!=100}{
        /if {$jz_2==0}{/var htok 0}{
            /if {$jz_3==0}{/var htok 1}{
        /var htok 0;/delay {$jz_3}{/var htok 1};
                                          };
                                    };
                    };
    /showme ---htok=$htok  -$jz_1-$jz_2-$jz_3=--;
    }
/ac {^10	�����ٻ�     mengyanjue%s%1%s��%2/3��%s%3}{
    /var jz_1 %1;
    /var jz_2 %2;
    /var jz_3 %3;
    /if {$jz_1==100}{
        /if {$jz_3==0}{/var zhok 1}{
            /var zhok 0;/delay {$jz_3}{/var zhok 1};
            };
        };
    /if {$jz_1!=100}{
        /if {$jz_2==0}{/var zhok 0}{
            /if {$jz_3==0}{/var zhok 1}{
        /var zhok 0;/delay {$jz_3}{/var zhok 1};
                                          };
                                    };
                    };
    /showme ---zhok=$zhok  -$jz_1-$jz_2-$jz_3=--;
    }
