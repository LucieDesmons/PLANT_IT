package com.plantit.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.plantit.dal.entities.Address;
import com.plantit.dal.repositories.AddressRepository;

import java.util.List;


@SpringBootTest
class AddressApplicationTests {

	@Autowired
	private AddressRepository addressRepository;

	@Test
	public void testCreateAddress() {
		Address address = new Address(1195, 69280, "Avenue Marcel Mérieux", "Bâtiment A, RDC", "Marcy-l'Etoile");
		addressRepository.save(address);
	}

	@Test
	public void testFindAddress()
	{
		Address a = addressRepository.findById(1L).get();
		System.out.println(a);
	}

	@Test
	public void testUpdateAddress()
	{
		Address a = addressRepository.findById(1L).get();
		a.setTown("Noyelles");
		addressRepository.save(a);
	}

	@Test
	public void testDeleteAddress()
	{
		addressRepository.deleteById(8L);;
	}

	@Test
	public void testListAllAddresses()
	{
		List<Address> addresses = addressRepository.findAll();
		for (Address a : addresses)
		{
			System.out.println(a);
		}
	}

}
