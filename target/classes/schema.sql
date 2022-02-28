CREATE TABLE `e_com`.`Users` (
  `user_id` INT NOT NULL,
  `email` VARCHAR(200) NOT NULL,
  `name` VARCHAR(200) NULL,
  `date_of_birth` DATE NULL,
  `phone` VARCHAR(100) NULL,
  `password` VARCHAR(100) NULL,
  `date_joined` DATE NULL,
  `date_modified` DATETIME NULL,
  `role` VARCHAR(20) NULL,
  `isactive` TINYINT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC, `user_id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci
COMMENT = 'fdfs';