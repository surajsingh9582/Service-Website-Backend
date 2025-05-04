package com.connect.repositary;

import com.connect.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<user,Long> {
}
