package webbanhang.service.impl;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webbanhang.dto.ProductDto;
import webbanhang.entity.ProductEntity;
import webbanhang.mapper.ProductMapper;
import webbanhang.repository.ProductRepository;
import webbanhang.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
//	@Autowired
//	ProductMapper productMapper; 
	
	@Override
	public ProductDto saveOne(ProductDto dto,Long id) {	
		ProductMapper productMapper = new ProductMapper(); 
		ProductEntity entity = productMapper.convertToEntity(dto);
		productRepository.save(entity);
		return new ProductDto(entity);
	}
	
}
