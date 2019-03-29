/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.lxisoft.client.open_lrw.api;

import com.lxisoft.client.open_lrw.model.DataSync;
import com.lxisoft.client.open_lrw.model.Org;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-29T12:01:52.955+05:30[Asia/Calcutta]")

@Api(value = "OrgController", description = "the OrgController API")
public interface OrgControllerApi {

    @ApiOperation(value = "getLatestDataSync", nickname = "getLatestDataSyncUsingGET", notes = "", response = DataSync.class, tags={ "org-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DataSync.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/orgs/{orgId}/datasyncs/{syncType}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DataSync> getLatestDataSyncUsingGET(@ApiParam(value = "orgId",required=true) @PathVariable("orgId") String orgId,@ApiParam(value = "syncType",required=true) @PathVariable("syncType") String syncType,@ApiParam(value = "") @Valid @RequestParam(value = "details", required = false) Object details,@ApiParam(value = "") @Valid @RequestParam(value = "authenticated", required = false) Boolean authenticated);


    @ApiOperation(value = "getOne", nickname = "getOneUsingGET", notes = "", response = Org.class, tags={ "org-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Org.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/orgs/{orgId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Org> getOneUsingGET(@ApiParam(value = "orgId",required=true) @PathVariable("orgId") String orgId,@ApiParam(value = "") @Valid @RequestParam(value = "details", required = false) Object details,@ApiParam(value = "") @Valid @RequestParam(value = "authenticated", required = false) Boolean authenticated);


    @ApiOperation(value = "postDataSync", nickname = "postDataSyncUsingPOST", notes = "", response = Object.class, tags={ "org-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/orgs/{orgId}/datasyncs",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Object> postDataSyncUsingPOST(@ApiParam(value = "orgId",required=true) @PathVariable("orgId") String orgId,@ApiParam(value = "dataSync" ,required=true )  @Valid @RequestBody DataSync dataSync,@ApiParam(value = "") @Valid @RequestParam(value = "details", required = false) Object details,@ApiParam(value = "") @Valid @RequestParam(value = "authenticated", required = false) Boolean authenticated);


    @ApiOperation(value = "post", nickname = "postUsingPOST2", notes = "", response = Object.class, tags={ "org-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/orgs",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Object> postUsingPOST2(@ApiParam(value = "org" ,required=true )  @Valid @RequestBody Org org,@ApiParam(value = "") @Valid @RequestParam(value = "details", required = false) Object details,@ApiParam(value = "") @Valid @RequestParam(value = "authenticated", required = false) Boolean authenticated);

}