package io.swagger.api;

import io.swagger.model.ApiSoftLimitResponse;
import io.swagger.model.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-11-26T21:56:11.148012911Z[GMT]")
@RestController
public class ApisoftlimitApiController implements ApisoftlimitApi {

    private static final Logger log = LoggerFactory.getLogger(ApisoftlimitApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApisoftlimitApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ApiSoftLimitResponse> apisoftlimitGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ApiSoftLimitResponse>(objectMapper.readValue("{\n  \"Stock\" : 200,\n  \"Margin\" : 200,\n  \"Future\" : 10,\n  \"FutureMini\" : 100,\n  \"FutureMicro\" : 1000,\n  \"Option\" : 20,\n  \"MiniOption\" : 200,\n  \"kabuSVersion\" : \"5.23.0.0\"\n}", ApiSoftLimitResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ApiSoftLimitResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ApiSoftLimitResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
