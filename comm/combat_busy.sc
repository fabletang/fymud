/nop  twbusy {tw /var npc_busy 1,busy_p,/var npc_busy 0}
/al twbusy {tw busy_p}
/ac {^�Է��Ѿ����ܶ����ˡ�����}{/all {/showme ---busy_npc:random}}
/ac {�Ѿ���æ�����ˣ�}{/all {/showme ---busy_npc:random}}
/ac {^�����Ѿ��ڼ���æ��}{/all {/showme ---busy_npc:6s:$npc_cn:}}
/ac {^��������δ��}{/var npc_busy 0;/all {/showme ===avoid_busy:$npc_cn}}
/ac {^---busy_npc:random}{/var npc_busy 1;de4 {/var npc_busy 0};busy_ag;busy_p;de3 {busy_ag;busy_p}}
/nop showme {�����ư����У��㲻��}
/nop showme {�����ư����У��費��}
/nop hs anxiang-steps
/ac {^�����ư����У�%1����}{
    /var npc_cn %1;
    /var npc_busy 1;
    /if {"$npc_cn"=="��"||"$npc_cn"=="$teamer_2_cn"||"$npc_cn"=="$teamer_1_cn"||"$npc_cn"=="$team_header_cn"}{/var npc_busy 0;/showme ---team_be_busy:$npc_cn};
    /delay {0.1}{
        /if {$npc_busy==1}{/showme ---busy_npc:6s:$npc_cn:}{/showme ---busy_npc:0s:$npc_cn:};
        };
    }
/ac {%5������ת}{
    /if {"$npc_cn"=="%5"}{/var npc_busy 0;/showme ===avoid_busy:$npc_cn};
    /if {"$npc_nc"=="$myname_cn"}{tt ===cancel_busy:$myname:$serial;/math serial {$serial+1}};
    }{4}

/ac {^��â������%1��࣬˿˿���}{
        /var npc_cn %1;
    /if {"$npc_cn"=="��"||"$npc_cn"=="$teamer_2_cn"||"$npc_cn"=="$teamer_1_cn"||"$npc_cn"=="$team_header_cn"}{
	/if {"$npc_cn"=="��"}{
        /showme ---wkxl fail:$npc_cn
                /var busy_self 1;de6 {/var busy_self 0};
		}
        }{/showme ---busy_npc:6s:$npc_cn:};
     }
/ac {^%1һ�����ģ��������һ����Ѫ}{
    /var npc_cn %1;
    /if {"$npc_cn"=="��"||"$npc_cn"=="$teamer_2_cn"||"$npc_cn"=="$teamer_1_cn"||"$npc_cn"=="$team_header_cn"}{/var npc_busy 0;/showme ---wkxl fail:$npc_cn};
 	};   	
/al busy_ag {;}
/ac {^---busy_npc:%1s:%2:}{
    /if {%1==0}{/showme ---busy_npc:fail:%2}; 
    /if {%1==6}{/var npc_busy 1;busy_p;de2 busy_p;de3 busy_p;de4 {busy_ag;busy_p};de5 {busy_ag;busy_p};}; 
    /if {%1==4}{/var npc_busy 1;busy_p;de2 busy_p;de3 {busy_ag;busy_p};}; 
    /delay {%1}{/var npc_busy 0};
    }
/nop ac {^����Ӱ��������趯}{busy_p}
/nop showme {��ֻ���ؿ�����Ѩһ�飬��ʱ�������á�}
/nop showme {����ֻ���ؿ�����Ѩһ�飬��ʱ�������á�}
/nop hs tanzhi-shentong
/ac {%1�͵�һ�����������}{
    /var npc_cn %1;
    /if {"$npc_cn"=="��"||"$npc_cn"=="$teamer_2_cn"||"$npc_cn"=="$teamer_1_cn"||"$npc_cn"=="$team_header_cn"}{}{ /var npc_busy 0;/showme ===avoid_busy:$npc_cn}
}
/ac {%1���Ĺ�һ����Ϊ}{
    /var npc_cn %1;
    /if {"$npc_cn"=="��"||"$npc_cn"=="$teamer_2_cn"||"$npc_cn"=="$teamer_1_cn"||"$npc_cn"=="$team_header_cn"}{}{ /var npc_busy 0;/showme ===avoid_busy:$npc_cn}
}
/ac {%1ֻ���ؿ�����Ѩһ�飬��ʱ�������á�}{
    /var npc_cn %1;
    /var npc_busy 1;
    /ac {%5������ת}{/if {"$npc_cn"=="%5"}{/var npc_busy 0}};
    /if {"$npc_cn"=="��"||"$npc_cn"=="$teamer_2_cn"||"$npc_cn"=="$teamer_1_cn"||"$npc_cn"=="$team_header_cn"}{/var npc_busy 0;/showme ---team_be_busy:$npc_cn}{
        /if {$npc_busy==1}{/showme ---busy_npc:6s:$npc_cn:}{/showme ---busy_npc:0s:$npc_cn:};
    }
    }
/nop do for busy 
