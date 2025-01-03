package in.ahmed.binding;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotesResponse {
	private List<Quote> quotes;
}
