-- 사용자 임시 데이터
INSERT INTO users (
    student_id, department, school_year, major, gender, name, phone,
    profile_image, user_id, password, join_date, is_deleted, is_verified
) VALUES
('20240001', '소프트웨어융합대', 1, '컴퓨터공학과', 'M', '강대기', '010-1111-2222', NULL, 'test1', '1234', NOW(), FALSE, TRUE),
('20240002', '소프트웨어융합대', 2, '소프트웨어학과', 'F', '김현철', '010-3333-4444', NULL, 'test2', '1234', NOW(), FALSE, FALSE),
('20240003', '디자인대학', 3, '패션디자인학과', 'F', '박지수', '010-5555-6666', NULL, 'test3', '1234', NOW(), FALSE, TRUE);
