DROP TABLE products IF EXISTS;

/* CREATE TABLE */
CREATE TABLE products(
skuID DOUBLE,
product_name VARCHAR(100),
product_description VARCHAR(100),
seller VARCHAR(100),
category VARCHAR(100),
total_stocks DOUBLE,
current_stock DOUBLE,
color VARCHAR(100),
brand VARCHAR(100),
size VARCHAR(100),
retail_cost DOUBLE,
cost_price DOUBLE,
discount_eligible VARCHAR(100),
max_discounts DOUBLE,
last_updated VARCHAR(100)
);

/* INSERT QUERY NO: 1 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
22458, 'Shirts', 'Mens Casual Shirt', 'Flipkart', 'Mens_Shirts', 1000, 250, 'Red', 'test1', 'M', 999, 455, 'FALSE', 0, ''
);

/* INSERT QUERY NO: 2 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
22459, 'Shirts', 'Mens Casual Shirt', 'Flipkart', 'Mens_Shirts', 1000, 655, 'Red', 'test1', 'L', 999, 455, 'FALSE', 0, ''
);

/* INSERT QUERY NO: 3 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
22460, 'Shirts', 'Mens Casual Shirt', 'Flipkart', 'Mens_Shirts', 1000, 862, 'Red', 'test1', 'XL', 999, 455, 'FALSE', 0, ''
);

/* INSERT QUERY NO: 4 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
22461, 'Shirts', 'Mens Casual Shirt', 'Flipkart', 'Mens_Shirts', 1000, 124, 'Red', 'test1', 'XXL', 999, 455, 'FALSE', 0, ''
);

/* INSERT QUERY NO: 5 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
22462, 'Shirts', 'Mens Casual Shirt', 'Flipkart', 'Mens_Shirts', 1000, 889, 'Red', 'test1', 'XS', 999, 455, 'FALSE', 0, ''
);

/* INSERT QUERY NO: 6 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
22463, 'Shirts', 'Mens Casual Shirt', 'Flipkart', 'Mens_Shirts', 1000, 221, 'Red', 'test1', 'S', 999, 455, 'FALSE', 0, ''
);

/* INSERT QUERY NO: 7 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
56241, 'Tshirt', 'Mens Solid Regular Fit T-Shirt', 'Amazon', 'Mens_Tshirts', 600, 554, 'Green', 'US Polo Association', 'XXL', 699, 239, 'TRUE', 25, ''
);

/* INSERT QUERY NO: 8 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
56242, 'Tshirt', 'Mens Solid Regular Fit T-Shirt', 'Amazon', 'Mens_Tshirts', 600, 223, 'Green', 'US Polo Association', 'M', 699, 239, 'TRUE', 25, ''
);

/* INSERT QUERY NO: 9 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
56243, 'Tshirt', 'Mens Solid Regular Fit T-Shirt', 'Amazon', 'Mens_Tshirts', 600, 285, 'Blue', 'US Polo Association', 'M', 699, 239, 'TRUE', 25, ''
);

/* INSERT QUERY NO: 10 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
56244, 'Tshirt', 'Mens Solid Regular Fit T-Shirt', 'Amazon', 'Mens_Tshirts', 600, 45, 'Green', 'US Polo Association', 'XL', 699, 239, 'TRUE', 25, ''
);

/* INSERT QUERY NO: 11 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
56245, 'Tshirt', 'Mens Solid Regular Fit T-Shirt', 'Amazon', 'Mens_Tshirts', 600, 663, 'Red', 'US Polo Association', 'XL', 699, 239, 'TRUE', 25, ''
);

/* INSERT QUERY NO: 12 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
56246, 'Tshirt', 'Mens Solid Regular Fit T-Shirt', 'Amazon', 'Mens_Tshirts', 600, 252, 'Green', 'US Polo Association', 'L', 699, 239, 'TRUE', 25, ''
);

/* INSERT QUERY NO: 13 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
56247, 'Tshirt', 'Mens Solid Regular Fit T-Shirt', 'Amazon', 'Mens_Tshirts', 600, 452, 'Pink', 'US Polo Association', 'L', 699, 239, 'TRUE', 25, ''
);

/* INSERT QUERY NO: 14 */
INSERT INTO products(skuID, product_name, product_description, seller, category, total_stocks, current_stock, color, brand, size, retail_cost, cost_price, discount_eligible, max_discounts, last_updated)
VALUES
(
56248, 'Tshirt', 'Mens Solid Regular Fit T-Shirt', 'Amazon', 'Mens_Tshirts', 600, 12, 'Green', 'US Polo Association', 'S', 699, 239, 'TRUE', 25, ''
);

