# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table trajet (
  id                        bigint not null,
  depart                    varchar(255),
  arrivee                   varchar(255),
  date                      timestamp,
  constraint pk_trajet primary key (id))
;

create sequence trajet_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists trajet;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists trajet_seq;

