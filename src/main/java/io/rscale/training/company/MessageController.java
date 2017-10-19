package io.rscale.training.company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by janssenss on 19/10/2017.
 */
@RefreshScope
@RestController
public class MessageController {

    @Value("${info.message:Hello default}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return "\n" + this.message + "\n\n";
    }
}

