package com.atsistemas.apidemo.controller;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.atsistemas.apidemo.generated.api.PetIdApi;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-12T09:58:45.844+02:00")

@Controller
public class PetIdApiController implements PetIdApi {



    public ResponseEntity<Void> petIdGet(@ApiParam(value = "ID of the pet",required=true ) @PathVariable("petId") String petId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
