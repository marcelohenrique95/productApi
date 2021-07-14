package com.psjava.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue
	@Column(name="id")
	public long id;

	@Column(name="name")
	public String name;

	@Column(name="price")
	public Integer price;

	@Column(name="score")
	public Integer score;

	@Column(name="image")
	public String image;

	public Product() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		String ls = System.lineSeparator();
		sb.append(ls);
		sb.append("name:  " + name);
		sb.append(ls);
		sb.append("price:  " + price);
		sb.append(ls);
		sb.append("score:  " + score);
		sb.append(ls);
		sb.append("image:  " + image);
		sb.append(ls);
		return ls;
	}

}