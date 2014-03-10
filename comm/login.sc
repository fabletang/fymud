/format ttfile {%s.tt}{$myname}
/al reload {/read $ttfile}
/act {^请选择您使用的内码}{0}
/act {^您的英文名字：} {$myname}
/ac {此英文名字已被使用，请输入此帐号的密码}{$passwd}
/ac {^请敲回车键［ＲＥＴＵＲＮ］}{/cr;/ticker {noidle}{xixi;}{280}}
/ac {^重新连线完毕。}{/cr;/ticker {noidle}{hehe}{280}}
/ac {^#SESSION '%0' DIED.}{reload}
/ac {^#SESSION '%0' ACTIVATED.}{reload}
