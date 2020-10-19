package App.repository;


import App.domain.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ChatRepository extends JpaRepository<Chat, BigInteger> {
}
