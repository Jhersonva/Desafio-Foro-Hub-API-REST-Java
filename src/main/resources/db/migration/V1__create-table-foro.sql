
create table topico(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(100) not null,
    fechaCreacion date,

    primary key(id)

);
