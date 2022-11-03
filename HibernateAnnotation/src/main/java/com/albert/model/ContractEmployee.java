package com.albert.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
// Table per hierarchy strategy (single table for parent and its subclasses)
// There will be null values
// @DiscriminatorValue("contract_employee")

// Table per concrete class
// @Table(name = "contract_employee102")
// @AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "id")),
// @AttributeOverride(name = "name", column = @Column(name = "name"))})

// Table per subclass, no duplicate column, use foreign key
@Table(name = "contract_employee103")
@PrimaryKeyJoinColumn(name = "employee_id")
public class ContractEmployee extends Employee {

  private float payPerHour;
  private String contractDuration;

  public String getContractDuration() {
    return contractDuration;
  }

  public float getPayPerHour() {
    return payPerHour;
  }

  public void setContractDuration(String contractDuration) {
    this.contractDuration = contractDuration;
  }

  public void setPayPerHour(float payPerHour) {
    this.payPerHour = payPerHour;
  }


}
