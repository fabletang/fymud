/var wq_anqi 0
/var wq_blade 0
/ac {^�㽫���˴�����}{/var wq_anqi 1;/var wq_blade 0}
/ac {^��������е����˴�}{/var wq_anqi 0;/var wq_blade 0}
/ac {^����һ�����λε�}{/var wq_blade 1;/var wq_anqi 0}
/ac {^��������е��ǻ�}{/var wq_blade 0;/var wq_anqi 0}
/ac {^��������еĺ���}{/var wq_blade 0;/var wq_anqi 0}
/ac {^  ���ǻ�(Jade)}{/var wq_blade 1;/var wq_anqi 0}
/ac {^  �̺���(Jade)}{/var wq_blade 1;/var wq_anqi 0}
/ac {^  ��%1���˴�}{/var wq_blade 0;/var wq_sword 0;/var wq_anqi 1}
/al wianqi {/if {$wq_anqi==0}{/if {$wq_blade==1||$wq_sword==1}{unwi jade};enable parry tanzhi-shentong;enable parry starrain;wi needle} }
/al wiblade {/if {$wq_blade==0}{ /if {$wq_anqi==1}{unwi needle};enable parry chillblade;wi jade} }
/var wq_sword 0
/ac {^�㡸ৡ���һ�����һ��}{/var wq_sword 1;/var wq_anqi 0;/var wq_blade 0}
/ac {^  ����罣(Jade)}{/var wq_sword 1;/var wq_anqi 0;/var wq_blade 0}
/ac {^�㽫���е�%1��������Ľ���}{/var wq_sword 0;/var wq_anqi 0;/var wq_blade 0}
/al wisword {/if {$wq_sword==0}{/if {$wq_anqi==1}{unwi needle};enable parry qingfeng-sword;wi jade}}

/nop npc �Ƿ�������
/var npcwi 0
/ac {^  ��������}{/var npcwi 1}
/ac {^  ��������}{/var npcwi 1}
/ac {^  ˫��ִ��}{/var npcwi 1}
/ac {^  ˫������}{/var npcwi 1}
/ac {^��˫��ִ��}{/var npcwi 1}
/ac {^��˫��ִ��}{/var npcwi 1}
/ac {^����������}{/var npcwi 1}
/ac {^����������}{/var npcwi 1}
/ac {^��ֻ�������ж̸赶�ѳֲ��������ַɳ���}{tt ==== ��������;}
/ac {^�������ϣ��ϻ̳Ͽֵ�վ������}{/showme get ����}
