package be.thomasmore.party;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication
public class PartyApplication{

  public static void main(String[] args){
      SpringApplication.run(PartyApplication.class,args);
  }

}
