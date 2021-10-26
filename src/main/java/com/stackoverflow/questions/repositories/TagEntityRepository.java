package com.stackoverflow.questions.repositories;

import java.util.List;
import com.stackoverflow.questions.entities.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagEntityRepository extends JpaRepository<TagEntity, Long> {
  List<TagEntity> findByPlanId(Long planId);
}
