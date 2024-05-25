package jogayjoga.group;

import java.io.Serializable;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record GroupOut (
    String id,
    String name,
    Integer qtdMembers,
    String description
) implements Serializable{
    private static final long serialVersionUID = 1L;
}