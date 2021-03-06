PGDMP                         z            projeto_kevin    12.1    12.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                        1262    24587    projeto_kevin    DATABASE     ?   CREATE DATABASE projeto_kevin WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE projeto_kevin;
                postgres    false            ?            1259    24608    cliente    TABLE     ?   CREATE TABLE public.cliente (
    nome character varying(80),
    telefone integer,
    id_cliente bigint NOT NULL,
    cpf character varying
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            ?            1259    24606    cliente_id_cliente_seq    SEQUENCE        CREATE SEQUENCE public.cliente_id_cliente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.cliente_id_cliente_seq;
       public          postgres    false    207            !           0    0    cliente_id_cliente_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.cliente_id_cliente_seq OWNED BY public.cliente.id_cliente;
          public          postgres    false    206            ?            1259    24599    funcionario    TABLE     ?   CREATE TABLE public.funcionario (
    id_funcionario integer NOT NULL,
    nome character varying(100),
    idade integer,
    datanascimento character varying(10),
    imagem bytea
);
    DROP TABLE public.funcionario;
       public         heap    postgres    false            ?            1259    24597    funcionario_id_funcionario_seq    SEQUENCE     ?   CREATE SEQUENCE public.funcionario_id_funcionario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE public.funcionario_id_funcionario_seq;
       public          postgres    false    205            "           0    0    funcionario_id_funcionario_seq    SEQUENCE OWNED BY     a   ALTER SEQUENCE public.funcionario_id_funcionario_seq OWNED BY public.funcionario.id_funcionario;
          public          postgres    false    204            ?            1259    24590    produto    TABLE       CREATE TABLE public.produto (
    id_produto integer NOT NULL,
    produto character varying(75),
    data character varying(10),
    tipo character varying(75),
    valor integer,
    responsavel character varying(75),
    descricao character varying(1000),
    imagem bytea
);
    DROP TABLE public.produto;
       public         heap    postgres    false            ?            1259    24588    produto_id_produto_seq    SEQUENCE     ?   CREATE SEQUENCE public.produto_id_produto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.produto_id_produto_seq;
       public          postgres    false    203            #           0    0    produto_id_produto_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.produto_id_produto_seq OWNED BY public.produto.id_produto;
          public          postgres    false    202            ?
           2604    24611    cliente id_cliente    DEFAULT     x   ALTER TABLE ONLY public.cliente ALTER COLUMN id_cliente SET DEFAULT nextval('public.cliente_id_cliente_seq'::regclass);
 A   ALTER TABLE public.cliente ALTER COLUMN id_cliente DROP DEFAULT;
       public          postgres    false    207    206    207            ?
           2604    24602    funcionario id_funcionario    DEFAULT     ?   ALTER TABLE ONLY public.funcionario ALTER COLUMN id_funcionario SET DEFAULT nextval('public.funcionario_id_funcionario_seq'::regclass);
 I   ALTER TABLE public.funcionario ALTER COLUMN id_funcionario DROP DEFAULT;
       public          postgres    false    204    205    205            ?
           2604    24593    produto id_produto    DEFAULT     x   ALTER TABLE ONLY public.produto ALTER COLUMN id_produto SET DEFAULT nextval('public.produto_id_produto_seq'::regclass);
 A   ALTER TABLE public.produto ALTER COLUMN id_produto DROP DEFAULT;
       public          postgres    false    203    202    203                      0    24608    cliente 
   TABLE DATA           B   COPY public.cliente (nome, telefone, id_cliente, cpf) FROM stdin;
    public          postgres    false    207   ?                 0    24599    funcionario 
   TABLE DATA           Z   COPY public.funcionario (id_funcionario, nome, idade, datanascimento, imagem) FROM stdin;
    public          postgres    false    205   ?                 0    24590    produto 
   TABLE DATA           i   COPY public.produto (id_produto, produto, data, tipo, valor, responsavel, descricao, imagem) FROM stdin;
    public          postgres    false    203   l       $           0    0    cliente_id_cliente_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.cliente_id_cliente_seq', 1, false);
          public          postgres    false    206            %           0    0    funcionario_id_funcionario_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.funcionario_id_funcionario_seq', 1, true);
          public          postgres    false    204            &           0    0    produto_id_produto_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.produto_id_produto_seq', 1, true);
          public          postgres    false    202            ?
           2606    24613    cliente cliente_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    207            ?
           2606    24615    funcionario funcionario_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT funcionario_pkey PRIMARY KEY (id_funcionario);
 F   ALTER TABLE ONLY public.funcionario DROP CONSTRAINT funcionario_pkey;
       public            postgres    false    205            ?
           2606    24617    produto produto_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (id_produto);
 >   ALTER TABLE ONLY public.produto DROP CONSTRAINT produto_pkey;
       public            postgres    false    203                  x?????? ? ?         `  x???ɒ%5E?UC[??/????????|?C???x9ʲ|ϵ???????o4ވ????_??r??{???V?R????? n?????????
-G?E:?Xc?-*b?qIiSӥ?:/Z<X?p?̼X^?R???!ѧ?吒-),????g%??^?-J??	?L?E????{?#a??P?@U?(?"P?<GD)??ozڠ?????e(????1?2L{??? Ί??)ګo?o?!F6?B???9?`"h?@Ө?EyB|2??YEX????%?????L\TJ?T?	Mx?ML??-,??]\??=<??CB??#"??SR??32???KJ??+*??C67:7?'O?:m????f/?f???+V?Z?y??m?w?ܵ?Ё??;~?????r???7o?????-??=??E?x??????4???D??X?P?#>l????????(?R0F??`???;=?v??????Mb??2??????׋???{????f@?C??.(N?{[w?3!R???+'m\?$=#??Ol]?g??r???k?$L3?v]]??[+?X?aRUȽ Өs?/???X?+N???gK????,	?kjlqX?t҆??ħ??Gqt?D???>?X?k?t..`Bi'???L߂)T??dH{`?-??]??r?y??`????
??{f??40pH-??=??L??@`? 6Q???]??z?E??X?}X????+9?E?Z?w:?L|z? ?R??a?J?@l?ۤסt[k???ITf?4Y?????S4?5?q??Z1?s[8ֻ? ?F2?\?s\??\?gQ@?@b.?|???????(]??@?8fz??Q?;T???rʙ??y?V;ph??????W???#         =  x???;??6E???x??e? ?8??????q?[?l?JO??= Eoߪ????/?,o???($o??O????[?}??????1-??:_<???qح1Tpc?9Ný?Z?Ũ?IG?=ڦ$&????.??u???ʇW捰????-Q????KJK??#?^???^??k?M?y?`?_??y?w??2?^'??G9????????????]????]???Q8?]???a?˜?h+????c????<??
	???h?pf'??4??Y??'3n??*2?%??C?^?l?ѝ\``2?A%??I?P7???)S3???VS?N?s????\\?|?{xz???????JNIM˙???U????0?`P?x??ek._?r?F?lݶ??;w5????l???:tPBG??y???S%v???;?߸y???#????_??3/?΋_?;???^?_=?>Z`?J@???(c~h? U~?=???1B?K??
??ۥOj?1?7?????????Wt?/V+??sVܑ{q+6?{p???:?s??{#??????_:??jǲIQ?X???bQ\??4?^?&??T?­??c ?????Q??}|0????7??h??C?;?΀????M?"hl?????gGV??A?g{??t,iF???j????%?P?B?G?$???Z,??/^?]3mj?#5uuT0?nd7ܶ??o#??n&j??????K???`^H???ec?3 ????Nt??g??R?	;X??(???????ZAD'?{l?<?(?,?+c??{K?[]??m?aQ;p?Б޹f??H???gm(#?m(Mlӷ??????? )2?&     