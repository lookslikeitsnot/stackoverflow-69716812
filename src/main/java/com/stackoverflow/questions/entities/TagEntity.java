package com.stackoverflow.questions.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tag")
public class TagEntity {
  @Id
  private Long id;

  @ManyToOne
  @JoinColumn(name = "plan_id", referencedColumnName = "id")
  private PlanEntity plan;
}
