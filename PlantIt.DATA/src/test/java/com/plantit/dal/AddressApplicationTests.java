package com.plantit.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.plantit.dal.model.Address;
import com.plantit.dal.repository.AddressRepository;


@SpringBootTest
class AddressApplicationTests {

	@Autowired
	private AddressRepository addressRepository;

	@Test
	public void testCreateAddress() {
		Address address = new Address(230, 62490, "rue de Bellonne", "", "Noyelles-sous-Bellonne");
		addressRepository.save(address);
	}

}
