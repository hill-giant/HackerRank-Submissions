DELIMITER //
CREATE PROCEDURE triangle(n INT)
BEGIN
    SET @i = n + 1;
    REPEAT
        SELECT REPEAT('* ', @i:=@i-1);
    UNTIL @i = 0 END REPEAT;
END
//
DELIMITER ;
CALL triangle(20);
