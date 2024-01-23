package POLYGLOT.MS.TEST.Gateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/gateway")
public class GatewayController {
    private Logger logger = LoggerFactory.getLogger(GatewayController.class);
    @GetMapping("/test")
    public ResponseEntity<?> testGateway() {
        logger.info("METHOD TEST GATEWAY");
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
}
