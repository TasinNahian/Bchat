package com.thebengalichat.repository;

import com.thebengalichat.model.Chat;
import com.thebengalichat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChatRepository extends JpaRepository<Integer, Chat> {

    @Query("select c form Chat c join c.users u where u.id = :userId")
    public List<Chat> findChatByUserId(@Param("userId") Integer userId);
    @Query("select c from chat c where c.isGroup=false and :user in c.users And :reqUser in c.users")
    public Chat findSingleChatByUserIds(@Param("user")User user, @Param("reqUser") User reqUser);
}
