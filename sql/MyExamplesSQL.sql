DROP SCHEMA IF EXISTS `billing_simple` ;
CREATE SCHEMA IF NOT EXISTS `billing_simple` DEFAULT CHARACTER SET utf8 ;
USE `billing_simple` ;

-- -----------------------------------------------------
-- Table `billing_simple`.`billing`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `billing_simple`.`billing` ;

CREATE TABLE IF NOT EXISTS `billing_simple`.`billing` (
  `payer_email` VARCHAR(255) NULL,
  `recipient_email` VARCHAR(255) NULL,
  `sum` DECIMAL(18,2) NULL,
  `currency` VARCHAR(3) NULL,
  `billing_date` DATE NULL,
  `comment` TEXT NULL)
ENGINE = InnoDB;

Выведите поступления денег от пользователя с email 'vasya@mail.com'.
В результат включите все столбцы таблицы и не меняйте порядка их вывода. Если, конечно, хотите успешно пройти проверку результата запроса )
select * from billing where payer_email='vasya@mail.com';

Задание
Добавьте в таблицу одну запись о платеже со следующими значениями:
email плательщика: 'pasha@mail.com'
email получателя: 'katya@mail.com'
сумма: 300.00
валюта: 'EUR'
дата операции: 14.02.2016
комментарий: 'Valentines day present)'
insert into billing (payer_email, recipient_email, sum, currency, billing_date, comment)
  values ('pasha@mail.com', 'katya@mail.com','300.00','EUR','2016-02-14', 'Valentines day present)');
  
Измените адрес плательщика на 'igor@mail.com' для всех записей таблицы, где адрес плательщика 'alex@mail.com'.
UPDATE billing SET  payer_email='igor@mail.com' WHERE  payer_email='alex@mail.com';

Удалите из таблицы записи, где адрес плательщика или адрес получателя установлен в неопределенное значение или пустую строку.
DELETE FROM billing WHERE (payer_email is null or payer_email='') OR  (recipient_email is null or recipient_email='');



