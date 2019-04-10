package com.example.alfacart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class Tes {


    @GetMapping("/")
    public String index(){
        String out;
        try {
            String namaserver   = InetAddress.getLocalHost().getHostName();
            String ipserver     = InetAddress.getLocalHost().getHostAddress();

            out=  "<h2>hello world AWS EKS server  </h2>IP : "+ ipserver + "<br> Hostname :" + namaserver  ;
            out=out + "<div style='padding:10px'>Halooo Fahmi</div><br><div>Env:</div>";
            out=out + "<div>SPRING_BEFORE_OPTS: "+System.getenv("SPRING_BEFORE_OPTS")+"</div>";
            out=out + "<div>SPRING_AFTER_OPTS: "+System.getenv("SPRING_AFTER_OPTS")+"</div>";

        }catch (UnknownHostException e){
            e.printStackTrace();
            out=e.getMessage();
        }

        return out;

    }
}
