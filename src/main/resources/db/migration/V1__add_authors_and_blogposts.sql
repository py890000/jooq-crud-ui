CREATE TABLE "person" (
  "id" BIGINT PRIMARY KEY AUTO_INCREMENT,
  "name" VARCHAR(60)
);

CREATE TABLE "blog_post" (
  "id" BIGINT PRIMARY KEY AUTO_INCREMENT,
  "title" VARCHAR(100) NOT NULL,
  "content" VARCHAR(10000) NOT NULL,
  "author" BIGINT REFERENCES "person"("id")
);