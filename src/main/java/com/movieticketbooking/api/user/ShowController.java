package com.movieticketbooking.api.user;
import com.movieticketbooking.dto.RequestShowDetails;
import com.movieticketbooking.entity.Shows;
import com.movieticketbooking.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shows")
public class ShowController {

    private final ShowService showService;
    @PostMapping("/add")
    public Shows addShows(@RequestBody Shows shows)  throws Exception {
        Shows.createShow(shows);
        return shows;
    }
    @GetMapping("/get")
    public ResponseEntity<?> getAllShows(@RequestBody RequestShowDetails showDetails){
        if(showDetails==null||showDetails.getName()==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response());
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(showService.getAllShows());
    }
    @GetMapping("/getid")
    public ResponseEntity<?> findShowsByID(@RequestBody RequestShowDetails showDetails){
        if(showDetails==null||showDetails.getName()==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response());
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(showService.findShowsByID(showDetails.getId()));
    }
    @GetMapping
    public Shows deleteShows(@RequestBody Shows shows) {
        return null;
    }
}


