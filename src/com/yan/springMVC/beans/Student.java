package com.yan.springMVC.beans;

import java.util.ArrayList;

public class Student {
	
	private String firstName;
	private String lastName;
	private String schoolYear;
	private ArrayList<String> schoolYearOption;
	private ArrayList<String> favoriteLanguageOptions;
	private String favLanguage; 
	private String [] operationSystem;
	
	public ArrayList<String> getSchoolYearOption() {
		return schoolYearOption;
	}

	public ArrayList<String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public Student() {
		schoolYearOption = new ArrayList<>();
		
		schoolYearOption.add("Freshman");
		schoolYearOption.add("Sophomore");
		schoolYearOption.add("Junior");
		schoolYearOption.add("Senior");
		schoolYearOption.add("Senior+");
		schoolYearOption.add("Graduate");
		
        // populate favorite language options
        favoriteLanguageOptions = new ArrayList<>();

        // parameter order: value, display label
        favoriteLanguageOptions.add("Java");
        favoriteLanguageOptions.add("JavaScript");
        favoriteLanguageOptions.add("Go");
        favoriteLanguageOptions.add("Ruby");        
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


	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public String getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(String schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String[] getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String [] operationSystem) {
		this.operationSystem = operationSystem;
	}
	
	
}
