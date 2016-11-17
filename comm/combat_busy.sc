/nop  twbusy {tw /var npc_busy 1,busy_p,/var npc_busy 0}
/al twbusy {tw busy_p}
/ac {^对方已经不能动弹了。。。}{busy_p;twbusy}
/ac {已经手忙脚乱了！}{busy_p;twbusy}
/nop showme {在缕缕暗香中，你不禁}
/nop showme {在缕缕暗香中，舞不禁}
/nop hs anxiang-steps
/ac {^在缕缕暗香中，%1不禁}{
    /var npc_cn %1;
    /var npc_busy 1;
    /if {"$npc_cn"=="你"||"$npc_cn"=="$teamer_2_cn"||"$npc_cn"=="$teamer_1_cn"||"$npc_cn"=="$team_header_cn"}{/var npc_busy 0;/showme ---team_be_busy:$npc_cn};
    /delay {0.1}{
        /if {$npc_busy==1}{/showme ---busy_npc:6s:$npc_cn:}{/showme ---busy_npc:0s:$npc_cn:};
        };
    }
/ac {%5真气流转}{
    /if {"$npc_cn"=="%5"}{/var npc_busy 0;/showme ===avoid_busy:$npc_cn};
    /if {"$npc_nc"=="$myname_cn"}{tt ===cancel_busy:$myname:$serial;/math serial {$serial+1}};
    }{4}
/ac {^---busy_npc:%1s:%2:}{
    /if {%1==0}{/showme ---busy_npc:fail:%2}; 
    /if {%1==6}{busy_p;de2 busy_p;de3 busy_p;de4 busy_p;de5 busy_p;}; 
    /if {%1==4}{busy_p;de2 busy_p;de3 busy_p;}; 
    /delay {%1}{/var npc_busy 0};
    }
/nop ac {^舞身影如旋风般舞动}{busy_p}
/nop showme {你只觉胸口膻中穴一麻，登时动弹不得。}
/nop showme {大嘴只觉胸口膻中穴一麻，登时动弹不得。}
/nop hs tanzhi-shentong
/ac {%1只觉胸口膻中穴一麻，登时动弹不得。}{
    /var npc_cn %1;
    /var npc_busy 1;
    /ac {%5真气流转}{/if {"$npc_cn"=="%5"}{/var npc_busy 0}};
    /if {"$npc_cn"=="你"||"$npc_cn"=="$teamer_2_cn"||"$npc_cn"=="$teamer_1_cn"||"$npc_cn"=="$team_header_cn"}{/var npc_busy 0;/showme ---team_be_busy:$npc_cn}{
        /if {$npc_busy==1}{/showme ---busy_npc:6s:$npc_cn:}{/showme ---busy_npc:0s:$npc_cn:};
    }
    }
/nop do for busy 
