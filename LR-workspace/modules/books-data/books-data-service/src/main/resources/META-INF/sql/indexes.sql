create index IX_D58BCB9D on ZU_Books (author[$COLUMN_LENGTH:75$], title[$COLUMN_LENGTH:75$]);
create index IX_3FE02BC on ZU_Books (title[$COLUMN_LENGTH:75$]);
create index IX_D9B1E9C0 on ZU_Books (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F629E042 on ZU_Books (uuid_[$COLUMN_LENGTH:75$], groupId);