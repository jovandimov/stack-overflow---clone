CREATE TABLE AppUser
(
    id            bigserial primary key,
    username      text not null,
    name          text not null,
    surname       text not null,
    email         text not null,
    app_user_role text default 'USER'
);

CREATE TABLE activation_tokens
(
    token       text primary key,
    app_user_id bigint not null,
    constraint fk_activation_tokens_app_user_id foreign key (app_user_id) references app_users (id)
);

CREATE TABLE Question
(
    id bigserial primary key,
    question_text text not null,
    

);