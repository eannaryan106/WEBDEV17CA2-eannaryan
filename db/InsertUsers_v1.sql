BEGIN TRANSACTION;
insert into User ( userName, userEmail, userRole, userToken, userStatus, userLastUpdate ) 
values  ('Larry', 'larry@toast.com', 'parent', 'music4life', '1', datetime('now')
);
COMMIT;
