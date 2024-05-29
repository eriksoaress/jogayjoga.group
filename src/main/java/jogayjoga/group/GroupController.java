package jogayjoga.group;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "jogayjoga-group")
public interface GroupController {

    @PostMapping("/group")
    public ResponseEntity<GroupOut> create(
        @RequestBody(required=true) GroupIn in);

    @GetMapping("/group")
    public ResponseEntity<List<GroupOut>> readall();


    @PutMapping("/group/{id}")
    public ResponseEntity<GroupOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) GroupIn in
        );

    @DeleteMapping("/group/{id}")
    public ResponseEntity<?> delete(
        @PathVariable(required = true) String id
        );

    @GetMapping("/group/{id}/sportname")
    ResponseEntity<GroupSportOut> getFullInfo(
        @PathVariable(required = true) String id
    );


    @GetMapping("/group/{id}")
    public ResponseEntity<GroupOut> read(
        @PathVariable(required = true) String id
        );
    
    
    }


