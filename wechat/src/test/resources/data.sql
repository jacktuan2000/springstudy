
INSERT INTO WE_User (id, modifiedDate, accountNonExpired, accountNonLocked, credentialsNonExpired, email, enabled, firstLogin, mobile, nickName, password, username) VALUES (3, null, true, true, true, null, true, true, null, null, 'admin', 'admin');
INSERT INTO WE_User (id, modifiedDate, accountNonExpired, accountNonLocked, credentialsNonExpired, email, enabled, firstLogin, mobile, nickName, password, username) VALUES (4, null, true, true, true, null, true, true, null, null, 'user', 'user');

INSERT INTO WE_Resource (id, modifiedDate, Name, content, enabled, remark, type) VALUES (1, null, '所有页面', '/**', true, '所有页面', 'requesturl');
INSERT INTO WE_Resource (id, modifiedDate, Name, content, enabled, remark, type) VALUES (2, null, '人员', '/person/*', true, '人员', 'requesturl');


INSERT INTO WE_Authoritie (id, modifiedDate, authority, user_id) VALUES (1, null, 'ROLE_ADMIN', 3);
INSERT INTO WE_Authoritie (id, modifiedDate, authority, user_id) VALUES (2, null, 'ROLE_USER', 3);
INSERT INTO WE_Authoritie (id, modifiedDate, authority, user_id) VALUES (3, null, 'ROLE_USER', 4);