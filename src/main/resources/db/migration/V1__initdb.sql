drop table if exists book;

create table book (
                      id binary(16) not null,
                      isbn varchar(255),
                      publisher varchar(255),
                      title varchar(255),
                      primary key (id)
) engine=InnoDB;

create table author (
                      id binary(16) not null,
                      first_name varchar(255),
                      last_name varchar(255),
                      primary key (id)
) engine=InnoDB;
