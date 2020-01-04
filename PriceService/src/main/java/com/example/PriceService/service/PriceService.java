package com.example.PriceService.service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;
import com.example.PriceService.model.Price;
@Service
public class PriceService {
   private static Map < Long, Price > PriceRepsitory = null;
   static {
      Stream < String > priceStream = Stream.of("1,Shamik  Mitra,Java,Architect", "2,Samir  Mitra,C++,Manager",
              "3,Swastika  Mitra,AI,Sr.Architect");
      PriceRepsitory = priceStream.map(priceStr -> {
         String[] info = priceStr.split(",");
         final Price price = createPrice(Long.valueOf(info[0]), info[1], info[2], info[3]);
         return price;
      }).collect(Collectors.toMap(Price::getPriceId, price -> price));
   }
   private static Price createPrice(Long id, String name, String practiceArea, String designation) {
      Price price = new Price();
      price.setPriceId(id);
      price.setName(name);
      price.setPracticeArea(practiceArea);
      price.setDesignation(designation);
      price.setCompanyInfo("Cognizant");
      return price;
   }
   public Price findById(Long id) {
      return PriceRepsitory.get(id);
   }
   public Collection < Price > findAll() {
      return PriceRepsitory.values();
   }
}