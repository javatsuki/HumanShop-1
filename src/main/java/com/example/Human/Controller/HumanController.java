package com.example.Human.Controller;


@Controller

//トップ画面へのマッピング
@RequestMapping("HumanShop")
public class HumanController {
	@Autowired
	private HumanShop humanShop;
	
	
	@GetMapping
	public String Index(Model model) {
		List<P>
	}
}
