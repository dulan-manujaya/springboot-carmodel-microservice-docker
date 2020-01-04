
package com.example.CarSearchService.model;
public class Car {
   private Long carId;
   private String name;
   private String practiceArea;
   private String designation;
   private String companyInfo;
   public Long getCarId() {
      return carId;
   }
   public void setCarId(Long carId) {
      this.carId = carId;
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
      return "Car [carId=" + carId + ", name=" + name + ", practiceArea=" + practiceArea + ", designation=" + designation + ", companyInfo=" + companyInfo + "]";
   }
}