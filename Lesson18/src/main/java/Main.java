public class Main {

    /*
    create table person(id int primary key,name varchar(25),is_man boolean,dateOfBirth date);
create table hobby(id int primary key,name varchar(25), type_id int constraint f_hobby_person references typeOfHobby(id))
create table typeOfHobby(id int primary key, type varchar(25));
create table relationship(id_person int  constraint f_person references person(id),id_hobby int  constraint f_hobby references hobby(id));
insert into person (id,name,is_man,dateofbirth) values
                                                    (1,'Андрей',true,'2003-08-11'),
                                                    (2,'Анжелика',false,'2004-01-10'),
                                                    (3,'Светлана',false,'1997-10-09'),
                                                    (4,'Дмитрий',true,'2010-12-29'),
                                                    (5,'Николай',true,'2002-08-04'),
                                                    (6,'Оксана',false,'2008-03-01'),
                                                    (7,'Василий',true,'2002-04-06'),
                                                    (8,'Борис',true,'2005-08-16'),
                                                    (9,'Иннокентий',true,'2012-11-05'),
                                                    (10,'Святозавр',true,'2018-06-02');


insert into typeofhobby (id,type) values
                                                    (1,'Активное'),
                                                    (2,'Пассивное')


insert into hobby (id, name, type_id)
values (1, 'Футбол',1),
       (2, 'Танцы',1),
       (3,'Чтение',2),
       (4, 'Хоккей',1),
       (5,'Вязание',2),
       (6,'Охота',1);

      //удаление всех таблиц
      drop table if exists person,hobby,typeofhobby,relationship;

     //Вывести всех людей старше какого-либо возраста
     select * from person where dateofbirth>'01-01-2005';

    // Вывести сколько людей каждого пола есть в бд
    select is_man,count(*) from person group by is_man;

   // Вывести информацию о людях и их хобби
      select p.name as Имя,h.name as Хобби from person p  left join relationship on p.id = relationship.id_person join hobby h on h.id = relationship.id_hobby;

  //  Вывести список людей у которых более одного хобби
  select p.name as Имя,count(*) as Количество_хобби from person p   join relationship on p.id = relationship.id_person join hobby h on h.id = relationship.id_hobby group by p.name having count(*)>1;

 //Вывести информацию какое хобби активное, а какое пассивное
 select h.name,t.type from hobby h join typeofhobby t on t.id = h.type_id


     */
}
