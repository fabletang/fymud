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
/nop #alias bat4 {open 屏风;s;#4 up}
/nop #alias bit5 {say 我来过，活过，爱过！}
/nop al batout {pl {open 屏风;s;u;u;u;u;answer no;e;sail};pr}
/al batout {do open 屏风,s,u,u,u,u,answer no,e,sail}
/al bat2chu {do open 屏风,s,u,u,u,u,answer no,e,sail}
/nop wang tian shou
/al batout1 {do open 屏风,s,u,u,u, u,answer no,e}
/al chu2white {ask master about island; bat2white+;de1 {keychain}}
/al bat2white {bat2chu;de2 {chu2white}}
/al white2dk {do sd,sd,sd,sd,sd,e,e,e,e}
/al dk2white {do w,w,w,w,nu,nu,nu,nu,nu}
/al dk2chu {batin;de2 {bat2chu}}
/al chu2fy {wlk;w;w;n;hb2fy}
/al dk2fy {batin;de1 bat2chu;de3 chu2fy}
/al white2fy {white2dk;de1 dk2fy}
/al chu2dk {ask master about island; chu2dk+;de1 {keychain}}
/nop dk 洞口
/al chu2dk+ {
/ac {^大海}{listen wave};
/ac {^海浪就象是一头头恶狼}{listen wave};
/ac {^突然间，你的船触礁了}{bat2dk-;/2 e}
}
/al chu2dk- {
/unac {^大海};
/unac {^海浪就象是一头头恶狼};
/unac {^突然间，你的船触礁了}
}
/al bat2white+ {
/ac {^大海}{listen wave};
/ac {^海浪就象是一头头恶狼}{listen wave};
/ac {^突然间，你的船触礁了}{bat2white-;do w,w,nu,nu,nu,nu}
}
/al bat2white- {
/unac {^大海};
/unac {^海浪就象是一头头恶狼};
/unac {^突然间，你的船触礁了}
}
/nop ac {^这个方向没有出路。}{look}
/ac {^风兵向你喝道：不可手持兵器} {unwield all}
/ac {^守备士兵向你喝道：不可手持兵器入城}{unwield all}
/nop al dqg2fy {wlk;wear all;open door;/3 eu;e;s;e;e;de1 {eu;e;e;s;wu;w;nu;wd};de2 {wd;wd;unwi all;/4 w};de3 {/7 w;u;nwlk}}
/al dqg2fy {yinbin2wy;de1 {wy2fy}}

/nop al fy2dqg {wlk;fy2xrd;de3 {xrd2dqg}}
/al fy2dqg {wlk;fy2wy;de3 {wy2yinbin}}
/nop yhgz 云海孤舟 
/al fy2yhgz {fye;de1 {do e,e,eu,eu,eu;nwlk}}
/al fy2wy {fye;de1 {pl {e;e;n;eu;eu;eu;sd;e;ed;n;w;nwlk};pr}}
/nop al wy2fy {wlk;pl {e;s;wu;w;nu;wd;wd;wd;w;w;};pr;de1 {fye-}}
/al wy2fy {wlk;pl {e;s;wu;w;nu;wd;wd;wd;w;w;fye-};pr}
/nop 仙人洞
/nop wy 危崖
/al xrd2wy {wlk;sd;e;ed;n;w;nwlk}
/al yhgz2wy {wlk;sd;e;ed;n;w;nwlk}
/al wy2yhgz {wlk;e;s;wu;w;nu;nwlk}
/al wy2xrd {wlk;e;s;wu;w;nu;nwlk}
/al wy2yinbin {wlk;w;wd;/2 w;n;w;/2 wd;open door;wd;nwlk}
/al yinbin2wy {wlk;eu;open door;eu;eu;e;s;e;e;eu;e;nwlk}
/al xrd2dqg {xrd2wy;de1 {wy2yinbin}}
/nop al fye2xrd {wlk;e;e;/3 eu;e;eu;nwlk}
/nop al fye2xrd {wlk;do e,e,eu,eu,eu,e,eu;nwlk}
/al fye2xrd+ {
    /ac {^奇石疏影}{n};
    /ac {^迷茫风雨路}{fye2xrd-}
}
/al fye2xrd- {
    /unac {^奇石疏影};
    /unac {^迷茫风雨路}
}
/nop al xrd2fye {wlk;wd;w;/3 wd;w;w;nwlk}
/nop al fy2xrd {fye;fye2xrd+;de2 {e;e;fye2xrd}}
/al fye2xrd {wlk;e;e;n;e;eu;eu;eu;ne;nw;n;nu;nwlk}
/al xrd2fye {wlk;sd;s;se;sw;wd;wd;wd;w;w;nwlk}
/al fy2xrd {fye;de1 {fye2xrd}}
/nop al xrd2fy {xrd2fye;de1 {fye-}}
/al xrd2fy {xrd2fye;de1 {fye-}}

/nop 灌木林
/nop al xrd2gml {xl2gml+;sd;ed;n}
/al xrd2gml {wlk;sd;e;ed;n;/4 e;/3 s;nwlk}
/al gml2xrd {wlk;/3 n;/4 w;s;wu;w;nu;nwlk}
/nop al fy2gml {fy2xrd;de3 {xrd2gml}}
/al fy2gml {fy2hb;de4 {s;s;s}}
/nop al gml2fy {gml2xrd;de1 {xrd2fy}}
/al gml2fy {w;w;n;hb2fy}
/nop gml2长春岛
/al gml2ccd {n;fy2ccd+;/delay {0.2}{l}}
/al fy2ccd {fy2gml;/delay {4.5}{gml2ccd}}
/al fy2ccd+ {
    wlk;
    /ac {^灌木林}{n};
    /ac {^碧蓝海边}{/ticker {pipe}{gb pipe;blow pipe;keychain}{4}};
    /ac {^常春岛渡口}{fy2ccd-;pp pipe};
    /ac {^老婆子说道：“上船吧！”}{/unticker {pipe};d};
    /ac {^老婆子说道：“到了，你们可以下船了。”}{u}
}

/al fy2ccd- {
    nwlk;
    /unac {^灌木林};
    /unac {^碧蓝海边};
    /unticker {pipe};
    /unac {^老婆子说道：“上船吧！”};
    /unac {^老婆子说道：“到了，你们可以下船了。”}
}
/al ccd2fy {ccd2fy+;/delay {0.2}{l}}
/al ccd2fy+ {
    wlk;
    /ac {^碧蓝海边}{s};
    /ac {^灌木林}{ccd2fy-;pp pipe;/delay {0.2}{gml2fy}};
    /ac {^常春岛渡口}{keychain;/ticker {pipe}{gb pipe;blow pipe}{4}};
    /ac {^老婆子说道：“上船吧！”}{/unticker {pipe};d};
    /ac {^老婆子说道：“到了，你们可以下船了。”}{u}
}

/al ccd2fy- {
    nwlk;
    put pipe in bag;
    /unac {^碧蓝海边};
    /unac {^灌木林};
    /unac {^常春岛渡口};
    /unticker {pipe};
    /unac {^老婆子说道：“上船吧！”};
    /unac {^老婆子说道：“到了，你们可以下船了。”}
}
/al ccdin+ {
    wlk;
    /ac {^常春岛渡口}{e;ne;se;eu;e;eu;};
    /ac {^长阶}{/delay {0.1}{eu}};
    /ac {^观月顶}{ccdin-}
}
/al ccdin- {
    nwlk;
    /unac {^常春岛渡口};
    /unac {^长阶};
    /unac {^观月顶}
}
/al ccdin {ccdin+;l}
/al ccdout+ {
    wlk;
    /ac {^常春岛渡口}{ccdout-};
    /ac {^长阶}{/delay {0.1}{wd}};
    /ac {^观月顶}{wd};
    /ac {^平台}{w;wd;nw;sw;w}
}
/al ccdout- {
    nwlk;
    /unac {^常春岛渡口};
    /unac {^长阶};
    /unac {^观月顶};
    /unac {^平台}
}
/al ccdout {ccdout+;l}
/nop 灌木林to蝙蝠岛
/nop ac batout {say 我来过，活过，爱过！}
/al fy2bat {fy2gml;de5 {gml2bat}}
/al fy2chu {fy2gml;de5 {wlk;dash bush;e;e;nwlk}}
/al gml2bat {bat+;l;dash bush;recover force}
/al bat+ {
    wlk;
    /ac {^灌木林}{wlk;dash bush};
    /ac {^  紫面煞神 魏行龙(Wei xing long)}{ask wei xing long about book;say fight wei xing long;e};
    /ac {^魏行龙无可奈何地从怀里掏出一本书递给你}{wlk;/delay {7.5}{e}};
    /ac {^  盗帅「妙绝天下」楚留香(Master chu)}{ask master about island;de2 {l}};
    /ac {^  「玉树临风」丁枫(Ding feng)}{keychain;give book to ding feng};
    /ac {^大海}{look wave};
    /ac {^海浪就象是一头头恶狼，唑咬着你的船！}{look wave};
    /ac {^人间地狱}{bat-;/2 e;de1 {cks}}
}
/al bat- {
    nwlk;
    /unac {^灌木林};
    /unac {^  紫面煞神 魏行龙(Wei xing long)};
    /unac {^魏行龙无可奈何地从怀里掏出一本书递给你};
    /unac {^  盗帅「妙绝天下」楚留香(Master chu)};
    /unac {^  「玉树临风」丁枫(Ding feng)};
    /unac {^大海};
    /unac {^海浪就象是一头头恶狼，唑咬着你的船！};
    /unac {^人间地狱}
}

/al xl2gml+ {
    wlk;
    /ac {^「小路」 -}{e};
    /ac {^「山中小路」 -}{e};
    /ac {^「平原路」 -}{e};
    /ac {^「海边路」 -}{e};
    /ac {^「灌木林」 -}{xl2gml-}
}
/al xl2gml- {
    nwlk;
    /unac {^「小路」 -};
    /unac {^「山中小路」 -};
    /unac {^「平原路」 -};
    /unac {^「海边路」 -};
    /unac {^「灌木林」 -}
}

/al gml2xl+ {
    wlk;
    /ac {^「小路」 -}{s};
    /ac {^「山中小路」 -}{w};
    /ac {^「平原路」 -}{w};
    /ac {^「海边路」 -}{w};
    /ac {^「谷内小径」 -}{gml2xl-}
}
/al gml2xl- {
    nwlk;
    /unac {^「小路」 -};
    /unac {^「山中小路」 -};
    /unac {^「平原路」 -};
    /unac {^「海边路」 -};
    /unac {^「谷内小径」 -}
}
/al dqgout {wlk;wear all;center;go cyan;open hua;s;nwlk}

/al dqgin {wlk;ask yin bin about man;remove all;de3 {ask zhu zao about 过阵;nwlk}}

/al fy2tuzi {fye;de1 {pl {e;e;n;e;e;e;eu;eu;eu;sd;e;ed;nwlk};pr}}
/nop al fy2tuzi {fye;de1 {do e,e,n,e,e,e,eu,eu,eu,sd,e,ed;nwlk}}
/al tuzi2fy {wlk;wu;w;nu;wd;wd;wd;unwi all;/4 w;de1 {/7 w;u;nwlk}}
/nopal tuzi2fy {wlk;do wu,w,nu,wd,wd,wd,unwield all,w,w;de1 {fye-;nwlk}}
/al tuzi2hb {wlk;n;/4 e;s;nwlk}
/al hb2tuzi {wlk;n;/4 w;s;wlk}
/nop al hb2tuzi {wlk;do s,s,s,s,s,n,n,n,w,w,w,w,s;wlk}
/al hb2fy {hb2tuzi;de1 {tuzi2fy}}
/al fy2hb {fy2tuzi;de3 {tuzi2hb}}
/al fy2longwang {fy2hb;de4 {wlk;do n,n,n,e,walkto bow,give man meat,enter;nwlk}}
/al fy2stj {fy2tuzi;de3 {tuzi2hb};de4 {n;n;n;w;open door;w;give romance to master}}
/al stj2fy {open door;e;e;s;s;s;de1 {hb2tuzi};de2 {tuzi2fy}}
/nop 海边-龙王
/al hb2lw {wlk;do n,n,n,n,n,e,walkto bow,give meat to man,enter;nwlk}
/al lw2hb {wlk;out;walkto 岸边;de8 {w;s;s;s;nwlk}}

/nop al fye2wxl {e;/3 eu;e;eu;ed;ed;n;}

/nop 镖局
/al fy2bj {wlk;d;/4 e;s;e;nwlk}
/al bj2fy {wlk;w;n;/4 w;u;nwlk}


/nop 无名镇


/al fy2wmz {wlk;d;/4 n;/delay {0.5}{nw;n;ne;n;n;e;e;nwlk}}
/al wmz2fy {wlk;w;w;s;s;sw;s;se;/delay {0.5}{/4 s;u;nwlk}}

/nop 千佛
/nop al fy2qf {wlk;d;/4 n;nw;de1 {n;ne;/4 n};de2 {n;/2 e;nwlk}}
/nop al qf2fy {wlk;/2 w;/3 s;de1 {unwi all;s;s;sw;s;se};de2 {/4 s;u;nwlk}}

/nop al fyn { wlk;do d,n,n,n,n,nw,n,ne,n,n;nwlk;}
/al fyn {pl {wlk;d;n;n;n;n;nw;n;ne;n;n;nwlk};pr}
/nop al fyn- {wlk;unwield all;do s,s,sw,s,se,s,s,s,s,u;nwlk}
/al fyn- {pl {wlk;unwield all;s;s;sw;s;se;s;s;s;s;u;nwlk};pr}
/nop al fys {wlk;do d,s,s,s,s,s,s,s,s;nwlk}
/al pfys {pl {wlk;d;s;s;s;s;s;s;s;s;nwlk}}
/nop al fys- {wlk;unwield all;do n,n,n,n,n,n,n,n,u;nwlk}
/al pfys- {pl {wlk;unwield all;n;n;n;n;n;n;n;n;u;nwlk}}
/al fys {pfys;pr}
/al fys- {pfys-;pr}
/al fye {pl {wlk;d;e;e;e;e;e;e;e;e;e;nwlk};pr}
/nop al fye {wlk;do d,e,e,e,e,e,e,e,e,e;nwlk;}
/al fye- {pl {wlk;unwield all;w;w;w;w;w;w;w;w;w;u;nwlk};pr}
/nop al fye- {wlk;unwield all;do w,w,w,w,w,w,w,w,w,u;nwlk}
/al fyw {wlk;do d,w,w,w,w,w,w,w,w;nwlk}
/al fyw {wlk;d;w;w;w;w;w;w;w;w;nwlk}
/al fyw- {wlk;unwield all;do e,e,e,e,e,e,e,e,u;nwlk}
/al fyw- {wlk;unwield all;e;e;e;e;e;e;e;e;u;nwlk}

/nop fyn {wlk;do d,n,n,n,n,nw,n,ne,n,n;nwlk;}
/nop  fy2qf {fyn;/delay {1.5}{fyn2qf}}
/al fy2qf {wlk;do d,n,n,n,n,nw,n,ne,n,n,n,n,n,e,e;nwlk}
/al fy2qf {wlk;d;n;n;n;n;nw;n;ne;n;n;n;n;n;e;e;nwlk}
/nop baihuagu
/al qf2bh {do e,e,s,around flower,w,westup,northup,climb up,ask laoren about 公子羽}
/al bhout {ask master about leave}
/al bh2qf {bhout;de4 {do southdown,eastdown,e,n,w,w}}
/nop fyn2qf {pl {wlk;n;n;n;e;e;nwlk};pr}
/al fyn2qf {wlk;do n,n,n,e,e;nwlk}
/al qf2fyn {pl {wlk;w;w;s;s;s;nwlk};pr}
/al qf2fy {unwield all;wlk;do w,w,s,s,s,s,s,sw,s,se,s,s,s,s,u;nwlk}
/al qf2fy {unwield all;wlk;w;w;s;s;s;s;s;sw;s;se;s;s;s;s;u;nwlk}
/nop al fy2qf {fyn;/delay {1.5}{/3 n;/2 e}}
/al fyn2qf+ {
    wlk;
    /ac {^风云城北}{n};
    /ac {^南北大道}{look east;/ac {^你要看什麽}{n};/ac {^阳关大道}{fyn2qf-;/delay {0.2}{e;e}}};
    /ac {^千佛山角}{fyn2qf-}
}
/al fyn2qf- {
    nwlk;
    /unac {^你要看什麽};
    /unac {^风云城北};
    /unac {^阳关大道};
    /unac {^南北大道};
    /unac {^千佛山角}
}

/nop  qf2fy {qf2fyn;de1 {fyn-}}
/al qf2fyn+ {

    wlk;
    /ac {^南北大道}{s};
    /ac {^风云城北}{;qf2fyn-;fyn-}
}
/al qf2fyn- {
    nwlk;
    /unac {^南北大道};
    /unac {^风云城北}
}

/nop 济南

/nop al fy2jn {wlk;fyn;de1 {walk 观川亭;}}
/al fy2jn {wlk;fy2qf;de2 {e;/3 s;nwlk}}
/al askhuwei {fy2jn;de3 {walk 问礼碑;ask yinxian about huwei}}
/nop al jn2fy {wlk;n;/3 w;/2 s;de1 {/3 s;sw;s;se};de2 {/4 s;u;nwlk}}
/al jn2fy {wlk;/3 n;w;de1 {qf2fy}}
/nop qf2master yin
/al qf2yin {e;/3 s;/delay {0.5}{su;sd;s;s;s};}
/al yin2qf {/3 n;nu;/delay {0.5}{nd;/3 n;w}}
/al fy2yin {fy2qf;de3 {qf2yin}}

/nop 兴国寺
/al qf2xg {wlk;e;eu;eu;nu;nwlk}
/al xg2qf {wlk;s;s;sd;wd;wd;w;nwlk}
/al fy2xg {fy2qf;de3 {qf2xg}}
/al xg2fy {xg2qf;de1 {qf2fy}}

/nop 清平山庄
/nop al qf2qp {wlk;do e,s,s,s,e,ne,ne,ne,e;nwlk}
/nop al qp2qf {wlk;do w,sw,sw,sw,w,n,n,n,w;nwlk}
/al qf2qp {pl {wlk;e;s;s;s;e;ne;ne;ne;e;nwlk};pr}
/al qp2qf {pl {wlk;w;sw;sw;sw;w;n;n;n;w;nwlk};pr}

/al fy2qp {fy2qf;de1 {qf2qp}}
/al qp2fy {qp2qf;de1 {qf2fy}}
/nop hm 后门
/al qp2hm {wlk;do e,e,e,e,e,e,e,eu,ed;nwlk}
/al hm2qp {wlk;do wu,wd,w,w,w,w,w,w,w;nwlk}
/al hm2ss {wlk;do push door,e,e,e,push stone,nu;nwlk}
/al ss2hm {wlk;do sd,push stone,w,w,w;nwlk}
/al fy2ss {fy2qp;de3 qp2hm;de4 hm2ss}
/al ss2ffy {ss2hm;de1 hm2qp;de2 qp2fy}

/nop 岱庙坊
/al qp2dm {pl {wlk;w;n;ne;ne;n;n;nwlk};pr}
/nop al qp2dm {wlk;do w,n,ne,ne,n,n;nwlk}
/al dm2qp {wlk;s;s;sw;sw;s;e;nwlk}
/al dm2ts {wlk;n;e;e;n;n;n;n;w;w;n;nu;nwlk}
/nop 岱庙in
/al dmin {walk 东配殿;de2 {l picture}}
/al ts2dm {wlk;sd;s;e;e;s;s;s;s;w;w;s;nwlk}
/al qp2ts {qp2dm;de1 {dm2ts}}
/al ts2qp {ts2dm;de1 {dm2qp}}
/nop al dm2qp {wlk;s;e;e;/4 s;de1 {w;w;/3 s;sw;sw;s;e;nwlk}}
/al fy2dm {fy2qp;de3 {qp2dm}}
/nop al fy2dm {fy2qf;de3 {wlk;e;/3 s;e;ne};de4 {/2 ne;n;/2 ne;/2 n;nwlk}}
/al dm2fy {wlk;dm2qp;de1 {qp2fy}}
/nop 泰山
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
    /ac {^红门宫}{/6 u;nu;eu;/2 u};
    /ac {^十八盘}{/delay {0.1}{u}};
    /ac {^南天门}{tsin-};
}
/al tsin- {
    nwlk;
    /unac {^红门宫};
    /unac {^十八盘};
    /unac {^南天门};
}
/al tsout {do d,d,d,d,d,d,d,d,d,d,d,d,d;wd;sd;/6 d}
/nop 老屋
/al fy2lw {fyn2lw+;fyn}
/al fyn2lw+ {
    wlk;
    /ac {^风云城北}{n};
    /ac {^南北大道}{n};
    /ac {^拉哈苏}{n;n;nw;e};
    /ac {^闹市}{fyn2lw-}
}
/al fyn2lw- {
    nwlk;
    /unac {^风云城北};
    /unac {^南北大道};
    /unac {^拉哈苏};
    /unac {^闹市}
}
/al lw2fy {pl {wlk;w;se;s;s;s;s;s;s;s;fyn-};pr}

/nop 三清
/al qf2sq {qf2sq+;/3 w;/2 wu;/delay {0.5}{/4 nu;climb up};de3 {climb up};de5 {/5 n;knock door}}
/al qf2sq+ {
    wlk;
    /ac {^吱的一声，门向里开了}{de2 {n;n;qf2sq-}};
    /ac {^三清宫大院}{/delay {0.5}{qf2sq-}};
    /ac {^上清殿}{qf2sq-};
    /ac {^门是开着的，敲什么}{de1 {n;n;qf2sq-}}
}
/al qf2sq- {
    nwlk;
    /unac {^吱的一声，门向里开了};
    /unac {^上清殿};
    /unac {^三清宫大院};
    /unac {^门是开着的，敲什么}
}
/al sq2qf {wlk;s;s;open door;pull door;/6 s;/delay {0.5}{climb down};de2 {climb down};de4 {/4 sd;ed;ed;e;e;nwlk}}
/al sq2fy {sq2qf;de6 {qf2fy}}
/al fy2sq {fy2qf;de3 {qf2sq}}

/nop 边城到二郎山
/al bc2els {wlk;se;/4 e;se;e;nwlk}
/al els2bc {wlk;w;nw;/4 w;nw;nwlk}
/nop 梅花庵
/al els2mha {wlk;do s,e,nu,nu,su,nu,wu,nu,wu;nwlk}
/al mha2els {wlk;do ed,sd,ed,sd,nd,sd,sd,w,n;nwlk}
/nop al fy2els {fy2bc;/delay {16}{bc2els}}
/nop al els2fy {els2bc;de1 {bc2fy}}
/al tp2els {wlk;ne;w;w;nw;w;n;nwlk}
/al tp2byz {wlk;ne;/2 w;nw;/2 nu;wu;/delay {0.5}{/2 wd;/2 w;n;nwlk}}
/al byz2tp {wlk;s;/2 e;/2 eu;/delay {0.5}{ed;/2 sd;se;/2 e;sw;nwlk}}
/al els2tp {wlk;s;e;se;e;e;sw;nwlk}
/al fy2els {fy2tp;de11 {tp2els}}
/al els2fy {els2tp;de1 {tp2fy}}
/nop 边城到白云庄
/al bc2byz {pl {wlk;se;e;e;e;e;se;e; e;nu;nu;wu;wd;wd;w;w;n;keychain;nwlk};pr}
/al byz2bc {pl {wlk;s;e; e;eu; eu;ed;sd;sd;w; w;nw;w;w;w;w;nw;nwlk};pr}
/al fy2byz {fy2tp;de10 {tp2byz}}
/al byz2fy {byz2tp;de2 {tp2fy}}
/nop 好汉庄
/al bc2hhz {w;/4 s;se;wade;de8 {su;/2 sw;/2 w}}
/al hhz2bc {/2 e;/2 ne;nd;wade;de8 {nw;/4 n;e}}
/nop 地狱谷
/al hhz2dyg {walk 地狱谷}
/nop bc2cuinong
/al bc2cuinong {walk 销金窟;de1 {open door;s;enter}} 
/nop 关外到二郎山
/al els2gw {els2tp;de1 {tp2gw}}
/al gw2els {gw2tp;de4 {tp2els}}

/nop 关外到白云庄
/al byz2gw {byz2bc;de3 {bc2gw}}
/al gw2byz {gw2bc;de6 {bc2byz}}

/nop 风云东
/nop 武当镇
/al fy2wdz {fy2wdz+;fye;de1 {do e,s,s,s;nwlk}}
/al fy2wdz {fy2wdz+;fye;de1 {e;s;s;s;nwlk}}
/al fy2wdz+ {
    /ac {^泥土路}{fy2wdz-};
    /ac {^奇石疏影}{n}
}
/al fy2wdz- {
    /unac {^泥土路};
    /unac {^奇石疏影}
}
/al wdz2fy {wlk;/3 n;w;de1 {fye-}}
/al fy2farmer {fy2wdz;de2 {/4 s;e;ask old farmer about 难题;nwlk}}
/nop 武当
/nop al fy2wd {fye;de1 {unwi all;/7 s};de2 {/2 s;/5 su;enter;nwlk}}
/al fy2wd {fy2wdz;de2 {unwi all;/5 s};de3 {/5 su;enter;nwlk}}
/al wd2fy {wlk;out;/5 nd;de1 {/5 n};de2 {wdz2fy}}
/al fy2wd2 {fy2wd;de4 {wlk;ne;s;s;s;s;su;su;su;su;nwlk}}
/nop old shandong
/al fy2shandong {fy2wdz;de2 {s;s;s;se;e;nwlk}}
/al shandong2fy {nwlk;w;nw;n;n;n;wdz2fy}
/al buyshaoji {fy2shandong;de3 {buy meat from shandong;shandong2fy}}
/nop 黑松山
/al fy2hss {wlk;fye;de1 {e;ne;/3 n;nwlk}}
/al hss2fy {wlk;/3 s;sw;w;de1 {fye-}}
/al hsb2fy {hsb2fy+;/delay {0.5}{l}}
/al hsb2fy+ {
    wlk;
    /ac {^西花园}{climb wall;};
    /ac {^你松开蔓藤}{de2 {look}};
    /ac {^黑松城堡的东侧}{w};
    /ac {^黑松城堡的西侧}{e};
    /ac {^黑松淳于} {down;w;w;d;w;d;s;};
    /ac {^山脚乡田}{hss2fy;hsb2fy-}
}
/al hsb2fy- {
    nwlk;
    /unac {^西花园};
    /unac {^你松开蔓藤};
    /unac {^黑松城堡的西侧};
    /unac {^黑松城堡的东侧};
    /unac {^黑松淳于};
    /unac {^山脚乡田}
}
/al fy2hsb {fy2hss;fy2hsb+;de2 {talk;/ticker {go}{north}{3}}}
/al fy2hsb+ {
    /ac {^山脚乡田}{talk;/ticker {hsb}{talk}{4}};
    /ac {^ 突然间！ 从北面}{/unticker {hsb};n};
    /ac {^黑松山脚}{/unticker {go};n;u;e;u;e;e;u;w;climb wall;fy2hsb-};
    /ac {^黑松城堡的西侧}{fy2hsb-}
}
/al fy2hsb- {
    nwlk;
    /unticker {go};
    /unticker {hsb};
    /unac {^山脚乡田};
    /unac {^ 突然间！ 从北面};
    /unac {^黑松山脚};
    /unac {^黑松城堡的西侧}
}

/nop 奈何桥
/nop al fy2nhq {wlk;d;/5 e;de1 {/7 e;n;fy2nhq+};de2 {/2 e;/3 eu;ne;e;e;}}
/al fy2nhq {fy2nhq+;fye;de1 {fye2nhq}}
/nop al fye2nhq {wlk;e;e;n;e;/delay {0.5}{/3 eu;ne;e};de1 {e;/4 s;nwlk}}
/al fye2nhq {pl {e;e;n;e;eu;eu;eu;ne;e};pr}
/nop al nhq2fye {wlk;/4 n;w;de1 {w;sw;/3 wd;w;w;nwlk}}
/al nhq2fy+ {
    fy2nhq-;
    wlk;
    /ac {^奈何桥}{/delay {0.5}{/4 n}};
    /ac {^岔路口}{/delay {0.5}{w}};
    /ac {^独木危桥}{w};
    /ac {^你脚下一滑，在独木桥}{de2 {west}};
    /ac {^山谷口}{sw};
    /ac {^云海孤舟}{nhq2fy-;wd;wd;wd;w;w;fye-;}
}
/al nhq2fy- {
    nwlk;
    /unac {^奈何桥};
    /unac {^岔路口};
    /unac {^独木危桥};
    /unac {^你脚下一滑，在独木桥};
    /unac {^山谷口};
    /unac {^云海孤舟}
}
/al nhq2fy {nhq2fy+;l}
/nop al nhq2fy {nhq2fye;de2 {fye-}}
/al fy2nhq+ {
    nhq2fy-
    wlk;
    /ac {^独木危桥}{
        east
    };
    /ac {^你脚下一滑，在独木桥}{de2 {east}};
    /ac {^岔路口}{pl {s;s;s;s};pr;fy2nhq-}
}
/al fy2nhq- {
    nwlk;
    /unac {^独木危桥};
    /unac {^你脚下一滑，在独木桥};
    /unac {^岔路口}
}
/nop 奈何桥到帝王谷
/al toucheren {touch 恶人像}
/al nhq2dw {nhq2dw+;l}
/al nhq2dw+ {
    wlk;
    /ac {^奈何桥} {fy2nhq-;/ticker {eren}{toucheren}{1};
        pl {s;east;east;east;east;east;east;down};pr;
        };
    /ac {^＂呀＂地一声}{pl {east;east;east;open door;east;east;east;};pr};
    /ac {^石壁上的门户又无声无息的合了起来}{toucheren};
    /ac {^谷地}{nhq2dw-;pl {s;s;s;w;w;w};pr;};
    /ac {^山阁}{nhq2dw-}
}
/al nhq2dw- {
    nwlk;
    /unticker {eren};
    /unac {^奈何桥};
    /unac {^＂呀＂地一声};
    /unac {^石壁上的门户又无声无息的合了起来};
    /unac {^谷地};
    /unac {^山阁}
}

/nop al dw2nhq {wlk;/3 e;/3 n;de1 {/3 west;open door;/3 west;u};de2 {/6 west;n;nwlk}}
/al dw2nhq+ {
    wlk;
    /ac {^山阁}{pl {e;e;e;n;n;n};pr;};
    /ac {^谷地}{/delay {0.5}{/3 w;open door;/3 w}};
    /ac {^坑底}{u};
    /ac {^坑道边}{/delay {0.5}{/6 w}};
    /ac {^鬼域}{dw2nhq-;/delay {0.2}{n;}}
}
/al dw2nhq- {
    nwlk;
    /unac {^山阁};
    /unac {^谷地};
    /unac {^坑底};
    /unac {^坑道边};
    /unac {^鬼域}
}
/al dw2nhq {dw2nhq+;l}
/al dw2fy {dw2nhq;nhq2fy+}
/nop al fy2dw {fy2nhq;de3 {nhq2dw}}
/al fy2dw {fy2nhq;nhq2dw+}

/nop 风云南n

/nop 白云
/al nh2by {pl {wlk;nh2by+;s;s;e;give 5 silver to zhanggui};pr}
/al fy2by {cx2fy-;by2fy-;fy2nh;de10 {nh2by}}
/al by2fy {by2fy+;by2nh;}
/al by2fy+ {
    wlk;
    /ac {^平原路}{nh2fy};
    /ac {^风云南城门}{by2fy-;nh2fy-}
}
/al by2fy- {
    nwlk;
    /unac {^平原路};
    /unac {^风云南城门}
}
/al byin {s;s;se;su;se;su;sw;su;enter}
/al byout {unwi all;out;nd;ne;nd;nw;nd;nw;n;n}
/al byin2 {/4 s;twist left}


/al nh2by+ {
    /ac {老掌柜说道：多谢这位}{pl {w;s;e;e;give qiyue to fox;d;/ticker {sail}{sail south}{4};sail south};pr};
    /ac {白云渡} {nh2by-;s}
}
/al nh2by- {
    nwlk;
    /unticker {sail};
    /unac {老掌柜说道：多谢这位};
    /unac {白云渡}
}

/al by2nh {by2nh+;n;yell}
/al by2nh+ {
    wlk;
    /ac {船家老伯跳上海岸}{d;sail north;/ticker {sail}{sail north}{4}};
    /ac {你拼命用力划了几下}{by2nh-;de2 {/2 w;/3 n}}
}
/al by2nh- {
    nwlk;
    /unticker {sail};
    /unac {船家老伯跳上海岸};
    /unac {你拼命用力划了几下}
}
/nop 莽林
/al ml2tree+ {
    /var swing_num 0;
    /ac {~[33m古树[2;37;0m}{climb tree};
    /ac {^你顺着树杆爬了上来}{/delay {0.1}{look}};
    /ac {^听着耳边的呼呼}{
        /math swing_num {$swing_num+1}
    }
}
/al ml2tree- {
    /var swing_num 0;
    /unac {~[33m古树[2;37;0m};
    /unac {^你顺着树杆爬了上来};
    /unac {^听着耳边的呼呼}
}

/al fy2ml {pl {wlk;d;s;s;s;s;s;s;s;s;s;s;s;s;s;s;climb tree;nwlk;};pr}
/al ml2fy {ml2fy+;l}
/al ml2fy+ {
    wlk;
    ml2tree+;
    /ac {^古树顶}{/delay {0.3}{swing north}};
    /ac {^莽林边缘}{ml2fy-;pl {n;n;n;n;fys-};pr}
}
/al ml2fy- {
    nwlk;
    ml2tree-;
    /unac {^古树顶};
    /unac {^莽林边缘}
}
/al ml2cx {ml2cx+;l}
/al ml2cx+ {
    wlk;
    ml2tree+;
    /ac {^古树顶}{/delay {0.3}{swing west}};
    /ac {^莽林边缘}{ml2cx-;w;w;w;w;}
}
/al ml2cx- {
    nwlk;
    ml2tree-;
    /unac {^古树顶};
    /unac {^莽林边缘}
}

/al ml2wm {ml2wm+;l}
/al ml2wm+ {
    wlk;
    ml2tree+;
    /ac {^古树顶}{swing east};
    /ac {^莽林边缘}{/4 e;ml2wm-};
    /ac {^风铃梅枝门}{ml2wm-}
}
/al ml2wm- {
    nwlk;
    ml2tree-;
    /unac {^古树顶};
    /unac {^莽林边缘};
    /unac {^风铃梅枝门}
}


/nop al fy2zt {fy2zt+;d;/3 n;w;de1 {w;n;w;w;open door;w;jump}}
/nop al fy2zt {fy2zt+;do d,s,s,s,w,w,sw,w;wlk;buy_white_towel}
/al fy2zt {fy2zt+;pl {d;s;s;s;w;w;sw;w;buy_white_towel};pr;wlk}

/nop al zt2fy {open door;/2 e;s;e;e;de1 {wear baojia;wear all;remove shouhuan;/3 s;u}}
/al zt2fy {pl {wlk;open door;s;s;s;s;dd white towel;wear all;e;ne;e;e;n;n;n;u;fy2zt-};pr}
/al buy_white_towel {buy white towel from little yahuan;remove all;wear white towel}
/al fy2zt- {
    nwlk;
    /unac {^楚楚向你笑道：没有白毛巾怎么洗};
    /unac {^你的钱不够};
    /unac {^你向小丫环买下一条白毛巾};
    /unac {你感到全身无比的舒泰};
    /unac {^你从枫叶泉里一跃而起}
}

/al fy2zt+ {
    wlk;
    /ac {^楚楚向你笑道：没有白毛巾怎么洗}{/3 s;buy_white_towel};
    /ac {^你的钱不够}{fy2zt-};
    /ac {^你向小丫环买下一条白毛巾}{remove all;wear white towel;/3 n;open door;n;jump;wear all};
    /ac {你感到全身无比的舒泰} {wlk;jump};
    /ac {^你从枫叶泉里一跃而起} {/2 dd leaf;zt2fy;fy2zt-;nwlk}
}

/al fy2ztv {wlk;fy2ztv+;d;/3 s;wlk;w;w;sw;de1 {s;s;w;buy white towel from kid}}
/nop al fy2ztv {fy2ztv+;d;/3 n;e;de1 {e;n;east;east;open door;east;wash}}
/nop al zt2fyv {open door;/2 w;s;w;w;de1 {wear baojia;wear all;remove shouhuan;/3 s;u}}
/al ztv2fy {wlk;open door;/4 n;de1 {wear baojia;wear all;e;n;n;ne;e;e;/3 n;u;fy2ztv-}}
/al fy2ztv- {
    nwlk;
    /unac {^金童向你笑道：没有白毛巾怎么洗};
    /unac {^你的钱不够};
    /unac {^你向小童买下一条白毛巾};
    /unac {你感到全身无比的舒泰};
    /unac {^你懒懒地从枫叶泉里站起身}
}
/al fy2ztv+  {
    wlk;
    /ac {^金童向你笑道：没有白毛巾怎么洗}{/3 n;buy white towel from kid};
    /ac {^你的钱不够}{fy2ztv-};
    /ac {^你向小童买下一条白毛巾}{remove all;wear white towel;/3 s;open door;s;wash;wear all};
    /ac {你感到全身无比的舒泰} {wlk;wash};
    /ac {^你懒懒地从枫叶泉里站起身来} {dd leaf;ztv2fy;fy2ztv-;nwlk}
}

/nop 沉香镇
/nop fy2cx {cx2fy-;fy2ml;fy2cx+}
/nop al fy2cx {cx2fy-;fy2ml;/delay {5.5}{swing west;swing west};/delay {6}{w;w;w;w;nwlk}}
/al fy2cx {fy2ml;/delay {6}{/showme --swing;swing west};/delay {6.5}{swing west};de7 {w;w;w;w;nwlk}}
/al fy2cx+ {
    wlk;
    /ac {^你抓着突出的树}{ml2cx+;};
    /ac {^镇东首}{fy2cx-}
}
/al fy2cx- {
    nwlk;
    ml2cx-;
    /unac {^你抓着突出的树};
    /unac {^镇东首}
}
/nop 沉香to风云
/nop cx2fy {cx2sf;de1 {sf2sk};de2 {sk2fy}}
/al cx2fy {fy2cx-;cx2fy+;l;}
/al cx2ml {pl {e;e;e;e;e;e;climb tree};pr}
/al cx2fy {wlk;cx2ml;de6 {swing north};/delay {6.5{swing north;/4 n;fys-;nwlk}}
/al cx2fy+ {
    wlk;
    /ac {^老城广场}{/delay {0.2}{/6 e;climb tree}};
    /ac {^你抓着突出的树}{ml2fy+};
    /ac {^风云天下}{cx2fy-}
}
/al cx2fy- {
    nwlk;
    ml2fy-;
    /unac {^老城广场};
    /unac {^你抓着突出的树};
    /unac {^风云天下}
}
/nop 万梅
/nop al fy2wm {wlk;d;/7 s;de1 {/7 s;fy2wm+;climb tree}}
/al fy2wm {fy2ml;de3 {ml2wm};de10 {ml2wm-}}
/al wm2fy {wlk;/6 w;climb tree;de3 {ml2fy}}
/al wm2hhd {/6 e;swim}

/nop 南海
/al fy2nh {cx2fy-;wlk;d;/7 s;de1 {/7 s;fy2nh+;climb tree}}
/al fy2nh+ {
    /ac {^你顺着树杆爬了上来} {/ac {^莽林边缘}{su;s;fy2nh-};swing south;de2 {swing south}};
}
/al fy2nh- {
    nwlk;
    /unac {^你顺着树杆爬了上来};
    /unac {^莽林边缘}
}


/nop al nh2fy {nh2ml;/delay {0.5}{ml2fy}}
/al nh2fy {nh2ml;de1 {ml2fy}}
/al nh2ml {wlk;n;nd;n;n;nwlk}
/al nh2fy+ {
    /unac {莽林边缘};
    /ac {^你顺着树杆爬了上来} {
    /ac {莽林边缘}{n;n;n;n;de1 {fys-;nh2fy-;by2fy-}};
    swing north;de3 {swing north}
    };
    /ac {^风云天下} {nh2fy-}
}
/al nh2fy- {
    nwlk;
    /unac {^你顺着树杆爬了上来};
    /unac {莽林边缘};
    /unac {^风云天下}
}

/nop 棺材店
/al dxcin {push coffin}
/al dxcout {climb bag}
/al fy2dxc+ {
    wlk;
    /ac {^安生店伙计似不经意地拦}{ki huo ji};
    /ac {^安生店伙计死了}{dxcin;fy2dxc-}
}
/al fy2dxc- {
    nwlk;
    /unac {^安生店伙计似不经意地拦};
    /unac {^安生店伙计死了}
}
/al fy2dxc {fy2dxc+;pl {d;e;e;e;e;e;e;n;n;n;n;e;dxcin;nwlk};pr}
/al fy2dxc2 {wlk;fyn;de1 {l grass;stamp grass;nwlk}}
/al dxcout2 {l ring;pull ring}
/al dxc2fy {wlk;dxcout;de1 {w;/4 s;/6 w;u;nwlk}}
/al dxc2fy2 {wlk;dxcout2;de1 {sw;sw;s;fyw-}}
/al fy2dxc2 {wlk;fyn;/delay {1.5}{w;l grass;stamp grass};nwlk;}
/nop 千金楼
/al qjl2fy {wlk;e;ne;se;ne;/3 e;n;ne;/2 e;/3 n;u;nwlk}
/nop al qj2fy {wlk;do s,s,s,e,ne,se,ne,e,e,e,n,ne,e,e;n;n;n;u;nwlk}
/al qj2fy {pl {wlk;s;s;s;e;ne;se;ne;e;e;e;n;ne;e;e;n;n;n;u;nwlk};pr}
/al fy2qj {wlk;fy2wm;de7 {e;keychain;wm2hhd}}
/nop 沉香到华山
/nop al cx2hs {wlk;do n,nw,ne,nw,nw,ne,nd,nw,w,w,s,s,s,su;wu;wu;nwlk}
/al cx2hs {pl {wlk;n;nw;ne;nw;nw;ne;nd;nw;w;w;s;s;s;su;wu;wu;nwlk};pr}
/nop al hs2cx {wlk;do ed,ed,nd,n,n,n,e,e,se,su,sw,se,se,sw;se;s;nwlk}
/al hs2cx {pl {wlk;ed;ed;nd;n;n;n;e;e;se;su;sw;se;se;sw;se;s;nwlk};pr}

/nop 风云到华山
/al fy2hs {fy2cx;de7 cx2hs}
/al fy2hs {fy2cx;de6 cx2hs}
/nop al hs2fy {hs2cx;de2 {cx2fy}}
/al hs2fy {hs2cx;cx2fy+}
/al hs2hua {pl {wlk;wu;wu;wu;se;sw;se;sw;e;su;su;eu;su;slide rock;nwlk};pr}
/al maonv2hua {nd;sw;se;sw;e;su;su;eu;su;apprentice hua zhenzhen;slide rock}
/al hua2hs {pl {wlk;nd;slide rock;nd;wd;nd;nd;w;ne;nw;ne;nw;ed;ed;ed;nwlk};pr}
/al hsout {wlk;do s,ed,ne,nu,nw,wd,wu,wd,nd,nd,w,ne,nw,ne;nw;ed;nwlk}
/al hsin  {wlk;do wu,se,sw,se,sw,e,su,su,eu,ed,eu,se,sd,sw,wu;n;nwlk}
/nop 嵩山
/al fy2sl {fyw;de1 {wlk;do w,nw,ne,nw,nu,nu,nu;nwlk}}
/al fy2sl {fyw;de1 {pl {wlk;w;nw;ne;nw;nu;nu;nu;nwlk};pr}}
/al sl2fy {wlk;do d,sd,sd,sd,se,sw,se,e;de1 {fyw-}}
/al sl2fy {wlk;d;sd;sd;sd;se;sw;se;e;de1 {fyw-}}
/nop sl 方丈南院
/al sl2fz {wlk;do eu,nw,n,n,n,nu,ask master yuan about 见方丈,answer 重要事,answer 经书被盗,nd,nu,nd;nwlk}
/al fz2sl {wlk;do su,sd,su,sd,s,s,s,se,wd;nwlk}
/al fy2fz {fy2sl;de2 sl2fz}
/al sl2nm {sl2fz;do nu,nu,nu,nd}
/al fy2nm {fy2sl;de2 sl2nm}
/al nm2sl {wlk;do su,sd,sd,sd;fz2sl}
/al fz2xie {wlk;do nu,nu,nu,nd,n,n,n,nu,n,n,n,ne,nw,w,w;nwlk}
/al xie2fz {wlk;do e,e,se,sw,s,s,s,sd,s,s,s,su,sd,sd,sd;nwlk}
/al sl2xie {sl2fz;de1 fz2xie}
/al xie2sl {xie2fz;de1 fz2sl}
/al fy2xie {fy2sl;de2 sl2xie}
/al xie2fy {xie2sl;de2 sl2fy}
/al slout {wlk;/5 {do s,su,sd,d;};nwlk}
/al jianfangzhang {pl {wlk;ask master about 见方丈;answer 重要事;nd;nu;nd;nu;sd;nwlk};pr}
/al fy2yetu {fyw;de1 {pl {wlk;w;nw;ne;e;ne;e;sw;s;nwlk};pr}}
/al yetu2fy {pl {wlk;nu;n;ne;w;sw;w;sw;se;e;fyw-};pr}
/nop slhm 少林后门
/al fy2slhm {fyw;de1 {w;nw;ne;e;ne;e;sw;e;nwlk}}
/al slhm2fy {wlk;w;ne;w;sw;w;sw;se;e;de1 {fyw-}}
/nop 风云西
/nop 富贵山庄
/al fyw2fg {wlk;do w,w,w,n,n,n,n,n,ne,n,e,n,n;nwlk}
/al fyw2fg {wlk;w;w;w;n;n;n;n;n;ne;n;e;n;n;nwlk}
/al fy2fg {fyw;de1 {fyw2fg}}
/al fg2fyw {wlk;do s,s,s,w,s,sw,s,s,s,s,s,e,e,e;nwlk}
/al fg2fyw {wlk;s;s;s;w;s;sw;s;s;s;s;s;e;e;e;nwlk}
/al fg2fy {fg2fyw;de1 {fyw-}}
/al fg2guo {pl {wlk;n;n;n;n;w;nw;nw;sw;nw;sw;nw};pr}
/al guo2fg {pl {wlk;se;ne;se;ne;se;se;e;s;s;s;s};pr}
/al fy2guo {fy2fg;de2 {fg2guo}}
/al guo2fy {guo2fg;de1 {fg2fy}}
/al fgin {wlk;do n,n,n,n,jie gaoshi,drop yaopai,nu,wu,nu,nu,wu,nu,ne,nu,nu;enter;nwlk}
/al fgout {wlk;do out,sd,sd,sw,sd,ed,sd,sd,ed,sd,s,s,s,s;nwlk}
/al fy2fg1 {fy2fg;de3 {fgin}}
/al fg12fy {fgout;de2 {fg2fy}}

/nop 红娘子
/al fg2hong {fg2hong+;/al fg2hong_do {w;look};do n,n,n,n,nu,wu,nu,nu,wu,nu,w;look;}
/al fg2hong+ {
    wlk;
    /ac {不出名字的黄色野花}{w;look};
    /ac {不出名字的绿色野花}{w;look};
    /ac {不出名字的红色野花}{w;look};
    /ac {不出名字的蓝色野花}{w;look};
    /ac {不出名字的白色野花}{/al fg2hong_do {do e,s,w,s,w};/ticker {migong}{fg2hong_do}{2}};
    /ac {^  稻草人(Daocao ren)}{/al fg2hong_do {l};pushaside grass;w;northwest;southwest;keychain;east;tear paper;de2 {/ticker {migong}{;};}}{4};
    /nop ac {^  稻草人(Daocao ren)}{/al fg2hong_do {l};pushaside grass;w;northwest;southwest;keychain;east;tear paper;de2 {/unticker {migong}}}{4};
    /ac {稻草人摇摇摆摆着倒了下去，露出一条小路}{/ticker {migong}{;};fg2hong-;de8 {east;hp}};
    /ac {纸条已经被人撕走了。}{/ticker {tear}{tear paper}{5};};
    /ac {有人已经在撕纸条了。}{/ticker {tear}{tear paper}{5};};
    /ac {^荒坟}{fg2hong-};
    /ac {^你不可以拨开grass}{l daocao ren};
    /ac {^了一个纸条子(paper)}{/ticker {migong}{;};tear paper}
}
/al fg2hong- {
    nwlk;
    drop paper;
    set brief3 1;
    /unticker {tear};
    /unticker {migong};
    /al fg2hong_do {;};
    /unac {不出名字的黄色野花};
    /unac {不出名字的绿色野花};
    /unac {不出名字的红色野花};
    /unac {不出名字的蓝色野花};
    /unac {不出名字的白色野花};
    /unac {^  稻草人(Daocao ren)};
    /unac {稻草人摇摇摆摆着倒了下去，露出一条小路};
    /unac {纸条已经被人撕走了。};
    /unac {有人已经在撕纸条了。};
    /unac {^你不可以拨开grass};
    /unac {^了一个纸条子(paper)};
    /unac {^荒坟}
}


/al hong2fg {wlk;fg2hong-;do e,e,e,e,leave,sd,ed,sd,sd,ed,sd,s,s,s,s;nwlk}
/al hong2fy {hong2fg;de2 {fg2fy}}

/nop 黄山迎客松
/al cx2yks {pl {wlk;s;w;wu;wu;wd;wu;n;wu;nw;ne;nu;wd;s;se;nwlk};pr}
/nop al cx2yks {wlk;do s,w,wu,wu,wd,wu,n,wu,nw,ne,nu,wd,s,se;nwlk}
/al yks2cx {pl {wlk;nw;n;eu;sd;sw;se;ed;s;ed;eu;ed;ed;e;n;nwlk};pr}
/nop al fy2yks {fy2cx;de7 {cx2yks}}
/al fy2yks {fy2cx;de8 {cx2yks}}
/al yks2fy {yks2cx;cx2fy+}
/nop monk 洗少林匪 10 silver/次
/al yks2monk {sw;w;wd;sw}
/al monk2yks {ne;eu;e;ne}
/al cx2monk {cx2yks;de1 {yks2monk}}
/al monk2cx {monk2yks;de1 {yks2cx}}
/al fy2monk {fy2yks;de8 {yks2monk}}
/al gmonk {give 10 silver to monk}
/al monk2fy {monk2yks;de1 {yks2fy}}
/al ggmonk {fy2monk;de9 {gmonk};de10 {monk2fy}} 
/al cx2rzp {wlk;s;w;/2 wu;wd;s;nwlk}
/al rzp2cx {wlk;n;eu;/2 ed;e;n;nwlk}
/nop sga 松谷庵
/al yks2sga {wlk;sw;w;wd;n;w;nwlk}
/al sga2yks {wlk;e;s;eu;e;ne;nwlk}
/al fy2sga {fy2yks;de8 {yks2sga}}
/al sga2fy {sga2yks;de1 {yks2fy}}

/nop 八识神通
/nop ff {conjure team_drift}
/al fff {fff+;fdf}
/al fff+ {
/ac {^你的周围一片寂静}{de10 {df2fy}};
/ac {^风坛}{fff-}
}
/al fff- {
/unac {^你的周围一片寂静};
/unac {^风坛}
}
/al fbat {ff;master yuan suiyun}
/al ffy {ffy+;ff;huang mazi}
/al ffy+ {
wlk;
/nop ac{^银钩赌坊大厅}{de4 {tf};de8 {pl {n;n;e;e;e;e;u};pr}};
/ac {^银钩赌坊大厅}{de4 {tf};de8 {do n,n,e,e,e,e,u;}};
/ac {^风坛}{ffy-}
}
/al ffy- {
/unac {^银钩赌坊大厅};
/unac {^风坛}
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
    /ac {^鹰记商号}{de4 {tf};de8 {w;/3 s;e}};
    /ac {^迎梅客栈}{fgw-}
}
/al fgw- {
    /unac {^鹰记商号};
    /unac {^迎梅客栈}
}
/nop 地府max
/al fyw2max {pl {wlk;w;w;w;w;w;w;w;s;nwlk};pr}
/al max2fyw {pl {wlk;n;e;e;e;e;e;e;e;nwlk};pr}
/al fy2max {fyw;de1 {fyw2max}}
/al max2fy {max2fyw;de1 {fyw-}}
/nop 判官to max e,e
/al df2fy {e;e;max2fy}
/al dfin+ {
    wlk;
    /ac {^焦都驿}{dash};
    /ac {^储藏室}{n;s};
    /ac {^奈何桥}{w;drop pumpkin;dfin-}
}
/al dfin- {
    nwlk;
    /unac {^焦都驿};
    /unac {^储藏室};
    /unac {^奈何桥}
}
/al dfin {buy pumpkin from max;eat pumpkin;de3 {dfin+;dash}}
/al fy2df {fy2max;de2 {dfin}}
/nop al dfout {su;sd;s;/5 d;/delay {0.5}{/8 d};/delay {1.5}{/6 d;ne}}
/al dfout {do su,sd,s,s,d,d,d,d,d,d,d,d;de1 {do d,d,d,d,d,d,d,d,d,d,d,ne}}
/ac {^你所受到的地域幽魂的效用消失了}{
    /ac {^孟婆亭}{sw;s;dash mist};
    look;
    }
/ac {^你狠了狠心，一头闯进了迷雾之中}{
    /unac {^你所受到的地域幽魂的效用消失了};
    /unac {^孟婆亭}
}
/nop 风云到关外

/al lz2gw {pl {wlk;w;w;w;w;w;w;w;w;w;w;w;w;w;s;e;nwlk};pr}
/nop  gw2lz {pl {wlk;wi jade;w;n;e;e;e;e;e;e;e;e;e;e;e;e;e;nwlk};pr}
/nop al gw2lz {wlk;unwield all;wield jade;do w,n,e,e,e,e,e,e,e,e,e,e,e,e,e;nwlk}
/al gw2lz {wlk;unwield all;wield jade;w;n;e;e;e;e;e;e;e;e;e;e;e;e;e;nwlk}
/al gw2cx {pl {gw2sj;wi jade;sj2cx};pr}
/nop al sj2cx {pl {wlk;e;e;s;s;su;sw;se;se;sw;se;s;nwlk};pr}
/nop al sj2cx {pl {wlk;do e,e,s,s,su,sw,se,se,sw,se,s;nwlk};pr}
/al sj2cx {pl {wlk;e;e;s;s;su;sw;se;se;sw;se;s;nwlk};pr}
/nop al gw2cx {gw2lz;de2 {lz2cx}}
/nop 沉香到绿洲
/al lz2cx {pl {wlk;w;s;s;su;sw;se;se;sw;se;s;nwlk};pr}
/nop al lz2cx {pl {wlk;do w,s,s,su,sw,se,se,sw,se,s;nwlk};pr}
/al cx2gw {cx2sj;de2 {sj2gw}}
/al cx2gw {pl {cx2sj;sj2gw};pr}
/nop 关外 山脚
/nop al cx2sj {wlk;n;nw;northeast;nw;nw;northeast;n;nd;/delay {0.5}{n;nw;nw;w;w;w;/3 w};}
/nop al cx2sj {pl {wlk;n;nw;northeast;nw;nw;northeast;n;nd;n;nw;e;w;w;w;w;nwlk};pr}
/nop al cx2sj {wlk;n;nw;do northeast,nw,nw,northeast,n,nd,n,nw,e,w,w,w,w;nwlk}
/al cx2sj {wlk;n;nw;northeast;nw;nw;northeast;n;nd;n;nw;e;w;w;w;w;nwlk}
/al cx2lz {pl {wlk;n;e;e;nw;ne;nw;nw;ne;n;nd;n;nw;nw;w;w;w};pr}
/nop al cx2lz {wlk;n;e;do e,nw,ne,nw,nw,ne,n,nd,n,nw,nw,w,w,w;}
/nop al gw2sj {wlk;do w,n,e,e,e,e,e,e,e,e,e,e;nwlk}
/al gw2sj {wlk;w;n;e;e;e;e;e;e;e;e;e;e;nwlk}
/nop al sj2gw {wlk;do w,w,w,w,w,w,w,w,w,w,s,e;nwlk}
/al sj2gw {pl {wlk;w;w;w;w;w;w;w;w;w;w;s;e;nwlk};pr}

/nop 关外到太平镇
/nop al lz2tp {wlk;do n,ne,nw,w,nw,nw,nw,sw;nwlk}
/al lz2tp {pl {wlk;n;ne;nw;w;nw;nw;nw;sw;nwlk};pr}
/nop al tp2lz {wlk;do wield jade,ne,se,se,se,e,se,sw,s;nwlk}
/al tp2lz {wlk;pl {wield jade;ne;se;se;se;e;se;sw;s;nwlk};pr}
/al gw2tp {gw2lz;de2 {lz2tp}}
/al tp2gw {tp2lz;de2 {lz2gw}}
/al tp2fy {tp2lz;de2 {lz2fy}}
/al cx2tp {pl {n;e;e;nw;ne;nw;nw;ne;n;nd;n;nw;nw;w;w;w;lz2tp};pr}
/al fy2tp {fy2lz;de9 {lz2tp}}
/al fy2tp {fy2cx;de8 {cx2tp}}
/nop 怡红小院
/al yhy2tp {pl {wlk;pull door;e;e;e;e;e;n;n;n;ne;ne;nwlk};pr}
/al tp2yhy {tp2yhy+;sw;sw;s;s;s;w;w;w;w;knock red door}
/al tp2yhy+ {
    wlk;
    /ac {^门是开着的}{w};
    /ac {^吱的一声，红门}{de3 {w}};
    /ac {^怡红小院}{tp2yhy-}
}
/al tp2yhy- {
    nwlk;
    /unac {^门是开着的};
    /unac {^吱的一声，红门};
    /unac {^怡红小院}
}
/al fy2yhy {fy2tp;de11 {tp2yhy}}
/al yhy2fy {yhy2tp;de2 {tp2fy}}
/nop 鬼子
/al tp2guizi {pl {wlk;sw;sw;s;s;s;w;w;w;w;push black door;s;s;nwlk};pr}
/al guizi2tp {pl {wlk;n;n;pull door;n;e;e;e;e;n;n;n;ne;ne;nwlk};pr}
/al guizi2fy {guizi2tp;de2 {tp2fy}}
/al fy2guizi {fy2tp;de10 {tp2guizi}}
/nop mha梅花庵
/al tp2mha {pl {wlk;ne;w;w;w;nw;nu;nu;su;nu;wu;nu;wu;nwlk};pr}
/al mha2tp {pl {wlk;ed;sd;ed;sd;nd;sd;sd;se;e;e;sw;nwlk};pr}
/nop 关外到恶人谷 山村口 -
/al lz2er {lz2tp;de2 {tp2er}}
/al er2lz {er2tp;de2 {tp2lz}}
/al tp2er {pl {wlk;ne;w;w;nw;nu;nu;su;nu;l rock;northdown;nd;nd;e;nwlk};pr}
/al er2tp {pl {wlk;w;su;su;southup;l rock;sd;nd;sd;sd;se;e;e;sw;nwlk};pr}
/nop wan
/al er2wan {walk 回春阁}

/al gw2er {gw2tp;de3 {tp2er}}
/al er2gw {er2tp;de3 {tp2gw}}
/al fy2er {fy2lz;de8 {lz2er}}
/al er2fy {er2lz;de4 {lz2fy}}
/nop 关外到边城
/al gw2bc {gw2lz;de2 {lz2bc}}

/al lz2bc {pl {wlk;n;ne;nw;w;nw;nw;nw;w;w;nw;w;w;nw;w;w;w;w;nw;nwlk;keychain};pr}
/nop al lz2bc {wlk;do n,ne,nw,w,nw,nw,nw,w,w,nw,w,w,nw,w;keychain;w;w;w;w;nw;nwlk;}

/al bc2gw {bc2lz;de3 {lz2gw}}

/al bc2lz {pl {wlk;wi jade;se;e;e;e;e;se;e;e;se;e;e;se;se;se;e;se;sw;s;nwlk};pr}
/nop al bc2lz {pl {wlk;wi jade;se;e;e;e;do e,se,e,e,se,e,e,se,se,se,e,se,sw,s;nwlk};pr}
/al fy2bc {fy2lz;de9 {lz2bc}}
/al bc2fy {bc2lz;de3 {lz2fy}}
/nop 藏藏北快活林
/al bc2khl {pl {wlk;se;e;e;e;e;s;s;w;w;su;sw;sw;sw;sd;nwlk};pr}
/al khl2bc {pl {wlk;w;w;w;nu;ne;ne;ne;nd;e;e;n;n;w;w;w;w;nw;nwlk};pr}
/nop 小屋
/al bc2xw {walk 林间空地;de2 {do open door,s}}
/nop 关外到乌拉泊
/al gw2wlb {gw2lz;de2 {lz2wlb}}
/al wlb2gw {wlb2lz;de3 {lz2gw}}
/nop xie changqing 
/al wlbin {wlk;do unwield all,n,nw,ne,n,n,nu,u,;nwlk}
/al wlbout {wlk;do d,sd,s,s,sw,se,s;nwlk}
/al lz2wlb {pl {wlk;w;w;w;nw;nw;ne;nw;nw;nw;nw;wd;wu;wd;wu;nw;nw;w;w;n;unwi all;nwlk};pr}
/nop al lz2wlb {pl {wlk;do w,w,w,nw,nw,ne,nw,nw,nw,nw,wd,wu,wd,wu,nw;nw;w;w;n;unwi all;nwlk};pr}
/al wlb2lz {pl {wlk;s;e;e;se;se;ed;eu;ed;eu;se;se;se;se;sw;se;se;e;e;e;nwlk};pr}
/al wlb2cx {pl {wlk;s;e;e;se;se;ed;eu;ed;eu;se;se;se;se;sw;se;se;e;e;e;lz2cx};pr}
/al wlb2bc {wlb2lz;de2 {lz2bc}}
/al bc2wlb {bc2lz;de2 {lz2wlb}}
/nop al wlb2fy {wlb2lz;de3 {lz2fy}}
/al wlb2fy {wlb2cx;de4 {cx2fy}}
/nop lz2fy {lz2cx;cx2fy+}
/nop al lz2fy {lz2sk;de1 {sk2fy}}
/nop al fy2lz {fy2cx;cx2lz+}
/al fy2lz {fy2cx;de8 {cx2lz}}
/al cx2lz+ {
    wlk;
    /ac {^老城广场}{cx2lz};
    /ac {^大漠风沙}{cx2lz-}
}
/al cx2lz- {
    nwlk;
    /unac {^老城广场};
    /unac {^大漠风沙}
}
/nop 火焰山
/al hys2wlb {pl {wlk;wd;wu;wd;wu;nw;nw;w;w;n;nwlk};pr}
/al wlb2hys {pl {wlk;s;e;e;se;se;ed;eu;ed;eu;nwlk};pr}
/nop 大漠
/al lz2dsm {pl {wlk;n;ne;nw;w;nw;nw;nwlk};pr}
/al dsm2lz {pl {wlk;se;se;e;se;sw;s;nwlk};pr}

/al 天枫
/al lz2tf {wlk;do w,n,n,n,n,e,n;nwlk}
/al tf2sk {wlk;do s,w,s,s,s,s,e,e,e,e,e;nwlk}
/al fy2tf {fy2lz;de9 {lz2tf}}
/al tf2fy {tf2sk;de2 {sk2fy}}
/al tf2lz {wlk;do s,w,s,s,s,e,n,w;nwlk}
/al tf2wurong {do nw,w,n,n,n,n;askwurong}
/al wurong2tf {do s,s,s,s,s.e,s,e,e}

/nop 塞口
/al fy2sk {fyw;pl {w;w;w;w;w;w;w;w;w;nwlk};pr}
/al sk2fy {wlk;do e,e,e,e,e,e,e,e,e;de1 {fyw-}}
/al sk2fy {pl {wlk;e;e;e;e;e;e;e;e;e;fyw-};pr}
/nop 桃源
/al fy2ty {wlk;/al ty_action {around;l};fy2wdz;fy2ty+;de2 {/4 e;ty_action}}
/al fy2ty+ {
    wlk;
    /ac {^看不见任何明显的出路，看来，你只好四处转转看了}{around};
    /ac {^水花。潭边长满了}{around};
    /ac {^你转来转去，也没找到出口，你迷了路}{de1 {l}}{6};
    /ac {^  野兔(Rabbit)}{/al ty_action {/3 catch rabbit};/ticker {catch}{ty_action}{1}}{4};
    /ac {^野兔三转两转，倏地一下不见了踪影}{listen;se;e;};
    /ac {^桃源村}{fy2ty-};
    /ac {^你沿着小路，走向那白云}{fy2ty-}
}

/al fy2ty- {
    nwlk;
    /unticker {catch};
    /unac {^看不见任何明显的出路，看来，你只好四处转转看了};
    /unac {^水花。潭边长满了};
    /unac {^你转来转去，也没找到出口，你迷了路};
    /unac {^  野兔(Rabbit)};
    /unac {^野兔三转两转，倏地一下不见了踪影};
    /unac {^「桃源村」 -};
    /unac {^你沿着小路，走向那白云}
}

/al ty2fy {ty2fy+;l}
/al ty2fy+ {
    wlk;
    /ac {^青青石板路}{w};
    /ac {^桃源村}{push door;nw;w;around};
    /ac {^你转来转去，也没找到出口，你迷了路！！}{/delay {0.5}{around}};
    /ac {^    这里唯一的出口是 south。}{s;w;w;/delay {0.5}{wdz2fy;ty2fy-}}{4}
}
/al ty2fy- {
    nwlk;
    /unac {^青青石板路};
    /unac {^桃源村};
    /unac {^你转来转去，也没找到出口，你迷了路！！};
    /unac {^    这里唯一的出口是 south。}
}

/nop 风云客栈
/al fykz {wlk;do d,s,s,s,e,e,se,s,e;nwlk}
/al fykz {wlk;d;s;s;s;e;e;se;s;e;nwlk}
/al kzfy {wlk;do w,n,nw,w,w,n,n,n,u;nwlk}
/al kzfy {wlk;w;n;nw;w;w;n;n;n;u;nwlk}
/nop 方玉香
/al fyfang {wlk;d;/4 w;s;s;w;open picture;wd;open door;n;nwlk}
/al fangfy {wlk;s;open door;eu;e;n;n;/4 e;u;nwlk}

/al fy2mx {mx2fy-;fy2mx+;fye;de1 {e;e;n;e;eu;eu;eu}}
/al fy2mx+ {
    wlk;
    /ac {^你在狭窄的山缝}{/al act_1 {de4 {act_1}}};
    /ac {云雾弥漫，北面的雾气似乎在轻轻流动}{n;nu; /ticker {try}{wd;eu}{2}};
    /ac {^    这里明显的出口是 westup 和 southdown。}{fy2mx-}{3};
    /ac {^云海孤舟}{
            de1 eu;
            wd;};
    /ac {^黄树林}{fy2mx-;de3 {wd;nu;}};
    /ac {^山道} {/al act_1 {nu;wu}; /unticker {try}}
}
/al fy2mx- {
    nwlk;
    /unticker {try};
    /unac {^你在狭窄的山缝};
    /unac {^云海孤舟};
    /unac {^黄树林};
    /unac {云雾弥漫，北面的雾气似乎在轻轻流动};
    /unac {^    这里明显的出口是 westup 和 southdown。};
    /unac {^山道}
}
/al mx2fy {fy2mx-;wlk;mx2fy+;look}
/al mx2fy+ {
    /ac {山道}{sd;de3 {sd;l}};
    /ac {^    这里明显的出口是 westdown 和 eastup。}{/delay {0.1}{wd};de3 {wd}};
    /ac {^迷茫风雨路}{de1 {wd}};
    /ac {^你努力挤过一处狭窄的山路}{de3 {sd;w}};
    /ac {^    这里明显的出口是 west 和 eastup。}{w};
    /ac {^赤峰路}{w;fye-;mx2fy-}
}
/al mx2fy- {
    nwlk;
    /unac {山道};
    /unac {^你努力挤过一处狭窄的山路};
    /unac {^    这里明显的出口是 westdown 和 eastup。};
    /unac {^迷茫风雨路}
    /unac {^    这里明显的出口是 west 和 eastup。};
    /unac {^赤峰路}
}
/al mxin+ {
    wlk;
    /ac {山道}{nu;wu;nd;de3 {l}};
    /ac {^沉香海}{mxin-};
    /ac {^云海孤舟}{wd};
    /ac {^黄树林}{nu;wu}
}
/al mxin- {
    nwlk;
    /unac {山道};
    /unac {^沉香海};
    /unac {^云海孤舟};
    /unac {^黄树林}
}
/al mxin {mxout-;mxin+;l}
/al mxout+ {
    wlk;
    /ac {^沉香海}{su};
    /ac {山道}{ed;sd;de3 {l}};
    /ac {^迷茫风雨路}{mxout-};
    /ac {^黄树林}{ed;sd}
}
/al mxout- {
    nwlk;
    /unac {山道};
    /unac {^沉香海};
    /unac {^迷茫风雨路};
    /unac {^黄树林}
}
/al mxout {mxin-;mxout+;l}
/nop 相思岭
/nop al fy2xsl {wlk;d;/5 e;de1 {/5 e};de2 {unwield all;/3 w;/4 e;s;nwlk}}
/al fy2xsl {pl {wlk;d;e;e;e;e;e;e;e;e;e;e;unwield all;w;w;w;e;e;e;e;s;nwlk};pr}
/al xsl2fy {pl {wlk;n;n;w;w;fye-;xslout-};pr}
/al fy2xsl2 {xslin+;fy2xsl}
/nop 绿竹林 - 石牌峰
/al xslup+ {
    wlk;
    /ac {^绿竹林}{s};
    /ac {^竹间清流}{s};
    /ac {^虎踞石}{jump up};
    /ac {^你的真气不够，怕还}{hr;/delay {2.1}{hp};de6 {l}};
    /ac {^你提一口气}{xslup-}
}
/al xslup- {
    nwlk;
    /unac {^绿竹林};
    /unac {^竹间清流};
    /unac {^虎踞石};
    /unac {^你的真气不够，怕还};
    /unac {^你提一口气}
}
/al xslup {xslup+;l}
/al xsldd+ {
    wlk;
    /ac {^两界碑}{jump down};
    /ac {^竹间清流}{n;xsldd-};
    /ac {^虎踞石}{de2 {n}};
    /ac {^你的真气不够，怕还}{hr;/delay {2.1}{hp};de6 {1}}
}
/al xsldd- {
    nwlk;
    /unac {^两界碑};
    /unac {^竹间清流};
    /unac {^虎踞石};
    /unac {^你的真气不够，怕还}
}
/al xsldd {xsldd+;l}
/al fy2ljb {xslup+;fy2xsl}
/al ljb2fy {wlg2fy+;xsldd}
/al xslout2 {wlg2fy+;xslout}
/nop ljb 两界碑 wlg 舞柳阁
/al ljb2wlg+ {
    wlk;
    /ac {^两界碑}{w};
    /ac {^千方雾障}{de2 {w}};
    /ac {^劫余岭}{de2 {su}};
    /ac {^回风山庄}{su};
    /ac {^舞柳阁}{ljb2wlg-}
}
/al ljb2wlg- {
    nwlk;
    /unac {^两界碑};
    /unac {^千方雾障};
    /unac {^劫余岭};
    /unac {^回风山庄};
    /unac {^舞柳阁}
}
/al ljb2wlg {ljb2wlg+;l}
/al fy2wlg {
    fy2xsl;
    xslup+;
    ljb2wlg+
}
/al wlg2ljb+ {
    wlk;
    /ac {^千方雾障}{e;wlg2ljb-};
    /ac {^劫余岭}{e};
    /ac {^回风山庄}{nd};
    /ac {^舞柳阁}{nd}
}
/al wlg2ljb- {
    nwlk;
    /unac {^千方雾障};
    /unac {^劫余岭};
    /unac {^回风山庄};
    /unac {^舞柳阁}
}
/al fy2sm {
    fy2xsl;
    xslup+;
    ljb2sm+
}
/al ljb2sm {walk 绿松石门} 
/al ljb2sm+ {
    wlk;
    /ac {^两界碑}{w};
    /ac {^千方雾障}{de2 w};
    /ac {^劫余岭}{de2 w};
    /ac {^黑木门}{w;ljb2sm;ljb2sm-};
}
/al ljb2sm- {
    nwlk;
    /unac {^两界碑};
    /unac {^千方雾障};
    /unac {^劫余岭};
    /unac {^黑木门};
}
/al wlg2ljb {wlg2ljb+;l}
/al wlg2fy+ {
    wlk;
    /ac {^绿竹林}{xsl2fy;wlg2fy-}
}
/al wlg2fy- {
    nwlk;
    /unac {^绿竹林}
}
/al wlg2fy {wlg2ljb;xsldd+;wlg2fy+}
/nop 巴山 walk 绿松石门 
/al wlg2sm {walk 绿松石门} 
/al sm2tw {walk 天外集}
/al xslin  {xslin+;/al xslin_do {n;l};l}
/al xslin+ {
   xslout-;
   xslup+;
    /ac {^两界碑}{e};
    /ac {^雷打石}{e};
    /ac {^雪中阁}{w};
    /ac {^相思岭}{/al xslin_do {n;get bag;l};/ticker {xslin_go}{xslin_do}{1}};
    /ac {^凝露池}{/al xslin_do {s;get bag;climb vine;look}};
    /ac {^石牌峰}{xslin-;/delay {2.1}{su;w;s}}
}
/al xslin- {
    xslup-;
    /unac {^两界碑};
    /unac {^雷打石};
    /unac {^雪中阁};
    /unac {^相思岭};
    /unticker {xslin_go};
    /unac {^凝露池};
    /unac {^石牌峰}
}
/al xslout {xslout+;/delay {0.2}{l}}
/al xslout+ {
xsldd+;
/ac {^冰洞入口}{out};
/ac {^玄冰洞}{out};
/ac {^壶仙岩}{sd};
/ac {^后山门}{e};
/ac {^楠木走廊}{e};
/ac {^不老寒泉}{n};
/ac {^杨木走廊}{e};
/ac {^皓月宫}{/2 nd;w;w;};
/ac {^你的内力过弱，恐怕跳}{hn;hp;l};
}
/al xslout- {
xsldd-;
/unac {^冰洞入口};
/unac {^玄冰洞};
/unac {^壶仙岩};
/unac {^后山门};
/unac {^楠木走廊};
/unac {^不老寒泉};
/unac {^杨木走廊};
/unac {^皓月宫};
/unac {^你的内力过弱，恐怕跳};
}
/al bingdong {bingdong+;/delay {0.2}{l}}
/al bingdong+ {
wlk;
/ac {^冰洞入口}{bingdong-};
/ac {^玄冰洞}{enter;bingdong-};
/ac {^壶仙岩}{enter};
/ac {^后山门}{nu};
/ac {^楠木走廊}{w};
/ac {^不老寒泉}{w};
/ac {^杨木走廊}{s};
/ac {^皓月宫}{w}
}
/al bingdong- {
nwlk;
/unac {^冰洞入口};
/unac {^玄冰洞};
/unac {^壶仙岩};
/unac {^后山门};
/unac {^楠木走廊};
/unac {^不老寒泉};
/unac {^杨木走廊};
/unac {^皓月宫}
}
/al bdin {
    /2 s;w;s;w;/7 s;w;/4 s;
}
/al bdout {
    /5 n;e;/7 n;e;n;e;/2 n;
}
/al gw2tx {wlk;do w,n,e,nu,n,n,n,pushaside grass,w,w,w,w,w,listen,n;nwlk}
/al gw2tx {wlk;w;n;e;nu;n;n;n;pushaside grass;w;w;w;w;w;listen;n;nwlk}
/al tx2gw {tx2gw+;/delay {0.2}{l}}
/al tx2gw+ {
    wlk;
    /ac {^梅雨潭}{su};
    /ac {^山庄后院}{s};
    /ac {^翠竹屋}{s};
    /ac {^藏书阁}{w};
    /ac {^山庄前院}{s};
    /ac {^翠竹庄门}{s;e;e;e;e;e;s;s;s;sd;w;s;e;};
    /ac {^羊肠小道}{tx2gw-}
}
/al tx2gw- {
    nwlk;
    /unac {^梅雨潭};
    /unac {^山庄后院};
    /unac {^翠竹屋};
    /unac {^藏书阁};
    /unac {^山庄前院};
    /unac {^翠竹庄门};
    /unac {^羊肠小道}
}
/al tx2fy {tx2fy+;/delay {0.2}{tx2gw}}
/al tx2fy+ {
    /ac {^迎梅客栈}{/delay {0.5}{gw2fy;tx2fy-}};
    /ac {^风云南}{tx2fy-}
}
/al tx2fy- {
    /unac {^迎梅客栈};
    /unac {^风云南}
}
/nop al tx2gw {wlk;s;s;s;/5 e;de1 {/3 s;sd;w;s;e;nwlk}}
/nop fy to yin bin 拿树叶

/al fy2yinbin {fy2qf;de4 {/2 e;/2 eu;nu;w;ask monk about meat};de6 {open door;s;pull 小柜;nwlk}}
/al buyleaf {wlk;n;e;sd;wd;wd;give xiaofan 10 silver;nwlk}
/nop al fy2gw {fy2cx;de9 {cx2gw}}
/al fy2gw {ffy;walk 马厩;de1 {goto guanwai}}
/al fy2gw {fy2cx;de9 {cx2gw}}
/al fy2tx {fy2cx;de9 {cx2gw};de12 {gw2tx}}
/nop al gw2fy {gw2cx;cx2fy+}
/al fy2wlb {fy2lz;de9 {lz2wlb}}
/al fy2wlb {fy2cx;de8 {pl {n;e;e;nw;ne;nw;nw;ne;n;nd;n;nw;nw;w;w;w;lz2wlb};pr;}}
/nop al fy2qj {fy2wm;de10 {/6 e;swim}}
/nop al fy2qj {wlk;d;/4 s;/delay {0.5}{/3 w;sw;nw;sw;w;n;nwlk}}
/nop al qj2fy {wlk;s;e;ne;se;ne;/3 e;/delay {0.5}{/4 n;u;nwlk}}
/nop youlingshanzhuang
/nop al gw2yl {gw2yl+;wlk;w;n;e;s;de1 {keychain;s;keychain;s;s;su;get all from rock;blow pipe;e;nwlk}}
/nop al gw2yl {gw2yl+;wlk;do w,n,e,s,s,s,s,su,keychain,get all from rock;blow pipe,e;nwlk}
/al gw2yl {gw2yl+;wlk;pl {w;n;e;s;s;s;s;su;keychain;get all from rock;blow pipe;e;nwlk};pr}
/al ylgw {yl2gw-;wlk;nd;/4 n;w;s;e;nwlk}
/al yl2gw {yl2gw+;/delay {0.5}{look}}
/nop al gw2ygh {wlk;do w,n,e,s,s,/delay {0.5}{ygh+;/2 s;n;e;e;agree to help}}
/al gw2ygh {ygh+;wlk;pl {w;n;e;s;s;s;s;n;e;e;agree to help;nwlk};pr}
/al yl2gw+ {
    wlk;
    /ac {^眼前景色似乎有些熟悉}{ylgw};
    /ac {^钢索桥上}{w}
}
/al yl2gw- {
    nwlk;
    /unac {^眼前景色似乎有些熟悉};
    /unac {^钢索桥上}
}
/al gw2yl+ {
    wlk;
/ac {^孤独美的喉结上下滚动着}{agree to help};
/ac {^粉燕子笑了笑道：有时候我连你都想要}{leave gu du mei};
/ac {^叶孤鸿对你说道:你们可以走了}{e;ga rock;blow pipe};
/ac {^白云之间忽然出现了一个人}{e;gw2yl-}
}
/al gw2yl- {
    uwlk;
/unac {^孤独美的喉结上下滚动着};
/unac {^粉燕子笑了笑道：有时候我连你都想要};
/unac {^叶孤鸿对你说道:你们可以走了}
/unac {^白云之间忽然出现了一个人}
}
/al ygh+ {
    wlk;
    /ac {^孤独美说道：向东走。}{e};
    /ac {^孤独美说道：向西走。}{w};
    /ac {^孤独美说道：向南走。}{s};
    /ac {^孤独美说道：向北走。}{n};
    /ac {^孤独美说道：到了。}{get pipe from rock;blow pipe;e;e;tell ghost no face;ygh-}
}
/al ygh- {
    nwlk;
    /unac {^孤独美说道：向东走。};
    /unac {^孤独美说道：向西走。};
    /unac {^孤独美说道：向南走。};
    /unac {^孤独美说道：向北走。};
    /unac {^孤独美说道：到了。}
}

/nop 黄山
/nop al fy2hs {fy2cx;de7 {cx2hs}}
/nop al hs2fy {hs2cx;cx2fy+}

/nop 太平to恶人谷
/nop al tp2erg {pl {wlk;ne;w;w;nw;nu;nu;su;su;look stone;nd;nd;nd;nd;e;nwlk};pr}
/nop al erg2tp {pl {wlk;w;su;su;wu;wu;ed;sd;ed;sd;nd;sd;sd;se;e;e;sw;nwlk};pr}

/nop 兴国in
/al xgin {wlk;xgin+;/4 n;touch mark}
/al xgin+ {
    /ac {铜人眼睛忽然睁开}{n;xgin-}
}
/al xgin- {
    nwlk;
    /unac {铜人眼睛忽然睁开}
}

/al xgin2 {wlk;xgin2+;n;n;n;smile}

/al xgin2+ {
    /ac {你愉快地笑了笑。}{l;/delay {0.5}{smile}};
    /ac {弥勒佛似乎也和你一起笑了起来}{n;xgin2-}
    /ac {^韦驮殿}{xgin2-};
    /ac {^观音殿}{xgin2-}
}
/al xgin2- {
    nwlk;
    /unac {你愉快地笑了笑。};
    /unac {弥勒佛似乎也和你一起笑了起来};
    /unac {^韦驮殿};
    /unac {^观音殿}
}

/al xgin3 {wlk;n;e;push luowang;n;nwlk}
/nop al xgout {pl {wlk;w;w;push button;s;e;s;s;s;s;s;s;s;nwlk};pr}
/nop al xgout {wlk;do w,w,push button,s,e,s,s,s,s,s,s,s;nwlk}
/al xgout {pl {wlk;w;w;push button;s;e;s;s;s;s;s;s;s;nwlk};pr}
/al fy2xg1 {fy2xg;de4 {xgin}}
/al fy2xg2 {fy2xg;de4 {xgin};de6 {xgin2}}
/al fy2xg3 {fy2xg;de4 {xgin};de8 {xgin2};/delay {15}{xgin3}}

/nop al fy2dqg {/7 e;de1 {/3 east;n;e;/3 eu;};de2 {sd;ed;n;w;w;/2 w};de3 {wd;/2 w;n;w;/3 wd}}
/nop 云雨舟千金
/al qj2yyz {pl {wlk;n;n;nw;w;w;w;w;w;w;n;n;w;s;nwlk};pr}
/al yyz2qj {pl {wlk;n;e;s;s;e;e;e;e;e;e;se;s;s;nwlk};pr}
/al yyz2fy {yyz2qj;de2 {qj2fy}}
/al fy2yyz {fy2qj;/delay {24}{qj2yyz}}
/狼山 太平客栈 -
/al ls2cx {pl {wlk;nw;nd;ne;nd;nd;wd;nw;nd;nd;ed;n;e;e;e;n;n;n;n;nwlk};pr}
/al cx2ls {pl {wlk;s;s;s;s;w;w;w;s;wu;give meat to fighter wolf;su;su;su;keychain;se;eu;su;su;sw;su;se;nwlk};pr}
/nop al cx2ls {wlk;do s,s,s,s,w,w,w,s,wu,su,keychain,su,keychain;de1 {do su,se,eu,su,su,sw,su,se;nwlk}}
/al ls2fy {ls2cx;cx2fy+}
/al fy2ls {fy2cx;de9 {cx2ls}}
/al fy2ls {fy2cx;de7 {cx2ls}}
/al ls2langwo {wlk;nw;nd;crawl up;nwlk}
/al langwo2ls {wlk;crawl down;de3 {su;se;nwlk}}
/al langwo2fy {langwo2ls;de4 {ls2fy}}
/al fy2langwo {fy2ls;de14 {ls2langwo}}
/al lsin {pl {wlk;s;se;su;su;su;su;su;se;su;/3 knock door;enter;nwlk};pr}
/al lsout {pl {wlk;n;out;nd;nw;nd;nd;nd;nd;nd;nw;n};pr}
/nop 香灵
/al fyxl {d;w;w;w;s}
/nop al fyxl {d;/3 w;s}
/al xlfy {n;e;e;e;u}
/金钱帮 宣武堂
/al fy2xwt {wlk;pl {d;w;w;w;w;n;n;w;n;w;open picture;wd;e;nwlk};pr}
/al xwt2fy {pl {wlk;w;eu;e;s;e;s;s;e;e;e;e;u;nwlk};pr}

/nop 饿虎岗
/al ehg2wdz {wlk;pl {nd;nd;nd;nd;nw;nw;n;n;n;nwlk};pr}
/al wdz2ehg {wlk;pl {s;s;s;se;se;su;su;su;keychain;su;su;nwlk};pr}
/al fy2ehg {fy2wdz;de2 {wdz2ehg}}
/al ehg2fy {ehg2wdz;de2 {wdz2fy}}
/nop 断塔
/al dtin {listen;push door;l 断塔;open door;enter}
/al wdz2dt {wlk;pl {s;s;s;se;se;su;su;su;keychain;sw;sw;su;dtin;nwlk};pr}
/al dt2wdz {wlk;pl {d;d;d;d;d;out;ne;nd;nd;nd;nw;nw;n;n;n;nwlk};pr}
/al fy2dt {fy2wdz;de2 {wdz2dt}}
/al dt2fy {dt2wdz;de2 {wdz2fy}}
/nop ask baili about 归东景
/al dt2jyt {jytin+;wlk;pl {u;u;u;u;u;u;u;u;jumpout window;drop dingxi note;d;u;jumpout window;nwlk};pr}
/al jytin {jytin+;wlk;push 断墙;enter;su;open 木墙;eu;nwlk}
/al jytin+ {
   /ac {^断墙边}{push 断墙};
   /ac {你俏面憋得通红，断墙还是纹丝不动}{push 断墙};
   /ac {^残砖断石纷纷落下}{/delay {0.5}{l}};
   /ac {^在残砖断瓦之后你似乎找到}{enter;su;open 木墙;eu;jytin-}
}
/al jytin- {
   /unac {^断墙边};
   /unac {你俏面憋得通红，断墙还是纹丝不动};
   /unac {^残砖断石纷纷落下};
   /unac {^在残砖断瓦之后你似乎找到}
}
/al fy2jyt {fy2dt;de4 dt2jyt;}
/al jyt2fy {wlk;nd;ehg2fy;nwlk}
/nop 快活林
/nop al lz2khl {wlk;n;ne;nw;nw;wade strand;de2 {l;nwlk}}
/al wadeliusha {wade 沙流}
/al cx2khl {cx2lz;de2 {lz2khl}}
/al lz2khl {lz2kqh;/delay {0.5}{khlin}}
/al fy2kqh {fy2lz;de9 {lz2kqh}}
/al khlin {khlin+;/delay {0.2}{l}}
/al khlin+ {
    /ac {^孔雀河}{wadeliusha};
    /ac {^西佛塔}{/4 e;khlin-};
    /ac {^东佛塔}{/4 w;khlin-};
    /ac {^南佛塔}{/4 n;khlin-};
    /ac {^北佛塔}{/4 s;khlin-};
    /ac {^圣殿}{khlin-}
}
/al khlin- {
    /unac {^孔雀河};
    /unac {^西佛塔};
    /unac {^东佛塔};
    /unac {^南佛塔};
    /unac {^北佛塔};
    /unac {^圣殿}
}
/al khlout {khlout+;/delay {0.2}{l}}
/al khlout+ {
    wlk;
    /ac {^北天街}{/4 n;u};
    /ac {^南天街}{/4 s;u};
    /ac {^东天街}{/4 e;u};
    /ac {^西天街}{/4 w;u};
    /ac {^圣殿}{e};
    /ac {^孔雀河}{khlout-};
    /ac {佛塔}{u}
}
/al khlout- {
    nwlk;
    /unac {^北天街};
    /unac {^南天街};
    /unac {^东天街};
    /unac {^西天街};
    /unac {^圣殿};
    /unac {^孔雀河};
    /unac {佛塔}
}
/al khl2fy {khlout;khl2fy+}
/al khl2fy+ {
/ac {^    这里唯一的出口是 southeast}{khl2fy-;kqh2fy}
}
/al khl2fy- {
/unac {^    这里唯一的出口是 southeast}
}
/al kqh2lz {wlk;se;se;sw;s;nwlk}
/al lz2kqh {wlk;n;ne;nw;nw;nwlk}
/al kqh2khl {kqh2lz;de1 {lz2khl}}
/al fy2khl {fy2lz;de9 {lz2khl}}
/al kqh2fy {kqh2lz;de1 {lz2fy}}
/al cx2tf {n;nw;ne;nw;nw;ne;nd;n;nw;n}
/nop 石峰边缘 -
/al tf2cx {s;/3 w;lz2cx}
/ac {^你脚下一滑，在独木桥上晃了晃}{nhq_force+;de1 {look}}
/al nhq_force+ {
/ac {^独木危桥}{e};
/ac {^岔路口}{s};
/ac {^黑石道路}{s};
/ac {^石像林}{s};
/ac {^奈何桥}{nhq_force-}
}
/al nhq_force- {
/unac {^独木危桥};
/unac {^岔路口};
/unac {^黑石道路};
/unac {^石像林};
/unac {^奈何桥}
}
/al ygdf {wlk;d;/4 w;/2 s;w;open picture;wd;open door;n;nwlk}
/al ygdf- {wlk;s;open door;eu;e;/2 n;/4 e;u;nwlk}
/al lll {say east;l east;say south;l south;say west;l west;say north;l north;}
/al jqin {wlk;d;/4 w;/2 n;w;n;w;open picture;wd;nwlk}
/al jqout {wlk;eu;e;s;e;/2 s;/4 e;u;nwlk}
/al xslnt {wlk;d;/2 n;e;n;ask youngman about 差事;s;w;/2 s;u;nwlk}
/al sqnt {wlk;n;ask master about 烦恼;s;open door;/6 s;climb down;nwlk}
/ac {^有一批宝藏就在%1的方向！你可以用 %2 来寻找它}{%2;de1 {read afrji}}
/ac {^有一批宝藏就在%1的方向！你可以用 %2 来寻找它}{%2;de1 {read afrji;read map}}
/nop 龙虎寨
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
/ac {^孙剑伸手挡住了你说：“请问找谁}{answer 律香川}
/al tp2lhz {wlk;ne;/2 w;nw;/2 w;nw;/delay {0.5}{/2 s;se;listen;l south;south;disarm;se;nwlk}}
/nop 仙人洞 yhgz 云海孤舟
/al fy2lan+ {
    wlk;
    /ac {^云海孤舟}{ne;nw;n;nu};
    /ac {^仙人洞}{fy2lan-}
}
/al fy2lan- {
    nwlk;
    /unac {^仙人洞};
    /unac {^云海孤舟}
}
/al fy2lan {fy2xrd;fy2lan+}
/al lan2fy+ {
    wlk;
    /ac {^云海孤舟}{lan2fy-;xrd2fy};
    /ac {^仙人洞}{sd;s;se;sw}
}
/al lan2fy- {
    nwlk;
    /unac {^云海孤舟};
    /unac {^仙人洞}
}
/al lan2fy {lan2fy+;l}
/nop tgs 塔公寺
/al tgs2bc {pl {wlk;nu;n;e;ne;ne;ne;nd;e;e;n;n;w;w;w;w;nw;nwlk};pr}
/al bc2tgs {pl {wlk;se;e;e;e;e;s;s;w;w;su;sw;sw;sw;w;s;sd;nwlk};pr}
/nop jqin2 临时的path
/al jqin2 {wlk;d;/2 e;/2 n;e;/delay {0.5}{n;/5 e;n;/3 e;nwlk}}
/al jqout2 {wlk;/5 w;s;/5 w;/delay {0.5}{s;w;/2 s;/2 w;u;nwlk}}
/al jqin3 {wlk;d;e;e;s;e;s;/delay {0.5}{/7 e;s};de1 {s;/6 e};/delay {1.5}{s;e;s;e;e;n;e;s;e;nwlk}}
/al jqout3 {wlk;w;n;w;s;w;w;n;w;n;/delay {0.5}{/6 w;n};de1 {n;/7 w;};/delay {1.5}{n;w;n;w;w;u;nwlk}}
/ac {^你必须先把窄门打开}{open door}
/al answerdm {;} 
/al lp {l picture}
/ac {^一株枯死的古柏，躯体以顺时针方向拧扭盘旋而上}{/al answerdm {answer 宁死不屈};w;n;n;n;answerdm}
/ac {^泰山神前告武则天灭子之状，化为此柏}{/al answerdm {answer 孤柏披忠};w;n;n;n;answerdm}
/ac {^一棵古柏枝身扭结上耸，若虬龙蟠旋，虽然肤剥心枯}{/al answerdm {answer 汉柏凌寒};w;n;n;n;answerdm}
/ac {^甬道下有一棵古柏，上有一枯枝向北，宛如展翅欲飞的仙鹤}{/al answerdm {answer 仙鹤展翅};w;n;n;n;answerdm}
/ac {^一棵古柏，苍翠的树冠上，簇拥着茂密的枝叶}{/al answerdm {answer 云列三台};w;n;n;n;answerdm}
/ac {^一棵苍郁挺拔，枝繁叶茂的汉柏，在它的主干与侧枝的交接处之上长了一个}{/al answerdm {answer 挂印封侯};w;n;n;n;answerdm}
/ac {^一棵古柏树干上淤结了一个球状疤瘤}{/al answerdm {answer 麒麟望月};w;n;n;n;answerdm}
/ac {^一棵唐槐，高大茂盛}{/al answerdm {answer 唐槐抱子};w;n;n;n;answerdm}
/al cx2hy {wlk;do n,nw,ne,nw,nw,ne,nw,nd;nwlk}
/al hy2cx {wlk;do su,ne,sw,se,se,sw,se,s;nwlk}
/nop sf 石峰
/al cx2sf {wlk;do n,nw,ne,nw,nw,ne,nw,nd,n,nw,n;nwlk}
/al sf2sk {wlk;do s,s,s,e,e,e,e,e;nwlk}
/al sf2sk {wlk;s;s;s;e;e;e;e;e;nwlk}
/nop  tf2sk {wlk;do s,w,s,s,s,s,e,e,e,e,e;nwlk}
/nop lz2tf {wlk;do w,n,n,n,n,e,n;nwlk}
/nop  tf2lz {wlk;do s,w,s,s,s,e,n,w;nwlk}
/al  sf2lz {wlk;do s,s,e,n,w;nwlk}
/al lz2sf {wlk;do w,n,n,n;nwlk}
/al lz2sf {wlk;w;n;n;n;nwlk}
/nop  lz2gw {pl {wlk;w;w;w;w;w;w;w;w;w;w;w;w;w;s;e;nwlk};pr}
/al lz2sk {wlk;do w,n,n,n,s,s,s,e,e,e,e,e;nwlk}
/nop al cx2fy {cx2sf;de1 {sf2sk};de2 {sk2fy}}
/nop al gw2fy {gw2lz;de1 {lz2sk};de2 {sk2fy}}
/al gw2fy {gw2sj;de1 {sj2cx};de3 {cx2fy}}
/nop al lz2fy {lz2sk;de1 {sk2fy}}
/al lz2fy {lz2cx;de1 {cx2fy}}
/al gt {goto %0;de2 {%0;l}}
/al fyz {ffy;do w,s,s,goto yangzhou}
/al ffy {do recall back,w,n,e,e,e,n,u}
/al ffy {recall back}
/al wfy {walk 天机阁}
/ac {^看来只有等到黎明时雾散}{keychain}
/nop miekou
/al fy2mingyue {fys;de1 {do s,e,se,se,s,s,s,e};de2 {walk 将军府大堂}}
/al mingyue2fy {do s,s,s,w,w,w;de1 {walk 风云南城门};de2 {fys-}}
/al fy2wk {walk 风云南城门;de2 fys2luori;de4 luori2wk}
/al fys2luori {walk 落日外门}
/al luori2wk {walk 旭日海边}
/al gotosm {do d,recall back,e,goto luoyang;/delay {4}{walk 文庙};/delay {5}{enter desert;alw}}
/ac {^你的『逍遥游』失败了}{de1 usemark}
/nop al gw2fy {walk 马厩;de1 {goto fy}}
