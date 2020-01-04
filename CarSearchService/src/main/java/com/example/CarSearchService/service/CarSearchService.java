package com.example.CarSearchService.service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;
import com.example.CarSearchService.model.Car;
@Service
public class CarSearchService {
   private static Map < Long, Car > CarRepsitory = null;
   static {
      Stream < String > carStream = Stream.of("1,Shamik  Mitra,Java,Architect", "2,Samir  Mitra,C++,Manager",
              "3,Swastika  Mitra,AI,Sr.Architect");
      CarRepsitory = carStream.map(carStr -> {
         String[] info = carStr.split(",");
         final Car car = createCar(Long.valueOf(info[0]), info[1], info[2], info[3]);
         return car;
      }).collect(Collectors.toMap(Car::getCarId, car -> car));
   }
   private static Car createCar(Long id, String name, String practiceArea, String designation) {
      Car car = new Car();
      car.setCarId(id);
      car.setName(name);
      car.setPracticeArea(practiceArea);
      car.setDesignation(designation);
      car.setCompanyInfo("Cognizant");
      return car;
   }
   public Car findById(Long id) {
      return CarRepsitory.get(id);
   }
   public Collection < Car > findAll() {
      return CarRepsitory.values();
   }
}