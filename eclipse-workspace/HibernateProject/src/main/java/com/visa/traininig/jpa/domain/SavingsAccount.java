package com.visa.traininig.jpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SA")
public class SavingsAccount extends Account {

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
		super();
	}
	public SavingsAccount(float balance) {
		super(balance);
	}

}
