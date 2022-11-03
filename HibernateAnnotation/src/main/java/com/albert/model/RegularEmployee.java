package com.albert.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
// Table per hierarchy strategy (single table for parent and its subclasses)
// There will be null values
// @DiscriminatorValue("regular_employee")

// Table per concrete class
// @Table(name = "regular_employee102")
// @AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "id")),
// @AttributeOverride(name = "name", column = @Column(name = "name"))})

// Table per subclass, no duplicate column, use foreign key
@Table(name = "regular_employee103")
@PrimaryKeyJoinColumn(name = "employee_id")
public class RegularEmployee extends Employee {
  private float salary;
  private int bonus;

  public int getBonus() {
    return bonus;
  }

  public float getSalary() {
    return salary;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }
}
