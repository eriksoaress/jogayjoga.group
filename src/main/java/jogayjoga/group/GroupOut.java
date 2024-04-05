package jogayjoga.group;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record GroupOut (
    String id,
    String name,
    Integer qtdMembers,
    String description
){

}