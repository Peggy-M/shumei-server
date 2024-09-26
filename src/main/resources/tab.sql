CREATE TABLE app_products (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              saasId VARCHAR(20),
                              storeId VARCHAR(20),
                              spuId VARCHAR(20),
                              title VARCHAR(255),
                              primaryImage VARCHAR(255),
                              available INT,
                              minSalePrice INT,
                              maxSalePrice INT,
                              spuStockQuantity INT,
                              soldNum INT,
                              isPutOnSale INT,
                              categoryIds VARCHAR(255)
) ENGINE=InnoDB;

-- 提交产品表的创建
COMMIT;

CREATE TABLE app_specs (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           productId INT,
                           specId VARCHAR(20),
                           title VARCHAR(50),
                           FOREIGN KEY (productId) REFERENCES app_products(id) ON DELETE CASCADE
) ENGINE=InnoDB;

-- 提交规格表的创建
COMMIT;

CREATE TABLE app_spec_values (
                                 id INT AUTO_INCREMENT PRIMARY KEY,
                                 specId VARCHAR(20),
                                 specValue VARCHAR(50)
) ENGINE=InnoDB;

-- 提交规格值表的创建
COMMIT;

CREATE TABLE app_skus (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          productId INT,
                          skuId VARCHAR(20),
                          skuImage VARCHAR(255),
                          FOREIGN KEY (productId) REFERENCES app_products(id) ON DELETE CASCADE
) ENGINE=InnoDB;

-- 提交 SKU 表的创建
COMMIT;

CREATE TABLE stock_info (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            skuId INT,
                            stockQuantity INT,
                            FOREIGN KEY (skuId) REFERENCES app_skus(id) ON DELETE CASCADE
) ENGINE=InnoDB;

-- 提交库存信息表的创建
COMMIT;

CREATE TABLE app_tags (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          productId INT,
                          title VARCHAR(50),
                          FOREIGN KEY (productId) REFERENCES app_products(id) ON DELETE CASCADE
) ENGINE=InnoDB;

-- 提交标签表的创建
COMMIT;

CREATE TABLE limit_info (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            productId INT,
                            text VARCHAR(50),
                            FOREIGN KEY (productId) REFERENCES app_products(id) ON DELETE CASCADE
) ENGINE=InnoDB;

-- 提交限制信息表的创建
COMMIT;

CREATE TABLE app_product_images (
                                    id INT AUTO_INCREMENT PRIMARY KEY,
                                    productId INT,
                                    imageUrl VARCHAR(255),
                                    FOREIGN KEY (productId) REFERENCES app_products(id) ON DELETE CASCADE
) ENGINE=InnoDB;

-- 提交描述图片表的创建
COMMIT;
