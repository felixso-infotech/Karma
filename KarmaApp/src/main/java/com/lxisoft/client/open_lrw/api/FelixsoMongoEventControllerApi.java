/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.lxisoft.client.open_lrw.api;

import com.lxisoft.client.open_lrw.model.MongoEvent;
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

@Api(value = "FelixsoMongoEventController", description = "the FelixsoMongoEventController API")
public interface FelixsoMongoEventControllerApi {

    @ApiOperation(value = "getMongoCompletedEvents", nickname = "getMongoCompletedEventsUsingDELETE", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/completed-events",
        produces = "*/*", 
        method = RequestMethod.DELETE)
    ResponseEntity<List<MongoEvent>> getMongoCompletedEventsUsingDELETE();


    @ApiOperation(value = "getMongoCompletedEvents", nickname = "getMongoCompletedEventsUsingGET", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/completed-events",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<MongoEvent>> getMongoCompletedEventsUsingGET();


    @ApiOperation(value = "getMongoCompletedEvents", nickname = "getMongoCompletedEventsUsingHEAD", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/completed-events",
        produces = "*/*", 
        method = RequestMethod.HEAD)
    ResponseEntity<List<MongoEvent>> getMongoCompletedEventsUsingHEAD();


    @ApiOperation(value = "getMongoCompletedEvents", nickname = "getMongoCompletedEventsUsingOPTIONS", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/completed-events",
        produces = "*/*", 
        method = RequestMethod.OPTIONS)
    ResponseEntity<List<MongoEvent>> getMongoCompletedEventsUsingOPTIONS();


    @ApiOperation(value = "getMongoCompletedEvents", nickname = "getMongoCompletedEventsUsingPATCH", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/completed-events",
        produces = "*/*", 
        method = RequestMethod.PATCH)
    ResponseEntity<List<MongoEvent>> getMongoCompletedEventsUsingPATCH();


    @ApiOperation(value = "getMongoCompletedEvents", nickname = "getMongoCompletedEventsUsingPOST", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/completed-events",
        produces = "*/*", 
        method = RequestMethod.POST)
    ResponseEntity<List<MongoEvent>> getMongoCompletedEventsUsingPOST();


    @ApiOperation(value = "getMongoCompletedEvents", nickname = "getMongoCompletedEventsUsingPUT", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/completed-events",
        produces = "*/*", 
        method = RequestMethod.PUT)
    ResponseEntity<List<MongoEvent>> getMongoCompletedEventsUsingPUT();


    @ApiOperation(value = "getMongoEStartedEvents", nickname = "getMongoEStartedEventsUsingDELETE", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/started-events",
        produces = "*/*", 
        method = RequestMethod.DELETE)
    ResponseEntity<List<MongoEvent>> getMongoEStartedEventsUsingDELETE();


    @ApiOperation(value = "getMongoEStartedEvents", nickname = "getMongoEStartedEventsUsingGET", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/started-events",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<MongoEvent>> getMongoEStartedEventsUsingGET();


    @ApiOperation(value = "getMongoEStartedEvents", nickname = "getMongoEStartedEventsUsingHEAD", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/started-events",
        produces = "*/*", 
        method = RequestMethod.HEAD)
    ResponseEntity<List<MongoEvent>> getMongoEStartedEventsUsingHEAD();


    @ApiOperation(value = "getMongoEStartedEvents", nickname = "getMongoEStartedEventsUsingOPTIONS", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/started-events",
        produces = "*/*", 
        method = RequestMethod.OPTIONS)
    ResponseEntity<List<MongoEvent>> getMongoEStartedEventsUsingOPTIONS();


    @ApiOperation(value = "getMongoEStartedEvents", nickname = "getMongoEStartedEventsUsingPATCH", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/started-events",
        produces = "*/*", 
        method = RequestMethod.PATCH)
    ResponseEntity<List<MongoEvent>> getMongoEStartedEventsUsingPATCH();


    @ApiOperation(value = "getMongoEStartedEvents", nickname = "getMongoEStartedEventsUsingPOST", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/started-events",
        produces = "*/*", 
        method = RequestMethod.POST)
    ResponseEntity<List<MongoEvent>> getMongoEStartedEventsUsingPOST();


    @ApiOperation(value = "getMongoEStartedEvents", nickname = "getMongoEStartedEventsUsingPUT", notes = "", response = MongoEvent.class, responseContainer = "List", tags={ "felixso-mongo-event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MongoEvent.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/started-events",
        produces = "*/*", 
        method = RequestMethod.PUT)
    ResponseEntity<List<MongoEvent>> getMongoEStartedEventsUsingPUT();

}
