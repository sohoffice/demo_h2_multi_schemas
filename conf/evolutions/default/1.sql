# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table foo.A (
  ID                        varchar(255) not null,
  NAME                      varchar(255),
  constraint pk_A primary key (ID))
;

create table bar.B (
  ID                        varchar(255) not null,
  NAME                      varchar(255),
  constraint pk_B primary key (ID))
;

create sequence foo.A_seq;

create sequence bar.B_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists foo.A;

drop table if exists bar.B;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists foo.A_seq;

drop sequence if exists bar.B_seq;

