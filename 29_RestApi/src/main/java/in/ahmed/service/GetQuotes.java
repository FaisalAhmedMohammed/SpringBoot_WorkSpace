package in.ahmed.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ahmed.binding.Quote;
import in.ahmed.binding.QuotesResponse;

@Service
public class GetQuotes {
	public static final String providerUrl = "https://dummyjson.com/quotes";

	public List<Quote> getMsg() {
		RestTemplate rst = new RestTemplate();

		// Fetching the response which contains a list of quotes
		ResponseEntity<QuotesResponse> forEntity = rst.getForEntity(providerUrl, QuotesResponse.class);

		// Extracting the list of quotes from the response body
		return forEntity.getBody() != null ? forEntity.getBody().getQuotes() : List.of();
	}
}
