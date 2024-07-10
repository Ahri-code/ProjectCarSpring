
    create table bici (
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        tipo_ammortizzatore integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici_ammortizzatore (
        ammortizzatore_id integer not null,
        bici_id integer not null
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer,
        id integer not null auto_increment,
        numero_porte integer,
        targa varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer,
        id integer not null auto_increment,
        targa varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_ammortizzatore (
        code integer not null,
        descrizione varchar(50),
        primary key (code)
    ) engine=InnoDB;

    create table tipo_colore (
        code_colore integer not null,
        descrizione varchar(50),
        primary key (code_colore)
    ) engine=InnoDB;

    create table tipo_marca (
        code_marca integer not null,
        descrizione varchar(255),
        primary key (code_marca)
    ) engine=InnoDB;

    create table tipo_veicolo (
        code_tipo varchar(255) not null,
        descrizione varchar(255),
        primary key (code_tipo)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        code_tipo integer not null,
        descrizione varchar(255),
        primary key (code_tipo)
    ) engine=InnoDB;

    create table veicolo (
        bici_id integer,
        id integer not null auto_increment,
        id_alimentazione integer,
        id_colore integer,
        id_marca integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer not null,
        numero_ruote integer not null,
        id_veicolo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_p3befe2jxy5drox4u9o4oi4et unique (bici_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici_ammortizzatore 
       add constraint FK37o1xye9ockvo2dbpdb9ak1ab 
       foreign key (ammortizzatore_id) 
       references tipo_ammortizzatore (code);

    alter table bici_ammortizzatore 
       add constraint FKt9bv4ogsxe6h38cc7r00j1dbm 
       foreign key (bici_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK6jk1gq3xedcbw7gvqenyff1t2 
       foreign key (bici_id) 
       references bici (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKgi33b1q1hwr42atlh93xfebc 
       foreign key (id_alimentazione) 
       references tipo_alimentazione (code_tipo);

    alter table veicolo 
       add constraint FKjh4yrda0txg5xkmbeldfxk5v9 
       foreign key (id_colore) 
       references tipo_colore (code_colore);

    alter table veicolo 
       add constraint FKdggqjsdi5ax5jk5lex47thv4f 
       foreign key (id_marca) 
       references tipo_marca (code_marca);

    alter table veicolo 
       add constraint FKsm3arkaa7h9acfbw3nov1871e 
       foreign key (id_veicolo) 
       references tipo_veicolo (code_tipo);

    create table bici (
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        tipo_ammortizzatore integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici_ammortizzatore (
        ammortizzatore_id integer not null,
        bici_id integer not null
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer,
        id integer not null auto_increment,
        numero_porte integer,
        targa varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer,
        id integer not null auto_increment,
        targa varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_ammortizzatore (
        code integer not null,
        descrizione varchar(50),
        primary key (code)
    ) engine=InnoDB;

    create table tipo_colore (
        code_colore integer not null,
        descrizione varchar(50),
        primary key (code_colore)
    ) engine=InnoDB;

    create table tipo_marca (
        code_marca integer not null,
        descrizione varchar(255),
        primary key (code_marca)
    ) engine=InnoDB;

    create table tipo_veicolo (
        code_tipo varchar(255) not null,
        descrizione varchar(255),
        primary key (code_tipo)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        code_tipo integer not null,
        descrizione varchar(255),
        primary key (code_tipo)
    ) engine=InnoDB;

    create table veicolo (
        bici_id integer,
        id integer not null auto_increment,
        id_alimentazione integer,
        id_colore integer,
        id_marca integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer not null,
        numero_ruote integer not null,
        id_veicolo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_p3befe2jxy5drox4u9o4oi4et unique (bici_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici_ammortizzatore 
       add constraint FK37o1xye9ockvo2dbpdb9ak1ab 
       foreign key (ammortizzatore_id) 
       references tipo_ammortizzatore (code);

    alter table bici_ammortizzatore 
       add constraint FKt9bv4ogsxe6h38cc7r00j1dbm 
       foreign key (bici_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK6jk1gq3xedcbw7gvqenyff1t2 
       foreign key (bici_id) 
       references bici (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKgi33b1q1hwr42atlh93xfebc 
       foreign key (id_alimentazione) 
       references tipo_alimentazione (code_tipo);

    alter table veicolo 
       add constraint FKjh4yrda0txg5xkmbeldfxk5v9 
       foreign key (id_colore) 
       references tipo_colore (code_colore);

    alter table veicolo 
       add constraint FKdggqjsdi5ax5jk5lex47thv4f 
       foreign key (id_marca) 
       references tipo_marca (code_marca);

    alter table veicolo 
       add constraint FKsm3arkaa7h9acfbw3nov1871e 
       foreign key (id_veicolo) 
       references tipo_veicolo (code_tipo);

    create table bici (
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        tipo_ammortizzatore integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici_ammortizzatore (
        ammortizzatore_id integer not null,
        bici_id integer not null
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer,
        id integer not null auto_increment,
        numero_porte integer,
        targa varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer,
        id integer not null auto_increment,
        targa varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_ammortizzatore (
        code integer not null,
        descrizione varchar(50),
        primary key (code)
    ) engine=InnoDB;

    create table tipo_colore (
        code_colore integer not null,
        descrizione varchar(50),
        primary key (code_colore)
    ) engine=InnoDB;

    create table tipo_marca (
        code_marca integer not null,
        descrizione varchar(255),
        primary key (code_marca)
    ) engine=InnoDB;

    create table tipo_veicolo (
        code_tipo varchar(255) not null,
        descrizione varchar(255),
        primary key (code_tipo)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        code_tipo integer not null,
        descrizione varchar(255),
        primary key (code_tipo)
    ) engine=InnoDB;

    create table veicolo (
        bici_id integer,
        id integer not null auto_increment,
        id_alimentazione integer,
        id_colore integer,
        id_marca integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer not null,
        numero_ruote integer not null,
        id_veicolo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_p3befe2jxy5drox4u9o4oi4et unique (bici_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici_ammortizzatore 
       add constraint FK37o1xye9ockvo2dbpdb9ak1ab 
       foreign key (ammortizzatore_id) 
       references tipo_ammortizzatore (code);

    alter table bici_ammortizzatore 
       add constraint FKt9bv4ogsxe6h38cc7r00j1dbm 
       foreign key (bici_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK6jk1gq3xedcbw7gvqenyff1t2 
       foreign key (bici_id) 
       references bici (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKgi33b1q1hwr42atlh93xfebc 
       foreign key (id_alimentazione) 
       references tipo_alimentazione (code_tipo);

    alter table veicolo 
       add constraint FKjh4yrda0txg5xkmbeldfxk5v9 
       foreign key (id_colore) 
       references tipo_colore (code_colore);

    alter table veicolo 
       add constraint FKdggqjsdi5ax5jk5lex47thv4f 
       foreign key (id_marca) 
       references tipo_marca (code_marca);

    alter table veicolo 
       add constraint FKsm3arkaa7h9acfbw3nov1871e 
       foreign key (id_veicolo) 
       references tipo_veicolo (code_tipo);
