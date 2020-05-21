package com.example.whiskyshop.whiskyservice;


import com.example.whiskyshop.whiskyservice.models.Customer;
import com.example.whiskyshop.whiskyservice.models.Order;
import com.example.whiskyshop.whiskyservice.models.Whisky;
import com.example.whiskyshop.whiskyservice.repositories.CustomerRepository;
import com.example.whiskyshop.whiskyservice.repositories.OrderRepository;
import com.example.whiskyshop.whiskyservice.repositories.WhiskyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WhiskyserviceApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	OrderRepository orderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveCustomerDetailsToStore(){
		Customer customer1 = new Customer("Peter", "Gemmell", "PeteG", "info@thegentlemanselect.com", "Yo22");
		customerRepository.save(customer1);
	}

	@Test
	public void canSaveWhiskyToStock(){
		Whisky whisky1 = new Whisky("Dalwhinnie", "Winters Frost", "Highland", "43%", "70cl", "https://cdn.shopify.com/s/files/1/0248/6121/2758/products/5000267173757_T2_1024x1024@2x.jpg", 12.99, 33.99, "Extreme conditions are responsible for shaping the signature Dalwhinnie Winter's Frost honeyed sweetness and spicy warmth.", 0, false);
		whiskyRepository.save(whisky1);
	}




}
