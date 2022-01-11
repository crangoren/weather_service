drop table weather_history if exists;
create table if not exists weather_history (weather_date date default current_date primary key, weather_value varchar(255));