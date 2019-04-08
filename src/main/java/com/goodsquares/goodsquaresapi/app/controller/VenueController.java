package com.goodsquares.goodsquaresapi.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Companies endpoint")
@ApiResponses(value = {
        @ApiResponse(code = 401, message = "UNAUTHORIZED"),
        @ApiResponse(code = 403, message = "Forbidden")
})
@RestController
@RequestMapping("/api/entities/companies")
public class VenueController {
}
