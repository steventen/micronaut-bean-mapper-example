create table if not exists companies (
    id text not null primary key,
    company_name text not null,
    company_value numeric
);

insert into companies (id, company_name, company_value)
values ('a', 'company a', 123.22) on conflict do nothing;

insert into companies (id, company_name, company_value)
values ('b', 'company b', 253.25) on conflict do nothing;