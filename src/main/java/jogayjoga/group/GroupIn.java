package jogayjoga.group;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record GroupIn (
    String name,
    Integer qtdMembers,
    String description

) {

}
