BEGIN TRANSACTION;
insert into Music ( userName, userEmail, userRole, userToken, userStatus, userLastUpdate ) 
values  ('Ultron', 'ultron@evilones.com', 'admin', 'evil', '1', datetime('now'));
COMMIT;
