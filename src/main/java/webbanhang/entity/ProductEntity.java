package webbanhang.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import webbanhang.dto.ProductDto;

@Entity
@Table(name = "product")
public class ProductEntity  extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	
	@Column(name="code")
	private String code;
	
	@Column(name="main_image_url")
	private String mainImageUrl;
	
	@Column(name="description", columnDefinition="TEXT")
	private String description;
	
	@Column(name="price")
	private Double price;

	@Column(name="isshow")
	private Boolean isShow;
	
	@Column(name="website_url")// website link
	private String websiteUrl; 
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMainImageUrl() {
		return mainImageUrl;
	}

	public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getIsShow() {
		return isShow;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
		
}
