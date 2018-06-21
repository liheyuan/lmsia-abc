CREATE TABLE IF NOT EXISTS `user` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(256) NOT NULL,
    `createdTime` BIGINT(20) NOT NULL,
    `updatedTime` BIGINT(20) NOT NULL,
    PRIMARY KEY (`id`)
);