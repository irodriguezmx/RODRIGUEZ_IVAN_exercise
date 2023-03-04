package com.ecore.roles.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {

    @JsonProperty
    private UUID id;

    @JsonProperty
    private String name;

    @JsonProperty
    private UUID teamLeadId;

    @JsonProperty
    private List<UUID> teamMemberIds;
}
