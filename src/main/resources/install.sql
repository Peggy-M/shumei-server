-- 开始事务
START TRANSACTION;

-- 插入白色短袖连衣裙数据
INSERT INTO app_products (saasId, storeId, spuId, title, primaryImage, available, minSalePrice, maxSalePrice,
                          spuStockQuantity, soldNum, isPutOnSale, categoryIds)
VALUES
    ('88888888', '1000', '0', '白色短袖连衣裙荷叶边裙摆宽松韩版休闲纯白清爽优雅连衣裙',
     'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09a.png', 1, 29800, 29800, 510, 1020, 1, NULL);

-- 获取最近插入的 productId
SET @dressId = LAST_INSERT_ID();

-- 插入规格数据
INSERT INTO app_specs (productId, title)
VALUES
    (@dressId, '颜色'),
    (@dressId, '尺码');

-- 获取最近插入的 specId
SET @colorSpecId = LAST_INSERT_ID() - 1; -- 颜色规格 ID
SET @sizeSpecId = LAST_INSERT_ID(); -- 尺码规格 ID

-- 插入规格值数据
INSERT INTO app_spec_values (specId, specValue)
VALUES
    (@colorSpecId, '米色荷叶边'),
    (@sizeSpecId, 'S'),
    (@sizeSpecId, 'M'),
    (@sizeSpecId, 'L');

-- 插入 SKU 数据
INSERT INTO app_skus (productId, skuId, skuImage)
VALUES
    (@dressId, '135676631', 'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09a.png');

-- 获取最近插入的 skuId
SET @skuId = LAST_INSERT_ID();

-- 插入库存信息
INSERT INTO stock_info (skuId, stockQuantity)
VALUES
    (@skuId, 175);

-- 插入标签数据
INSERT INTO app_tags (productId, title)
VALUES
    (@dressId, '限时抢购');

-- 插入限制信息
INSERT INTO limit_info (productId, text)
VALUES
    (@dressId, '限购5件');

-- 插入描述图片数据
INSERT INTO app_product_images (productId, imageUrl)
VALUES
    (@dressId, 'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09c.png'),
    (@dressId, 'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09d.png');

-- 插入运动连帽拉链卫衣数据
INSERT INTO app_products (saasId, storeId, spuId, title, primaryImage, available, minSalePrice, maxSalePrice,
                          spuStockQuantity, soldNum, isPutOnSale, categoryIds)
VALUES
    ('88888888', '1000', '135691628', '运动连帽拉链卫衣休闲开衫长袖多色运动细绒面料运动上衣',
     'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-17a.png', 1, 25900, 25900, 0, 1022, 1, NULL);

-- 获取最近插入的 productId
SET @hoodieId = LAST_INSERT_ID();

-- 插入规格数据
INSERT INTO app_specs (productId, title)
VALUES
    (@hoodieId, '颜色'),
    (@hoodieId, '尺码');

-- 获取最近插入的 specId
SET @colorSpecHoodieId = LAST_INSERT_ID() - 1; -- 颜色规格 ID
SET @sizeSpecHoodieId = LAST_INSERT_ID(); -- 尺码规格 ID

-- 插入规格值数据
INSERT INTO app_spec_values (specId, specValue)
VALUES
    (@colorSpecHoodieId, '军绿色'),
    (@sizeSpecHoodieId, 'XS'),
    (@sizeSpecHoodieId, 'S'),
    (@sizeSpecHoodieId, 'M'),
    (@sizeSpecHoodieId, 'L');

-- 插入 SKU 数据
INSERT INTO app_skus (productId, skuId, skuImage)
VALUES
    (@hoodieId, '135676632', 'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-17a.png');

-- 获取最近插入的 skuId
SET @hoodieSkuId = LAST_INSERT_ID();

-- 插入库存信息
INSERT INTO stock_info (skuId, stockQuantity)
VALUES
    (@hoodieSkuId, 0);

-- 插入标签数据
INSERT INTO app_tags (productId, title)
VALUES
    (@hoodieId, '热卖');

-- 插入限制信息
INSERT INTO limit_info (productId, text)
VALUES
    (@hoodieId, '限购3件');

-- 插入描述图片数据
INSERT INTO app_product_images (productId, imageUrl)
VALUES
    (@hoodieId, 'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-17b.png'),
    (@hoodieId, 'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-17c.png');

-- 插入纯色纯棉T恤数据
INSERT INTO app_products (saasId, storeId, spuId, title, primaryImage, available, minSalePrice, maxSalePrice,
                          spuStockQuantity, soldNum, isPutOnSale, categoryIds)
VALUES
    ('88888888', '1000', '135686633', '纯色纯棉休闲圆领短袖T恤纯白亲肤厚柔软细腻面料纯白短袖套头T恤',
     'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-08b.png', 1, 25900, 26900, 371, 1032, 1, NULL);

-- 获取最近插入的 productId
SET @tShirtId = LAST_INSERT_ID();

-- 插入规格数据
INSERT INTO app_specs (productId, title)
VALUES
    (@tShirtId, '颜色'),
    (@tShirtId, '尺码');

-- 获取最近插入的 specId
SET @colorSpecTShirtId = LAST_INSERT_ID() - 1; -- 颜色规格 ID
SET @sizeSpecTShirtId = LAST_INSERT_ID(); -- 尺码规格 ID

-- 插入规格值数据
INSERT INTO app_spec_values (specId, specValue)
VALUES
    (@colorSpecTShirtId, '白色'),
    (@sizeSpecTShirtId, 'S'),
    (@sizeSpecTShirtId, 'M'),
    (@sizeSpecTShirtId, 'L');

-- 插入 SKU 数据
INSERT INTO app_skus (productId, skuId, skuImage)
VALUES
    (@tShirtId, '135686634', 'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-08b.png');

-- 获取最近插入的 skuId
SET @tShirtSkuId = LAST_INSERT_ID();

-- 插入库存信息
INSERT INTO stock_info (skuId, stockQuantity)
VALUES
    (@tShirtSkuId, 371);

-- 插入标签数据
INSERT INTO app_tags (productId, title)
VALUES
    (@tShirtId, '新款');

-- 插入限制信息
INSERT INTO limit_info (productId, text)
VALUES
    (@tShirtId, '限购5件');

-- 插入描述图片数据
INSERT INTO app_product_images (productId, imageUrl)
VALUES
    (@tShirtId, 'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-08c.png'),
    (@tShirtId, 'https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-08d.png');

-- 提交事务
COMMIT;
