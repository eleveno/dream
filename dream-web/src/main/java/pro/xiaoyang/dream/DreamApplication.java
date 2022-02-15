package pro.xiaoyang.dream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pro.xiaoyang.dream")
public class DreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamApplication.class, args);
    }

}
