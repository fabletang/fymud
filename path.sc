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
/nop #alias bat4 {open ����;s;#4 up}
/nop #alias bit5 {say �������������������}
/nop al batout {pl {open ����;s;u;u;u;u;answer no;e;sail};pr}
/al batout {do open ����,s,u,u,u,u,answer no,e,sail}
/al bat2chu {do open ����,s,u,u,u,u,answer no,e,sail}
/nop wang tian shou
/al batout1 {do open ����,s,u,u,u, u,answer no,e}
/al chu2white {ask master about island; bat2white+;de1 {keychain}}
/al bat2white {bat2chu;de2 {chu2white}}
/al white2dk {do sd,sd,sd,sd,sd,e,e,e,e}
/al dk2white {do w,w,w,w,nu,nu,nu,nu,nu}
/al dk2chu {batin;de2 {bat2chu}}
/al chu2fy {wlk;w;w;n;hb2fy}
/al dk2fy {batin;de1 bat2chu;de3 chu2fy}
/al white2fy {white2dk;de1 dk2fy}
/al chu2dk {ask master about island; chu2dk+;de1 {keychain}}
/nop dk ����
/al chu2dk+ {
/ac {^��}{listen wave};
/ac {^���˾�����һͷͷ����}{listen wave};
/ac {^ͻȻ�䣬��Ĵ�������}{bat2dk-;/2 e}
}
/al chu2dk- {
/unac {^��};
/unac {^���˾�����һͷͷ����};
/unac {^ͻȻ�䣬��Ĵ�������}
}
/al bat2white+ {
/ac {^��}{listen wave};
/ac {^���˾�����һͷͷ����}{listen wave};
/ac {^ͻȻ�䣬��Ĵ�������}{bat2white-;do w,w,nu,nu,nu,nu}
}
/al bat2white- {
/unac {^��};
/unac {^���˾�����һͷͷ����};
/unac {^ͻȻ�䣬��Ĵ�������}
}
/nop ac {^�������û�г�·��}{look}
/ac {^�������ȵ��������ֱֳ���} {unwield all}
/ac {^�ر�ʿ������ȵ��������ֱֳ������}{unwield all}
/nop al dqg2fy {wlk;wear all;open door;/3 eu;e;s;e;e;de1 {eu;e;e;s;wu;w;nu;wd};de2 {wd;wd;unwi all;/4 w};de3 {/7 w;u;nwlk}}
/al dqg2fy {yinbin2wy;de1 {wy2fy}}

/nop al fy2dqg {wlk;fy2xrd;de3 {xrd2dqg}}
/al fy2dqg {wlk;fy2wy;de3 {wy2yinbin}}
/nop yhgz �ƺ����� 
/al fy2yhgz {fye;de1 {do e,e,eu,eu,eu;nwlk}}
/al fy2wy {fye;de1 {do e,e,n,eu,eu,eu,sd,e,ed,n,w;nwlk}}
/al wy2fy {wlk;do e,s,wu,w,nu,wd,wd,wd,w,w;de1 {fye-}}
/nop ���˶�
/nop wy Σ��
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
    /ac {^��ʯ��Ӱ}{n};
    /ac {^��ã����·}{fye2xrd-}
}
/al fye2xrd- {
    /unac {^��ʯ��Ӱ};
    /unac {^��ã����·}
}
/nop al xrd2fye {wlk;wd;w;/3 wd;w;w;nwlk}
/nop al fy2xrd {fye;fye2xrd+;de2 {e;e;fye2xrd}}
/al fye2xrd {wlk;do e,e,n,e,eu,eu,eu,ne,nw,n,nu;nwlk}
/al xrd2fye {wlk;do sd,s,se,sw,wd,wd,wd,w,w;nwlk}
/al fy2xrd {fye;de1 {fye2xrd}}
/nop al xrd2fy {xrd2fye;de1 {fye-}}
/al xrd2fy {xrd2fye;de1 {fye-}}

/nop ��ľ��
/nop al xrd2gml {xl2gml+;sd;ed;n}
/al xrd2gml {wlk;sd;e;ed;n;/4 e;/3 s;nwlk}
/al gml2xrd {wlk;/3 n;/4 w;s;wu;w;nu;nwlk}
/nop al fy2gml {fy2xrd;de3 {xrd2gml}}
/al fy2gml {fy2hb;de4 {s;s;s}}
/nop al gml2fy {gml2xrd;de1 {xrd2fy}}
/al gml2fy {w;w;n;hb2fy}
/nop gml2������
/al gml2ccd {n;fy2ccd+;/delay {0.2}{l}}
/al fy2ccd {fy2gml;/delay {4.5}{gml2ccd}}
/al fy2ccd+ {
    wlk;
    /ac {^��ľ��}{n};
    /ac {^��������}{/ticker {pipe}{gb pipe;blow pipe;keychain}{4}};
    /ac {^�������ɿ�}{fy2ccd-;pp pipe};
    /ac {^������˵�������ϴ��ɣ���}{/unticker {pipe};d};
    /ac {^������˵���������ˣ����ǿ����´��ˡ���}{u}
}

/al fy2ccd- {
    nwlk;
    /unac {^��ľ��};
    /unac {^��������};
    /unticker {pipe};
    /unac {^������˵�������ϴ��ɣ���};
    /unac {^������˵���������ˣ����ǿ����´��ˡ���}
}
/al ccd2fy {ccd2fy+;/delay {0.2}{l}}
/al ccd2fy+ {
    wlk;
    /ac {^��������}{s};
    /ac {^��ľ��}{ccd2fy-;pp pipe;/delay {0.2}{gml2fy}};
    /ac {^�������ɿ�}{keychain;/ticker {pipe}{gb pipe;blow pipe}{4}};
    /ac {^������˵�������ϴ��ɣ���}{/unticker {pipe};d};
    /ac {^������˵���������ˣ����ǿ����´��ˡ���}{u}
}

/al ccd2fy- {
    nwlk;
    put pipe in bag;
    /unac {^��������};
    /unac {^��ľ��};
    /unac {^�������ɿ�};
    /unticker {pipe};
    /unac {^������˵�������ϴ��ɣ���};
    /unac {^������˵���������ˣ����ǿ����´��ˡ���}
}
/al ccdin+ {
    wlk;
    /ac {^�������ɿ�}{e;ne;se;eu;e;eu;};
    /ac {^����}{/delay {0.1}{eu}};
    /ac {^���¶�}{ccdin-}
}
/al ccdin- {
    nwlk;
    /unac {^�������ɿ�};
    /unac {^����};
    /unac {^���¶�}
}
/al ccdin {ccdin+;l}
/al ccdout+ {
    wlk;
    /ac {^�������ɿ�}{ccdout-};
    /ac {^����}{/delay {0.1}{wd}};
    /ac {^���¶�}{wd};
    /ac {^ƽ̨}{w;wd;nw;sw;w}
}
/al ccdout- {
    nwlk;
    /unac {^�������ɿ�};
    /unac {^����};
    /unac {^���¶�};
    /unac {^ƽ̨}
}
/al ccdout {ccdout+;l}
/nop ��ľ��to����
/nop ac batout {say �������������������}
/al fy2bat {fy2gml;de5 {gml2bat}}
/al fy2chu {fy2gml;de5 {wlk;dash bush;e;e;nwlk}}
/al gml2bat {bat+;l;dash bush;recover force}
/al bat+ {
    wlk;
    /ac {^��ľ��}{wlk;dash bush};
    /ac {^  ����ɷ�� κ����(Wei xing long)}{ask wei xing long about book;say fight wei xing long;e};
    /ac {^κ�����޿��κεشӻ����ͳ�һ����ݸ���}{wlk;/delay {7.5}{e}};
    /ac {^  ��˧��������¡�������(Master chu)}{ask master about island;de2 {l}};
    /ac {^  �������ٷ硹����(Ding feng)}{keychain;give book to ding feng};
    /ac {^��}{look wave};
    /ac {^���˾�����һͷͷ���ǣ���ҧ����Ĵ���}{look wave};
    /ac {^�˼����}{bat-;/2 e;de1 {cks}}
}
/al bat- {
    nwlk;
    /unac {^��ľ��};
    /unac {^  ����ɷ�� κ����(Wei xing long)};
    /unac {^κ�����޿��κεشӻ����ͳ�һ����ݸ���};
    /unac {^  ��˧��������¡�������(Master chu)};
    /unac {^  �������ٷ硹����(Ding feng)};
    /unac {^��};
    /unac {^���˾�����һͷͷ���ǣ���ҧ����Ĵ���};
    /unac {^�˼����}
}

/al xl2gml+ {
    wlk;
    /ac {^��С·�� -}{e};
    /ac {^��ɽ��С·�� -}{e};
    /ac {^��ƽԭ·�� -}{e};
    /ac {^������·�� -}{e};
    /ac {^����ľ�֡� -}{xl2gml-}
}
/al xl2gml- {
    nwlk;
    /unac {^��С·�� -};
    /unac {^��ɽ��С·�� -};
    /unac {^��ƽԭ·�� -};
    /unac {^������·�� -};
    /unac {^����ľ�֡� -}
}

/al gml2xl+ {
    wlk;
    /ac {^��С·�� -}{s};
    /ac {^��ɽ��С·�� -}{w};
    /ac {^��ƽԭ·�� -}{w};
    /ac {^������·�� -}{w};
    /ac {^������С���� -}{gml2xl-}
}
/al gml2xl- {
    nwlk;
    /unac {^��С·�� -};
    /unac {^��ɽ��С·�� -};
    /unac {^��ƽԭ·�� -};
    /unac {^������·�� -};
    /unac {^������С���� -}
}
/al dqgout {wlk;wear all;center;go cyan;open hua;s;nwlk}

/al dqgin {wlk;ask yin bin about man;remove all;de3 {ask zhu zao about ����;nwlk}}

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
/nop ����-����
/al hb2lw {wlk;do n,n,n,n,n,e,walkto bow,give meat to man,enter;nwlk}
/al lw2hb {wlk;out;walkto ����;de8 {w;s;s;s;nwlk}}

/nop al fye2wxl {e;/3 eu;e;eu;ed;ed;n;}

/nop �ھ�
/al fy2bj {wlk;d;/4 e;s;e;nwlk}
/al bj2fy {wlk;w;n;/4 w;u;nwlk}


/nop ������


/al fy2wmz {wlk;d;/4 n;/delay {0.5}{nw;n;ne;n;n;e;e;nwlk}}
/al wmz2fy {wlk;w;w;s;s;sw;s;se;/delay {0.5}{/4 s;u;nwlk}}

/nop ǧ��
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
    /ac {^���ƳǱ�}{n};
    /ac {^�ϱ����}{look east;/ac {^��Ҫ��ʲ��}{n};/ac {^���ش��}{fyn2qf-;/delay {0.2}{e;e}}};
    /ac {^ǧ��ɽ��}{fyn2qf-}
}
/al fyn2qf- {
    nwlk;
    /unac {^��Ҫ��ʲ��};
    /unac {^���ƳǱ�};
    /unac {^���ش��};
    /unac {^�ϱ����};
    /unac {^ǧ��ɽ��}
}

/nop  qf2fy {qf2fyn;de1 {fyn-}}
/al qf2fyn+ {

    wlk;
    /ac {^�ϱ����}{s};
    /ac {^���ƳǱ�}{;qf2fyn-;fyn-}
}
/al qf2fyn- {
    nwlk;
    /unac {^�ϱ����};
    /unac {^���ƳǱ�}
}

/nop ����

/al fy2jn {wlk;fy2qf;de2 {e;/3 s;nwlk}}
/nop al jn2fy {wlk;n;/3 w;/2 s;de1 {/3 s;sw;s;se};de2 {/4 s;u;nwlk}}
/al jn2fy {wlk;/3 n;w;/delay {0.5}{qf2fy}}
/nop qf2master yin
/al qf2yin {e;/3 s;/delay {0.5}{su;sd;s;s;s};}
/al yin2qf {/3 n;nu;/delay {0.5}{nd;/3 n;w}}
/al fy2yin {fy2qf;de3 {qf2yin}}

/nop �˹���
/al qf2xg {wlk;e;eu;eu;nu;nwlk}
/al xg2qf {wlk;s;s;sd;wd;wd;w;nwlk}
/al fy2xg {fy2qf;de3 {qf2xg}}
/al xg2fy {xg2qf;de1 {qf2fy}}

/nop ��ƽɽׯ
/nop qf2qp {pl {wlk;e;s;s;s;e;ne;ne;ne;e;nwlk};pr}
/nop qp2qf {pl {wlk;w;sw;sw;sw;w;n;n;n;w;nwlk};pr}
/al qf2qp {wlk;do e,s,s,s,e,ne,ne,ne,e;nwlk}
/al qp2qf {wlk;do w,sw,sw,sw,w,n,n,n,w;nwlk}

/al fy2qp {fy2qf;de1 {qf2qp}}
/al qp2fy {qp2qf;de1 {qf2fy}}
/nop hm ����
/al qp2hm {wlk;do e,e,e,e,e,e,e,eu,ed;nwlk}
/al hm2qp {wlk;do wu,wd,w,w,w,w,w,w,w;nwlk}
/al hm2ss {wlk;do push door,e,e,e,push stone,nu;nwlk}
/al ss2hm {wlk;do sd,push stone,w,w,w;nwlk}
/al fy2ss {fy2qp;de3 qp2hm;de4 hm2ss}
/al ss2ffy {ss2hm;de1 hm2qp;de2 qp2fy}

/nop ���
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
/nop ̩ɽ
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
    /ac {^���Ź�}{/6 u;nu;eu;/2 u};
    /ac {^ʮ����}{/delay {0.1}{u}};
    /ac {^������}{tsin-};
}
/al tsin- {
    nwlk;
    /unac {^���Ź�};
    /unac {^ʮ����};
    /unac {^������};
}
/al tsout {do d,d,d,d,d,d,d,d,d,d,d,d,d;wd;sd;/6 d}
/nop ����
/al fy2lw {fyn2lw+;fyn}
/al fyn2lw+ {
    wlk;
    /ac {^���ƳǱ�}{n};
    /ac {^�ϱ����}{n};
    /ac {^������}{n;n;nw;e};
    /ac {^����}{fyn2lw-}
}
/al fyn2lw- {
    nwlk;
    /unac {^���ƳǱ�};
    /unac {^�ϱ����};
    /unac {^������};
    /unac {^����}
}
/al lw2fy {pl {wlk;w;se;s;s;s;s;s;s;s;fyn-};pr}

/nop ����
/al qf2sq {qf2sq+;/3 w;/2 wu;/delay {0.5}{/4 nu;climb up};de3 {climb up};de5 {/5 n;knock door}}
/al qf2sq+ {
    wlk;
    /ac {^֨��һ���������￪��}{de2 {n}};
    /ac {^���幬��Ժ}{/delay {0.5}{qf2sq-}};
    /ac {^�����}{s};
    /ac {^���ǿ��ŵģ���ʲô}{n}
}
/al qf2sq- {
    nwlk;
    /unac {^֨��һ���������￪��};
    /unac {^�����};
    /unac {^���幬��Ժ};
    /unac {^���ǿ��ŵģ���ʲô}
}
/al sq2qf {wlk;pull door;/6 s;/delay {0.5}{climb down};de2 {climb down};de4 {/4 sd;ed;ed;e;e;nwlk}}
/al sq2fy {sq2qf;de6 {qf2fy}}
/al fy2sq {fy2qf;de3 {qf2sq}}

/nop �߳ǵ�����ɽ
/al bc2els {wlk;se;/4 e;se;e;nwlk}
/al els2bc {wlk;w;nw;/4 w;nw;nwlk}
/nop ÷����
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
/nop �߳ǵ�����ׯ
/al bc2byz {pl {wlk;se;e;e;e;e;se;e; e;nu;nu;wu;wd;wd;w;w;n;keychain;nwlk};pr}
/al byz2bc {pl {wlk;s;e; e;eu; eu;ed;sd;sd;w; w;nw;w;w;w;w;nw;nwlk};pr}
/al fy2byz {fy2tp;de10 {tp2byz}}
/al byz2fy {byz2tp;de2 {tp2fy}}
/nop �ú�ׯ
/al bc2hhz {w;/4 s;se;wade;de8 {su;/2 sw;/2 w}}
/al hhz2bc {/2 e;/2 ne;nd;wade;de8 {nw;/4 n;e}}
/nop ���⵽����ɽ
/al els2gw {els2tp;de1 {tp2gw}}
/al gw2els {gw2tp;de4 {tp2els}}

/nop ���⵽����ׯ
/al byz2gw {byz2bc;de3 {bc2gw}}
/al gw2byz {gw2bc;de6 {bc2byz}}

/nop ���ƶ�
/nop �䵱��
/al fy2wdz {fy2wdz+;fye;de1 {do e,s,s,s;nwlk}}
/al fy2wdz+ {
    /ac {^����·}{fy2wdz-};
    /ac {^��ʯ��Ӱ}{n}
}
/al fy2wdz- {
    /unac {^����·};
    /unac {^��ʯ��Ӱ}
}
/al wdz2fy {wlk;/3 n;w;de1 {fye-}}
/al fy2farmer {fy2wdz;de2 {/4 s;e;ask old farmer about ����;nwlk}}
/nop �䵱
/nop al fy2wd {fye;de1 {unwi all;/7 s};de2 {/2 s;/5 su;enter;nwlk}}
/al fy2wd {fy2wdz;de2 {unwi all;/5 s};de3 {/5 su;enter;nwlk}}
/al wd2fy {wlk;out;/5 nd;de1 {/5 n};de2 {wdz2fy}}
/nop old shandong
/al fy2shandong {fy2wdz;de2 {do s,s,s,se,e;nwlk}}
/al shandong2fy {nwlk;w;nw;n;n;n;wdz2fy}
/al buyshaoji {fy2shandong;de3 {buy meat from shandong;shandong2fy}}
/nop ����ɽ
/al fy2hss {wlk;fye;de1 {e;ne;/3 n;nwlk}}
/al hss2fy {wlk;/3 s;sw;w;de1 {fye-}}
/al hsb2fy {hsb2fy+;/delay {0.5}{l}}
/al hsb2fy+ {
    wlk;
    /ac {^����԰}{climb wall;};
    /ac {^���ɿ�����}{de2 {look}};
    /ac {^���ɳǱ��Ķ���}{w};
    /ac {^���ɳǱ�������}{e};
    /ac {^���ɴ���} {down;w;w;d;w;d;s;};
    /ac {^ɽ������}{hss2fy;hsb2fy-}
}
/al hsb2fy- {
    nwlk;
    /unac {^����԰};
    /unac {^���ɿ�����};
    /unac {^���ɳǱ�������};
    /unac {^���ɳǱ��Ķ���};
    /unac {^���ɴ���};
    /unac {^ɽ������}
}
/al fy2hsb {fy2hss;fy2hsb+;de2 {talk;/ticker {go}{north}{3}}}
/al fy2hsb+ {
    /ac {^ɽ������}{talk;/ticker {hsb}{talk}{4}};
    /ac {^ ͻȻ�䣡 �ӱ���}{/unticker {hsb};n};
    /ac {^����ɽ��}{/unticker {go};n;u;e;u;e;e;u;w;climb wall;fy2hsb-};
    /ac {^���ɳǱ�������}{fy2hsb-}
}
/al fy2hsb- {
    nwlk;
    /unticker {go};
    /unticker {hsb};
    /unac {^ɽ������};
    /unac {^ ͻȻ�䣡 �ӱ���};
    /unac {^����ɽ��};
    /unac {^���ɳǱ�������}
}

/nop �κ���
/nop al fy2nhq {wlk;d;/5 e;de1 {/7 e;n;fy2nhq+};de2 {/2 e;/3 eu;ne;e;e;}}
/al fy2nhq {fy2nhq+;fye;de1 {fye2nhq}}
/nop al fye2nhq {wlk;e;e;n;e;/delay {0.5}{/3 eu;ne;e};de1 {e;/4 s;nwlk}}
/al fye2nhq {wlk;do e,e,n,e,eu,eu,eu,ne,e;}
/nop al nhq2fye {wlk;/4 n;w;de1 {w;sw;/3 wd;w;w;nwlk}}
/al nhq2fy+ {
    fy2nhq-;
    wlk;
    /ac {^�κ���}{/delay {0.2}{/4 n}};
    /ac {^��·��}{/delay {0.2}{w}};
    /ac {^��ľΣ��}{w};
    /ac {^�����һ�����ڶ�ľ��}{de2 {west}};
    /ac {^ɽ�ȿ�}{sw};
    /ac {^�ƺ�����}{nhq2fy-;do wd,wd,wd,w,w;fye-;}
}
/al nhq2fy- {
    nwlk;
    /unac {^�κ���};
    /unac {^��·��};
    /unac {^��ľΣ��};
    /unac {^�����һ�����ڶ�ľ��};
    /unac {^ɽ�ȿ�};
    /unac {^�ƺ�����}
}
/al nhq2fy {nhq2fy+;l}
/nop al nhq2fy {nhq2fye;de2 {fye-}}
/al fy2nhq+ {
    nhq2fy-
    wlk;
    /ac {^��ľΣ��}{
        east
    };
    /ac {^�����һ�����ڶ�ľ��}{de2 {east}};
    /ac {^��·��}{/delay {0.5}{/4 s};fy2nhq-}
}
/al fy2nhq- {
    nwlk;
    /unac {^��ľΣ��};
    /unac {^�����һ�����ڶ�ľ��};
    /unac {^��·��}
}
/nop �κ��ŵ�������
/al toucheren {touch ������}
/al nhq2dw {nhq2dw+;l}
/al nhq2dw+ {
    wlk;
    /ac {^�κ���} {fy2nhq-;/ticker {eren}{toucheren}{1};
        do s,east,east,east,east,east,east,down;
        };
    /ac {^��ѽ����һ��}{/3 east;open door;/3 east;};
    /ac {^ʯ���ϵ��Ż���������Ϣ�ĺ�������}{toucheren};
    /ac {^�ȵ�}{/delay {0.5}{/3 s;/3 w;nhq2dw-}};
    /ac {^ɽ��}{nhq2dw-}
}
/al nhq2dw- {
    nwlk;
    /unticker {eren};
    /unac {^�κ���};
    /unac {^��ѽ����һ��};
    /unac {^ʯ���ϵ��Ż���������Ϣ�ĺ�������};
    /unac {^�ȵ�};
    /unac {^ɽ��}
}

/nop al dw2nhq {wlk;/3 e;/3 n;de1 {/3 west;open door;/3 west;u};de2 {/6 west;n;nwlk}}
/al dw2nhq+ {
    wlk;
    /ac {^ɽ��}{/3 e;/3 n};
    /ac {^�ȵ�}{/delay {0.5}{/3 w;open door;/3 w}};
    /ac {^�ӵ�}{u};
    /ac {^�ӵ���}{/delay {0.5}{/6 w}};
    /ac {^����}{/delay {0.2}{n;dw2nhq-}}
}
/al dw2nhq- {
    nwlk;
    /unac {^ɽ��};
    /unac {^�ȵ�};
    /unac {^�ӵ�};
    /unac {^�ӵ���};
    /unac {^����}
}
/al dw2nhq {dw2nhq+;l}
/al dw2fy {dw2nhq;nhq2fy+}
/nop al fy2dw {fy2nhq;de3 {nhq2dw}}
/al fy2dw {fy2nhq;nhq2dw+}

/nop ������n

/nop ����
/al nh2by {wlk;nh2by+;s;s;e;give 5 silver to zhanggui}
/al fy2by {cx2fy-;by2fy-;fy2nh;de10 {nh2by+;do s,s,e,get 5 silver from bag,give 5 silver to zhanggui}}
/al by2fy {by2fy+;by2nh;}
/al by2fy+ {
    wlk;
    /ac {^ƽԭ·}{nh2fy};
    /ac {^�����ϳ���}{by2fy-;nh2fy-}
}
/al by2fy- {
    nwlk;
    /unac {^ƽԭ·};
    /unac {^�����ϳ���}
}
/al byin {s;s;se;su;se;su;sw;su;enter}
/al byout {unwi all;out;nd;ne;nd;nw;nd;nw;n;n}
/al byin2 {/4 s;twist left}


/al nh2by+ {
    /ac {���ƹ�˵������л��λ}{do w,s,e,e,give qiyue to fox,d;/ticker {sail}{sail south}{4};sail south};
    /ac {���ƶ�} {nh2by-;s}
}
/al nh2by- {
    nwlk;
    /unticker {sail};
    /unac {���ƹ�˵������л��λ};
    /unac {���ƶ�}
}

/al by2nh {by2nh+;n;yell}
/al by2nh+ {
    wlk;
    /ac {�����ϲ����Ϻ���}{d;sail north;/ticker {sail}{sail north}{4}};
    /ac {��ƴ���������˼���}{by2nh-;de2 {/2 w;/3 n}}
}
/al by2nh- {
    nwlk;
    /unticker {sail};
    /unac {�����ϲ����Ϻ���};
    /unac {��ƴ���������˼���}
}
/nop ç��
/al ml2tree+ {
    /var swing_num 0;
    /ac {~[33m����[2;37;0m}{climb tree};
    /ac {^��˳��������������}{/delay {0.1}{look}};
    /ac {^���Ŷ��ߵĺ���}{
        /math swing_num {$swing_num+1}
    }
}
/al ml2tree- {
    /var swing_num 0;
    /unac {~[33m����[2;37;0m};
    /unac {^��˳��������������};
    /unac {^���Ŷ��ߵĺ���}
}

/nop  fy2ml {fys;de1 {do s,s,s,s,s,s,climb tree;nwlk;}}
/al fy2ml {wlk;d;do s,s,s,s,s,s,s,s,s,s,s,s,s,s,climb tree;nwlk;}
/al ml2fy {ml2fy+;l}
/al ml2fy+ {
    wlk;
    ml2tree+;
    /ac {^������}{/delay {0.5}{swing north}};
    /ac {^ç�ֱ�Ե}{ml2fy-;do n,n,n,n;/delay {0.5}{fys-}}
}
/al ml2fy- {
    nwlk;
    ml2tree-;
    /unac {^������};
    /unac {^ç�ֱ�Ե}
}
/al ml2cx {ml2cx+;l}
/al ml2cx+ {
    wlk;
    ml2tree+;
    /ac {^������}{/delay {0.5}{swing west}};
    /ac {^ç�ֱ�Ե}{ml2cx-;do w,w,w,w;}
}
/al ml2cx- {
    nwlk;
    ml2tree-;
    /unac {^������};
    /unac {^ç�ֱ�Ե}
}

/al ml2wm {ml2wm+;l}
/al ml2wm+ {
    wlk;
    ml2tree+;
    /ac {^������}{swing east};
    /ac {^ç�ֱ�Ե}{/4 e;ml2wm-};
    /ac {^����÷֦��}{ml2wm-}
}
/al ml2wm- {
    nwlk;
    ml2tree-;
    /unac {^������};
    /unac {^ç�ֱ�Ե};
    /unac {^����÷֦��}
}


/nop al fy2zt {fy2zt+;d;/3 n;w;de1 {w;n;w;w;open door;w;jump}}
/al fy2zt {wlk;fy2zt+;pl {d;s;s;s;w;w;sw;w;buy_white_towel};pr;wlk}

/nop al zt2fy {open door;/2 e;s;e;e;de1 {wear baojia;wear all;remove shouhuan;/3 s;u}}
/al zt2fy {pl {wlk;open door;s;s;s;s;dd white towel;wear all;e;ne;e;e;n;n;n;u;fy2zt-};pr}
/al buy_white_towel {buy white towel from little yahuan;remove all;wear white towel}
/al fy2zt- {
    nwlk;
    /unac {^��������Ц����û�а�ë����ôϴ};
    /unac {^���Ǯ����};
    /unac {^����СѾ������һ����ë��};
    /unac {��е�ȫ���ޱȵ���̩};
    /unac {^��ӷ�ҶȪ��һԾ����}
}

/al fy2zt+ {
    wlk;
    /ac {^��������Ц����û�а�ë����ôϴ}{/3 s;buy_white_towel};
    /ac {^���Ǯ����}{fy2zt-};
    /ac {^����СѾ������һ����ë��}{remove all;wear white towel;/3 n;open door;n;jump};
    /ac {��е�ȫ���ޱȵ���̩} {wlk;jump};
    /ac {^��ӷ�ҶȪ��һԾ����} {/2 dd leaf;zt2fy;fy2zt-;nwlk}
}

/al fy2ztv {wlk;fy2ztv+;d;/3 s;w;w;sw;de1 {s;s;w;buy white towel from kid}}
/nop al fy2ztv {fy2ztv+;d;/3 n;e;de1 {e;n;east;east;open door;east;wash}}
/nop al zt2fyv {open door;/2 w;s;w;w;de1 {wear baojia;wear all;remove shouhuan;/3 s;u}}
/al ztv2fy {wlk;open door;/4 n;de1 {wear baojia;wear all;e;n;n;ne;e;e;/3 n;u;fy2ztv-}}
/al fy2ztv- {
    nwlk;
    /unac {^��ͯ����Ц����û�а�ë����ôϴ};
    /unac {^���Ǯ����};
    /unac {^����Сͯ����һ����ë��};
    /unac {��е�ȫ���ޱȵ���̩};
    /unac {^�������شӷ�ҶȪ��վ����}
}
/al fy2ztv+  {
    wlk;
    /ac {^��ͯ����Ц����û�а�ë����ôϴ}{/3 n;buy white towel from kid};
    /ac {^���Ǯ����}{fy2ztv-};
    /ac {^����Сͯ����һ����ë��}{remove all;wear white towel;/3 s;open door;s;wash};
    /ac {��е�ȫ���ޱȵ���̩} {wlk;wash};
    /ac {^�������شӷ�ҶȪ��վ������} {dd leaf;ztv2fy;fy2ztv-;nwlk}
}

/nop ������
/nop fy2cx {cx2fy-;fy2ml;fy2cx+}
/al fy2cx {fy2ml;/delay {5}{swing west;swing west};/delay {5.5}{do w,w,w,w;nwlk}}
/al fy2cx+ {
    wlk;
    /ac {^��ץ��ͻ������}{ml2cx+;};
    /ac {^����}{fy2cx-}
}
/al fy2cx- {
    nwlk;
    ml2cx-;
    /unac {^��ץ��ͻ������};
    /unac {^����}
}
/nop ����to����
/nop cx2fy {fy2cx-;cx2fy+;l;}
/al cx2fy {cx2sf;de1 {sf2sk};de2 {sk2fy}}
/al cx2fy+ {
    wlk;
    /ac {^�ϳǹ㳡}{/delay {0.2}{/6 e;climb tree}};
    /ac {^��ץ��ͻ������}{ml2fy+};
    /ac {^��������}{cx2fy-}
}
/al cx2fy- {
    nwlk;
    ml2fy-;
    /unac {^�ϳǹ㳡};
    /unac {^��ץ��ͻ������};
    /unac {^��������}
}
/nop ��÷
/nop al fy2wm {wlk;d;/7 s;de1 {/7 s;fy2wm+;climb tree}}
/al fy2wm {fy2ml;de3 {ml2wm};de10 {ml2wm-}}
/al wm2fy {wlk;/6 w;climb tree;de3 {ml2fy}}
/al wm2hhd {/6 e;swim}

/nop �Ϻ�
/al fy2nh {cx2fy-;wlk;d;/7 s;de1 {/7 s;fy2nh+;climb tree}}
/al fy2nh+ {
    /ac {^��˳��������������} {/ac {^ç�ֱ�Ե}{su;s;fy2nh-};swing south;de2 {swing south}};
}
/al fy2nh- {
    nwlk;
    /unac {^��˳��������������};
    /unac {^ç�ֱ�Ե}
}


/nop al nh2fy {nh2ml;/delay {0.5}{ml2fy}}
/al nh2fy {nh2ml;/delay {0.5}{ml2fy}}
/al nh2ml {wlk;do n,nd,n,n;nwlk}
/al nh2fy+ {
    /unac {ç�ֱ�Ե};
    /ac {^��˳��������������} {
    /ac {ç�ֱ�Ե}{do n,n,n,n;de1 {fys-;nh2fy-;by2fy-}};
    swing north;de3 {swing north}
    };
    /ac {^��������} {nh2fy-}
}
/al nh2fy- {
    nwlk;
    /unac {^��˳��������������};
    /unac {ç�ֱ�Ե};
    /unac {^��������}
}

/nop �ײĵ�
/al dxcin {push coffin}
/al dxcout {climb bag}
/al fy2dxc+ {
    wlk;
    /ac {^���������Ʋ��������}{ki huo ji};
    /ac {^������������}{dxcin;fy2dxc-}
}
/al fy2dxc- {
    nwlk;
    /unac {^���������Ʋ��������};
    /unac {^������������}
}
/al fy2dxc {fy2dxc+;pl {d;e;e;e;e;e;e;n;n;n;n;e;dxcin;nwlk};pr}
/al fy2dxc2 {wlk;fyn;de1 {l grass;stamp grass;nwlk}}
/al dxcout2 {l ring;pull ring}
/al dxc2fy {wlk;dxcout;de1 {w;/4 s;/6 w;u;nwlk}}
/al dxc2fy2 {wlk;dxcout2;de1 {sw;sw;s;fyw-}}
/al fy2dxc2 {wlk;fyn;/delay {1.5}{w;l grass;stamp grass};nwlk;}
/nop ǧ��¥
/al qjl2fy {wlk;e;ne;se;ne;/3 e;n;ne;/2 e;/3 n;u;nwlk}
/al qj2fy {wlk;do s,s,s,e,ne,se,ne,e,e,e,n,ne,e,e;n;n;n;u;nwlk}
/al fy2qj {wlk;fy2wm;de7 {e;keychain;wm2hhd}}
/nop ���㵽��ɽ
/al cx2hs {wlk;do n,nw,ne,nw,nw,ne,nd,nw,w,w,s,s,s,su;wu;wu;nwlk}
/al hs2cx {wlk;do ed,ed,nd,n,n,n,e,e,se,su,sw,se,se,sw;se;s;nwlk}

/nop ���Ƶ���ɽ
/al fy2hs {fy2cx;de7 cx2hs}
/nop al hs2fy {hs2cx;de2 {cx2fy}}
/al hs2fy {hs2cx;cx2fy+}
/al hs2hua {pl {wlk;wu;wu;wu;se;sw;se;sw;e;su;su;eu;su;slide rock;nwlk};pr}
/al maonv2hua {nd;sw;se;sw;e;su;su;eu;su;apprentice hua zhenzhen;slide rock}
/al hua2hs {pl {wlk;nd;slide rock;nd;wd;nd;nd;w;ne;nw;ne;nw;ed;ed;ed;nwlk};pr}
/al hsout {wlk;do s,ed,ne,nu,nw,wd,wu,wd,nd,nd,w,ne,nw,ne;nw;ed;nwlk}
/al hsin  {wlk;do wu,se,sw,se,sw,e,su,su,eu,ed,eu,se,sd,sw,wu;n;nwlk}
/nop ��ɽ
/al fy2sl {fyw;de1 {pl {wlk;w;nw;ne;nw;nu;nu;nu;nwlk};pr}}
/al sl2fy {wlk;do d,sd,sd,sd,se,sw,se,e;de1 {fyw-}}
/nop sl ������Ժ
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
/al jianfangzhang {pl {wlk;ask master about ������;answer ��Ҫ��;nd;nu;nd;nu;sd;nwlk};pr}
/al fy2yetu {fyw;de1 {pl {wlk;w;nw;ne;e;ne;e;sw;s;nwlk};pr}}
/al yetu2fy {pl {wlk;nu;n;ne;w;sw;w;sw;se;e;fyw-};pr}
/nop slhm ���ֺ���
/al fy2slhm {fyw;de1 {w;nw;ne;e;ne;e;sw;e;nwlk}}
/al slhm2fy {wlk;w;ne;w;sw;w;sw;se;e;de1 {fyw-}}
/nop ������
/nop ����ɽׯ
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

/nop ������
/al fg2hong {fg2hong+;/al fg2hong_do {w;look};do n,n,n,n,nu,wu,nu,nu,wu,nu,w;look;}
/al fg2hong+ {
    wlk;
    /ac {�������ֵĻ�ɫҰ��}{w;look};
    /ac {�������ֵ���ɫҰ��}{w;look};
    /ac {�������ֵĺ�ɫҰ��}{w;look};
    /ac {�������ֵ���ɫҰ��}{w;look};
    /ac {�������ֵİ�ɫҰ��}{/al fg2hong_do {do e,s,w,s,w};/ticker {migong}{fg2hong_do}{2}};
    /ac {^  ������(Daocao ren)}{/al fg2hong_do {l};pushaside grass;w;northwest;southwest;keychain;east;tear paper;de2 {/ticker {migong}{;};}}{4};
    /nop ac {^  ������(Daocao ren)}{/al fg2hong_do {l};pushaside grass;w;northwest;southwest;keychain;east;tear paper;de2 {/unticker {migong}}}{4};
    /ac {������ҡҡ�ڰ��ŵ�����ȥ��¶��һ��С·}{/ticker {migong}{;};fg2hong-;de8 {east;hp}};
    /ac {ֽ���Ѿ�����˺���ˡ�}{/ticker {tear}{tear paper}{5};};
    /ac {�����Ѿ���˺ֽ���ˡ�}{/ticker {tear}{tear paper}{5};};
    /ac {^�ķ�}{fg2hong-};
    /ac {^�㲻���Բ���grass}{l daocao ren};
    /ac {^��һ��ֽ����(paper)}{/ticker {migong}{;};tear paper}
}
/al fg2hong- {
    nwlk;
    drop paper;
    set brief3 1;
    /unticker {tear};
    /unticker {migong};
    /al fg2hong_do {;};
    /unac {�������ֵĻ�ɫҰ��};
    /unac {�������ֵ���ɫҰ��};
    /unac {�������ֵĺ�ɫҰ��};
    /unac {�������ֵ���ɫҰ��};
    /unac {�������ֵİ�ɫҰ��};
    /unac {^  ������(Daocao ren)};
    /unac {������ҡҡ�ڰ��ŵ�����ȥ��¶��һ��С·};
    /unac {ֽ���Ѿ�����˺���ˡ�};
    /unac {�����Ѿ���˺ֽ���ˡ�};
    /unac {^�㲻���Բ���grass};
    /unac {^��һ��ֽ����(paper)};
    /unac {^�ķ�}
}


/al hong2fg {wlk;fg2hong-;do e,e,e,e,leave,sd,ed,sd,sd,ed,sd,s,s,s,s;nwlk}
/al hong2fy {hong2fg;de2 {fg2fy}}

/nop ��ɽӭ����
/nop al cx2yks {pl {wlk;s;w;wu;wu;wd;wu;n;wu;nw;ne;nu;wd;s;se;nwlk};pr}
/al cx2yks {wlk;do s,w,wu,wu,wd,wu,n,wu,nw,ne,nu,wd,s,se;nwlk}
/al yks2cx {wlk;do nw,n,eu,sd,sw,se,ed,s,ed,eu,ed,ed,e,n;nwlk}
/al fy2yks {fy2cx;de7 {cx2yks}}
/al yks2fy {yks2cx;cx2fy+}
/nop monk ϴ���ַ� 10 silver/��
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
/nop sga �ɹ���
/al yks2sga {wlk;sw;w;wd;n;w;nwlk}
/al sga2yks {wlk;e;s;eu;e;ne;nwlk}
/al fy2sga {fy2yks;de8 {yks2sga}}
/al sga2fy {sga2yks;de1 {yks2fy}}

/nop ��ʶ��ͨ
/nop ff {conjure team_drift}
/al fff {fff+;fdf}
/al fff+ {
/ac {^�����ΧһƬ�ž�}{de10 {df2fy}};
/ac {^��̳}{fff-}
}
/al fff- {
/unac {^�����ΧһƬ�ž�};
/unac {^��̳}
}
/al fbat {ff;master yuan suiyun}
/al ffy {ffy+;ff;huang mazi}
/al ffy+ {
wlk;
/nop ac{^�����ķ�����}{de4 {tf};de8 {pl {n;n;e;e;e;e;u};pr}};
/ac {^�����ķ�����}{de4 {tf};de8 {do n,n,e,e,e,e,u;}};
/ac {^��̳}{ffy-}
}
/al ffy- {
/unac {^�����ķ�����};
/unac {^��̳}
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
    /ac {^ӥ���̺�}{de4 {tf};de8 {w;/3 s;e}};
    /ac {^ӭ÷��ջ}{fgw-}
}
/al fgw- {
    /unac {^ӥ���̺�};
    /unac {^ӭ÷��ջ}
}
/nop �ظ�max
/al fyw2max {wlk;do w,w,w,w,w,w,w,s;nwlk}
/al max2fyw {wlk;do n,e,e,e,e,e,e,e;nwlk}
/al fy2max {fyw;de1 {fyw2max}}
/al max2fy {max2fyw;de1 {fyw-}}
/nop �й�to max e,e
/al df2fy {e;e;max2fy}
/al dfin+ {
    wlk;
    /ac {^������}{dash};
    /ac {^������}{n;s};
    /ac {^�κ���}{w;drop pumpkin;dfin-}
}
/al dfin- {
    nwlk;
    /unac {^������};
    /unac {^������};
    /unac {^�κ���}
}
/al dfin {buy pumpkin from max;eat pumpkin;de3 {dfin+;dash}}
/al fy2df {fy2max;de2 {dfin}}
/nop al dfout {su;sd;s;/5 d;/delay {0.5}{/8 d};/delay {1.5}{/6 d;ne}}
/al dfout {do su,sd,s,s,d,d,d,d,d,d,d,d;de1 {do d,d,d,d,d,d,d,d,d,d,d,ne}}
/ac {^�����ܵ��ĵ����Ļ��Ч����ʧ��}{
    /ac {^����ͤ}{sw;s;dash mist};
    look;
    }
/ac {^����˺��ģ�һͷ����������֮��}{
    /unac {^�����ܵ��ĵ����Ļ��Ч����ʧ��};
    /unac {^����ͤ}
}
/nop ���Ƶ�����

/nop lz2gw {pl {wlk;w;w;w;w;w;w;w;w;w;w;w;w;w;s;e;nwlk};pr}
/al lz2gw {wlk;do w,w,w,w,w,w,w,w,w,w,w,w,w,s,e;nwlk}
/nop  gw2lz {pl {wlk;wi jade;w;n;e;e;e;e;e;e;e;e;e;e;e;e;e;nwlk};pr}
/al gw2lz {wlk;unwield all;wield jade;do w,n,e,e,e,e,e,e,e,e,e,e,e,e,e;nwlk}
/al gw2cx {gw2sj;wi jade;de2 {sj2cx}}
/nop al sj2cx {pl {wlk;e;e;s;s;su;sw;se;se;sw;se;s;nwlk};pr}
/al sj2cx {pl {wlk;do e,e,s,s,su,sw,se,se,sw,se,s;nwlk};pr}
/nop al gw2cx {gw2lz;de2 {lz2cx}}
/nop ���㵽����
/nop al lz2cx {pl {wlk;w;s;s;su;sw;se;se;sw;se;s;nwlk};pr}
/al lz2cx {pl {wlk;do w,s,s,su,sw,se,se,sw,se,s;nwlk};pr}
/al cx2gw {cx2sj;de2 {sj2gw}}
/nop ���� ɽ��
/nop al cx2sj {wlk;n;nw;northeast;nw;nw;northeast;n;nd;/delay {0.5}{n;nw;nw;w;w;w;/3 w};}
/nop al cx2sj {pl {wlk;n;nw;northeast;nw;nw;northeast;n;nd;n;nw;e;w;w;w;w;nwlk};pr}
/al cx2sj {wlk;n;nw;do northeast,nw,nw,northeast,n,nd,n,nw,e,w,w,w,w;nwlk}
/nop al cx2lz {pl {wlk;n;e;e;nw;ne;nw;nw;ne;n;nd;n;nw;nw;w;w;w};pr}
/al cx2lz {wlk;n;e;do e,nw,ne,nw,nw,ne,n,nd,n,nw,nw,w,w,w;}
/al gw2sj {wlk;do w,n,e,e,e,e,e,e,e,e,e,e;nwlk}
/al sj2gw {wlk;do w,w,w,w,w,w,w,w,w,w,s,e;nwlk}

/nop ���⵽̫ƽ��
/al lz2tp {wlk;do n,ne,nw,w,nw,nw,nw,sw;nwlk}
/al tp2lz {wlk;do wield jade,ne,se,se,se,e,se,sw,s;nwlk}
/al gw2tp {gw2lz;de2 {lz2tp}}
/al tp2gw {tp2lz;de2 {lz2gw}}
/al tp2fy {tp2lz;de2 {lz2fy}}
/al fy2tp {fy2lz;de9 {lz2tp}}
/nop ����СԺ
/al yhy2tp {wlk;do pull door,e,e,e,e,e,n,n,n,ne,ne;nwlk}
/al tp2yhy {tp2yhy+;do sw,sw,s,s,s,w,w,w,w,knock red door}
/al tp2yhy+ {
    wlk;
    /ac {^���ǿ��ŵ�}{w};
    /ac {^֨��һ��������}{de3 {w}};
    /ac {^����СԺ}{tp2yhy-}
}
/al tp2yhy- {
    nwlk;
    /unac {^���ǿ��ŵ�};
    /unac {^֨��һ��������};
    /unac {^����СԺ}
}
/al fy2yhy {fy2tp;de10 {tp2yhy}}
/al yhy2fy {yhy2tp;de2 {tp2fy}}
/nop ����
/al tp2guizi {pl {wlk;sw;sw;s;s;s;w;w;w;w;push black door;s;s;nwlk};pr}
/al guizi2tp {pl {wlk;n;n;pull door;n;e;e;e;e;n;n;n;ne;ne;nwlk};pr}
/al guizi2fy {guizi2tp;de2 {tp2fy}}
/al fy2guizi {fy2tp;de10 {tp2guizi}}
/nop mha÷����
/al tp2mha {pl {wlk;ne;w;w;w;nw;nu;nu;su;nu;wu;nu;wu;nwlk};pr}
/al mha2tp {pl {wlk;ed;sd;ed;sd;nd;sd;sd;se;e;e;sw;nwlk};pr}
/nop ���⵽���˹� ɽ��� -
/al lz2er {lz2tp;de2 {tp2er}}
/al er2lz {er2tp;de2 {tp2lz}}
/al tp2er {pl {wlk;ne;w;w;nw;nu;nu;su;nu;l rock;northdown;nd;nd;e;nwlk};pr}
/al er2tp {pl {wlk;w;su;su;southup;l rock;sd;nd;sd;sd;se;e;e;sw;nwlk};pr}

/al gw2er {gw2tp;de3 {tp2er}}
/al er2gw {er2tp;de3 {tp2gw}}
/al fy2er {fy2lz;de8 {lz2er}}
/al er2fy {er2lz;de4 {lz2fy}}
/nop ���⵽�߳�
/al gw2bc {gw2lz;de2 {lz2bc}}

/nop al lz2bc {pl {wlk;n;ne;nw;w;nw;nw;nw;w;w;nw;w;w;nw;w;w;w;w;nw;nwlk;keychain};pr}
/al lz2bc {wlk;do n,ne,nw,w,nw,nw,nw,w,w,nw,w,w,nw,w;keychain;w;w;w;w;nw;nwlk;}

/al bc2gw {bc2lz;de3 {lz2gw}}

/nop al bc2lz {pl {wlk;wi jade;se;e;e;e;e;se;e;e;se;e;e;se;se;se;e;se;sw;s;nwlk};pr}
/al bc2lz {pl {wlk;wi jade;se;e;e;e;do e,se,e,e,se,e,e,se,se,se,e,se,sw,s;nwlk};pr}
/al fy2bc {fy2lz;de9 {lz2bc}}
/al bc2fy {bc2lz;de3 {lz2fy}}
/nop �زر������
/al bc2khl {pl {wlk;se;e;e;e;e;s;s;w;w;su;sw;sw;sd;nwlk};pr}
/al khl2bc {pl {wlk;w;w;w;nu;ne;ne;ne;nd;e;e;n;n;w;w;w;w;nw;nwlk};pr}

/nop ���⵽������
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
    /ac {^�ϳǹ㳡}{cx2lz};
    /ac {^��Į��ɳ}{cx2lz-}
}
/al cx2lz- {
    nwlk;
    /unac {^�ϳǹ㳡};
    /unac {^��Į��ɳ}
}
/nop ����ɽ
/al hys2wlb {pl {wlk;wd;wu;wd;wu;nw;nw;w;w;n;nwlk};pr}
/al wlb2hys {pl {wlk;s;e;e;se;se;ed;eu;ed;eu;nwlk};pr}
/nop ��Į
/al lz2dsm {pl {wlk;n;ne;nw;w;nw;nw;nwlk};pr}
/al dsm2lz {pl {wlk;se;se;e;se;sw;s;nwlk};pr}

/al ���
/al lz2tf {wlk;do w,n,n,n,n,e,n;nwlk}
/al tf2sk {wlk;do s,w,s,s,s,s,e,e,e,e,e;nwlk}
/al fy2tf {fy2lz;de9 {lz2tf}}
/al tf2fy {tf2sk;de2 {sk2fy}}
/al tf2lz {wlk;do s,w,s,s,s,e,n,w;nwlk}
/al tf2wurong {do nw,w,n,n,n,n;askwurong}
/al wurong2tf {do s,s,s,s,s.e,s,e,e}

/nop ����
/al fy2sk {fyw;de1 {do w,w,w,w,w,w,w,w,w;nwlk}}
/al sk2fy {wlk;do e,e,e,e,e,e,e,e,e;de1 {fyw-}}
/nop ��Դ
/al fy2ty {wlk;/al ty_action {around;l};fy2wdz;fy2ty+;de2 {/4 e;ty_action}}
/al fy2ty+ {
    wlk;
    /ac {^�������κ����Եĳ�·����������ֻ���Ĵ�תת����}{around};
    /ac {^ˮ����̶�߳�����}{around};
    /ac {^��ת��תȥ��Ҳû�ҵ����ڣ�������·}{de1 {l}}{6};
    /ac {^  Ұ��(Rabbit)}{/al ty_action {/3 catch rabbit};/ticker {catch}{ty_action}{1}}{4};
    /ac {^Ұ����ת��ת��ٿ��һ�²�������Ӱ}{listen;se;e;};
    /ac {^��Դ��}{fy2ty-};
    /ac {^������С·�������ǰ���}{fy2ty-}
}

/al fy2ty- {
    nwlk;
    /unticker {catch};
    /unac {^�������κ����Եĳ�·����������ֻ���Ĵ�תת����};
    /unac {^ˮ����̶�߳�����};
    /unac {^��ת��תȥ��Ҳû�ҵ����ڣ�������·};
    /unac {^  Ұ��(Rabbit)};
    /unac {^Ұ����ת��ת��ٿ��һ�²�������Ӱ};
    /unac {^����Դ�塹 -};
    /unac {^������С·�������ǰ���}
}

/al ty2fy {ty2fy+;l}
/al ty2fy+ {
    wlk;
    /ac {^����ʯ��·}{w};
    /ac {^��Դ��}{push door;nw;w;around};
    /ac {^��ת��תȥ��Ҳû�ҵ����ڣ�������·����}{/delay {0.5}{around}};
    /ac {^    ����Ψһ�ĳ����� south��}{s;w;w;/delay {0.5}{wdz2fy;ty2fy-}}{4}
}
/al ty2fy- {
    nwlk;
    /unac {^����ʯ��·};
    /unac {^��Դ��};
    /unac {^��ת��תȥ��Ҳû�ҵ����ڣ�������·����};
    /unac {^    ����Ψһ�ĳ����� south��}
}

/nop ���ƿ�ջ
/al fykz {wlk;do d,s,s,s,e,e,se,s,e;nwlk}
/al kzfy {wlk;do w,n,nw,w,w,n,n,n,u;nwlk}

/al fy2mx {mx2fy-;fy2mx+;fye;do e,e,n,e,eu,eu;eu}
/al fy2mx+ {
    wlk;
    /ac {^������խ��ɽ��}{/al act_1 {de4 {act_1}}};
    /ac {��������������������ƺ�����������}{n;nu; /ticker {try}{wd;eu}{2}};
    /ac {^    �������Եĳ����� westup �� southdown��}{fy2mx-}{3};
    /ac {^�ƺ�����}{wd};
    /ac {^������}{fy2mx-;de3 {wd;nu;}};
    /ac {^ɽ��} {/al act_1 {nu;wu}; /unticker {try}}
}
/al fy2mx- {
    nwlk;
    /unticker {try};
    /unac {^������խ��ɽ��};
    /unac {^�ƺ�����};
    /unac {^������};
    /unac {��������������������ƺ�����������};
    /unac {^    �������Եĳ����� westup �� southdown��};
    /unac {^ɽ��}
}
/al mx2fy {fy2mx-;wlk;mx2fy+;look}
/al mx2fy+ {
    /ac {ɽ��}{sd;de3 {sd;l}};
    /ac {^    �������Եĳ����� westdown �� eastup��}{/delay {0.1}{wd};de3 {wd}};
    /ac {^��ã����·}{de1 {wd}};
    /ac {^��Ŭ������һ����խ��ɽ·}{de3 {sd;w}};
    /ac {^    �������Եĳ����� west �� eastup��}{w};
    /ac {^���·}{w;fye-;mx2fy-}
}
/al mx2fy- {
    nwlk;
    /unac {ɽ��};
    /unac {^��Ŭ������һ����խ��ɽ·};
    /unac {^    �������Եĳ����� westdown �� eastup��};
    /unac {^��ã����·}
    /unac {^    �������Եĳ����� west �� eastup��};
    /unac {^���·}
}
/al mxin+ {
    wlk;
    /ac {ɽ��}{nu;wu;nd;de3 {l}};
    /ac {^���㺣}{mxin-};
    /ac {^�ƺ�����}{wd};
    /ac {^������}{nu;wu}
}
/al mxin- {
    nwlk;
    /unac {ɽ��};
    /unac {^���㺣};
    /unac {^�ƺ�����};
    /unac {^������}
}
/al mxin {mxout-;mxin+;l}
/al mxout+ {
    wlk;
    /ac {^���㺣}{su};
    /ac {ɽ��}{ed;sd;de3 {l}};
    /ac {^��ã����·}{mxout-};
    /ac {^������}{ed;sd}
}
/al mxout- {
    nwlk;
    /unac {ɽ��};
    /unac {^���㺣};
    /unac {^��ã����·};
    /unac {^������}
}
/al mxout {mxin-;mxout+;l}
/nop ��˼��
/nop al fy2xsl {wlk;d;/5 e;de1 {/5 e};de2 {unwield all;/3 w;/4 e;s;nwlk}}
/al fy2xsl {pl {wlk;d;e;e;e;e;e;e;e;e;e;e;unwield all;w;w;w;e;e;e;e;s;nwlk};pr}
/al xsl2fy {pl {wlk;n;n;w;w;fye-;xslout-};pr}
/al fy2xsl2 {xslin+;fy2xsl}
/nop ������ - ʯ�Ʒ�
/al xslup+ {
    wlk;
    /ac {^������}{s};
    /ac {^�������}{s};
    /ac {^����ʯ}{jump up};
    /ac {^��������������»�}{hr;/delay {2.1}{hp};de6 {l}};
    /ac {^����һ����}{xslup-}
}
/al xslup- {
    nwlk;
    /unac {^������};
    /unac {^�������};
    /unac {^����ʯ};
    /unac {^��������������»�};
    /unac {^����һ����}
}
/al xslup {xslup+;l}
/al xsldd+ {
    wlk;
    /ac {^���籮}{jump down};
    /ac {^�������}{n;xsldd-};
    /ac {^����ʯ}{de2 {n}};
    /ac {^��������������»�}{hr;/delay {2.1}{hp};de6 {1}}
}
/al xsldd- {
    nwlk;
    /unac {^���籮};
    /unac {^�������};
    /unac {^����ʯ};
    /unac {^��������������»�}
}
/al xsldd {xsldd+;l}
/al fy2ljb {xslup+;fy2xsl}
/al ljb2fy {wlg2fy+;xsldd}
/al xslout2 {wlg2fy+;xslout}
/nop ljb ���籮 wlg ������
/al ljb2wlg+ {
    wlk;
    /ac {^���籮}{w};
    /ac {^ǧ������}{de2 {w}};
    /ac {^������}{de2 {su}};
    /ac {^�ط�ɽׯ}{su};
    /ac {^������}{ljb2wlg-}
}
/al ljb2wlg- {
    nwlk;
    /unac {^���籮};
    /unac {^ǧ������};
    /unac {^������};
    /unac {^�ط�ɽׯ};
    /unac {^������}
}
/al ljb2wlg {ljb2wlg+;l}
/al fy2wlg {
    fy2xsl;
    xslup+;
    ljb2wlg+
}
/al wlg2ljb+ {
    wlk;
    /ac {^ǧ������}{e;wlg2ljb-};
    /ac {^������}{e};
    /ac {^�ط�ɽׯ}{nd};
    /ac {^������}{nd}
}
/al wlg2ljb- {
    nwlk;
    /unac {^ǧ������};
    /unac {^������};
    /unac {^�ط�ɽׯ};
    /unac {^������}
}
/al wlg2ljb {wlg2ljb+;l}
/al wlg2fy+ {
    wlk;
    /ac {^������}{xsl2fy;wlg2fy-}
}
/al wlg2fy- {
    nwlk;
    /unac {^������}
}
/al wlg2fy {wlg2ljb;xsldd+;wlg2fy+}
/al xslin  {xslin+;/al xslin_do {n;l};l}
/al xslin+ {
   xslout-;
   xslup+;
    /ac {^���籮}{e};
    /ac {^�״�ʯ}{e};
    /ac {^ѩ�и�}{w};
    /ac {^��˼��}{/al xslin_do {n;get bag;l};/ticker {xslin_go}{xslin_do}{1}};
    /ac {^��¶��}{/al xslin_do {s;get bag;climb vine;look}};
    /ac {^ʯ�Ʒ�}{xslin-;/delay {2.1}{su;w;s}}
}
/al xslin- {
    xslup-;
    /unac {^���籮};
    /unac {^�״�ʯ};
    /unac {^ѩ�и�};
    /unac {^��˼��};
    /unticker {xslin_go};
    /unac {^��¶��};
    /unac {^ʯ�Ʒ�}
}
/al xslout {xslout+;/delay {0.2}{l}}
/al xslout+ {
xsldd+;
/ac {^�������}{out};
/ac {^������}{out};
/ac {^������}{sd};
/ac {^��ɽ��}{e};
/ac {^�ľ����}{e};
/ac {^���Ϻ�Ȫ}{n};
/ac {^��ľ����}{e};
/ac {^��¹�}{/2 nd;w;w;};
/ac {^�������������������}{hn;hp;l};
}
/al xslout- {
xsldd-;
/unac {^�������};
/unac {^������};
/unac {^������};
/unac {^��ɽ��};
/unac {^�ľ����};
/unac {^���Ϻ�Ȫ};
/unac {^��ľ����};
/unac {^��¹�};
/unac {^�������������������};
}
/al bingdong {bingdong+;/delay {0.2}{l}}
/al bingdong+ {
wlk;
/ac {^�������}{bingdong-};
/ac {^������}{enter;bingdong-};
/ac {^������}{enter};
/ac {^��ɽ��}{nu};
/ac {^�ľ����}{w};
/ac {^���Ϻ�Ȫ}{w};
/ac {^��ľ����}{s};
/ac {^��¹�}{w}
}
/al bingdong- {
nwlk;
/unac {^�������};
/unac {^������};
/unac {^������};
/unac {^��ɽ��};
/unac {^�ľ����};
/unac {^���Ϻ�Ȫ};
/unac {^��ľ����};
/unac {^��¹�}
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
    /ac {^÷��̶}{su};
    /ac {^ɽׯ��Ժ}{s};
    /ac {^������}{s};
    /ac {^�����}{w};
    /ac {^ɽׯǰԺ}{s};
    /ac {^����ׯ��}{do s,e,e,e,e,e,s,s,s,sd,w,s,e;};
    /ac {^��С��}{tx2gw-}
}
/al tx2gw- {
    nwlk;
    /unac {^÷��̶};
    /unac {^ɽׯ��Ժ};
    /unac {^������};
    /unac {^�����};
    /unac {^ɽׯǰԺ};
    /unac {^����ׯ��};
    /unac {^��С��}
}
/al tx2fy {tx2fy+;/delay {0.2}{tx2gw}}
/al tx2fy+ {
    /ac {^ӭ÷��ջ}{/delay {0.5}{gw2fy;tx2fy-}};
    /ac {^������}{tx2fy-}
}
/al tx2fy- {
    /unac {^ӭ÷��ջ};
    /unac {^������}
}
/nop al tx2gw {wlk;s;s;s;/5 e;de1 {/3 s;sd;w;s;e;nwlk}}
/nop fy to yin bin ����Ҷ

/al fy2yinbin {fy2qf;de4 {/2 e;/2 eu;nu;w;ask monk about meat};de6 {open door;s;pull С��;nwlk}}
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
    /ac {^��ǰ��ɫ�ƺ���Щ��Ϥ}{ylgw};
    /ac {^��������}{w}
}
/al yl2gw- {
    nwlk;
    /unac {^��ǰ��ɫ�ƺ���Щ��Ϥ};
    /unac {^��������}
}
/al gw2yl+ {
    wlk;
/ac {^�¶����ĺ�����¹�����}{agree to help};
/ac {^������Ц��Ц������ʱ�������㶼��Ҫ}{leave gu du mei};
/ac {^Ҷ�º����˵��:���ǿ�������}{e;ga rock;blow pipe};
/ac {^����֮���Ȼ������һ����}{e;gw2yl-}
}
/al gw2yl- {
    uwlk;
/unac {^�¶����ĺ�����¹�����};
/unac {^������Ц��Ц������ʱ�������㶼��Ҫ};
/unac {^Ҷ�º����˵��:���ǿ�������}
/unac {^����֮���Ȼ������һ����}
}
/al ygh+ {
    wlk;
    /ac {^�¶���˵�������ߡ�}{e};
    /ac {^�¶���˵���������ߡ�}{w};
    /ac {^�¶���˵���������ߡ�}{s};
    /ac {^�¶���˵�������ߡ�}{n};
    /ac {^�¶���˵�������ˡ�}{get pipe from rock;blow pipe;e;e;tell ghost no face;ygh-}
}
/al ygh- {
    nwlk;
    /unac {^�¶���˵�������ߡ�};
    /unac {^�¶���˵���������ߡ�};
    /unac {^�¶���˵���������ߡ�};
    /unac {^�¶���˵�������ߡ�};
    /unac {^�¶���˵�������ˡ�}
}

/nop ��ɽ
/nop al fy2hs {fy2cx;de7 {cx2hs}}
/nop al hs2fy {hs2cx;cx2fy+}

/nop ̫ƽto���˹�
/nop al tp2erg {pl {wlk;ne;w;w;nw;nu;nu;su;su;look stone;nd;nd;nd;nd;e;nwlk};pr}
/nop al erg2tp {pl {wlk;w;su;su;wu;wu;ed;sd;ed;sd;nd;sd;sd;se;e;e;sw;nwlk};pr}

/nop �˹�in
/al xgin {wlk;xgin+;/4 n;touch mark}
/al xgin+ {
    /ac {ͭ���۾���Ȼ����}{n;xgin-}
}
/al xgin- {
    nwlk;
    /unac {ͭ���۾���Ȼ����}
}

/al xgin2 {wlk;xgin2+;n;n;n;smile}

/al xgin2+ {
    /ac {������Ц��Ц��}{l;/delay {0.5}{smile}};
    /ac {���շ��ƺ�Ҳ����һ��Ц������}{n;xgin2-}
    /ac {^Τ�Ե�}{xgin2-};
    /ac {^������}{xgin2-}
}
/al xgin2- {
    nwlk;
    /unac {������Ц��Ц��};
    /unac {���շ��ƺ�Ҳ����һ��Ц������};
    /unac {^Τ�Ե�};
    /unac {^������}
}

/al xgin3 {wlk;n;e;push luowang;n;nwlk}
/nop al xgout {pl {wlk;w;w;push button;s;e;s;s;s;s;s;s;s;nwlk};pr}
/al xgout {wlk;do w,w,push button,s,e,s,s,s,s,s,s,s;nwlk}
/al fy2xg1 {fy2xg;de4 {xgin}}
/al fy2xg2 {fy2xg;de4 {xgin};de6 {xgin2}}
/al fy2xg3 {fy2xg;de4 {xgin};de8 {xgin2};/delay {15}{xgin3}}

/nop al fy2dqg {/7 e;de1 {/3 east;n;e;/3 eu;};de2 {sd;ed;n;w;w;/2 w};de3 {wd;/2 w;n;w;/3 wd}}
/nop ������ǧ��
/al qj2yyz {pl {wlk;n;n;nw;w;w;w;w;w;w;n;n;w;s;nwlk};pr}
/al yyz2qj {pl {wlk;n;e;s;s;e;e;e;e;e;e;se;s;s;nwlk};pr}
/al yyz2fy {yyz2qj;de2 {qj2fy}}
/al fy2yyz {fy2qj;/delay {24}{qj2yyz}}
/��ɽ ̫ƽ��ջ -
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
/nop ����
/al fyxl {do d,w,w,w,s}
/nop al fyxl {d;/3 w;s}
/al xlfy {do n,e,e,e;u}
/��Ǯ�� ������
/al fy2xwt {wlk;do d,w,w,w,w,n,n,w,n,w,open picture,wd,e;nwlk}
/al xwt2fy {pl {wlk;w;eu;e;s;e;s;s;e;e;e;e;u;nwlk};pr}

/nop ������
/al ehg2wdz {wlk;do nd,nd,nd,nd,nw,nw,n,n,n;nwlk}
/al wdz2ehg {wlk;do s,s,s,se,se,su,su,su,keychain,su,su;nwlk}
/al fy2ehg {fy2wdz;de2 {wdz2ehg}}
/al ehg2fy {ehg2wdz;de2 {wdz2fy}}
/nop ����
/al dtin {do listen,push door,l ����,open door,enter}
/al wdz2dt {wlk;do s,s,s,se,se,su,su,su,keychain,sw,sw,su;dtin;nwlk}
/al dt2wdz {wlk;do d,d,d,d,d,out,ne,nd,nd,nd,nw,nw,n,n,n;nwlk}
/al fy2dt {fy2wdz;de2 {wdz2dt}}
/al dt2fy {dt2wdz;de2 {wdz2fy}}
/nop ask baili about �鶫��
/al dt2jyt {jytin+;wlk;do u,u,u,u,u,u,u,u,jumpout window,drop dingxi note,d,u,jumpout window;nwlk}
/al jytin {jytin+;wlk;do push ��ǽ,enter,su,open ľǽ,eu;nwlk}
/al jytin+ {
   /ac {^��ǽ��}{push ��ǽ};
   /ac {��������ͨ�죬��ǽ������˿����}{push ��ǽ};
   /ac {^��ש��ʯ�׷�����}{/delay {0.5}{l}};
   /ac {^�ڲ�ש����֮�����ƺ��ҵ�}{do enter,su,open ľǽ,eu;jytin-}
}
/al jytin- {
   /unac {^��ǽ��};
   /unac {��������ͨ�죬��ǽ������˿����};
   /unac {^��ש��ʯ�׷�����};
   /unac {^�ڲ�ש����֮�����ƺ��ҵ�}
}
/al fy2jyt {fy2dt;de4 dt2jyt;}
/al jyt2fy {wlk;nd;ehg2fy;nwlk}
/nop �����
/nop al lz2khl {wlk;n;ne;nw;nw;wade strand;de2 {l;nwlk}}
/al wadeliusha {wade ɳ��}
/al cx2khl {cx2lz;de2 {lz2khl}}
/al lz2khl {lz2kqh;/delay {0.5}{khlin}}
/al fy2kqh {fy2lz;de9 {lz2kqh}}
/al khlin {khlin+;/delay {0.2}{l}}
/al khlin+ {
    /ac {^��ȸ��}{wadeliusha};
    /ac {^������}{/4 e;khlin-};
    /ac {^������}{/4 w;khlin-};
    /ac {^�Ϸ���}{/4 n;khlin-};
    /ac {^������}{/4 s;khlin-};
    /ac {^ʥ��}{khlin-}
}
/al khlin- {
    /unac {^��ȸ��};
    /unac {^������};
    /unac {^������};
    /unac {^�Ϸ���};
    /unac {^������};
    /unac {^ʥ��}
}
/al khlout {khlout+;/delay {0.2}{l}}
/al khlout+ {
    wlk;
    /ac {^�����}{/4 n;u};
    /ac {^�����}{/4 s;u};
    /ac {^�����}{/4 e;u};
    /ac {^�����}{/4 w;u};
    /ac {^ʥ��}{e};
    /ac {^��ȸ��}{khlout-};
    /ac {����}{u}
}
/al khlout- {
    nwlk;
    /unac {^�����};
    /unac {^�����};
    /unac {^�����};
    /unac {^�����};
    /unac {^ʥ��};
    /unac {^��ȸ��};
    /unac {����}
}
/al khl2fy {khlout;khl2fy+}
/al khl2fy+ {
/ac {^    ����Ψһ�ĳ����� southeast}{khl2fy-;kqh2fy}
}
/al khl2fy- {
/unac {^    ����Ψһ�ĳ����� southeast}
}
/al kqh2lz {wlk;se;se;sw;s;nwlk}
/al lz2kqh {wlk;n;ne;nw;nw;nwlk}
/al kqh2khl {kqh2lz;de1 {lz2khl}}
/al fy2khl {fy2lz;de9 {lz2khl}}
/al kqh2fy {kqh2lz;de1 {lz2fy}}
/al cx2tf {n;nw;ne;nw;nw;ne;nd;n;nw;n}
/nop ʯ���Ե -
/al tf2cx {s;/3 w;lz2cx}
/ac {^�����һ�����ڶ�ľ���ϻ��˻�}{nhq_force+;de1 {look}}
/al nhq_force+ {
/ac {^��ľΣ��}{e};
/ac {^��·��}{s};
/ac {^��ʯ��·}{s};
/ac {^ʯ����}{s};
/ac {^�κ���}{nhq_force-}
}
/al nhq_force- {
/unac {^��ľΣ��};
/unac {^��·��};
/unac {^��ʯ��·};
/unac {^ʯ����};
/unac {^�κ���}
}
/al ygdf {wlk;d;/4 w;/2 s;w;open picture;wd;open door;n;nwlk}
/al ygdf- {wlk;s;open door;eu;e;/2 n;/4 e;u;nwlk}
/al lll {say east;l east;say south;l south;say west;l west;say north;l north;}
/al jqin {wlk;d;/4 w;/2 n;w;n;w;open picture;wd;nwlk}
/al jqout {wlk;eu;e;s;e;/2 s;/4 e;u;nwlk}
/al xslnt {wlk;d;/2 n;e;n;ask youngman about ����;s;w;/2 s;u;nwlk}
/al sqnt {wlk;n;ask master about ����;s;open door;/6 s;climb down;nwlk}
/ac {^��һ�����ؾ���%1�ķ���������� %2 ��Ѱ����}{%2;de1 {read afrji}}
/nop ����կ
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
/ac {^�｣���ֵ�ס����˵����������˭}{answer ���㴨}
/al tp2lhz {wlk;ne;/2 w;nw;/2 w;nw;/delay {0.5}{/2 s;se;listen;l south;south;disarm;se;nwlk}}
/nop ���˶� yhgz �ƺ�����
/al fy2lan+ {
    wlk;
    /ac {^�ƺ�����}{ne;nw;n;nu};
    /ac {^���˶�}{fy2lan-}
}
/al fy2lan- {
    nwlk;
    /unac {^���˶�};
    /unac {^�ƺ�����}
}
/al fy2lan {fy2xrd;fy2lan+}
/al lan2fy+ {
    wlk;
    /ac {^�ƺ�����}{lan2fy-;xrd2fy};
    /ac {^���˶�}{sd;s;se;sw}
}
/al lan2fy- {
    nwlk;
    /unac {^�ƺ�����};
    /unac {^���˶�}
}
/al lan2fy {lan2fy+;l}
/nop tgs ������
/al tgs2bc {pl {wlk;nu;n;e;ne;ne;ne;nd;e;e;n;n;w;w;w;w;nw;nwlk};pr}
/al bc2tgs {pl {wlk;se;e;e;e;e;s;s;w;w;su;sw;sw;sw;w;s;sd;nwlk};pr}
/nop jqin2 ��ʱ��path
/al jqin2 {wlk;d;/2 e;/2 n;e;/delay {0.5}{n;/5 e;n;/3 e;nwlk}}
/al jqout2 {wlk;/5 w;s;/5 w;/delay {0.5}{s;w;/2 s;/2 w;u;nwlk}}
/al jqin3 {wlk;d;e;e;s;e;s;/delay {0.5}{/7 e;s};de1 {s;/6 e};/delay {1.5}{s;e;s;e;e;n;e;s;e;nwlk}}
/al jqout3 {wlk;w;n;w;s;w;w;n;w;n;/delay {0.5}{/6 w;n};de1 {n;/7 w;};/delay {1.5}{n;w;n;w;w;u;nwlk}}
/ac {^������Ȱ�խ�Ŵ�}{open door}
/al answerdm {;} 
/al lp {l picture}
/ac {^һ������ĹŰأ�������˳ʱ�뷽��šŤ��������}{/al answerdm {answer ��������};w;n;n;n;answerdm}
/ac {^̩ɽ��ǰ������������֮״����Ϊ�˰�}{/al answerdm {answer �°�����};w;n;n;n;answerdm}
/ac {^һ�ùŰ�֦��Ť�����ʣ�������������Ȼ�����Ŀ�}{/al answerdm {answer �����躮};w;n;n;n;answerdm}
/ac {^������һ�ùŰأ�����һ��֦�򱱣�����չ�����ɵ��ɺ�}{/al answerdm {answer �ɺ�չ��};w;n;n;n;answerdm}
/ac {^һ�ùŰأ��Դ�������ϣ���ӵ��ï�ܵ�֦Ҷ}{/al answerdm {answer ������̨};w;n;n;n;answerdm}
/ac {һ�ò���ͦ�Σ�֦��Ҷï�ĺ��أ��������������֦�Ľ��Ӵ�֮�ϳ���һ��^}{/al answerdm {answer ��ӡ���};w;n;n;n;answerdm}
/ac {^һ�ùŰ��������ٽ���һ����״����}{/al answerdm {answer ��������};w;n;n;n;answerdm}
/ac {^һ���ƻ����ߴ�ïʢ}{/al answerdm {answer �ƻ�����};w;n;n;n;answerdm}
/al cx2hy {wlk;do n,nw,ne,nw,nw,ne,nw,nd;nwlk}
/al hy2cx {wlk;do su,ne,sw,se,se,sw,se,s;nwlk}
/nop sf ʯ��
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
