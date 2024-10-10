CREATE TABLE "product_category" (
  "id" integer PRIMARY KEY NOT NULL,
  "name" varchar
);

CREATE TABLE "product" (
  "id" integer PRIMARY KEY NOT NULL,
  "name" varchar,
  "rate_score" integer,
  "product_category_id" integer,
  "product_style_id" integer,
  "description" text,
  "quantity_reviewers" integer,
  "offer_expire" time
);

CREATE TABLE "product_image" (
  "id" integer PRIMARY KEY NOT NULL,
  "produc_item_id" integer,
  "image_filename" varchar(255)
);

CREATE TABLE "color" (
  "id" integer PRIMARY KEY NOT NULL,
  "name" varchar
);

CREATE TABLE "product_item" (
  "id" integer PRIMARY KEY NOT NULL,
  "product_id" integer,
  "color_id" integer,
  "size_id" integer,
  "original_price" bigint,
  "sale_price" bigint
);

CREATE TABLE "size_option" (
  "id" integer PRIMARY KEY NOT NULL,
  "name" varchar
);

CREATE TABLE "product_style" (
  "id" integer PRIMARY KEY NOT NULL,
  "name" varchar
);

ALTER TABLE "product" ADD CONSTRAINT "product_category" FOREIGN KEY ("product_category_id") REFERENCES "product_category" ("id");

ALTER TABLE "product_item" ADD CONSTRAINT "color_item" FOREIGN KEY ("color_id") REFERENCES "color" ("id");

ALTER TABLE "product_item" ADD CONSTRAINT "product_item" FOREIGN KEY ("product_id") REFERENCES "product" ("id");

ALTER TABLE "product_image" ADD CONSTRAINT "image_item" FOREIGN KEY ("produc_item_id") REFERENCES "product_item" ("id");

ALTER TABLE "product_item" ADD CONSTRAINT "size_item" FOREIGN KEY ("size_id") REFERENCES "size_option" ("id");

ALTER TABLE "product" ADD CONSTRAINT "product_style" FOREIGN KEY ("product_style_id") REFERENCES "product_style" ("id");
