
package com.example.PriceService.model;
public class Price {
   private Long priceId;
   private String name;
   private String practiceArea;
   private String designation;
   private String companyInfo;
   public Long getPriceId() {
      return priceId;
   }
   public void setPriceId(Long priceId) {
      this.priceId = priceId;
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
      return "Price [priceId=" + priceId + ", name=" + name + ", practiceArea=" + practiceArea + ", designation=" + designation + ", companyInfo=" + companyInfo + "]";
   }
}