package com.example.OptionsService.service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;
import com.example.OptionsService.model.Options;
@Service
public class OptionsService {
   private static Map < Long, Options > OptionsRepsitory = null;
   static {
      Stream < String > optionsStream = Stream.of("1,Shamik  Mitra,Java,Architect", "2,Samir  Mitra,C++,Manager",
              "3,Swastika  Mitra,AI,Sr.Architect");
      OptionsRepsitory = optionsStream.map(optionsStr -> {
         String[] info = optionsStr.split(",");
         final Options options = createOptions(Long.valueOf(info[0]), info[1], info[2], info[3]);
         return options;
      }).collect(Collectors.toMap(Options::getOptionsId, options -> options));
   }
   private static Options createOptions(Long id, String name, String practiceArea, String designation) {
      Options options = new Options();
      options.setOptionsId(id);
      options.setName(name);
      options.setPracticeArea(practiceArea);
      options.setDesignation(designation);
      options.setCompanyInfo("Cognizant");
      return options;
   }
   public Options findById(Long id) {
      return OptionsRepsitory.get(id);
   }
   public Collection < Options > findAll() {
      return OptionsRepsitory.values();
   }
}