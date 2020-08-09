INSERT INTO user (user_id, username, password, email)
VALUES (1, 'siuming', '2ac9cb7dc02b3c0083eb70898e549b63', 'me@siuming.dev'),
       (2, 'mike', '2ac9cb7dc02b3c0083eb70898e549b63', 'mike@siuming.dev');

INSERT INTO todo_item (user_id, content, due_dt, create_dt)
VALUES (1, 'Complete coding exercise', null, '2020-08-01 12:00:00+08:00'),
       (2, 'Body check', '2020-08-10 13:00:00+08:00', '2020-08-01 14:00:00+08:00'),
       (2, 'Go to hktvmall O2O', '2020-08-04 18:00:00+08:00', '2020-08-01 14:01:00+08:00');