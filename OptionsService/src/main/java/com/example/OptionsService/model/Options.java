
package com.example.OptionsService.model;
public class Options {
   private Long optionsId;
   private String name;
   private String practiceArea;
   private String designation;
   private String companyInfo;
   public Long getOptionsId() {
      return optionsId;
   }
   public void setOptionsId(Long optionsId) {
      this.optionsId = optionsId;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getPracticeArea() {
      return practiceArea;
   }
   public void setPracticeArea(String practiceArea) {
      this.practiceArea = practiceArea;
   }
   public String getDesignation() {
      return designation;
   }
   public void setDesignation(String designation) {
      this.designation = designation;
   }
   public String getCompanyInfo() {
      return companyInfo;
   }
   public void setCompanyInfo(String companyInfo) {
      this.companyInfo = companyInfo;
   }
   @Override
   public String toString() {
      return "Options [optionsId=" + optionsId + ", name=" + name + ", practiceArea=" + practiceArea + ", designation=" + designation + ", companyInfo=" + companyInfo + "]";
   }
}