# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table task (
  id                        bigint not null,
  label                     varchar(255),
  time_creation             timestamp,
  time_ending               timestamp,
  seconds_ending            integer,
  status                    varchar(9),
  important                 boolean,
  constraint ck_task_status check (status in ('PENDING','COMPLETED','CANCELED','DELAYED')),
  constraint pk_task primary key (id))
;

create sequence task_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists task;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists task_seq;

