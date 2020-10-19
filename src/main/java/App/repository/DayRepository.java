package App.repository;

import App.domain.Day;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface DayRepository extends JpaRepository<Day, BigInteger> {
}
