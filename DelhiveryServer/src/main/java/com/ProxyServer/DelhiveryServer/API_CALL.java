package com.ProxyServer.DelhiveryServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class API_CALL {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/data/{id}")
	  @CrossOrigin(origins = "https://www.uavmarketplace.in")
	public String Data(@PathVariable String id) {
		
		String data = restTemplate.getForObject("https://track.delhivery.com/api/v1/packages/json/?waybill="+id+"&token=57b6b1d451e2e8ab0abf2e3414d6dbd529111ee7", String.class);
		return data;
	}
	
}


//async function trackOrder() {
  /*  const trackingId = document.getElementById('trackingId').value;
    const apiKey = '57b6b1d451e2e8ab0abf2e3414d6dbd529111ee7'; // Replace with your API key
    const apiUrl = `https://track.delhivery.com/api/v1/packages/json/?waybill=${trackingId}&token=${apiKey}`;
    const corsProxy = 'https://cors-anywhere.herokuapp.com/'; // CORS proxy to bypass CORS restrictions*/
    