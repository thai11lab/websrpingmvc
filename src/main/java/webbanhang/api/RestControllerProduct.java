package webbanhang.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import webbanhang.dto.ProductDto;
import webbanhang.service.ProductService;

@RestController(value = "apiProduct")
@RequestMapping("/api/product")
public class RestControllerProduct {
	
	@Autowired
	ProductService productService;
	
	@PostMapping
	public ProductDto addProduct(@RequestBody ProductDto dto){
		ProductDto result = productService.saveOne(dto,null);
		return result;
	}
}
