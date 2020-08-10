DROP TABLE IF EXISTS todo_item;
DROP TABLE IF EXISTS user;

CREATE TABLE IF NOT EXISTS user (
    PRIMARY KEY (id),
    id       BIGINT       NOT NULL AUTO_INCREMENT,
    username VARCHAR(50)  NOT NULL,
    password VARCHAR(100) NOT NULL,
    email    VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS todo_item (
    PRIMARY KEY (id),
    id        BIGINT      NOT NULL AUTO_INCREMENT,
    user_id   BIGINT      NOT NULL,
    content   TEXT        NOT NULL,
    due_dt    DATETIME(6),
    create_dt DATETIME(6) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id)
);