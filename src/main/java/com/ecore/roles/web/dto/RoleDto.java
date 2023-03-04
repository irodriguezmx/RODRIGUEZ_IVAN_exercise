package com.ecore.roles.web.dto;

import com.ecore.roles.model.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleDto {

    @JsonProperty
    private UUID id;
    @JsonProperty
    @NotBlank
    private String name;

    public static RoleDto fromModel(Role role) {
        if (role == null) {
            return null;
        }
        return RoleDto.builder()
                .id(role.getId())
                .name(role.getName())
                .build();
    }

    public Role toModel() {
        return Role.builder()
                .id(this.id)
                .name(this.name)
                .build();
    }

}
