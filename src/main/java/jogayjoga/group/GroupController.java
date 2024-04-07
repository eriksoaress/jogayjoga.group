package jogayjoga.group;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "jogayjoga-group")
public interface GroupController {

    @PostMapping("/group")
    public ResponseEntity<GroupOut> create(
        @RequestBody(required=true) GroupIn in);


    // @PutMapping("/group/{id}")
    // public ResponseEntity<GroupOut> update(
    //     @PathVariable(required = true) String id,
    //     @RequestBody(required = true) GroupIn in
    //     );
    
    // @GetMapping("/group")
    // public ResponseEntity<GroupOut> readall(
    //     @RequestHeader(required = true, name = "id-user") String idUser,
    //     @RequestHeader(required = true, name = "role-user") String roleUser
    // );

    @GetMapping("/group/{id}")
    public ResponseEntity<GroupOut> read(
        @PathVariable(required = true) String id
        );
    
    
    }


