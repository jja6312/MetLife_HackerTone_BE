CREATE TABLE `Products` (
  `id` integer PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `product_feature` varchar(255)
);

CREATE TABLE `special_contacts` (
  `id` integer PRIMARY KEY,
  `product_id` varchar(10) NOT NULL,
  `category` varchar(30) NOT NULL,
  `name` varchar(10) NOT NULL,
  `payment_period` varchar(30),
  `payment_age` varchar(30),
  `guarantee_amount` integer,
  `month_payment_amount` integer
);

CREATE TABLE `filter_product` (
  `age_group` integer,
  `gender` varchar(10),
  `product_id` integer,
  `recommand_rank` varchar(10),
  PRIMARY KEY (`age_group`, `gender`, `product_id`)
);

insert into `Products`(id,name,product_feature) VALUES(1, '(무)360암보험','["최대 100세까지(20년갱신)  \n 주계약 암진단비 최대 1억 보장","3대 특정암 보장강화 및 납입면제 혜택까지","3대 특정암도 차등없이 주계약 가입금액 대비 100% 가입가능","주계약은 감액기간 없이 암보장개시일부터 가입금액의 100% 지급"]');
insert into `Products`(id,name,product_feature) VALUES(2, '(무)아이사랑첫보험','["태아와 산모 모두 보호해주니까 안심","큰 병도 보장해주니까 든든","질병 및 사고를 다양하게 보장","고객 니즈에 따라 맞춤 선택 가능"]');
insert into `Products`(id,name,product_feature) VALUES(3, '(무)360치매간병보험','["경증치매부터 중증치매까지 \n 단계별로 든든하게 치매진단비 보장","중등도치매, 중증치매 진단 후 살아계시는 동안, 생활비 종신 지급","노인장기요양등급 판정 후 시설급여/ 재가급여/ 주야간보호 이용 시 \n 매월 지원금을 최대 종신까지 지급"]');

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(1,1,'진단','일반암','5','70',50000000,96000);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(2,1,'진단','일반암','10','70',50000000,48000);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(3,1,'진단','일반암','20','70',50000000,24000);

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(4,1,'진단','일반암','5','80',50000000,141000);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(5,1,'진단','일반암','10','80',50000000,75000);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(6,1,'진단','일반암','20','80',50000000,38000);

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(7,1,'진단','일반암','5','100',50000000,200000);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(8,1,'진단','일반암','10','100',50000000,100000);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(9,1,'진단','일반암','20','100',50000000,60000);

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(10,1,'진단','10대고액암','5','70',50000000,5765);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(11,1,'진단','10대고액암','10','70',50000000,2845);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(12,1,'진단','10대고액암','20','70',50000000,1422);

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(13,1,'진단','10대고액암','5','80',50000000,7444);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(14,1,'진단','10대고액암','10','80',50000000,3515);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(15,1,'진단','10대고액암','20','80',50000000,1700);

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(16,1,'진단','10대고액암','5','100',50000000,9000);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(17,1,'진단','10대고액암','10','100',50000000,4760);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(18,1,'진단','10대고액암','20','100',50000000,2350);


insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(19,1,'수술','암수술특약','5','70',10000000,23000);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(20,1,'수술','암수술특약','10','70',10000000,11900);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(21,1,'수술','암수술특약','20','70',10000000,5765);

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(22,1,'수술','암수술특약','5','80',10000000,34400);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(23,1,'수술','암수술특약','10','80',10000000,17200);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(24,1,'수술','암수술특약','20','80',10000000,8600);

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(25,1,'수술','암수술특약','5','100',10000000,54000);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(26,1,'수술','암수술특약','10','100',10000000,23700);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(27,1,'수술','암수술특약','20','100',10000000,11500);


insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(28,1,'입원','암입원특약(15년)','5','70',6000000,1073);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(29,1,'입원','암입원특약(15년)','10','70',6000000,1073);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(30,1,'입원','암입원특약(15년)','20','70',6000000,1073);

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(31,1,'입원','암입원특약(15년)','5','80',6000000,1073);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(32,1,'입원','암입원특약(15년)','10','80',6000000,1073);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(33,1,'입원','암입원특약(15년)','20','80',6000000,1073);

insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(34,1,'입원','암입원특약(15년)','5','100',6000000,1073);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(35,1,'입원','암입원특약(15년)','10','100',6000000,1073);
insert into `special_contacts`(id,product_id,category,name,payment_period,payment_age,guarantee_amount,month_payment_amount) VALUES(36,1,'입원','암입원특약(15년)','20','100',6000000,1073);

select * from Products;