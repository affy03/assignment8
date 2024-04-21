DROP TABLE IF EXISTS assessments;

CREATE TABLE assessments (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(100) NOT NULL,
 posture VARCHAR(100) NOT NULL,
 goal VARCHAR(100) NOT NULL,
 PRIMARY KEY(id)
);cko

INSERT INTO assessments (name, posture, goal) VALUES ('中村', 'フラットバック', '腰椎改善');
INSERT INTO assessments (name, posture, goal) VALUES ('上野', 'ロードシス', '重心を引き上げて身軽になる');
INSERT INTO assessments (name, posture, goal) VALUES ('熊川', 'スウェイバック', '肩こり改善');
