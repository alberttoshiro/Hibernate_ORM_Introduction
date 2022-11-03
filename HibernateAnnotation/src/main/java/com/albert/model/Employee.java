package com.albert.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity


// Table per hierarchy strategy (single table for parent and its subclasses)
// There will be null values
// @Table(name = "employee101")
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name = "employee_type", discriminatorType = DiscriminatorType.STRING)
// @DiscriminatorValue(value = "employee")

// Table per concrete class strategy, 1 table for each class
// @Table(name = "employee102")
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

// Table per subclass, no duplicate column, use foreign key
@Table(name = "employee103")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }



}
