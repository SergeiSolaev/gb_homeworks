# 1. Создайте таблицу с мобильными телефонами, используя графический интерфейс. 
#    Необходимые поля таблицы: product_name (название товара), manufacturer (производитель), product_count (количество), price (цена). 
#    Заполните БД произвольными данными.

	CREATE TABLE `geekbrains`.`mobile_phones` (
	  `idmobile_phones` INT NOT NULL,
 	 `product_name` VARCHAR(45) NULL,
 	 `manufacturer` VARCHAR(45) NULL,
 	 `product_count` INT NULL,
 	 `price` INT NULL,
 	 PRIMARY KEY (`idmobile_phones`));


	INSERT INTO `geekbrains`.`mobile_phones` (`idmobile_phones`, `product_name`, `manufacturer`, `product_count`, `price`) VALUES ('1', 'Poco m5', 'Xiaomi', '20', '99');
	INSERT INTO `geekbrains`.`mobile_phones` (`idmobile_phones`, `product_name`, `manufacturer`, `product_count`, `price`) VALUES ('2', 'Redmi 12', 'Xiaomi', '30', '120');
	INSERT INTO `geekbrains`.`mobile_phones` (`idmobile_phones`, `product_name`, `manufacturer`, `product_count`, `price`) VALUES ('3', 'A50', 'Samsung', '56', '79');
	INSERT INTO `geekbrains`.`mobile_phones` (`idmobile_phones`, `product_name`, `manufacturer`, `product_count`, `price`) VALUES ('4', 'Honor 70', 'Honor', '79', '169');
	INSERT INTO `geekbrains`.`mobile_phones` (`idmobile_phones`, `product_name`, `manufacturer`, `product_count`, `price`) VALUES ('5', 'Iphone 8', 'Apple', '2', '999');

# 2. Напишите SELECT-запрос, который выводит название товара, производителя и цену для товаров, количество которых превышает 2

	SELECT product_name, manufacturer, price FROM geekbrains.mobile_phones WHERE product_count > 2;

# 3. Выведите SELECT-запросом весь ассортимент товаров марки “Samsung”

	SELECT * FROM geekbrains.mobile_phones WHERE manufacturer = 'Samsung';

# 4.* С помощью SELECT-запроса с оператором LIKE / REGEXP найти:

  # 4.1.* Товары, в которых есть упоминание "Iphone"

	SELECT * FROM geekbrains.mobile_phones WHERE product_name LIKE '%Iphone%'OR manufacturer LIKE '%Iphone%';

  # 4.2.* Товары, в которых есть упоминание "Samsung"

	SELECT * FROM geekbrains.mobile_phones WHERE product_name LIKE '%Samsung%'OR manufacturer LIKE '%Samsung%';

  # 4.3.* Товары, в названии которых есть ЦИФРЫ

	SELECT * FROM geekbrains.mobile_phones WHERE product_name REGEXP '[0-9]';

  # 4.4.* Товары, в названии которых есть ЦИФРА "8"

	SELECT * FROM geekbrains.mobile_phones WHERE product_name LIKE '%8%';
