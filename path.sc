/nop fy2005 tintin 2.00.7
/substitute {^> %0}{%0}{1}
/nop al nd northdown
/nop al nu northup
/nop al sd southdown
/nop al su southup
/nop al se southeast
/nop al sw southwest
/nop al ne northeast
/nop al nw northwest
/nop al eu eastup
/nop al ed eastdown
/nop al wu westup
/nop al wd westdown
/nop al e east
/nop al w west
/nop al s south
/nop al n north
/al ee {/%1 e}
/al ss {/%1 s}
/al nn {/%1 n}
/al ww {/%1 w}
/al pr {/path run 0.1}
/al pl {/path load {%1}}
/al aliaswalk {alias nd northdown;alias nu northup;alias sd southdown;alias su southup;alias se southeast;alias sw southwest;alias ne northeast;alias nw northwest;alias eu eastup;alias e east;alias w west;alias s south;alias n north}
/al aliaswalkoff {alias nd;alias nu;alias sd;alias su;alias se;alias sw;alias ne;alias nw;alias eu;alias e;alias w;alias s;alias n}
/nop al batin {/2 e;dash huache;open rightdoor;de1 {bat3}}
/al batin {do e,e,dash huache,open rightdoor;de1 {bat3}}
/nop al bat3 {/3 w;up;/4 e}
/al bat3 {wlk;do w,w,w,up,e,e,e,e;nwlk}
/nop #alias bat4 {open ÆÁ·ç;s;#4 up}
/nop #alias bit5 {say ÎÒÀ´¹ı£¬»î¹ı£¬°®¹ı£¡}
/nop al batout {pl {open ÆÁ·ç;s;u;u;u;u;answer no;e;sail};pr}
/al batout {do open ÆÁ·ç,s,u,u,u,u,answer no,e,sail}
/al bat2chu {do open ÆÁ·ç,s,u,u,u,u,answer no,e,sail}
/nop wang tian shou
/al batout1 {do open ÆÁ·ç,s,u,u,u, u,answer no,e}
/al chu2white {ask master about island; bat2white+;de1 {keychain}}
/al bat2white {bat2chu;de2 {chu2white}}
/al white2dk {do sd,sd,sd,sd,sd,e,e,e,e}
/al dk2white {do w,w,w,w,nu,nu,nu,nu,nu}
/al dk2chu {batin;de2 {bat2chu}}
/al chu2fy {wlk;w;w;n;hb2fy}
/al dk2fy {batin;de1 bat2chu;de3 chu2fy}
/al white2fy {white2dk;de1 dk2fy}
/al chu2dk {ask master about island; chu2dk+;de1 {keychain}}
/nop dk ¶´¿Ú
/al chu2dk+ {
/ac {^´óº£}{listen wave};
/ac {^º£ÀË¾ÍÏóÊÇÒ»Í·Í·¶ñÀÇ}{listen wave};
/ac {^Í»È»¼ä£¬ÄãµÄ´¬´¥½¸ÁË}{bat2dk-;/2 e}
}
/al chu2dk- {
/unac {^´óº£};
/unac {^º£ÀË¾ÍÏóÊÇÒ»Í·Í·¶ñÀÇ};
/unac {^Í»È»¼ä£¬ÄãµÄ´¬´¥½¸ÁË}
}
/al bat2white+ {
/ac {^´óº£}{listen wave};
/ac {^º£ÀË¾ÍÏóÊÇÒ»Í·Í·¶ñÀÇ}{listen wave};
/ac {^Í»È»¼ä£¬ÄãµÄ´¬´¥½¸ÁË}{bat2white-;do w,w,nu,nu,nu,nu}
}
/al bat2white- {
/unac {^´óº£};
/unac {^º£ÀË¾ÍÏóÊÇÒ»Í·Í·¶ñÀÇ};
/unac {^Í»È»¼ä£¬ÄãµÄ´¬´¥½¸ÁË}
}
/nop ac {^Õâ¸ö·½ÏòÃ»ÓĞ³öÂ·¡£}{look}
/ac {^·ç±øÏòÄãºÈµÀ£º²»¿ÉÊÖ³Ö±øÆ÷} {unwield all}
/ac {^ÊØ±¸Ê¿±øÏòÄãºÈµÀ£º²»¿ÉÊÖ³Ö±øÆ÷Èë³Ç}{unwield all}
/nop al dqg2fy {wlk;wear all;open door;/3 eu;e;s;e;e;de1 {eu;e;e;s;wu;w;nu;wd};de2 {wd;wd;unwi all;/4 w};de3 {/7 w;u;nwlk}}
/al dqg2fy {yinbin2wy;de1 {wy2fy}}

/nop al fy2dqg {wlk;fy2xrd;de3 {xrd2dqg}}
/al fy2dqg {wlk;fy2wy;de3 {wy2yinbin}}
/nop yhgz ÔÆº£¹ÂÖÛ 
/al fy2yhgz {fye;de1 {do e,e,eu,eu,eu;nwlk}}
/al fy2wy {fye;de1 {do e,e,n,eu,eu,eu,sd,e,ed,n,w;nwlk}}
/al wy2fy {wlk;do e,s,wu,w,nu,wd,wd,wd,w,w;de1 {fye-}}
/nop ÏÉÈË¶´
/nop wy Î£ÑÂ
/al xrd2wy {wlk;do sd,e,ed,n,w;nwlk}
/al yhgz2wy {wlk;do sd,e,ed,n,w;nwlk}
/al wy2yhgz {wlk;do e,s,wu,w,nu;nwlk}
/al wy2xrd {wlk;do e,s,wu,w,nu;nwlk}
/al wy2yinbin {wlk;w;wd;/2 w;n;w;/2 wd;open door;wd;nwlk}
/al yinbin2wy {wlk;do eu,open door,eu,eu,e,s,e,e,eu,e;nwlk}
/al xrd2dqg {xrd2wy;de1 {wy2yinbin}}
/nop al fye2xrd {wlk;e;e;/3 eu;e;eu;nwlk}
/nop al fye2xrd {wlk;do e,e,eu,eu,eu,e,eu;nwlk}
/al fye2xrd+ {
    /ac {^ÆæÊ¯ÊèÓ°}{n};
    /ac {^ÃÔÃ£·çÓêÂ·}{fye2xrd-}
}
/al fye2xrd- {
    /unac {^ÆæÊ¯ÊèÓ°};
    /unac {^ÃÔÃ£·çÓêÂ·}
}
/nop al xrd2fye {wlk;wd;w;/3 wd;w;w;nwlk}
/nop al fy2xrd {fye;fye2xrd+;de2 {e;e;fye2xrd}}
/al fye2xrd {wlk;do e,e,n,e,eu,eu,eu,ne,nw,n,nu;nwlk}
/al xrd2fye {wlk;do sd,s,se,sw,wd,wd,wd,w,w;nwlk}
/al fy2xrd {fye;de1 {fye2xrd}}
/nop al xrd2fy {xrd2fye;de1 {fye-}}
/al xrd2fy {xrd2fye;de1 {fye-}}

/nop ¹àÄ¾ÁÖ
/nop al xrd2gml {xl2gml+;sd;ed;n}
/al xrd2gml {wlk;sd;e;ed;n;/4 e;/3 s;nwlk}
/al gml2xrd {wlk;/3 n;/4 w;s;wu;w;nu;nwlk}
/nop al fy2gml {fy2xrd;de3 {xrd2gml}}
/al fy2gml {fy2hb;de4 {s;s;s}}
/nop al gml2fy {gml2xrd;de1 {xrd2fy}}
/al gml2fy {w;w;n;hb2fy}
/nop gml2³¤´ºµº
/al gml2ccd {n;fy2ccd+;/delay {0.2}{l}}
/al fy2ccd {fy2gml;/delay {4.5}{gml2ccd}}
/al fy2ccd+ {
    wlk;
    /ac {^¹àÄ¾ÁÖ}{n};
    /ac {^±ÌÀ¶º£±ß}{/ticker {pipe}{gb pipe;blow pipe;keychain}{4}};
    /ac {^³£´ºµº¶É¿Ú}{fy2ccd-;pp pipe};
    /ac {^ÀÏÆÅ×ÓËµµÀ£º¡°ÉÏ´¬°É£¡¡±}{/unticker {pipe};d};
    /ac {^ÀÏÆÅ×ÓËµµÀ£º¡°µ½ÁË£¬ÄãÃÇ¿ÉÒÔÏÂ´¬ÁË¡£¡±}{u}
}

/al fy2ccd- {
    nwlk;
    /unac {^¹àÄ¾ÁÖ};
    /unac {^±ÌÀ¶º£±ß};
    /unticker {pipe};
    /unac {^ÀÏÆÅ×ÓËµµÀ£º¡°ÉÏ´¬°É£¡¡±};
    /unac {^ÀÏÆÅ×ÓËµµÀ£º¡°µ½ÁË£¬ÄãÃÇ¿ÉÒÔÏÂ´¬ÁË¡£¡±}
}
/al ccd2fy {ccd2fy+;/delay {0.2}{l}}
/al ccd2fy+ {
    wlk;
    /ac {^±ÌÀ¶º£±ß}{s};
    /ac {^¹àÄ¾ÁÖ}{ccd2fy-;pp pipe;/delay {0.2}{gml2fy}};
    /ac {^³£´ºµº¶É¿Ú}{keychain;/ticker {pipe}{gb pipe;blow pipe}{4}};
    /ac {^ÀÏÆÅ×ÓËµµÀ£º¡°ÉÏ´¬°É£¡¡±}{/unticker {pipe};d};
    /ac {^ÀÏÆÅ×ÓËµµÀ£º¡°µ½ÁË£¬ÄãÃÇ¿ÉÒÔÏÂ´¬ÁË¡£¡±}{u}
}

/al ccd2fy- {
    nwlk;
    put pipe in bag;
    /unac {^±ÌÀ¶º£±ß};
    /unac {^¹àÄ¾ÁÖ};
    /unac {^³£´ºµº¶É¿Ú};
    /unticker {pipe};
    /unac {^ÀÏÆÅ×ÓËµµÀ£º¡°ÉÏ´¬°É£¡¡±};
    /unac {^ÀÏÆÅ×ÓËµµÀ£º¡°µ½ÁË£¬ÄãÃÇ¿ÉÒÔÏÂ´¬ÁË¡£¡±}
}
/al ccdin+ {
    wlk;
    /ac {^³£´ºµº¶É¿Ú}{e;ne;se;eu;e;eu;};
    /ac {^³¤½×}{/delay {0.1}{eu}};
    /ac {^¹ÛÔÂ¶¥}{ccdin-}
}
/al ccdin- {
    nwlk;
    /unac {^³£´ºµº¶É¿Ú};
    /unac {^³¤½×};
    /unac {^¹ÛÔÂ¶¥}
}
/al ccdin {ccdin+;l}
/al ccdout+ {
    wlk;
    /ac {^³£´ºµº¶É¿Ú}{ccdout-};
    /ac {^³¤½×}{/delay {0.1}{wd}};
    /ac {^¹ÛÔÂ¶¥}{wd};
    /ac {^Æ½Ì¨}{w;wd;nw;sw;w}
}
/al ccdout- {
    nwlk;
    /unac {^³£´ºµº¶É¿Ú};
    /unac {^³¤½×};
    /unac {^¹ÛÔÂ¶¥};
    /unac {^Æ½Ì¨}
}
/al ccdout {ccdout+;l}
/nop ¹àÄ¾ÁÖtoòùòğµº
/nop ac batout {say ÎÒÀ´¹ı£¬»î¹ı£¬°®¹ı£¡}
/al fy2bat {fy2gml;de5 {gml2bat}}
/al fy2chu {fy2gml;de5 {wlk;dash bush;e;e;nwlk}}
/al gml2bat {bat+;l;dash bush;recover force}
/al bat+ {
    wlk;
    /ac {^¹àÄ¾ÁÖ}{wlk;dash bush};
    /ac {^  ×ÏÃæÉ·Éñ ÎºĞĞÁú(Wei xing long)}{ask wei xing long about book;say fight wei xing long;e};
    /ac {^ÎºĞĞÁúÎŞ¿ÉÄÎºÎµØ´Ó»³ÀïÌÍ³öÒ»±¾Êéµİ¸øÄã}{wlk;/delay {7.5}{e}};
    /ac {^  µÁË§¡¸Ãî¾øÌìÏÂ¡¹³şÁôÏã(Master chu)}{ask master about island;de2 {l}};
    /ac {^  ¡¸ÓñÊ÷ÁÙ·ç¡¹¶¡·ã(Ding feng)}{keychain;give book to ding feng};
    /ac {^´óº£}{look wave};
    /ac {^º£ÀË¾ÍÏóÊÇÒ»Í·Í·¶ñÀÇ£¬ßòÒ§×ÅÄãµÄ´¬£¡}{look wave};
    /ac {^ÈË¼äµØÓü}{bat-;/2 e;de1 {cks}}
}
/al bat- {
    nwlk;
    /unac {^¹àÄ¾ÁÖ};
    /unac {^  ×ÏÃæÉ·Éñ ÎºĞĞÁú(Wei xing long)};
    /unac {^ÎºĞĞÁúÎŞ¿ÉÄÎºÎµØ´Ó»³ÀïÌÍ³öÒ»±¾Êéµİ¸øÄã};
    /unac {^  µÁË§¡¸Ãî¾øÌìÏÂ¡¹³şÁôÏã(Master chu)};
    /unac {^  ¡¸ÓñÊ÷ÁÙ·ç¡¹¶¡·ã(Ding feng)};
    /unac {^´óº£};
    /unac {^º£ÀË¾ÍÏóÊÇÒ»Í·Í·¶ñÀÇ£¬ßòÒ§×ÅÄãµÄ´¬£¡};
    /unac {^ÈË¼äµØÓü}
}

/al xl2gml+ {
    wlk;
    /ac {^¡¸Ğ¡Â·¡¹ -}{e};
    /ac {^¡¸É½ÖĞĞ¡Â·¡¹ -}{e};
    /ac {^¡¸Æ½Ô­Â·¡¹ -}{e};
    /ac {^¡¸º£±ßÂ·¡¹ -}{e};
    /ac {^¡¸¹àÄ¾ÁÖ¡¹ -}{xl2gml-}
}
/al xl2gml- {
    nwlk;
    /unac {^¡¸Ğ¡Â·¡¹ -};
    /unac {^¡¸É½ÖĞĞ¡Â·¡¹ -};
    /unac {^¡¸Æ½Ô­Â·¡¹ -};
    /unac {^¡¸º£±ßÂ·¡¹ -};
    /unac {^¡¸¹àÄ¾ÁÖ¡¹ -}
}

/al gml2xl+ {
    wlk;
    /ac {^¡¸Ğ¡Â·¡¹ -}{s};
    /ac {^¡¸É½ÖĞĞ¡Â·¡¹ -}{w};
    /ac {^¡¸Æ½Ô­Â·¡¹ -}{w};
    /ac {^¡¸º£±ßÂ·¡¹ -}{w};
    /ac {^¡¸¹ÈÄÚĞ¡¾¶¡¹ -}{gml2xl-}
}
/al gml2xl- {
    nwlk;
    /unac {^¡¸Ğ¡Â·¡¹ -};
    /unac {^¡¸É½ÖĞĞ¡Â·¡¹ -};
    /unac {^¡¸Æ½Ô­Â·¡¹ -};
    /unac {^¡¸º£±ßÂ·¡¹ -};
    /unac {^¡¸¹ÈÄÚĞ¡¾¶¡¹ -}
}
/al dqgout {wlk;wear all;center;go cyan;open hua;s;nwlk}

/al dqgin {wlk;ask yin bin about man;remove all;de3 {ask zhu zao about ¹ıÕó;nwlk}}

/nop al fy2tuzi {fye;de1 {pl {e;e;n;e;e;e;eu;eu;eu;sd;e;ed;nwlk};pr}}
/al fy2tuzi {fye;de1 {do e,e,n,e,e,e,eu,eu,eu,sd,e,ed;nwlk}}
/nop al tuzi2fy {wlk;wu;w;nu;wd;wd;wd;unwi all;/4 w;de1 {/7 w;u;nwlk}}
/al tuzi2fy {wlk;do wu,w,nu,wd,wd,wd,unwield all,w,w;de1 {fye-;nwlk}}
/al tuzi2hb {wlk;n;/4 e;s;nwlk}
/nop al hb2tuzi {wlk;n;/4 w;s;wlk}
/al hb2tuzi {wlk;do s,s,s,s,s,n,n,n,w,w,w,w,s;wlk}
/al hb2fy {hb2tuzi;de1 {tuzi2fy}}
/al fy2hb {fy2tuzi;de3 {tuzi2hb}}
/al fy2stj {fy2tuzi;de3 {tuzi2hb};de4 {do n,n,n,w,open door,w;give romance to master;}}
/nop º£±ß-ÁúÍõ
/al hb2lw {wlk;do n,n,n,n,n,e,walkto bow,give meat to man,enter;nwlk}
/al lw2hb {wlk;out;walkto °¶±ß;de8 {w;s;s;s;nwlk}}

/nop al fye2wxl {e;/3 eu;e;eu;ed;ed;n;}

/nop ïÚ¾Ö
/al fy2bj {wlk;d;/4 e;s;e;nwlk}
/al bj2fy {wlk;w;n;/4 w;u;nwlk}


/nop ÎŞÃûÕò


/al fy2wmz {wlk;d;/4 n;/delay {0.5}{nw;n;ne;n;n;e;e;nwlk}}
/al wmz2fy {wlk;w;w;s;s;sw;s;se;/delay {0.5}{/4 s;u;nwlk}}

/nop Ç§·ğ
/nop al fy2qf {wlk;d;/4 n;nw;de1 {n;ne;/4 n};de2 {n;/2 e;nwlk}}
/nop al qf2fy {wlk;/2 w;/3 s;de1 {unwi all;s;s;sw;s;se};de2 {/4 s;u;nwlk}}

/nop al fyn {pl {wlk;d;n;n;n;n;nw;n;ne;n;n;nwlk};pr}
/al fyn { wlk;do d,n,n,n,n,nw,n,ne,n,n;nwlk;}
/nop al fyn- {pl {wlk;unwield all;s;s;sw;s;se;s;s;s;s;u;nwlk;wim};pr}
/al fyn- {wlk;unwield all;do s,s,sw,s,se,s,s,s,s,u;nwlk}
/nop al pfys {pl {wlk;d;s;s;s;s;s;s;s;s;nwlk}}
/al fys {wlk;do d,s,s,s,s,s,s,s,s;nwlk}
/nop al pfys- {pl {wlk;unwield all;n;n;n;n;n;n;n;n;u;nwlk}}
/al fys- {wlk;unwield all;do n,n,n,n,n,n,n,n,u;nwlk}
/nop al fys {pfys;pr}
/nop al fys- {pfys-;pr}
/nop al fye {pl {wlk;d;e;e;e;e;e;e;e;e;e;nwlk};pr}
/al fye {wlk;do d,e,e,e,e,e,e,e,e,e;nwlk;}
/nop al fye- {pl {wlk;unwield all;w;w;w;w;w;w;w;w;w;u;nwlk;wim};pr}
/al fye- {wlk;unwield all;do w,w,w,w,w,w,w,w,w,u;nwlk}
/al fyw {wlk;do d,w,w,w,w,w,w,w,w;nwlk}
/al fyw- {wlk;unwield all;do e,e,e,e,e,e,e,e,u;nwlk}

/nop fyn {wlk;do d,n,n,n,n,nw,n,ne,n,n;nwlk;}
/nop  fy2qf {fyn;/delay {1.5}{fyn2qf}}
/al fy2qf {wlk;do d,n,n,n,n,nw,n,ne,n,n,n,n,n,e,e;nwlk}
/nop fyn2qf {pl {wlk;n;n;n;e;e;nwlk};pr}
/al fyn2qf {wlk;do n,n,n,e,e;nwlk}
/al qf2fyn {pl {wlk;w;w;s;s;s;nwlk};pr}
/al qf2fy {unwield all;wlk;do w,w,s,s,s,s,s,sw,s,se,s,s,s,s,u;nwlk}
/nop al fy2qf {fyn;/delay {1.5}{/3 n;/2 e}}
/al fyn2qf+ {
    wlk;
    /ac {^·çÔÆ³Ç±±}{n};
    /ac {^ÄÏ±±´óµÀ}{look east;/ac {^ÄãÒª¿´Ê²÷á}{n};/ac {^Ñô¹Ø´óµÀ}{fyn2qf-;/delay {0.2}{e;e}}};
    /ac {^Ç§·ğÉ½½Ç}{fyn2qf-}
}
/al fyn2qf- {
    nwlk;
    /unac {^ÄãÒª¿´Ê²÷á};
    /unac {^·çÔÆ³Ç±±};
    /unac {^Ñô¹Ø´óµÀ};
    /unac {^ÄÏ±±´óµÀ};
    /unac {^Ç§·ğÉ½½Ç}
}

/nop  qf2fy {qf2fyn;de1 {fyn-}}
/al qf2fyn+ {

    wlk;
    /ac {^ÄÏ±±´óµÀ}{s};
    /ac {^·çÔÆ³Ç±±}{;qf2fyn-;fyn-}
}
/al qf2fyn- {
    nwlk;
    /unac {^ÄÏ±±´óµÀ};
    /unac {^·çÔÆ³Ç±±}
}

/nop ¼ÃÄÏ

/al fy2jn {wlk;fy2qf;de2 {e;/3 s;nwlk}}
/nop al jn2fy {wlk;n;/3 w;/2 s;de1 {/3 s;sw;s;se};de2 {/4 s;u;nwlk}}
/al jn2fy {wlk;/3 n;w;/delay {0.5}{qf2fy}}
/nop qf2master yin
/al qf2yin {e;/3 s;/delay {0.5}{su;sd;s;s;s};}
/al yin2qf {/3 n;nu;/delay {0.5}{nd;/3 n;w}}
/al fy2yin {fy2qf;de3 {qf2yin}}

/nop ĞË¹úËÂ
/al qf2xg {wlk;e;eu;eu;nu;nwlk}
/al xg2qf {wlk;s;s;sd;wd;wd;w;nwlk}
/al fy2xg {fy2qf;de3 {qf2xg}}
/al xg2fy {xg2qf;de1 {qf2fy}}

/nop ÇåÆ½É½×¯
/nop qf2qp {pl {wlk;e;s;s;s;e;ne;ne;ne;e;nwlk};pr}
/nop qp2qf {pl {wlk;w;sw;sw;sw;w;n;n;n;w;nwlk};pr}
/al qf2qp {wlk;do e,s,s,s,e,ne,ne,ne,e;nwlk}
/al qp2qf {wlk;do w,sw,sw,sw,w,n,n,n,w;nwlk}

/al fy2qp {fy2qf;de1 {qf2qp}}
/al qp2fy {qp2qf;de1 {qf2fy}}
/nop hm ºóÃÅ
/al qp2hm {wlk;do e,e,e,e,e,e,e,eu,ed;nwlk}
/al hm2qp {wlk;do wu,wd,w,w,w,w,w,w,w;nwlk}
/al hm2ss {wlk;do push door,e,e,e,push stone,nu;nwlk}
/al ss2hm {wlk;do sd,push stone,w,w,w;nwlk}
/al fy2ss {fy2qp;de3 qp2hm;de4 hm2ss}
/al ss2ffy {ss2hm;de1 hm2qp;de2 qp2fy}

/nop á·Ãí·»
/nop al qp2dm {pl {wlk;w;n;ne;ne;n;n;nwlk};pr}
/al qp2dm {wlk;do w,n,ne,ne,n,n;nwlk}
/al dm2qp {wlk;do s,s,sw,sw,s,e;nwlk}
/al dm2ts {wlk;do n,e,e,n,n,n,n,w,w,n,nu;nwlk}
/al ts2dm {wlk;do sd,s,e,e,s,s,s,s,w,w,s;nwlk}
/al qp2ts {qp2dm;de1 {dm2ts}}
/al ts2qp {ts2dm;de1 {dm2qp}}
/nop al dm2qp {wlk;s;e;e;/4 s;de1 {w;w;/3 s;sw;sw;s;e;nwlk}}
/al fy2dm {fy2qp;de3 {qp2dm}}
/nop al fy2dm {fy2qf;de3 {wlk;e;/3 s;e;ne};de4 {/2 ne;n;/2 ne;/2 n;nwlk}}
/al dm2fy {wlk;dm2qp;de1 {qp2fy}}
/nop Ì©É½
/nop al dm2ts {wlk;/5 n;/delay {0.5}{/4 n;nu;nwlk}}
/nop al ts2dm {wlk;sd;/4 s;/delay {0.5}{/5 s}}
/nop al dm2ts {wlk;nw;w;/4 n;/2 e;n;nu;nwlk}
/nop al ts2dm {wlk;sd;s;/2 w;/4 s;e;se;nwlk}
/al fy2ts {fy2dm;de4 {dm2ts}}
/nop yun zhen
/al ts2yunzheng {do ed,eu,climb down}
/al yunzheng2ts {climb up;de4 {wd;wu}}
/al fy2yunzheng {fy2ts;de7 {ts2yunzheng}}
/al yunzheng2fy {yunzheng2ts;de5 {ts2fy}}
/al ts2fy {ts2dm;de1 {dm2fy}}
/al ts2xsq {wlk;/6 u;nu;de1 {/2 eu;e;s;se;/3 e;nwlk}}
/al xsq2ts {wlk;/3 w;nw;n;n;w;/2 wd;de1 {sd;/6 d;nwlk}}
/al xsqin {hold vine;/3 s;climb cliff;de2 {climb up}}
/al tsin {tsin+;l}
/al tsin+ {
    wlk;
    /ac {^ºìÃÅ¹¬}{/6 u;nu;eu;/2 u};
    /ac {^Ê®°ËÅÌ}{/delay {0.1}{u}};
    /ac {^ÄÏÌìÃÅ}{tsin-};
}
/al tsin- {
    nwlk;
    /unac {^ºìÃÅ¹¬};
    /unac {^Ê®°ËÅÌ};
    /unac {^ÄÏÌìÃÅ};
}
/al tsout {do d,d,d,d,d,d,d,d,d,d,d,d,d;wd;sd;/6 d}
/nop ÀÏÎİ
/al fy2lw {fyn2lw+;fyn}
/al fyn2lw+ {
    wlk;
    /ac {^·çÔÆ³Ç±±}{n};
    /ac {^ÄÏ±±´óµÀ}{n};
    /ac {^À­¹şËÕ}{n;n;nw;e};
    /ac {^ÄÖÊĞ}{fyn2lw-}
}
/al fyn2lw- {
    nwlk;
    /unac {^·çÔÆ³Ç±±};
    /unac {^ÄÏ±±´óµÀ};
    /unac {^À­¹şËÕ};
    /unac {^ÄÖÊĞ}
}
/al lw2fy {pl {wlk;w;se;s;s;s;s;s;s;s;fyn-};pr}

/nop ÈıÇå
/al qf2sq {qf2sq+;/3 w;/2 wu;/delay {0.5}{/4 nu;climb up};de3 {climb up};de5 {/5 n;knock door}}
/al qf2sq+ {
    wlk;
    /ac {^Ö¨µÄÒ»Éù£¬ÃÅÏòÀï¿ªÁË}{de2 {n}};
    /ac {^ÈıÇå¹¬´óÔº}{/delay {0.5}{qf2sq-}};
    /ac {^ÉÏÇåµî}{s};
    /ac {^ÃÅÊÇ¿ª×ÅµÄ£¬ÇÃÊ²Ã´}{n}
}
/al qf2sq- {
    nwlk;
    /unac {^Ö¨µÄÒ»Éù£¬ÃÅÏòÀï¿ªÁË};
    /unac {^ÉÏÇåµî};
    /unac {^ÈıÇå¹¬´óÔº};
    /unac {^ÃÅÊÇ¿ª×ÅµÄ£¬ÇÃÊ²Ã´}
}
/al sq2qf {wlk;pull door;/6 s;/delay {0.5}{climb down};de2 {climb down};de4 {/4 sd;ed;ed;e;e;nwlk}}
/al sq2fy {sq2qf;de6 {qf2fy}}
/al fy2sq {fy2qf;de3 {qf2sq}}

/nop ±ß³Çµ½¶şÀÉÉ½
/al bc2els {wlk;se;/4 e;se;e;nwlk}
/al els2bc {wlk;w;nw;/4 w;nw;nwlk}
/nop Ã·»¨âÖ
/al els2mha {wlk;do s,e,nu,nu,su,nu,wu,nu,wu;nwlk}
/al mha2els {wlk;do ed,sd,ed,sd,nd,sd,sd,w,n;nwlk}
/nop al fy2els {fy2bc;/delay {16}{bc2els}}
/nop al els2fy {els2bc;de1 {bc2fy}}
/al tp2els {wlk;ne;w;w;nw;w;n;nwlk}
/al tp2byz {wlk;ne;/2 w;nw;/2 nu;wu;/delay {0.5}{/2 wd;/2 w;n;nwlk}}
/al byz2tp {wlk;s;/2 e;/2 eu;/delay {0.5}{ed;/2 sd;se;/2 e;sw;nwlk}}
/al els2tp {wlk;s;e;se;e;e;sw;nwlk}
/al fy2els {fy2tp;de10 {tp2els}}
/al els2fy {els2tp;de1 {tp2fy}}
/nop ±ß³Çµ½°×ÔÆ×¯
/al bc2byz {pl {wlk;se;e;e;e;e;se;e; e;nu;nu;wu;wd;wd;w;w;n;keychain;nwlk};pr}
/al byz2bc {pl {wlk;s;e; e;eu; eu;ed;sd;sd;w; w;nw;w;w;w;w;nw;nwlk};pr}
/al fy2byz {fy2tp;de10 {tp2byz}}
/al byz2fy {byz2tp;de2 {tp2fy}}
/nop ºÃºº×¯
/al bc2hhz {w;/4 s;se;wade;de8 {su;/2 sw;/2 w}}
/al hhz2bc {/2 e;/2 ne;nd;wade;de8 {nw;/4 n;e}}
/nop ¹ØÍâµ½¶şÀÉÉ½
/al els2gw {els2tp;de1 {tp2gw}}
/al gw2els {gw2tp;de4 {tp2els}}

/nop ¹ØÍâµ½°×ÔÆ×¯
/al byz2gw {byz2bc;de3 {bc2gw}}
/al gw2byz {gw2bc;de6 {bc2byz}}

/nop ·çÔÆ¶«
/nop Îäµ±Õò
/al fy2wdz {fy2wdz+;fye;de1 {do e,s,s,s;nwlk}}
/al fy2wdz+ {
    /ac {^ÄàÍÁÂ·}{fy2wdz-};
    /ac {^ÆæÊ¯ÊèÓ°}{n}
}
/al fy2wdz- {
    /unac {^ÄàÍÁÂ·};
    /unac {^ÆæÊ¯ÊèÓ°}
}
/al wdz2fy {wlk;/3 n;w;de1 {fye-}}
/al fy2farmer {fy2wdz;de2 {/4 s;e;ask old farmer about ÄÑÌâ;nwlk}}
/nop Îäµ±
/nop al fy2wd {fye;de1 {unwi all;/7 s};de2 {/2 s;/5 su;enter;nwlk}}
/al fy2wd {fy2wdz;de2 {unwi all;/5 s};de3 {/5 su;enter;nwlk}}
/al wd2fy {wlk;out;/5 nd;de1 {/5 n};de2 {wdz2fy}}
/nop old shandong
/al fy2shandong {fy2wdz;de2 {do s,s,s,se,e;nwlk}}
/al shandong2fy {nwlk;w;nw;n;n;n;wdz2fy}
/al buyshaoji {fy2shandong;de3 {buy meat from shandong;shandong2fy}}
/nop ºÚËÉÉ½
/al fy2hss {wlk;fye;de1 {e;ne;/3 n;nwlk}}
/al hss2fy {wlk;/3 s;sw;w;de1 {fye-}}
/al hsb2fy {hsb2fy+;/delay {0.5}{l}}
/al hsb2fy+ {
    wlk;
    /ac {^Î÷»¨Ô°}{climb wall;};
    /ac {^ÄãËÉ¿ªÂûÌÙ}{de2 {look}};
    /ac {^ºÚËÉ³Ç±¤µÄ¶«²à}{w};
    /ac {^ºÚËÉ³Ç±¤µÄÎ÷²à}{e};
    /ac {^ºÚËÉ´¾ÓÚ} {down;w;w;d;w;d;s;};
    /ac {^É½½ÅÏçÌï}{hss2fy;hsb2fy-}
}
/al hsb2fy- {
    nwlk;
    /unac {^Î÷»¨Ô°};
    /unac {^ÄãËÉ¿ªÂûÌÙ};
    /unac {^ºÚËÉ³Ç±¤µÄÎ÷²à};
    /unac {^ºÚËÉ³Ç±¤µÄ¶«²à};
    /unac {^ºÚËÉ´¾ÓÚ};
    /unac {^É½½ÅÏçÌï}
}
/al fy2hsb {fy2hss;fy2hsb+;de2 {talk;/ticker {go}{north}{3}}}
/al fy2hsb+ {
    /ac {^É½½ÅÏçÌï}{talk;/ticker {hsb}{talk}{4}};
    /ac {^ Í»È»¼ä£¡ ´Ó±±Ãæ}{/unticker {hsb};n};
    /ac {^ºÚËÉÉ½½Å}{/unticker {go};n;u;e;u;e;e;u;w;climb wall;fy2hsb-};
    /ac {^ºÚËÉ³Ç±¤µÄÎ÷²à}{fy2hsb-}
}
/al fy2hsb- {
    nwlk;
    /unticker {go};
    /unticker {hsb};
    /unac {^É½½ÅÏçÌï};
    /unac {^ Í»È»¼ä£¡ ´Ó±±Ãæ};
    /unac {^ºÚËÉÉ½½Å};
    /unac {^ºÚËÉ³Ç±¤µÄÎ÷²à}
}

/nop ÄÎºÎÇÅ
/nop al fy2nhq {wlk;d;/5 e;de1 {/7 e;n;fy2nhq+};de2 {/2 e;/3 eu;ne;e;e;}}
/al fy2nhq {fy2nhq+;fye;de1 {fye2nhq}}
/nop al fye2nhq {wlk;e;e;n;e;/delay {0.5}{/3 eu;ne;e};de1 {e;/4 s;nwlk}}
/al fye2nhq {wlk;do e,e,n,e,eu,eu,eu,ne,e;}
/nop al nhq2fye {wlk;/4 n;w;de1 {w;sw;/3 wd;w;w;nwlk}}
/al nhq2fy+ {
    fy2nhq-;
    wlk;
    /ac {^ÄÎºÎÇÅ}{/delay {0.2}{/4 n}};
    /ac {^²íÂ·¿Ú}{/delay {0.2}{w}};
    /ac {^¶ÀÄ¾Î£ÇÅ}{w};
    /ac {^Äã½ÅÏÂÒ»»¬£¬ÔÚ¶ÀÄ¾ÇÅ}{de2 {west}};
    /ac {^É½¹È¿Ú}{sw};
    /ac {^ÔÆº£¹ÂÖÛ}{nhq2fy-;do wd,wd,wd,w,w;fye-;}
}
/al nhq2fy- {
    nwlk;
    /unac {^ÄÎºÎÇÅ};
    /unac {^²íÂ·¿Ú};
    /unac {^¶ÀÄ¾Î£ÇÅ};
    /unac {^Äã½ÅÏÂÒ»»¬£¬ÔÚ¶ÀÄ¾ÇÅ};
    /unac {^É½¹È¿Ú};
    /unac {^ÔÆº£¹ÂÖÛ}
}
/al nhq2fy {nhq2fy+;l}
/nop al nhq2fy {nhq2fye;de2 {fye-}}
/al fy2nhq+ {
    nhq2fy-
    wlk;
    /ac {^¶ÀÄ¾Î£ÇÅ}{
        east
    };
    /ac {^Äã½ÅÏÂÒ»»¬£¬ÔÚ¶ÀÄ¾ÇÅ}{de2 {east}};
    /ac {^²íÂ·¿Ú}{/delay {0.5}{/4 s};fy2nhq-}
}
/al fy2nhq- {
    nwlk;
    /unac {^¶ÀÄ¾Î£ÇÅ};
    /unac {^Äã½ÅÏÂÒ»»¬£¬ÔÚ¶ÀÄ¾ÇÅ};
    /unac {^²íÂ·¿Ú}
}
/nop ÄÎºÎÇÅµ½µÛÍõ¹È
/al toucheren {touch ¶ñÈËÏñ}
/al nhq2dw {nhq2dw+;l}
/al nhq2dw+ {
    wlk;
    /ac {^ÄÎºÎÇÅ} {fy2nhq-;/ticker {eren}{toucheren}{1};
        do s,east,east,east,east,east,east,down;
        };
    /ac {^£¢Ñ½£¢µØÒ»Éù}{/3 east;open door;/3 east;};
    /ac {^Ê¯±ÚÉÏµÄÃÅ»§ÓÖÎŞÉùÎŞÏ¢µÄºÏÁËÆğÀ´}{toucheren};
    /ac {^¹ÈµØ}{/delay {0.5}{/3 s;/3 w;nhq2dw-}};
    /ac {^É½¸ó}{nhq2dw-}
}
/al nhq2dw- {
    nwlk;
    /unticker {eren};
    /unac {^ÄÎºÎÇÅ};
    /unac {^£¢Ñ½£¢µØÒ»Éù};
    /unac {^Ê¯±ÚÉÏµÄÃÅ»§ÓÖÎŞÉùÎŞÏ¢µÄºÏÁËÆğÀ´};
    /unac {^¹ÈµØ};
    /unac {^É½¸ó}
}

/nop al dw2nhq {wlk;/3 e;/3 n;de1 {/3 west;open door;/3 west;u};de2 {/6 west;n;nwlk}}
/al dw2nhq+ {
    wlk;
    /ac {^É½¸ó}{/3 e;/3 n};
    /ac {^¹ÈµØ}{/delay {0.5}{/3 w;open door;/3 w}};
    /ac {^¿Óµ×}{u};
    /ac {^¿ÓµÀ±ß}{/delay {0.5}{/6 w}};
    /ac {^¹íÓò}{/delay {0.2}{n;dw2nhq-}}
}
/al dw2nhq- {
    nwlk;
    /unac {^É½¸ó};
    /unac {^¹ÈµØ};
    /unac {^¿Óµ×};
    /unac {^¿ÓµÀ±ß};
    /unac {^¹íÓò}
}
/al dw2nhq {dw2nhq+;l}
/al dw2fy {dw2nhq;nhq2fy+}
/nop al fy2dw {fy2nhq;de3 {nhq2dw}}
/al fy2dw {fy2nhq;nhq2dw+}

/nop ·çÔÆÄÏn

/nop °×ÔÆ
/al nh2by {wlk;nh2by+;s;s;e;give 5 silver to zhanggui}
/al fy2by {cx2fy-;by2fy-;fy2nh;de10 {nh2by+;do s,s,e,get 5 silver from bag,give 5 silver to zhanggui}}
/al by2fy {by2fy+;by2nh;}
/al by2fy+ {
    wlk;
    /ac {^Æ½Ô­Â·}{nh2fy};
    /ac {^·çÔÆÄÏ³ÇÃÅ}{by2fy-;nh2fy-}
}
/al by2fy- {
    nwlk;
    /unac {^Æ½Ô­Â·};
    /unac {^·çÔÆÄÏ³ÇÃÅ}
}
/al byin {s;s;se;su;se;su;sw;su;enter}
/al byout {unwi all;out;nd;ne;nd;nw;nd;nw;n;n}
/al byin2 {/4 s;twist left}


/al nh2by+ {
    /ac {ÀÏÕÆ¹ñËµµÀ£º¶àĞ»ÕâÎ»}{do w,s,e,e,give qiyue to fox,d;/ticker {sail}{sail south}{4};sail south};
    /ac {°×ÔÆ¶É} {nh2by-;s}
}
/al nh2by- {
    nwlk;
    /unticker {sail};
    /unac {ÀÏÕÆ¹ñËµµÀ£º¶àĞ»ÕâÎ»};
    /unac {°×ÔÆ¶É}
}

/al by2nh {by2nh+;n;yell}
/al by2nh+ {
    wlk;
    /ac {´¬¼ÒÀÏ²®ÌøÉÏº£°¶}{d;sail north;/ticker {sail}{sail north}{4}};
    /ac {ÄãÆ´ÃüÓÃÁ¦»®ÁË¼¸ÏÂ}{by2nh-;de2 {/2 w;/3 n}}
}
/al by2nh- {
    nwlk;
    /unticker {sail};
    /unac {´¬¼ÒÀÏ²®ÌøÉÏº£°¶};
    /unac {ÄãÆ´ÃüÓÃÁ¦»®ÁË¼¸ÏÂ}
}
/nop Ã§ÁÖ
/al ml2tree+ {
    /var swing_num 0;
    /ac {~[33m¹ÅÊ÷[2;37;0m}{climb tree};
    /ac {^ÄãË³×ÅÊ÷¸ËÅÀÁËÉÏÀ´}{/delay {0.1}{look}};
    /ac {^Ìı×Å¶ú±ßµÄºôºô}{
        /math swing_num {$swing_num+1}
    }
}
/al ml2tree- {
    /var swing_num 0;
    /unac {~[33m¹ÅÊ÷[2;37;0m};
    /unac {^ÄãË³×ÅÊ÷¸ËÅÀÁËÉÏÀ´};
    /unac {^Ìı×Å¶ú±ßµÄºôºô}
}

/nop  fy2ml {fys;de1 {do s,s,s,s,s,s,climb tree;nwlk;}}
/al fy2ml {wlk;d;do s,s,s,s,s,s,s,s,s,s,s,s,s,s,climb tree;nwlk;}
/al ml2fy {ml2fy+;l}
/al ml2fy+ {
    wlk;
    ml2tree+;
    /ac {^¹ÅÊ÷¶¥}{/delay {0.5}{swing north}};
    /ac {^Ã§ÁÖ±ßÔµ}{ml2fy-;do n,n,n,n;/delay {0.5}{fys-}}
}
/al ml2fy- {
    nwlk;
    ml2tree-;
    /unac {^¹ÅÊ÷¶¥};
    /unac {^Ã§ÁÖ±ßÔµ}
}
/al ml2cx {ml2cx+;l}
/al ml2cx+ {
    wlk;
    ml2tree+;
    /ac {^¹ÅÊ÷¶¥}{/delay {0.5}{swing west}};
    /ac {^Ã§ÁÖ±ßÔµ}{ml2cx-;do w,w,w,w;}
}
/al ml2cx- {
    nwlk;
    ml2tree-;
    /unac {^¹ÅÊ÷¶¥};
    /unac {^Ã§ÁÖ±ßÔµ}
}

/al ml2wm {ml2wm+;l}
/al ml2wm+ {
    wlk;
    ml2tree+;
    /ac {^¹ÅÊ÷¶¥}{swing east};
    /ac {^Ã§ÁÖ±ßÔµ}{/4 e;ml2wm-};
    /ac {^·çÁåÃ·Ö¦ÃÅ}{ml2wm-}
}
/al ml2wm- {
    nwlk;
    ml2tree-;
    /unac {^¹ÅÊ÷¶¥};
    /unac {^Ã§ÁÖ±ßÔµ};
    /unac {^·çÁåÃ·Ö¦ÃÅ}
}


/nop al fy2zt {fy2zt+;d;/3 n;w;de1 {w;n;w;w;open door;w;jump}}
/al fy2zt {wlk;fy2zt+;pl {d;s;s;s;w;w;sw;w;buy_white_towel};pr;wlk}

/nop al zt2fy {open door;/2 e;s;e;e;de1 {wear baojia;wear all;remove shouhuan;/3 s;u}}
/al zt2fy {pl {wlk;open door;s;s;s;s;dd white towel;wear all;e;ne;e;e;n;n;n;u;fy2zt-};pr}
/al buy_white_towel {buy white towel from little yahuan;remove all;wear white towel}
/al fy2zt- {
    nwlk;
    /unac {^³ş³şÏòÄãĞ¦µÀ£ºÃ»ÓĞ°×Ã«½íÔõÃ´Ï´};
    /unac {^ÄãµÄÇ®²»¹»};
    /unac {^ÄãÏòĞ¡Ñ¾»·ÂòÏÂÒ»Ìõ°×Ã«½í};
    /unac {Äã¸Ğµ½È«ÉíÎŞ±ÈµÄÊæÌ©};
    /unac {^Äã´Ó·ãÒ¶ÈªÀïÒ»Ô¾¶øÆğ}
}

/al fy2zt+ {
    wlk;
    /ac {^³ş³şÏòÄãĞ¦µÀ£ºÃ»ÓĞ°×Ã«½íÔõÃ´Ï´}{/3 s;buy_white_towel};
    /ac {^ÄãµÄÇ®²»¹»}{fy2zt-};
    /ac {^ÄãÏòĞ¡Ñ¾»·ÂòÏÂÒ»Ìõ°×Ã«½í}{remove all;wear white towel;/3 n;open door;n;jump};
    /ac {Äã¸Ğµ½È«ÉíÎŞ±ÈµÄÊæÌ©} {wlk;jump};
    /ac {^Äã´Ó·ãÒ¶ÈªÀïÒ»Ô¾¶øÆğ} {/2 dd leaf;zt2fy;fy2zt-;nwlk}
}

/al fy2ztv {wlk;fy2ztv+;d;/3 s;w;w;sw;de1 {s;s;w;buy white towel from kid}}
/nop al fy2ztv {fy2ztv+;d;/3 n;e;de1 {e;n;east;east;open door;east;wash}}
/nop al zt2fyv {open door;/2 w;s;w;w;de1 {wear baojia;wear all;remove shouhuan;/3 s;u}}
/al ztv2fy {wlk;open door;/4 n;de1 {wear baojia;wear all;e;n;n;ne;e;e;/3 n;u;fy2ztv-}}
/al fy2ztv- {
    nwlk;
    /unac {^½ğÍ¯ÏòÄãĞ¦µÀ£ºÃ»ÓĞ°×Ã«½íÔõÃ´Ï´};
    /unac {^ÄãµÄÇ®²»¹»};
    /unac {^ÄãÏòĞ¡Í¯ÂòÏÂÒ»Ìõ°×Ã«½í};
    /unac {Äã¸Ğµ½È«ÉíÎŞ±ÈµÄÊæÌ©};
    /unac {^ÄãÀÁÀÁµØ´Ó·ãÒ¶ÈªÀïÕ¾ÆğÉí}
}
/al fy2ztv+  {
    wlk;
    /ac {^½ğÍ¯ÏòÄãĞ¦µÀ£ºÃ»ÓĞ°×Ã«½íÔõÃ´Ï´}{/3 n;buy white towel from kid};
    /ac {^ÄãµÄÇ®²»¹»}{fy2ztv-};
    /ac {^ÄãÏòĞ¡Í¯ÂòÏÂÒ»Ìõ°×Ã«½í}{remove all;wear white towel;/3 s;open door;s;wash};
    /ac {Äã¸Ğµ½È«ÉíÎŞ±ÈµÄÊæÌ©} {wlk;wash};
    /ac {^ÄãÀÁÀÁµØ´Ó·ãÒ¶ÈªÀïÕ¾ÆğÉíÀ´} {dd leaf;ztv2fy;fy2ztv-;nwlk}
}

/nop ³ÁÏãÕò
/nop fy2cx {cx2fy-;fy2ml;fy2cx+}
/al fy2cx {fy2ml;/delay {5}{swing west;swing west};/delay {5.5}{do w,w,w,w;nwlk}}
/al fy2cx+ {
    wlk;
    /ac {^Äã×¥×ÅÍ»³öµÄÊ÷}{ml2cx+;};
    /ac {^Õò¶«Ê×}{fy2cx-}
}
/al fy2cx- {
    nwlk;
    ml2cx-;
    /unac {^Äã×¥×ÅÍ»³öµÄÊ÷};
    /unac {^Õò¶«Ê×}
}
/nop ³ÁÏãto·çÔÆ
/nop cx2fy {fy2cx-;cx2fy+;l;}
/al cx2fy {cx2sf;de1 {sf2sk};de2 {sk2fy}}
/al cx2fy+ {
    wlk;
    /ac {^ÀÏ³Ç¹ã³¡}{/delay {0.2}{/6 e;climb tree}};
    /ac {^Äã×¥×ÅÍ»³öµÄÊ÷}{ml2fy+};
    /ac {^·çÔÆÌìÏÂ}{cx2fy-}
}
/al cx2fy- {
    nwlk;
    ml2fy-;
    /unac {^ÀÏ³Ç¹ã³¡};
    /unac {^Äã×¥×ÅÍ»³öµÄÊ÷};
    /unac {^·çÔÆÌìÏÂ}
}
/nop ÍòÃ·
/nop al fy2wm {wlk;d;/7 s;de1 {/7 s;fy2wm+;climb tree}}
/al fy2wm {fy2ml;de3 {ml2wm};de10 {ml2wm-}}
/al wm2fy {wlk;/6 w;climb tree;de3 {ml2fy}}
/al wm2hhd {/6 e;swim}

/nop ÄÏº£
/al fy2nh {cx2fy-;wlk;d;/7 s;de1 {/7 s;fy2nh+;climb tree}}
/al fy2nh+ {
    /ac {^ÄãË³×ÅÊ÷¸ËÅÀÁËÉÏÀ´} {/ac {^Ã§ÁÖ±ßÔµ}{su;s;fy2nh-};swing south;de2 {swing south}};
}
/al fy2nh- {
    nwlk;
    /unac {^ÄãË³×ÅÊ÷¸ËÅÀÁËÉÏÀ´};
    /unac {^Ã§ÁÖ±ßÔµ}
}


/nop al nh2fy {nh2ml;/delay {0.5}{ml2fy}}
/al nh2fy {nh2ml;/delay {0.5}{ml2fy}}
/al nh2ml {wlk;do n,nd,n,n;nwlk}
/al nh2fy+ {
    /unac {Ã§ÁÖ±ßÔµ};
    /ac {^ÄãË³×ÅÊ÷¸ËÅÀÁËÉÏÀ´} {
    /ac {Ã§ÁÖ±ßÔµ}{do n,n,n,n;de1 {fys-;nh2fy-;by2fy-}};
    swing north;de3 {swing north}
    };
    /ac {^·çÔÆÌìÏÂ} {nh2fy-}
}
/al nh2fy- {
    nwlk;
    /unac {^ÄãË³×ÅÊ÷¸ËÅÀÁËÉÏÀ´};
    /unac {Ã§ÁÖ±ßÔµ};
    /unac {^·çÔÆÌìÏÂ}
}

/nop ¹×²Äµê
/al dxcin {push coffin}
/al dxcout {climb bag}
/al fy2dxc+ {
    wlk;
    /ac {^°²Éúµê»ï¼ÆËÆ²»¾­ÒâµØÀ¹}{ki huo ji};
    /ac {^°²Éúµê»ï¼ÆËÀÁË}{dxcin;fy2dxc-}
}
/al fy2dxc- {
    nwlk;
    /unac {^°²Éúµê»ï¼ÆËÆ²»¾­ÒâµØÀ¹};
    /unac {^°²Éúµê»ï¼ÆËÀÁË}
}
/al fy2dxc {fy2dxc+;pl {d;e;e;e;e;e;e;n;n;n;n;e;dxcin;nwlk};pr}
/al fy2dxc2 {wlk;fyn;de1 {l grass;stamp grass;nwlk}}
/al dxcout2 {l ring;pull ring}
/al dxc2fy {wlk;dxcout;de1 {w;/4 s;/6 w;u;nwlk}}
/al dxc2fy2 {wlk;dxcout2;de1 {sw;sw;s;fyw-}}
/al fy2dxc2 {wlk;fyn;/delay {1.5}{w;l grass;stamp grass};nwlk;}
/nop Ç§½ğÂ¥
/al qjl2fy {wlk;e;ne;se;ne;/3 e;n;ne;/2 e;/3 n;u;nwlk}
/al qj2fy {wlk;do s,s,s,e,ne,se,ne,e,e,e,n,ne,e,e;n;n;n;u;nwlk}
/al fy2qj {wlk;fy2wm;de7 {e;keychain;wm2hhd}}
/nop ³ÁÏãµ½»ªÉ½
/al cx2hs {wlk;do n,nw,ne,nw,nw,ne,nd,nw,w,w,s,s,s,su;wu;wu;nwlk}
/al hs2cx {wlk;do ed,ed,nd,n,n,n,e,e,se,su,sw,se,se,sw;se;s;nwlk}

/nop ·çÔÆµ½»ªÉ½
/al fy2hs {fy2cx;de7 cx2hs}
/nop al hs2fy {hs2cx;de2 {cx2fy}}
/al hs2fy {hs2cx;cx2fy+}
/al hs2hua {pl {wlk;wu;wu;wu;se;sw;se;sw;e;su;su;eu;su;slide rock;nwlk};pr}
/al maonv2hua {nd;sw;se;sw;e;su;su;eu;su;apprentice hua zhenzhen;slide rock}
/al hua2hs {pl {wlk;nd;slide rock;nd;wd;nd;nd;w;ne;nw;ne;nw;ed;ed;ed;nwlk};pr}
/al hsout {wlk;do s,ed,ne,nu,nw,wd,wu,wd,nd,nd,w,ne,nw,ne;nw;ed;nwlk}
/al hsin  {wlk;do wu,se,sw,se,sw,e,su,su,eu,ed,eu,se,sd,sw,wu;n;nwlk}
/nop áÔÉ½
/al fy2sl {fyw;de1 {pl {wlk;w;nw;ne;nw;nu;nu;nu;nwlk};pr}}
/al sl2fy {wlk;do d,sd,sd,sd,se,sw,se,e;de1 {fyw-}}
/nop sl ·½ÕÉÄÏÔº
/al sl2fz {wlk;do eu,nw,n,n,n,nu,nd,nu,nd;nwlk}
/al fz2sl {wlk;do su,sd,su,sd,s,s,s,se,wd;nwlk}
/al sl2nm {sl2fz;do nu,nu,nu,nd}
/al nm2sl {wlk;do su,sd,sd,sd;fz2sl}
/al fz2xie {wlk;do nu,nu,nu,nd,n,n,n,nu,n,n,n,ne,nw,w,w;nwlk}
/al xie2fz {wlk;do e,e,se,sw,s,s,s,sd,s,s,s,su,sd,sd,sd;nwlk}
/al sl2xie {sl2fz;de1 fz2xie}
/al xie2sl {xie2fz;de1 fz2sl}
/al fy2xie {fy2sl;de2 sl2xie}
/al xie2fy {xie2sl;de2 sl2fy}
/al slout {wlk;/5 {do s,su,sd,d;};nwlk}
/al jianfangzhang {pl {wlk;ask master about ¼û·½ÕÉ;answer ÖØÒªÊÂ;nd;nu;nd;nu;sd;nwlk};pr}
/al fy2yetu {fyw;de1 {pl {wlk;w;nw;ne;e;ne;e;sw;s;nwlk};pr}}
/al yetu2fy {pl {wlk;nu;n;ne;w;sw;w;sw;se;e;fyw-};pr}
/nop slhm ÉÙÁÖºóÃÅ
/al fy2slhm {fyw;de1 {w;nw;ne;e;ne;e;sw;e;nwlk}}
/al slhm2fy {wlk;w;ne;w;sw;w;sw;se;e;de1 {fyw-}}
/nop ·çÔÆÎ÷
/nop ¸»¹óÉ½×¯
/al fyw2fg {wlk;do w,w,w,n,n,n,n,n,ne,n,e,n,n;nwlk}
/al fy2fg {fyw;de1 {fyw2fg}}
/al fg2fyw {wlk;do s,s,s,w,s,sw,s,s,s,s,s,e,e,e;nwlk}
/al fg2fy {fg2fyw;de1 {fyw-}}
/al fg2guo {pl {wlk;n;n;n;n;w;nw;nw;sw;nw;sw;nw};pr}
/al guo2fg {pl {wlk;se;ne;se;ne;se;se;e;s;s;s;s};pr}
/al fy2guo {fy2fg;de2 {fg2guo}}
/al guo2fy {guo2fg;de1 {fg2fy}}
/al fgin {wlk;do n,n,n,n,jie gaoshi,drop yaopai,nu,wu,nu,nu,wu,nu,ne,nu,nu;enter;nwlk}
/al fgout {wlk;do out,sd,sd,sw,sd,ed,sd,sd,ed,sd,s,s,s,s;nwlk}
/al fy2fg1 {fy2fg;de3 {fgin}}
/al fg12fy {fgout;de2 {fg2fy}}

/nop ºìÄï×Ó
/al fg2hong {fg2hong+;/al fg2hong_do {w;look};do n,n,n,n,nu,wu,nu,nu,wu,nu,w;look;}
/al fg2hong+ {
    wlk;
    /ac {²»³öÃû×ÖµÄ»ÆÉ«Ò°»¨}{w;look};
    /ac {²»³öÃû×ÖµÄÂÌÉ«Ò°»¨}{w;look};
    /ac {²»³öÃû×ÖµÄºìÉ«Ò°»¨}{w;look};
    /ac {²»³öÃû×ÖµÄÀ¶É«Ò°»¨}{w;look};
    /ac {²»³öÃû×ÖµÄ°×É«Ò°»¨}{/al fg2hong_do {do e,s,w,s,w};/ticker {migong}{fg2hong_do}{2}};
    /ac {^  µ¾²İÈË(Daocao ren)}{/al fg2hong_do {l};pushaside grass;w;northwest;southwest;keychain;east;tear paper;de2 {/ticker {migong}{;};}}{4};
    /nop ac {^  µ¾²İÈË(Daocao ren)}{/al fg2hong_do {l};pushaside grass;w;northwest;southwest;keychain;east;tear paper;de2 {/unticker {migong}}}{4};
    /ac {µ¾²İÈËÒ¡Ò¡°Ú°Ú×Åµ¹ÁËÏÂÈ¥£¬Â¶³öÒ»ÌõĞ¡Â·}{/ticker {migong}{;};fg2hong-;de8 {east;hp}};
    /ac {Ö½ÌõÒÑ¾­±»ÈËËº×ßÁË¡£}{/ticker {tear}{tear paper}{5};};
    /ac {ÓĞÈËÒÑ¾­ÔÚËºÖ½ÌõÁË¡£}{/ticker {tear}{tear paper}{5};};
    /ac {^»Ä·Ø}{fg2hong-};
    /ac {^Äã²»¿ÉÒÔ²¦¿ªgrass}{l daocao ren};
    /ac {^ÁËÒ»¸öÖ½Ìõ×Ó(paper)}{/ticker {migong}{;};tear paper}
}
/al fg2hong- {
    nwlk;
    drop paper;
    set brief3 1;
    /unticker {tear};
    /unticker {migong};
    /al fg2hong_do {;};
    /unac {²»³öÃû×ÖµÄ»ÆÉ«Ò°»¨};
    /unac {²»³öÃû×ÖµÄÂÌÉ«Ò°»¨};
    /unac {²»³öÃû×ÖµÄºìÉ«Ò°»¨};
    /unac {²»³öÃû×ÖµÄÀ¶É«Ò°»¨};
    /unac {²»³öÃû×ÖµÄ°×É«Ò°»¨};
    /unac {^  µ¾²İÈË(Daocao ren)};
    /unac {µ¾²İÈËÒ¡Ò¡°Ú°Ú×Åµ¹ÁËÏÂÈ¥£¬Â¶³öÒ»ÌõĞ¡Â·};
    /unac {Ö½ÌõÒÑ¾­±»ÈËËº×ßÁË¡£};
    /unac {ÓĞÈËÒÑ¾­ÔÚËºÖ½ÌõÁË¡£};
    /unac {^Äã²»¿ÉÒÔ²¦¿ªgrass};
    /unac {^ÁËÒ»¸öÖ½Ìõ×Ó(paper)};
    /unac {^»Ä·Ø}
}


/al hong2fg {wlk;fg2hong-;do e,e,e,e,leave,sd,ed,sd,sd,ed,sd,s,s,s,s;nwlk}
/al hong2fy {hong2fg;de2 {fg2fy}}

/nop »ÆÉ½Ó­¿ÍËÉ
/nop al cx2yks {pl {wlk;s;w;wu;wu;wd;wu;n;wu;nw;ne;nu;wd;s;se;nwlk};pr}
/al cx2yks {wlk;do s,w,wu,wu,wd,wu,n,wu,nw,ne,nu,wd,s,se;nwlk}
/al yks2cx {wlk;do nw,n,eu,sd,sw,se,ed,s,ed,eu,ed,ed,e,n;nwlk}
/al fy2yks {fy2cx;de7 {cx2yks}}
/al yks2fy {yks2cx;cx2fy+}
/nop monk Ï´ÉÙÁÖ·Ë 10 silver/´Î
/al yks2monk {do sw,w;wd;sw}
/al monk2yks {do ne,eu,e,ne}
/al cx2monk {cx2yks;de1 {yks2monk}}
/al monk2cx {monk2yks;de1 {yks2cx}}
/al fy2monk {fy2yks;de8 {yks2monk}}
/al gmonk {give 10 silver to monk}
/al monk2fy {monk2yks;de1 {yks2fy}}
/al ggmonk {fy2monk;de9 {gmonk};de10 {monk2fy}} 
/al cx2rzp {wlk;s;w;/2 wu;wd;s;nwlk}
/al rzp2cx {wlk;n;eu;/2 ed;e;n;nwlk}
/nop sga ËÉ¹ÈâÖ
/al yks2sga {wlk;sw;w;wd;n;w;nwlk}
/al sga2yks {wlk;e;s;eu;e;ne;nwlk}
/al fy2sga {fy2yks;de8 {yks2sga}}
/al sga2fy {sga2yks;de1 {yks2fy}}

/nop °ËÊ¶ÉñÍ¨
/nop ff {conjure team_drift}
/al fff {fff+;fdf}
/al fff+ {
/ac {^ÄãµÄÖÜÎ§Ò»Æ¬¼Å¾²}{de10 {df2fy}};
/ac {^·çÌ³}{fff-}
}
/al fff- {
/unac {^ÄãµÄÖÜÎ§Ò»Æ¬¼Å¾²};
/unac {^·çÌ³}
}
/al fbat {ff;master yuan suiyun}
/al ffy {ffy+;ff;huang mazi}
/al ffy+ {
wlk;
/nop ac{^Òø¹³¶Ä·»´óÌü}{de4 {tf};de8 {pl {n;n;e;e;e;e;u};pr}};
/ac {^Òø¹³¶Ä·»´óÌü}{de4 {tf};de8 {do n,n,e,e,e,e,u;}};
/ac {^·çÌ³}{ffy-}
}
/al ffy- {
/unac {^Òø¹³¶Ä·»´óÌü};
/unac {^·çÌ³}
}
/al fyl {ff;master lao dao}
/al fby {ff;hui dashi}
/al fcc {ff;master queen}
/al fsl {ff;xie zhanggui}
/al fdw {ff;hua fei;feiyu;mafeng}
/al fss {ff;bai sankong}
/al fxg {ff;master xing}
/al fxsl {ff;master tongban}
/al fgw {fgw+;ff;hu}
/al fgw+ {
    /ac {^Ó¥¼ÇÉÌºÅ}{de4 {tf};de8 {w;/3 s;e}};
    /ac {^Ó­Ã·¿ÍÕ»}{fgw-}
}
/al fgw- {
    /unac {^Ó¥¼ÇÉÌºÅ};
    /unac {^Ó­Ã·¿ÍÕ»}
}
/nop µØ¸®max
/al fyw2max {wlk;do w,w,w,w,w,w,w,s;nwlk}
/al max2fyw {wlk;do n,e,e,e,e,e,e,e;nwlk}
/al fy2max {fyw;de1 {fyw2max}}
/al max2fy {max2fyw;de1 {fyw-}}
/nop ÅĞ¹Ùto max e,e
/al df2fy {e;e;max2fy}
/al dfin+ {
    wlk;
    /ac {^½¹¶¼æä}{dash};
    /ac {^´¢²ØÊÒ}{n;s};
    /ac {^ÄÎºÎÇÅ}{w;drop pumpkin;dfin-}
}
/al dfin- {
    nwlk;
    /unac {^½¹¶¼æä};
    /unac {^´¢²ØÊÒ};
    /unac {^ÄÎºÎÇÅ}
}
/al dfin {buy pumpkin from max;eat pumpkin;de3 {dfin+;dash}}
/al fy2df {fy2max;de2 {dfin}}
/nop al dfout {su;sd;s;/5 d;/delay {0.5}{/8 d};/delay {1.5}{/6 d;ne}}
/al dfout {do su,sd,s,s,d,d,d,d,d,d,d,d;de1 {do d,d,d,d,d,d,d,d,d,d,d,ne}}
/ac {^ÄãËùÊÜµ½µÄµØÓòÓÄ»êµÄĞ§ÓÃÏûÊ§ÁË}{
    /ac {^ÃÏÆÅÍ¤}{sw;s;dash mist};
    look;
    }
/ac {^ÄãºİÁËºİĞÄ£¬Ò»Í·´³½øÁËÃÔÎíÖ®ÖĞ}{
    /unac {^ÄãËùÊÜµ½µÄµØÓòÓÄ»êµÄĞ§ÓÃÏûÊ§ÁË};
    /unac {^ÃÏÆÅÍ¤}
}
/nop ·çÔÆµ½¹ØÍâ

/nop lz2gw {pl {wlk;w;w;w;w;w;w;w;w;w;w;w;w;w;s;e;nwlk};pr}
/al lz2gw {wlk;do w,w,w,w,w,w,w,w,w,w,w,w,w,s,e;nwlk}
/nop  gw2lz {pl {wlk;wi jade;w;n;e;e;e;e;e;e;e;e;e;e;e;e;e;nwlk};pr}
/al gw2lz {wlk;unwield all;wield jade;do w,n,e,e,e,e,e,e,e,e,e,e,e,e,e;nwlk}
/al gw2cx {gw2sj;wi jade;de2 {sj2cx}}
/nop al sj2cx {pl {wlk;e;e;s;s;su;sw;se;se;sw;se;s;nwlk};pr}
/al sj2cx {pl {wlk;do e,e,s,s,su,sw,se,se,sw,se,s;nwlk};pr}
/nop al gw2cx {gw2lz;de2 {lz2cx}}
/nop ³ÁÏãµ½ÂÌÖŞ
/nop al lz2cx {pl {wlk;w;s;s;su;sw;se;se;sw;se;s;nwlk};pr}
/al lz2cx {pl {wlk;do w,s,s,su,sw,se,se,sw,se,s;nwlk};pr}
/al cx2gw {cx2sj;de2 {sj2gw}}
/nop ¹ØÍâ É½½Å
/nop al cx2sj {wlk;n;nw;northeast;nw;nw;northeast;n;nd;/delay {0.5}{n;nw;nw;w;w;w;/3 w};}
/nop al cx2sj {pl {wlk;n;nw;northeast;nw;nw;northeast;n;nd;n;nw;e;w;w;w;w;nwlk};pr}
/al cx2sj {wlk;n;nw;do northeast,nw,nw,northeast,n,nd,n,nw,e,w,w,w,w;nwlk}
/nop al cx2lz {pl {wlk;n;e;e;nw;ne;nw;nw;ne;n;nd;n;nw;nw;w;w;w};pr}
/al cx2lz {wlk;n;e;do e,nw,ne,nw,nw,ne,n,nd,n,nw,nw,w,w,w;}
/al gw2sj {wlk;do w,n,e,e,e,e,e,e,e,e,e,e;nwlk}
/al sj2gw {wlk;do w,w,w,w,w,w,w,w,w,w,s,e;nwlk}

/nop ¹ØÍâµ½Ì«Æ½Õò
/al lz2tp {wlk;do n,ne,nw,w,nw,nw,nw,sw;nwlk}
/al tp2lz {wlk;do wield jade,ne,se,se,se,e,se,sw,s;nwlk}
/al gw2tp {gw2lz;de2 {lz2tp}}
/al tp2gw {tp2lz;de2 {lz2gw}}
/al tp2fy {tp2lz;de2 {lz2fy}}
/al fy2tp {fy2lz;de9 {lz2tp}}
/nop âùºìĞ¡Ôº
/al yhy2tp {wlk;do pull door,e,e,e,e,e,n,n,n,ne,ne;nwlk}
/al tp2yhy {tp2yhy+;do sw,sw,s,s,s,w,w,w,w,knock red door}
/al tp2yhy+ {
    wlk;
    /ac {^ÃÅÊÇ¿ª×ÅµÄ}{w};
    /ac {^Ö¨µÄÒ»Éù£¬ºìÃÅ}{de3 {w}};
    /ac {^âùºìĞ¡Ôº}{tp2yhy-}
}
/al tp2yhy- {
    nwlk;
    /unac {^ÃÅÊÇ¿ª×ÅµÄ};
    /unac {^Ö¨µÄÒ»Éù£¬ºìÃÅ};
    /unac {^âùºìĞ¡Ôº}
}
/al fy2yhy {fy2tp;de10 {tp2yhy}}
/al yhy2fy {yhy2tp;de2 {tp2fy}}
/nop ¹í×Ó
/al tp2guizi {pl {wlk;sw;sw;s;s;s;w;w;w;w;push black door;s;s;nwlk};pr}
/al guizi2tp {pl {wlk;n;n;pull door;n;e;e;e;e;n;n;n;ne;ne;nwlk};pr}
/al guizi2fy {guizi2tp;de2 {tp2fy}}
/al fy2guizi {fy2tp;de10 {tp2guizi}}
/nop mhaÃ·»¨âÖ
/al tp2mha {pl {wlk;ne;w;w;w;nw;nu;nu;su;nu;wu;nu;wu;nwlk};pr}
/al mha2tp {pl {wlk;ed;sd;ed;sd;nd;sd;sd;se;e;e;sw;nwlk};pr}
/nop ¹ØÍâµ½¶ñÈË¹È É½´å¿Ú -
/al lz2er {lz2tp;de2 {tp2er}}
/al er2lz {er2tp;de2 {tp2lz}}
/al tp2er {pl {wlk;ne;w;w;nw;nu;nu;su;nu;l rock;northdown;nd;nd;e;nwlk};pr}
/al er2tp {pl {wlk;w;su;su;southup;l rock;sd;nd;sd;sd;se;e;e;sw;nwlk};pr}

/al gw2er {gw2tp;de3 {tp2er}}
/al er2gw {er2tp;de3 {tp2gw}}
/al fy2er {fy2lz;de8 {lz2er}}
/al er2fy {er2lz;de4 {lz2fy}}
/nop ¹ØÍâµ½±ß³Ç
/al gw2bc {gw2lz;de2 {lz2bc}}

/nop al lz2bc {pl {wlk;n;ne;nw;w;nw;nw;nw;w;w;nw;w;w;nw;w;w;w;w;nw;nwlk;keychain};pr}
/al lz2bc {wlk;do n,ne,nw,w,nw,nw,nw,w,w,nw,w,w,nw,w;keychain;w;w;w;w;nw;nwlk;}

/al bc2gw {bc2lz;de3 {lz2gw}}

/nop al bc2lz {pl {wlk;wi jade;se;e;e;e;e;se;e;e;se;e;e;se;se;se;e;se;sw;s;nwlk};pr}
/al bc2lz {pl {wlk;wi jade;se;e;e;e;do e,se,e,e,se,e,e,se,se,se,e,se,sw,s;nwlk};pr}
/al fy2bc {fy2lz;de9 {lz2bc}}
/al bc2fy {bc2lz;de3 {lz2fy}}
/nop ²Ø²Ø±±¿ì»îÁÖ
/al bc2khl {pl {wlk;se;e;e;e;e;s;s;w;w;su;sw;sw;sd;nwlk};pr}
/al khl2bc {pl {wlk;w;w;w;nu;ne;ne;ne;nd;e;e;n;n;w;w;w;w;nw;nwlk};pr}

/nop ¹ØÍâµ½ÎÚÀ­²´
/al gw2wlb {gw2lz;de2 {lz2wlb}}
/al wlb2gw {wlb2lz;de3 {lz2gw}}
/nop xie changqing 
/al wlbin {wlk;do unwield all,n,nw,ne,n,n,nu,u,;nwlk}
/al wlbout {wlk;do d,sd,s,s,sw,se,s;nwlk}
/nop al lz2wlb {pl {wlk;w;w;w;nw;nw;ne;nw;nw;nw;nw;wd;wu;wd;wu;nw;nw;w;w;n;unwi all;nwlk};pr}
/al lz2wlb {pl {wlk;do w,w,w,nw,nw,ne,nw,nw,nw,nw,wd,wu,wd,wu,nw;nw;w;w;n;unwi all;nwlk};pr}
/al wlb2lz {pl {wlk;s;e;e;se;se;ed;do eu,ed,eu,se,se,se,se,sw,se,se,e,e,e;nwlk};pr}
/al wlb2bc {wlb2lz;de2 {lz2bc}}
/al bc2wlb {bc2lz;de2 {lz2wlb}}
/al wlb2fy {wlb2lz;de3 {lz2fy}}
/nop lz2fy {lz2cx;cx2fy+}
/al lz2fy {lz2sk;de1 {sk2fy}}
/nop al fy2lz {fy2cx;cx2lz+}
/al fy2lz {fy2cx;de7 {cx2lz}}
/al cx2lz+ {
    wlk;
    /ac {^ÀÏ³Ç¹ã³¡}{cx2lz};
    /ac {^´óÄ®·çÉ³}{cx2lz-}
}
/al cx2lz- {
    nwlk;
    /unac {^ÀÏ³Ç¹ã³¡};
    /unac {^´óÄ®·çÉ³}
}
/nop »ğÑæÉ½
/al hys2wlb {pl {wlk;wd;wu;wd;wu;nw;nw;w;w;n;nwlk};pr}
/al wlb2hys {pl {wlk;s;e;e;se;se;ed;eu;ed;eu;nwlk};pr}
/nop ´óÄ®
/al lz2dsm {pl {wlk;n;ne;nw;w;nw;nw;nwlk};pr}
/al dsm2lz {pl {wlk;se;se;e;se;sw;s;nwlk};pr}

/al Ìì·ã
/al lz2tf {wlk;do w,n,n,n,n,e,n;nwlk}
/al tf2sk {wlk;do s,w,s,s,s,s,e,e,e,e,e;nwlk}
/al fy2tf {fy2lz;de9 {lz2tf}}
/al tf2fy {tf2sk;de2 {sk2fy}}
/al tf2lz {wlk;do s,w,s,s,s,e,n,w;nwlk}
/al tf2wurong {do nw,w,n,n,n,n;askwurong}
/al wurong2tf {do s,s,s,s,s.e,s,e,e}

/nop Èû¿Ú
/al fy2sk {fyw;de1 {do w,w,w,w,w,w,w,w,w;nwlk}}
/al sk2fy {wlk;do e,e,e,e,e,e,e,e,e;de1 {fyw-}}
/nop ÌÒÔ´
/al fy2ty {wlk;/al ty_action {around;l};fy2wdz;fy2ty+;de2 {/4 e;ty_action}}
/al fy2ty+ {
    wlk;
    /ac {^¿´²»¼ûÈÎºÎÃ÷ÏÔµÄ³öÂ·£¬¿´À´£¬ÄãÖ»ºÃËÄ´¦×ª×ª¿´ÁË}{around};
    /ac {^Ë®»¨¡£Ì¶±ß³¤ÂúÁË}{around};
    /ac {^Äã×ªÀ´×ªÈ¥£¬Ò²Ã»ÕÒµ½³ö¿Ú£¬ÄãÃÔÁËÂ·}{de1 {l}}{6};
    /ac {^  Ò°ÍÃ(Rabbit)}{/al ty_action {/3 catch rabbit};/ticker {catch}{ty_action}{1}}{4};
    /ac {^Ò°ÍÃÈı×ªÁ½×ª£¬Ù¿µØÒ»ÏÂ²»¼ûÁË×ÙÓ°}{listen;se;e;};
    /ac {^ÌÒÔ´´å}{fy2ty-};
    /ac {^ÄãÑØ×ÅĞ¡Â·£¬×ßÏòÄÇ°×ÔÆ}{fy2ty-}
}

/al fy2ty- {
    nwlk;
    /unticker {catch};
    /unac {^¿´²»¼ûÈÎºÎÃ÷ÏÔµÄ³öÂ·£¬¿´À´£¬ÄãÖ»ºÃËÄ´¦×ª×ª¿´ÁË};
    /unac {^Ë®»¨¡£Ì¶±ß³¤ÂúÁË};
    /unac {^Äã×ªÀ´×ªÈ¥£¬Ò²Ã»ÕÒµ½³ö¿Ú£¬ÄãÃÔÁËÂ·};
    /unac {^  Ò°ÍÃ(Rabbit)};
    /unac {^Ò°ÍÃÈı×ªÁ½×ª£¬Ù¿µØÒ»ÏÂ²»¼ûÁË×ÙÓ°};
    /unac {^¡¸ÌÒÔ´´å¡¹ -};
    /unac {^ÄãÑØ×ÅĞ¡Â·£¬×ßÏòÄÇ°×ÔÆ}
}

/al ty2fy {ty2fy+;l}
/al ty2fy+ {
    wlk;
    /ac {^ÇàÇàÊ¯°åÂ·}{w};
    /ac {^ÌÒÔ´´å}{push door;nw;w;around};
    /ac {^Äã×ªÀ´×ªÈ¥£¬Ò²Ã»ÕÒµ½³ö¿Ú£¬ÄãÃÔÁËÂ·£¡£¡}{/delay {0.5}{around}};
    /ac {^    ÕâÀïÎ¨Ò»µÄ³ö¿ÚÊÇ south¡£}{s;w;w;/delay {0.5}{wdz2fy;ty2fy-}}{4}
}
/al ty2fy- {
    nwlk;
    /unac {^ÇàÇàÊ¯°åÂ·};
    /unac {^ÌÒÔ´´å};
    /unac {^Äã×ªÀ´×ªÈ¥£¬Ò²Ã»ÕÒµ½³ö¿Ú£¬ÄãÃÔÁËÂ·£¡£¡};
    /unac {^    ÕâÀïÎ¨Ò»µÄ³ö¿ÚÊÇ south¡£}
}

/nop ·çÔÆ¿ÍÕ»
/al fykz {wlk;do d,s,s,s,e,e,se,s,e;nwlk}
/al kzfy {wlk;do w,n,nw,w,w,n,n,n,u;nwlk}

/al fy2mx {mx2fy-;fy2mx+;fye;do e,e,n,e,eu,eu;eu}
/al fy2mx+ {
    wlk;
    /ac {^ÄãÔÚÏÁÕ­µÄÉ½·ì}{/al act_1 {de4 {act_1}}};
    /ac {ÔÆÎíÃÖÂş£¬±±ÃæµÄÎíÆøËÆºõÔÚÇáÇáÁ÷¶¯}{n;nu; /ticker {try}{wd;eu}{2}};
    /ac {^    ÕâÀïÃ÷ÏÔµÄ³ö¿ÚÊÇ westup ºÍ southdown¡£}{fy2mx-}{3};
    /ac {^ÔÆº£¹ÂÖÛ}{wd};
    /ac {^»ÆÊ÷ÁÖ}{fy2mx-;de3 {wd;nu;}};
    /ac {^É½µÀ} {/al act_1 {nu;wu}; /unticker {try}}
}
/al fy2mx- {
    nwlk;
    /unticker {try};
    /unac {^ÄãÔÚÏÁÕ­µÄÉ½·ì};
    /unac {^ÔÆº£¹ÂÖÛ};
    /unac {^»ÆÊ÷ÁÖ};
    /unac {ÔÆÎíÃÖÂş£¬±±ÃæµÄÎíÆøËÆºõÔÚÇáÇáÁ÷¶¯};
    /unac {^    ÕâÀïÃ÷ÏÔµÄ³ö¿ÚÊÇ westup ºÍ southdown¡£};
    /unac {^É½µÀ}
}
/al mx2fy {fy2mx-;wlk;mx2fy+;look}
/al mx2fy+ {
    /ac {É½µÀ}{sd;de3 {sd;l}};
    /ac {^    ÕâÀïÃ÷ÏÔµÄ³ö¿ÚÊÇ westdown ºÍ eastup¡£}{/delay {0.1}{wd};de3 {wd}};
    /ac {^ÃÔÃ£·çÓêÂ·}{de1 {wd}};
    /ac {^ÄãÅ¬Á¦¼·¹ıÒ»´¦ÏÁÕ­µÄÉ½Â·}{de3 {sd;w}};
    /ac {^    ÕâÀïÃ÷ÏÔµÄ³ö¿ÚÊÇ west ºÍ eastup¡£}{w};
    /ac {^³à·åÂ·}{w;fye-;mx2fy-}
}
/al mx2fy- {
    nwlk;
    /unac {É½µÀ};
    /unac {^ÄãÅ¬Á¦¼·¹ıÒ»´¦ÏÁÕ­µÄÉ½Â·};
    /unac {^    ÕâÀïÃ÷ÏÔµÄ³ö¿ÚÊÇ westdown ºÍ eastup¡£};
    /unac {^ÃÔÃ£·çÓêÂ·}
    /unac {^    ÕâÀïÃ÷ÏÔµÄ³ö¿ÚÊÇ west ºÍ eastup¡£};
    /unac {^³à·åÂ·}
}
/al mxin+ {
    wlk;
    /ac {É½µÀ}{nu;wu;nd;de3 {l}};
    /ac {^³ÁÏãº£}{mxin-};
    /ac {^ÔÆº£¹ÂÖÛ}{wd};
    /ac {^»ÆÊ÷ÁÖ}{nu;wu}
}
/al mxin- {
    nwlk;
    /unac {É½µÀ};
    /unac {^³ÁÏãº£};
    /unac {^ÔÆº£¹ÂÖÛ};
    /unac {^»ÆÊ÷ÁÖ}
}
/al mxin {mxout-;mxin+;l}
/al mxout+ {
    wlk;
    /ac {^³ÁÏãº£}{su};
    /ac {É½µÀ}{ed;sd;de3 {l}};
    /ac {^ÃÔÃ£·çÓêÂ·}{mxout-};
    /ac {^»ÆÊ÷ÁÖ}{ed;sd}
}
/al mxout- {
    nwlk;
    /unac {É½µÀ};
    /unac {^³ÁÏãº£};
    /unac {^ÃÔÃ£·çÓêÂ·};
    /unac {^»ÆÊ÷ÁÖ}
}
/al mxout {mxin-;mxout+;l}
/nop ÏàË¼Áë
/nop al fy2xsl {wlk;d;/5 e;de1 {/5 e};de2 {unwield all;/3 w;/4 e;s;nwlk}}
/al fy2xsl {pl {wlk;d;e;e;e;e;e;e;e;e;e;e;unwield all;w;w;w;e;e;e;e;s;nwlk};pr}
/al xsl2fy {pl {wlk;n;n;w;w;fye-;xslout-};pr}
/al fy2xsl2 {xslin+;fy2xsl}
/nop ÂÌÖñÁÖ - Ê¯ÅÆ·å
/al xslup+ {
    wlk;
    /ac {^ÂÌÖñÁÖ}{s};
    /ac {^Öñ¼äÇåÁ÷}{s};
    /ac {^»¢¾áÊ¯}{jump up};
    /ac {^ÄãµÄÕæÆø²»¹»£¬ÅÂ»¹}{hr;/delay {2.1}{hp};de6 {l}};
    /ac {^ÄãÌáÒ»¿ÚÆø}{xslup-}
}
/al xslup- {
    nwlk;
    /unac {^ÂÌÖñÁÖ};
    /unac {^Öñ¼äÇåÁ÷};
    /unac {^»¢¾áÊ¯};
    /unac {^ÄãµÄÕæÆø²»¹»£¬ÅÂ»¹};
    /unac {^ÄãÌáÒ»¿ÚÆø}
}
/al xslup {xslup+;l}
/al xsldd+ {
    wlk;
    /ac {^Á½½ç±®}{jump down};
    /ac {^Öñ¼äÇåÁ÷}{n;xsldd-};
    /ac {^»¢¾áÊ¯}{de2 {n}};
    /ac {^ÄãµÄÕæÆø²»¹»£¬ÅÂ»¹}{hr;/delay {2.1}{hp};de6 {1}}
}
/al xsldd- {
    nwlk;
    /unac {^Á½½ç±®};
    /unac {^Öñ¼äÇåÁ÷};
    /unac {^»¢¾áÊ¯};
    /unac {^ÄãµÄÕæÆø²»¹»£¬ÅÂ»¹}
}
/al xsldd {xsldd+;l}
/al fy2ljb {xslup+;fy2xsl}
/al ljb2fy {wlg2fy+;xsldd}
/al xslout2 {wlg2fy+;xslout}
/nop ljb Á½½ç±® wlg ÎèÁø¸ó
/al ljb2wlg+ {
    wlk;
    /ac {^Á½½ç±®}{w};
    /ac {^Ç§·½ÎíÕÏ}{de2 {w}};
    /ac {^½ÙÓàÁë}{de2 {su}};
    /ac {^»Ø·çÉ½×¯}{su};
    /ac {^ÎèÁø¸ó}{ljb2wlg-}
}
/al ljb2wlg- {
    nwlk;
    /unac {^Á½½ç±®};
    /unac {^Ç§·½ÎíÕÏ};
    /unac {^½ÙÓàÁë};
    /unac {^»Ø·çÉ½×¯};
    /unac {^ÎèÁø¸ó}
}
/al ljb2wlg {ljb2wlg+;l}
/al fy2wlg {
    fy2xsl;
    xslup+;
    ljb2wlg+
}
/al wlg2ljb+ {
    wlk;
    /ac {^Ç§·½ÎíÕÏ}{e;wlg2ljb-};
    /ac {^½ÙÓàÁë}{e};
    /ac {^»Ø·çÉ½×¯}{nd};
    /ac {^ÎèÁø¸ó}{nd}
}
/al wlg2ljb- {
    nwlk;
    /unac {^Ç§·½ÎíÕÏ};
    /unac {^½ÙÓàÁë};
    /unac {^»Ø·çÉ½×¯};
    /unac {^ÎèÁø¸ó}
}
/al wlg2ljb {wlg2ljb+;l}
/al wlg2fy+ {
    wlk;
    /ac {^ÂÌÖñÁÖ}{xsl2fy;wlg2fy-}
}
/al wlg2fy- {
    nwlk;
    /unac {^ÂÌÖñÁÖ}
}
/al wlg2fy {wlg2ljb;xsldd+;wlg2fy+}
/al xslin  {xslin+;/al xslin_do {n;l};l}
/al xslin+ {
   xslout-;
   xslup+;
    /ac {^Á½½ç±®}{e};
    /ac {^À×´òÊ¯}{e};
    /ac {^Ñ©ÖĞ¸ó}{w};
    /ac {^ÏàË¼Áë}{/al xslin_do {n;get bag;l};/ticker {xslin_go}{xslin_do}{1}};
    /ac {^ÄıÂ¶³Ø}{/al xslin_do {s;get bag;climb vine;look}};
    /ac {^Ê¯ÅÆ·å}{xslin-;/delay {2.1}{su;w;s}}
}
/al xslin- {
    xslup-;
    /unac {^Á½½ç±®};
    /unac {^À×´òÊ¯};
    /unac {^Ñ©ÖĞ¸ó};
    /unac {^ÏàË¼Áë};
    /unticker {xslin_go};
    /unac {^ÄıÂ¶³Ø};
    /unac {^Ê¯ÅÆ·å}
}
/al xslout {xslout+;/delay {0.2}{l}}
/al xslout+ {
xsldd+;
/ac {^±ù¶´Èë¿Ú}{out};
/ac {^Ğş±ù¶´}{out};
/ac {^ºøÏÉÑÒ}{sd};
/ac {^ºóÉ½ÃÅ}{e};
/ac {^éªÄ¾×ßÀÈ}{e};
/ac {^²»ÀÏº®Èª}{n};
/ac {^ÑîÄ¾×ßÀÈ}{e};
/ac {^ğ©ÔÂ¹¬}{/2 nd;w;w;};
/ac {^ÄãµÄÄÚÁ¦¹ıÈõ£¬¿ÖÅÂÌø}{hn;hp;l};
}
/al xslout- {
xsldd-;
/unac {^±ù¶´Èë¿Ú};
/unac {^Ğş±ù¶´};
/unac {^ºøÏÉÑÒ};
/unac {^ºóÉ½ÃÅ};
/unac {^éªÄ¾×ßÀÈ};
/unac {^²»ÀÏº®Èª};
/unac {^ÑîÄ¾×ßÀÈ};
/unac {^ğ©ÔÂ¹¬};
/unac {^ÄãµÄÄÚÁ¦¹ıÈõ£¬¿ÖÅÂÌø};
}
/al bingdong {bingdong+;/delay {0.2}{l}}
/al bingdong+ {
wlk;
/ac {^±ù¶´Èë¿Ú}{bingdong-};
/ac {^Ğş±ù¶´}{enter;bingdong-};
/ac {^ºøÏÉÑÒ}{enter};
/ac {^ºóÉ½ÃÅ}{nu};
/ac {^éªÄ¾×ßÀÈ}{w};
/ac {^²»ÀÏº®Èª}{w};
/ac {^ÑîÄ¾×ßÀÈ}{s};
/ac {^ğ©ÔÂ¹¬}{w}
}
/al bingdong- {
nwlk;
/unac {^±ù¶´Èë¿Ú};
/unac {^Ğş±ù¶´};
/unac {^ºøÏÉÑÒ};
/unac {^ºóÉ½ÃÅ};
/unac {^éªÄ¾×ßÀÈ};
/unac {^²»ÀÏº®Èª};
/unac {^ÑîÄ¾×ßÀÈ};
/unac {^ğ©ÔÂ¹¬}
}
/al bdin {
    /2 s;w;s;w;/7 s;w;/4 s;
}
/al bdout {
    /5 n;e;/7 n;e;n;e;/2 n;
}
/al gw2tx {wlk;do w,n,e,nu,n,n,n,pushaside grass,w,w,w,w,w,listen,n;nwlk}
/al tx2gw {tx2gw+;/delay {0.2}{l}}
/al tx2gw+ {
    wlk;
    /ac {^Ã·ÓêÌ¶}{su};
    /ac {^É½×¯ºóÔº}{s};
    /ac {^´äÖñÎİ}{s};
    /ac {^²ØÊé¸ó}{w};
    /ac {^É½×¯Ç°Ôº}{s};
    /ac {^´äÖñ×¯ÃÅ}{do s,e,e,e,e,e,s,s,s,sd,w,s,e;};
    /ac {^Ñò³¦Ğ¡µÀ}{tx2gw-}
}
/al tx2gw- {
    nwlk;
    /unac {^Ã·ÓêÌ¶};
    /unac {^É½×¯ºóÔº};
    /unac {^´äÖñÎİ};
    /unac {^²ØÊé¸ó};
    /unac {^É½×¯Ç°Ôº};
    /unac {^´äÖñ×¯ÃÅ};
    /unac {^Ñò³¦Ğ¡µÀ}
}
/al tx2fy {tx2fy+;/delay {0.2}{tx2gw}}
/al tx2fy+ {
    /ac {^Ó­Ã·¿ÍÕ»}{/delay {0.5}{gw2fy;tx2fy-}};
    /ac {^·çÔÆÄÏ}{tx2fy-}
}
/al tx2fy- {
    /unac {^Ó­Ã·¿ÍÕ»};
    /unac {^·çÔÆÄÏ}
}
/nop al tx2gw {wlk;s;s;s;/5 e;de1 {/3 s;sd;w;s;e;nwlk}}
/nop fy to yin bin ÄÃÊ÷Ò¶

/al fy2yinbin {fy2qf;de4 {/2 e;/2 eu;nu;w;ask monk about meat};de6 {open door;s;pull Ğ¡¹ñ;nwlk}}
/al buyleaf {wlk;n;e;sd;wd;wd;give xiaofan 10 silver;nwlk}
/nop al fy2gw {fy2cx;de9 {cx2gw}}
/al fy2gw {fy2cx;de7 {cx2gw}}
/al fy2tx {fy2cx;de7 {cx2gw};de11 {gw2tx}}
/al gw2fy {gw2cx;cx2fy+}
/al fy2wlb {fy2lz;de9 {lz2wlb}}
/nop al fy2qj {fy2wm;de10 {/6 e;swim}}
/nop al fy2qj {wlk;d;/4 s;/delay {0.5}{/3 w;sw;nw;sw;w;n;nwlk}}
/nop al qj2fy {wlk;s;e;ne;se;ne;/3 e;/delay {0.5}{/4 n;u;nwlk}}
/nop youlingshanzhuang
/nop al gw2yl {gw2yl+;wlk;w;n;e;s;de1 {keychain;s;keychain;s;s;su;get all from rock;blow pipe;e;nwlk}}
/al gw2yl {gw2yl+;wlk;do w,n,e,s,s,s,s,su,keychain,get all from rock;blow pipe,e;nwlk}
/al ylgw {yl2gw-;wlk;nd;/4 n;w;s;e;nwlk}
/al yl2gw {yl2gw+;/delay {0.5}{look}}
/nop al gw2ygh {wlk;do w,n,e,s,s,/delay {0.5}{ygh+;/2 s;n;e;e;agree to help}}
/al gw2ygh {ygh+;wlk;do w,n,e,s,s,s,s,n,e,e,agree to help;nwlk}
/al yl2gw+ {
    wlk;
    /ac {^ÑÛÇ°¾°É«ËÆºõÓĞĞ©ÊìÏ¤}{ylgw};
    /ac {^¸ÖË÷ÇÅÉÏ}{w}
}
/al yl2gw- {
    nwlk;
    /unac {^ÑÛÇ°¾°É«ËÆºõÓĞĞ©ÊìÏ¤};
    /unac {^¸ÖË÷ÇÅÉÏ}
}
/al gw2yl+ {
    wlk;
/ac {^¹Â¶ÀÃÀµÄºí½áÉÏÏÂ¹ö¶¯×Å}{agree to help};
/ac {^·ÛÑà×ÓĞ¦ÁËĞ¦µÀ£ºÓĞÊ±ºòÎÒÁ¬Äã¶¼ÏëÒª}{leave gu du mei};
/ac {^Ò¶¹Âºè¶ÔÄãËµµÀ:ÄãÃÇ¿ÉÒÔ×ßÁË}{e;ga rock;blow pipe};
/ac {^°×ÔÆÖ®¼äºöÈ»³öÏÖÁËÒ»¸öÈË}{e;gw2yl-}
}
/al gw2yl- {
    uwlk;
/unac {^¹Â¶ÀÃÀµÄºí½áÉÏÏÂ¹ö¶¯×Å};
/unac {^·ÛÑà×ÓĞ¦ÁËĞ¦µÀ£ºÓĞÊ±ºòÎÒÁ¬Äã¶¼ÏëÒª};
/unac {^Ò¶¹Âºè¶ÔÄãËµµÀ:ÄãÃÇ¿ÉÒÔ×ßÁË}
/unac {^°×ÔÆÖ®¼äºöÈ»³öÏÖÁËÒ»¸öÈË}
}
/al ygh+ {
    wlk;
    /ac {^¹Â¶ÀÃÀËµµÀ£ºÏò¶«×ß¡£}{e};
    /ac {^¹Â¶ÀÃÀËµµÀ£ºÏòÎ÷×ß¡£}{w};
    /ac {^¹Â¶ÀÃÀËµµÀ£ºÏòÄÏ×ß¡£}{s};
    /ac {^¹Â¶ÀÃÀËµµÀ£ºÏò±±×ß¡£}{n};
    /ac {^¹Â¶ÀÃÀËµµÀ£ºµ½ÁË¡£}{get pipe from rock;blow pipe;e;e;tell ghost no face;ygh-}
}
/al ygh- {
    nwlk;
    /unac {^¹Â¶ÀÃÀËµµÀ£ºÏò¶«×ß¡£};
    /unac {^¹Â¶ÀÃÀËµµÀ£ºÏòÎ÷×ß¡£};
    /unac {^¹Â¶ÀÃÀËµµÀ£ºÏòÄÏ×ß¡£};
    /unac {^¹Â¶ÀÃÀËµµÀ£ºÏò±±×ß¡£};
    /unac {^¹Â¶ÀÃÀËµµÀ£ºµ½ÁË¡£}
}

/nop »ÆÉ½
/nop al fy2hs {fy2cx;de7 {cx2hs}}
/nop al hs2fy {hs2cx;cx2fy+}

/nop Ì«Æ½to¶ñÈË¹È
/nop al tp2erg {pl {wlk;ne;w;w;nw;nu;nu;su;su;look stone;nd;nd;nd;nd;e;nwlk};pr}
/nop al erg2tp {pl {wlk;w;su;su;wu;wu;ed;sd;ed;sd;nd;sd;sd;se;e;e;sw;nwlk};pr}

/nop ĞË¹úin
/al xgin {wlk;xgin+;/4 n;touch mark}
/al xgin+ {
    /ac {Í­ÈËÑÛ¾¦ºöÈ»Õö¿ª}{n;xgin-}
}
/al xgin- {
    nwlk;
    /unac {Í­ÈËÑÛ¾¦ºöÈ»Õö¿ª}
}

/al xgin2 {wlk;xgin2+;n;n;n;smile}

/al xgin2+ {
    /ac {ÄãÓä¿ìµØĞ¦ÁËĞ¦¡£}{l;/delay {0.5}{smile}};
    /ac {ÃÖÀÕ·ğËÆºõÒ²ºÍÄãÒ»ÆğĞ¦ÁËÆğÀ´}{n;xgin2-}
    /ac {^Î¤ÍÔµî}{xgin2-};
    /ac {^¹ÛÒôµî}{xgin2-}
}
/al xgin2- {
    nwlk;
    /unac {ÄãÓä¿ìµØĞ¦ÁËĞ¦¡£};
    /unac {ÃÖÀÕ·ğËÆºõÒ²ºÍÄãÒ»ÆğĞ¦ÁËÆğÀ´};
    /unac {^Î¤ÍÔµî};
    /unac {^¹ÛÒôµî}
}

/al xgin3 {wlk;n;e;push luowang;n;nwlk}
/nop al xgout {pl {wlk;w;w;push button;s;e;s;s;s;s;s;s;s;nwlk};pr}
/al xgout {wlk;do w,w,push button,s,e,s,s,s,s,s,s,s;nwlk}
/al fy2xg1 {fy2xg;de4 {xgin}}
/al fy2xg2 {fy2xg;de4 {xgin};de6 {xgin2}}
/al fy2xg3 {fy2xg;de4 {xgin};de8 {xgin2};/delay {15}{xgin3}}

/nop al fy2dqg {/7 e;de1 {/3 east;n;e;/3 eu;};de2 {sd;ed;n;w;w;/2 w};de3 {wd;/2 w;n;w;/3 wd}}
/nop ÔÆÓêÖÛÇ§½ğ
/al qj2yyz {pl {wlk;n;n;nw;w;w;w;w;w;w;n;n;w;s;nwlk};pr}
/al yyz2qj {pl {wlk;n;e;s;s;e;e;e;e;e;e;se;s;s;nwlk};pr}
/al yyz2fy {yyz2qj;de2 {qj2fy}}
/al fy2yyz {fy2qj;/delay {24}{qj2yyz}}
/ÀÇÉ½ Ì«Æ½¿ÍÕ» -
/al ls2cx {wlk;do nw,nd,ne,nd,nd,wd,nw,nd,nd,ed,n,e,e,e;n;n;n;n;nwlk}
/nop al cx2ls {pl {wlk;s;s;s;s;w;w;w;s;wu;give meat to fighter wolf;su;su;su;keychain;se;eu;su;su;sw;su;se;nwlk};pr}
/al cx2ls {wlk;do s,s,s,s,w,w,w,s,wu,su,keychain,su,keychain;de1 {do su,se,eu,su,su,sw,su,se;nwlk}}
/al ls2fy {ls2cx;cx2fy+}
/al fy2ls {fy2cx;de9 {cx2ls}}
/al ls2langwo {wlk;nw;nd;crawl up;nwlk}
/al langwo2ls {wlk;crawl down;de3 {su;se;nwlk}}
/al langwo2fy {langwo2ls;de4 {ls2fy}}
/al fy2langwo {fy2ls;de14 {ls2langwo}}
/al lsin {pl {wlk;s;se;su;su;su;su;su;se;su;/3 knock door;enter;nwlk};pr}
/al lsout {pl {wlk;n;out;nd;nw;nd;nd;nd;nd;nd;nw;n};pr}
/nop ÏãÁé
/al fyxl {do d,w,w,w,s}
/nop al fyxl {d;/3 w;s}
/al xlfy {do n,e,e,e;u}
/½ğÇ®°ï ĞûÎäÌÃ
/al fy2xwt {wlk;do d,w,w,w,w,n,n,w,n,w,open picture,wd,e;nwlk}
/al xwt2fy {pl {wlk;w;eu;e;s;e;s;s;e;e;e;e;u;nwlk};pr}

/nop ¶ö»¢¸Ú
/al ehg2wdz {wlk;do nd,nd,nd,nd,nw,nw,n,n,n;nwlk}
/al wdz2ehg {wlk;do s,s,s,se,se,su,su,su,keychain,su,su;nwlk}
/al fy2ehg {fy2wdz;de2 {wdz2ehg}}
/al ehg2fy {ehg2wdz;de2 {wdz2fy}}
/nop ¶ÏËş
/al dtin {do listen,push door,l ¶ÏËş,open door,enter}
/al wdz2dt {wlk;do s,s,s,se,se,su,su,su,keychain,sw,sw,su;dtin;nwlk}
/al dt2wdz {wlk;do d,d,d,d,d,out,ne,nd,nd,nd,nw,nw,n,n,n;nwlk}
/al fy2dt {fy2wdz;de2 {wdz2dt}}
/al dt2fy {dt2wdz;de2 {wdz2fy}}
/nop ask baili about ¹é¶«¾°
/al dt2jyt {jytin+;wlk;do u,u,u,u,u,u,u,u,jumpout window,drop dingxi note,d,u,jumpout window;nwlk}
/al jytin {jytin+;wlk;do push ¶ÏÇ½,enter,su,open Ä¾Ç½,eu;nwlk}
/al jytin+ {
   /ac {^¶ÏÇ½±ß}{push ¶ÏÇ½};
   /ac {ÄãÇÎÃæ±ïµÃÍ¨ºì£¬¶ÏÇ½»¹ÊÇÎÆË¿²»¶¯}{push ¶ÏÇ½};
   /ac {^²Ğ×©¶ÏÊ¯·×·×ÂäÏÂ}{/delay {0.5}{l}};
   /ac {^ÔÚ²Ğ×©¶ÏÍßÖ®ºóÄãËÆºõÕÒµ½}{do enter,su,open Ä¾Ç½,eu;jytin-}
}
/al jytin- {
   /unac {^¶ÏÇ½±ß};
   /unac {ÄãÇÎÃæ±ïµÃÍ¨ºì£¬¶ÏÇ½»¹ÊÇÎÆË¿²»¶¯};
   /unac {^²Ğ×©¶ÏÊ¯·×·×ÂäÏÂ};
   /unac {^ÔÚ²Ğ×©¶ÏÍßÖ®ºóÄãËÆºõÕÒµ½}
}
/al fy2jyt {fy2dt;de4 dt2jyt;}
/al jyt2fy {wlk;nd;ehg2fy;nwlk}
/nop ¿ì»îÁÖ
/nop al lz2khl {wlk;n;ne;nw;nw;wade strand;de2 {l;nwlk}}
/al wadeliusha {wade É³Á÷}
/al cx2khl {cx2lz;de2 {lz2khl}}
/al lz2khl {lz2kqh;/delay {0.5}{khlin}}
/al fy2kqh {fy2lz;de9 {lz2kqh}}
/al khlin {khlin+;/delay {0.2}{l}}
/al khlin+ {
    /ac {^¿×È¸ºÓ}{wadeliusha};
    /ac {^Î÷·ğËş}{/4 e;khlin-};
    /ac {^¶«·ğËş}{/4 w;khlin-};
    /ac {^ÄÏ·ğËş}{/4 n;khlin-};
    /ac {^±±·ğËş}{/4 s;khlin-};
    /ac {^Ê¥µî}{khlin-}
}
/al khlin- {
    /unac {^¿×È¸ºÓ};
    /unac {^Î÷·ğËş};
    /unac {^¶«·ğËş};
    /unac {^ÄÏ·ğËş};
    /unac {^±±·ğËş};
    /unac {^Ê¥µî}
}
/al khlout {khlout+;/delay {0.2}{l}}
/al khlout+ {
    wlk;
    /ac {^±±Ìì½Ö}{/4 n;u};
    /ac {^ÄÏÌì½Ö}{/4 s;u};
    /ac {^¶«Ìì½Ö}{/4 e;u};
    /ac {^Î÷Ìì½Ö}{/4 w;u};
    /ac {^Ê¥µî}{e};
    /ac {^¿×È¸ºÓ}{khlout-};
    /ac {·ğËş}{u}
}
/al khlout- {
    nwlk;
    /unac {^±±Ìì½Ö};
    /unac {^ÄÏÌì½Ö};
    /unac {^¶«Ìì½Ö};
    /unac {^Î÷Ìì½Ö};
    /unac {^Ê¥µî};
    /unac {^¿×È¸ºÓ};
    /unac {·ğËş}
}
/al khl2fy {khlout;khl2fy+}
/al khl2fy+ {
/ac {^    ÕâÀïÎ¨Ò»µÄ³ö¿ÚÊÇ southeast}{khl2fy-;kqh2fy}
}
/al khl2fy- {
/unac {^    ÕâÀïÎ¨Ò»µÄ³ö¿ÚÊÇ southeast}
}
/al kqh2lz {wlk;se;se;sw;s;nwlk}
/al lz2kqh {wlk;n;ne;nw;nw;nwlk}
/al kqh2khl {kqh2lz;de1 {lz2khl}}
/al fy2khl {fy2lz;de9 {lz2khl}}
/al kqh2fy {kqh2lz;de1 {lz2fy}}
/al cx2tf {n;nw;ne;nw;nw;ne;nd;n;nw;n}
/nop Ê¯·å±ßÔµ -
/al tf2cx {s;/3 w;lz2cx}
/ac {^Äã½ÅÏÂÒ»»¬£¬ÔÚ¶ÀÄ¾ÇÅÉÏ»ÎÁË»Î}{nhq_force+;de1 {look}}
/al nhq_force+ {
/ac {^¶ÀÄ¾Î£ÇÅ}{e};
/ac {^²íÂ·¿Ú}{s};
/ac {^ºÚÊ¯µÀÂ·}{s};
/ac {^Ê¯ÏñÁÖ}{s};
/ac {^ÄÎºÎÇÅ}{nhq_force-}
}
/al nhq_force- {
/unac {^¶ÀÄ¾Î£ÇÅ};
/unac {^²íÂ·¿Ú};
/unac {^ºÚÊ¯µÀÂ·};
/unac {^Ê¯ÏñÁÖ};
/unac {^ÄÎºÎÇÅ}
}
/al ygdf {wlk;d;/4 w;/2 s;w;open picture;wd;open door;n;nwlk}
/al ygdf- {wlk;s;open door;eu;e;/2 n;/4 e;u;nwlk}
/al lll {say east;l east;say south;l south;say west;l west;say north;l north;}
/al jqin {wlk;d;/4 w;/2 n;w;n;w;open picture;wd;nwlk}
/al jqout {wlk;eu;e;s;e;/2 s;/4 e;u;nwlk}
/al xslnt {wlk;d;/2 n;e;n;ask youngman about ²îÊÂ;s;w;/2 s;u;nwlk}
/al sqnt {wlk;n;ask master about ·³ÄÕ;s;open door;/6 s;climb down;nwlk}
/ac {^ÓĞÒ»Åú±¦²Ø¾ÍÔÚ%1µÄ·½Ïò£¡Äã¿ÉÒÔÓÃ %2 À´Ñ°ÕÒËü}{%2;de1 {read afrji}}
/nop Áú»¢Õ¯
/al bc2lhz {pl {se;e;e;e;e;s;s;se;listen;l south;s;disarm;se;climb tree};pr;de3 {/10 scout}}
/nop fy to room set room 000
/al fy2room+ {
    wlk;
    /ac   {room                  %1}{/al roomin {%1};say  %1}
}
/al fy2room- {
    nwlk;
    /unac {room                  %1}
}
/nop al fy2room {fy2room+;set;do d,s,w,u,w,u,u,u,u,u,u,u,u,u;roomin;nwlk}
/al fy2room {wlk;do d,s,w,u,w,u,u,u,u,u,u,u,u,u;roomin;nwlk}
/al room2fy {pl {wlk;out;d;d;d;d;d;d;d;d;d;e;d;e;n;u;nwlk};pr}
/al gitem {fy2room;de2 {getitem};de3 {room2fy}}
/ac {^Ëï½£ÉìÊÖµ²×¡ÁËÄãËµ£º¡°ÇëÎÊÕÒË­}{answer ÂÉÏã´¨}
/al tp2lhz {wlk;ne;/2 w;nw;/2 w;nw;/delay {0.5}{/2 s;se;listen;l south;south;disarm;se;nwlk}}
/nop ÏÉÈË¶´ yhgz ÔÆº£¹ÂÖÛ
/al fy2lan+ {
    wlk;
    /ac {^ÔÆº£¹ÂÖÛ}{ne;nw;n;nu};
    /ac {^ÏÉÈË¶´}{fy2lan-}
}
/al fy2lan- {
    nwlk;
    /unac {^ÏÉÈË¶´};
    /unac {^ÔÆº£¹ÂÖÛ}
}
/al fy2lan {fy2xrd;fy2lan+}
/al lan2fy+ {
    wlk;
    /ac {^ÔÆº£¹ÂÖÛ}{lan2fy-;xrd2fy};
    /ac {^ÏÉÈË¶´}{sd;s;se;sw}
}
/al lan2fy- {
    nwlk;
    /unac {^ÔÆº£¹ÂÖÛ};
    /unac {^ÏÉÈË¶´}
}
/al lan2fy {lan2fy+;l}
/nop tgs Ëş¹«ËÂ
/al tgs2bc {pl {wlk;nu;n;e;ne;ne;ne;nd;e;e;n;n;w;w;w;w;nw;nwlk};pr}
/al bc2tgs {pl {wlk;se;e;e;e;e;s;s;w;w;su;sw;sw;sw;w;s;sd;nwlk};pr}
/nop jqin2 ÁÙÊ±µÄpath
/al jqin2 {wlk;d;/2 e;/2 n;e;/delay {0.5}{n;/5 e;n;/3 e;nwlk}}
/al jqout2 {wlk;/5 w;s;/5 w;/delay {0.5}{s;w;/2 s;/2 w;u;nwlk}}
/al jqin3 {wlk;d;e;e;s;e;s;/delay {0.5}{/7 e;s};de1 {s;/6 e};/delay {1.5}{s;e;s;e;e;n;e;s;e;nwlk}}
/al jqout3 {wlk;w;n;w;s;w;w;n;w;n;/delay {0.5}{/6 w;n};de1 {n;/7 w;};/delay {1.5}{n;w;n;w;w;u;nwlk}}
/ac {^Äã±ØĞëÏÈ°ÑÕ­ÃÅ´ò¿ª}{open door}
/al answerdm {;} 
/al lp {l picture}
/ac {^Ò»Öê¿İËÀµÄ¹Å°Ø£¬ÇûÌåÒÔË³Ê±Õë·½ÏòÅ¡Å¤ÅÌĞı¶øÉÏ}{/al answerdm {answer ÄşËÀ²»Çü};w;n;n;n;answerdm}
/ac {^Ì©É½ÉñÇ°¸æÎäÔòÌìÃğ×ÓÖ®×´£¬»¯Îª´Ë°Ø}{/al answerdm {answer ¹Â°ØÅûÖÒ};w;n;n;n;answerdm}
/ac {^Ò»¿Ã¹Å°ØÖ¦ÉíÅ¤½áÉÏËÊ£¬Èôò°Áúó´Ğı£¬ËäÈ»·ô°şĞÄ¿İ}{/al answerdm {answer ºº°ØÁèº®};w;n;n;n;answerdm}
/ac {^ğ®µÀÏÂÓĞÒ»¿Ã¹Å°Ø£¬ÉÏÓĞÒ»¿İÖ¦Ïò±±£¬ÍğÈçÕ¹³áÓû·ÉµÄÏÉº×}{/al answerdm {answer ÏÉº×Õ¹³á};w;n;n;n;answerdm}
/ac {^Ò»¿Ã¹Å°Ø£¬²Ô´äµÄÊ÷¹ÚÉÏ£¬´ØÓµ×ÅÃ¯ÃÜµÄÖ¦Ò¶}{/al answerdm {answer ÔÆÁĞÈıÌ¨};w;n;n;n;answerdm}
/ac {Ò»¿Ã²ÔÓôÍ¦°Î£¬Ö¦·±Ò¶Ã¯µÄºº°Ø£¬ÔÚËüµÄÖ÷¸ÉÓë²àÖ¦µÄ½»½Ó´¦Ö®ÉÏ³¤ÁËÒ»¸ö^}{/al answerdm {answer ¹ÒÓ¡·âºî};w;n;n;n;answerdm}
/ac {^Ò»¿Ã¹Å°ØÊ÷¸ÉÉÏÓÙ½áÁËÒ»¸öÇò×´°ÌÁö}{/al answerdm {answer ÷è÷ëÍûÔÂ};w;n;n;n;answerdm}
/ac {^Ò»¿ÃÌÆ»±£¬¸ß´óÃ¯Ê¢}{/al answerdm {answer ÌÆ»±±§×Ó};w;n;n;n;answerdm}
/al cx2hy {wlk;do n,nw,ne,nw,nw,ne,nw,nd;nwlk}
/al hy2cx {wlk;do su,ne,sw,se,se,sw,se,s;nwlk}
/nop sf Ê¯·å
/al cx2sf {wlk;do n,nw,ne,nw,nw,ne,nw,nd,n,nw,n;nwlk}
/al sf2sk {wlk;do s,s,s,e,e,e,e,e;nwlk}
/nop  tf2sk {wlk;do s,w,s,s,s,s,e,e,e,e,e;nwlk}
/nop lz2tf {wlk;do w,n,n,n,n,e,n;nwlk}
/nop  tf2lz {wlk;do s,w,s,s,s,e,n,w;nwlk}
/al  sf2lz {wlk;do s,s,e,n,w;nwlk}
/al lz2sf {wlk;do w,n,n,n;nwlk}
/nop  lz2gw {pl {wlk;w;w;w;w;w;w;w;w;w;w;w;w;w;s;e;nwlk};pr}
/al lz2sk {wlk;do w,n,n,n,s,s,s,e,e,e,e,e;nwlk}
/al cx2fy {cx2sf;de1 {sf2sk};de2 {sk2fy}}
/al gw2fy {gw2lz;de1 {lz2sk};de2 {sk2fy}}
/al lz2fy {lz2sk;de1 {sk2fy}}
/al gt {goto %0;de2 {%0;l}}
/al fyz {recall back}
