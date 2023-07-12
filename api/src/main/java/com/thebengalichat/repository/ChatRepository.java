package com.thebengalichat.repository;

import com.thebengalichat.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Integer, Chat> {
}
