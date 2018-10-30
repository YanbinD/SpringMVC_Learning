package com.yan.springMVC.beans;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOption;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private String favLanguage; 
	
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public Student() {
		countryOption = new LinkedHashMap<>();
		
		countryOption.put("BR", "Brazil");
		countryOption.put("US", "United States");
		countryOption.put("CH", "China");
		
        // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("JavaScript", "JavaScript#");
        favoriteLanguageOptions.put("Go", "Go");
        favoriteLanguageOptions.put("Ruby", "Ruby");        


	}
	
	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}
	
	
}
