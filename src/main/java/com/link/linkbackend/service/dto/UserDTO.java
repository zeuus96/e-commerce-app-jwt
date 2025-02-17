package com.link.linkbackend.service.dto;

import com.link.linkbackend.domain.AbstractAuditingEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends AbstractAuditingEntity<String> {
    @NotBlank(message = "Username is required.")
    @Schema(description = "Login")
    private String username;
    @Schema(description = "First name")
    private String firstName;
    @Schema(description = "Last name")
    private String lastName;
    @Schema(description = "Email address")
    private String email;
    @Schema(description = "Phone number")
    private String phone;
    @NotBlank(message = "Password is required.")
    @Schema(description = "Password")
    private String password;
    @Schema(description = "User image")
    private String imageUrl;
    @Schema(description = "User roles")
    private List<String> roleList;
}
