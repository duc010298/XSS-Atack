create table if not exists data
(
    id            		serial       not null primary key,
    data_object          text,
    time_up               date
);
