/format ttfile {%s.tt}{$myname}
/al reload {/read $ttfile}
/act {^��ѡ����ʹ�õ�����}{0}
/act {^����Ӣ�����֣�} {$myname}
/ac {��Ӣ�������ѱ�ʹ�ã���������ʺŵ�����}{$passwd}
/ac {^���ûس����ۣңţԣգңΣ�}{/cr;/ticker {noidle}{xixi;}{280}}
/ac {^����������ϡ�}{/cr;/ticker {noidle}{hehe}{280}}
/ac {^#SESSION '%0' DIED.}{reload}
/ac {^#SESSION '%0' ACTIVATED.}{reload}
