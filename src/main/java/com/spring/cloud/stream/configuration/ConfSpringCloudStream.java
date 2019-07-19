package com.spring.cloud.stream.configuration;

import com.spring.cloud.stream.processor.*;
import com.spring.cloud.stream.processor.output.InclusaoRecadoSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({
        InclusaoRecadoPostegreSQLProcessor.class, InclusaoRecadoCacheProcessor.class,
        InclusaoRecadoSink.class
})
public class ConfSpringCloudStream {

}
