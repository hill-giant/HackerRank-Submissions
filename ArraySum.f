FUNCTION a_sum(n, a)
    IMPLICIT NONE
    INTEGER a_sum
    INTEGER :: n
    INTEGER :: s
    INTEGER :: i
    INTEGER, DIMENSION (n) :: a
    s = 0
    DO i = 1, n
        s = s + a(i)
    END DO
    a_sum = s
END FUNCTION

PROGRAM main
    IMPLICIT NONE
    INTEGER, ALLOCATABLE, DIMENSION (:) :: a
    INTEGER :: n
    INTEGER :: a_sum
    INTEGER :: i
    READ *, n
    ALLOCATE(a(n))
    READ(*, *) a
    WRITE (*, '(i0)') a_sum(n, a)
END PROGRAM main
