package in.ahmed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ahmed.binding.Quote;
import in.ahmed.service.GetQuotes;

@Controller
public class QuoteController {
	@Autowired
	private GetQuotes getQuotes;

	@GetMapping("/")
	public String LoadForm(Model model) {

		List<Quote> msg = getQuotes.getMsg();
		System.out.println(msg);
		model.addAttribute("quote", msg);

		return "index";
	}

}
