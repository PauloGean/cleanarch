package com.paulolopes.cleanarch.core.dataprovider;

import com.paulolopes.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
	Address find(final String zipCode);
}
