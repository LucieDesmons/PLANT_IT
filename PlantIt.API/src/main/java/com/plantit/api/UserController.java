package com.plantit.api;

import com.plantit.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Api(value = "UserController", tags = { "User Management" })
public class UserController {

    @PostMapping("/customers")
    @ApiOperation(value = "Create a new customer", response = void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Customer created successfully"),
            @ApiResponse(code = 400, message = "Invalid input data")})
    public void createCustomer(@RequestBody UserDTO userDTO) {
        createCustomer(userDTO);
    }
}
